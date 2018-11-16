package typings
package fibjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** module Or Internal Object */
/**
	* @brief gui 模块
	* @detail 使用方法：,```JavaScript,var gui = require('gui');,```
	*/
@JSImport("gui", JSImport.Namespace)
@js.native
object guiMod extends js.Object {
  val EDGE: /* 11001 */ scala.Double = js.native
  val IE10: /* 10000 */ scala.Double = js.native
  val IE11: /* 11000 */ scala.Double = js.native
  val IE7: /* 7000 */ scala.Double = js.native
  val IE8: /* 8000 */ scala.Double = js.native
  val IE9: /* 9000 */ scala.Double = js.native
  def open(url: java.lang.String): fibjsLib.Class_WebView = js.native
  def open(url: java.lang.String, opt: js.Object): fibjsLib.Class_WebView = js.native
  def setVersion(ver: scala.Double): scala.Unit = js.native
}

