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
  val base32: js.Any = js.native
  val base64: js.Any = js.native
  val base64vlq: js.Any = js.native
  val hex: js.Any = js.native
  val json: js.Any = js.native
  def decodeURI(url: java.lang.String): java.lang.String = js.native
  def encodeURI(url: java.lang.String): java.lang.String = js.native
  def encodeURIComponent(url: java.lang.String): java.lang.String = js.native
  def jsstr(str: java.lang.String): java.lang.String = js.native
  def jsstr(str: java.lang.String, json: scala.Boolean): java.lang.String = js.native
}

