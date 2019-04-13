package typings
package fibjsLib

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
  def decodeURI(url: java.lang.String): java.lang.String = js.native
  def encodeURI(url: java.lang.String): java.lang.String = js.native
  def encodeURIComponent(url: java.lang.String): java.lang.String = js.native
  def jsstr(str: java.lang.String): java.lang.String = js.native
  def jsstr(str: java.lang.String, json: scala.Boolean): java.lang.String = js.native
  @js.native
  object base32 extends js.Object {
    def decode(data: java.lang.String): fibjsLib.Class_Buffer = js.native
    def encode(data: fibjsLib.Class_Buffer): java.lang.String = js.native
  }
  
  @js.native
  object base64 extends js.Object {
    def decode(data: java.lang.String): fibjsLib.Class_Buffer = js.native
    def encode(data: fibjsLib.Class_Buffer): java.lang.String = js.native
    def encode(data: fibjsLib.Class_Buffer, url: scala.Boolean): java.lang.String = js.native
  }
  
  @js.native
  object base64vlq extends js.Object {
    def decode(data: java.lang.String): js.Array[_] = js.native
    def encode(data: js.Array[_]): java.lang.String = js.native
    def encode(data: scala.Double): java.lang.String = js.native
  }
  
  @js.native
  object bson extends js.Object {
    def decode(data: fibjsLib.Class_Buffer): js.Object = js.native
    def encode(data: js.Object): fibjsLib.Class_Buffer = js.native
  }
  
  @js.native
  object hex extends js.Object {
    def decode(data: java.lang.String): fibjsLib.Class_Buffer = js.native
    def encode(data: fibjsLib.Class_Buffer): java.lang.String = js.native
  }
  
  @js.native
  object iconv extends js.Object {
    def decode(charset: java.lang.String, data: fibjsLib.Class_Buffer): java.lang.String = js.native
    def encode(charset: java.lang.String, data: java.lang.String): fibjsLib.Class_Buffer = js.native
    def isEncoding(charset: java.lang.String): scala.Boolean = js.native
  }
  
  @js.native
  object json extends js.Object {
    def decode(data: java.lang.String): js.Any = js.native
    def encode(data: js.Any): java.lang.String = js.native
  }
  
}

