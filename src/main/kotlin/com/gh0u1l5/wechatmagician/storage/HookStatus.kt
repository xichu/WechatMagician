package com.gh0u1l5.wechatmagician.storage

import java.io.Serializable

class HookStatus : Serializable {
    @Volatile var MsgStorage: Boolean = false
    @Volatile var ImgStorage: Boolean = false

    @Volatile var Resources: Boolean = false
    @Volatile var Database:  Boolean = false
    @Volatile var XMLParser: Boolean = false
    @Volatile var CustomScheme: Boolean = false
}
