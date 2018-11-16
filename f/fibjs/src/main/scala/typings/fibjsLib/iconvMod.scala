package typings
package fibjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** end of `module iconv` */
/** module Or Internal Object */
/**
	* @brief iconv 编码与解码模块
	* @detail 引用方式：,```JavaScript,var encoding = require('encoding');,var iconv = encoding.iconv;,```,或者,```JavaScript,var iconv = require('iconv');,```
	*/
@JSImport("iconv", JSImport.Namespace)
@js.native
object iconvMod extends js.Object {
  def decode(charset: java.lang.String, data: fibjsLib.Class_Buffer): java.lang.String = js.native
  def encode(charset: java.lang.String, data: java.lang.String): fibjsLib.Class_Buffer = js.native
  def isEncoding(charset: java.lang.String): scala.Boolean = js.native
}

