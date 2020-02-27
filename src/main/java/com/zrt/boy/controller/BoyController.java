package com.zrt.boy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BoyController {
    @GetMapping(value = "/index")
    public String name(@RequestParam(value = "name",required = false,defaultValue = "未命名") String my)
    {
        return "name:"+my;
    }
}
