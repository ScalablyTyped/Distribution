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
  val base32: fibjsLib.Anon_Base32 = js.native
  val base64: fibjsLib.Anon_Base64 = js.native
  val base64vlq: fibjsLib.Anon_Base64vlq = js.native
  val bson: fibjsLib.Anon_DataDecodeEncode = js.native
  val hex: fibjsLib.Anon_Data = js.native
  val iconv: fibjsLib.Anon_Charset = js.native
  val json: fibjsLib.Anon_DataDecode = js.native
  def decodeURI(url: java.lang.String): java.lang.String = js.native
  def encodeURI(url: java.lang.String): java.lang.String = js.native
  def encodeURIComponent(url: java.lang.String): java.lang.String = js.native
  def jsstr(str: java.lang.String): java.lang.String = js.native
  def jsstr(str: java.lang.String, json: scala.Boolean): java.lang.String = js.native
}

