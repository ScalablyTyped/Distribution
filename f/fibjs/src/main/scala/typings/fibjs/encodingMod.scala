package typings.fibjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** module Or Internal Object */
/**
  * @brief 编码与解码模块，用于处理不同的数据编码格式与二进制之间的转换
  * @detail 引用方式：,```JavaScript,var encoding = require('encoding');,```
  */
object encodingMod {
  
  object base32 {
    
    @JSImport("encoding", "base32.decode")
    @js.native
    def decode(data: String): ClassBuffer = js.native
    
    @JSImport("encoding", "base32.encode")
    @js.native
    def encode(data: ClassBuffer): String = js.native
  }
  
  object base64 {
    
    @JSImport("encoding", "base64.decode")
    @js.native
    def decode(data: String): ClassBuffer = js.native
    
    @JSImport("encoding", "base64.encode")
    @js.native
    def encode(data: ClassBuffer): String = js.native
    @JSImport("encoding", "base64.encode")
    @js.native
    def encode(data: ClassBuffer, url: Boolean): String = js.native
  }
  
  object base64vlq {
    
    @JSImport("encoding", "base64vlq.decode")
    @js.native
    def decode(data: String): js.Array[_] = js.native
    
    @JSImport("encoding", "base64vlq.encode")
    @js.native
    def encode(data: js.Array[_]): String = js.native
    @JSImport("encoding", "base64vlq.encode")
    @js.native
    def encode(data: Double): String = js.native
  }
  
  object bson {
    
    @JSImport("encoding", "bson.decode")
    @js.native
    def decode(data: ClassBuffer): js.Object = js.native
    
    @JSImport("encoding", "bson.encode")
    @js.native
    def encode(data: js.Object): ClassBuffer = js.native
  }
  
  @JSImport("encoding", "decodeURI")
  @js.native
  def decodeURI(url: String): String = js.native
  
  @JSImport("encoding", "encodeURI")
  @js.native
  def encodeURI(url: String): String = js.native
  
  @JSImport("encoding", "encodeURIComponent")
  @js.native
  def encodeURIComponent(url: String): String = js.native
  
  object hex {
    
    @JSImport("encoding", "hex.decode")
    @js.native
    def decode(data: String): ClassBuffer = js.native
    
    @JSImport("encoding", "hex.encode")
    @js.native
    def encode(data: ClassBuffer): String = js.native
  }
  
  object iconv {
    
    @JSImport("encoding", "iconv.decode")
    @js.native
    def decode(charset: String, data: ClassBuffer): String = js.native
    
    @JSImport("encoding", "iconv.encode")
    @js.native
    def encode(charset: String, data: String): ClassBuffer = js.native
    
    @JSImport("encoding", "iconv.isEncoding")
    @js.native
    def isEncoding(charset: String): Boolean = js.native
  }
  
  object json {
    
    @JSImport("encoding", "json.decode")
    @js.native
    def decode(data: String): js.Any = js.native
    
    @JSImport("encoding", "json.encode")
    @js.native
    def encode(data: js.Any): String = js.native
  }
  
  @JSImport("encoding", "jsstr")
  @js.native
  def jsstr(str: String): String = js.native
  @JSImport("encoding", "jsstr")
  @js.native
  def jsstr(str: String, json: Boolean): String = js.native
}
