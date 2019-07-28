package typings.fibjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** module Or Internal Object */
/**
	* @brief 编码与解码模块，用于处理不同的数据编码格式与二进制之间的转换
	* @detail 引用方式：,```JavaScript,var encoding = require('encoding');,```
	*/
@JSImport("encoding", JSImport.Namespace)
@js.native
object encodingMod extends js.Object {
  def decodeURI(url: String): String = js.native
  def encodeURI(url: String): String = js.native
  def encodeURIComponent(url: String): String = js.native
  def jsstr(str: String): String = js.native
  def jsstr(str: String, json: Boolean): String = js.native
  @js.native
  object base32 extends js.Object {
    def decode(data: String): Class_Buffer = js.native
    def encode(data: Class_Buffer): String = js.native
  }
  
  @js.native
  object base64 extends js.Object {
    def decode(data: String): Class_Buffer = js.native
    def encode(data: Class_Buffer): String = js.native
    def encode(data: Class_Buffer, url: Boolean): String = js.native
  }
  
  @js.native
  object base64vlq extends js.Object {
    def decode(data: String): js.Array[_] = js.native
    def encode(data: js.Array[_]): String = js.native
    def encode(data: Double): String = js.native
  }
  
  @js.native
  object bson extends js.Object {
    def decode(data: Class_Buffer): js.Object = js.native
    def encode(data: js.Object): Class_Buffer = js.native
  }
  
  @js.native
  object hex extends js.Object {
    def decode(data: String): Class_Buffer = js.native
    def encode(data: Class_Buffer): String = js.native
  }
  
  @js.native
  object iconv extends js.Object {
    def decode(charset: String, data: Class_Buffer): String = js.native
    def encode(charset: String, data: String): Class_Buffer = js.native
    def isEncoding(charset: String): Boolean = js.native
  }
  
  @js.native
  object json extends js.Object {
    def decode(data: String): js.Any = js.native
    def encode(data: js.Any): String = js.native
  }
  
}

