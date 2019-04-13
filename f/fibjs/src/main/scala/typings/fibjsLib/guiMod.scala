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
  val EDGE: fibjsLib.fibjsLibNumbers.`11001` = js.native
  val IE10: fibjsLib.fibjsLibNumbers.`10000` = js.native
  val IE11: fibjsLib.fibjsLibNumbers.`11000` = js.native
  val IE7: fibjsLib.fibjsLibNumbers.`7000` = js.native
  val IE8: fibjsLib.fibjsLibNumbers.`8000` = js.native
  val IE9: fibjsLib.fibjsLibNumbers.`9000` = js.native
  def open(url: java.lang.String): fibjsLib.Class_WebView = js.native
  def open(url: java.lang.String, opt: js.Object): fibjsLib.Class_WebView = js.native
  def setVersion(ver: scala.Double): scala.Unit = js.native
}

