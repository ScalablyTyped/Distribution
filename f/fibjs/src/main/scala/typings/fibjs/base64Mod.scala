package typings.fibjs

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
  def decode(data: String): Class_Buffer = js.native
  def encode(data: Class_Buffer): String = js.native
  def encode(data: Class_Buffer, url: Boolean): String = js.native
}

