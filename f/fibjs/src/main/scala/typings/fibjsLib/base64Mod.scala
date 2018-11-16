package typings
package fibjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** module Or Internal Object */
/**
	* @brief base64 编码与解码模块
	* @detail 引用方式：,```JavaScript,var encoding = require('encoding');,var base64 = encoding.base64;,```,或者,```JavaScript,var base64 = require('base64');,```
	*/
@JSImport("base64", JSImport.Namespace)
@js.native
object base64Mod extends js.Object {
  def decode(data: java.lang.String): fibjsLib.Class_Buffer = js.native
  def encode(data: fibjsLib.Class_Buffer): java.lang.String = js.native
  def encode(data: fibjsLib.Class_Buffer, url: scala.Boolean): java.lang.String = js.native
}

