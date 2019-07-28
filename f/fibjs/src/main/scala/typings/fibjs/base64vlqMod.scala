package typings.fibjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** module Or Internal Object */
/**
	* @brief base64vlq 编码与解码模块
	* @detail 引用方式：,```JavaScript,var encoding = require('encoding');,var base64vlq = encoding.base64vlq;,```,或者,```JavaScript,var base64vlq = require('base64vlq');,```
	*/
@JSImport("base64vlq", JSImport.Namespace)
@js.native
object base64vlqMod extends js.Object {
  def decode(data: String): js.Array[_] = js.native
  def encode(data: js.Array[_]): String = js.native
  def encode(data: Double): String = js.native
}

