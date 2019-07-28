package typings.fibjs

import typings.fibjs.fibjsNumbers.`10000`
import typings.fibjs.fibjsNumbers.`11000`
import typings.fibjs.fibjsNumbers.`11001`
import typings.fibjs.fibjsNumbers.`7000`
import typings.fibjs.fibjsNumbers.`8000`
import typings.fibjs.fibjsNumbers.`9000`
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
  val EDGE: `11001` = js.native
  val IE10: `10000` = js.native
  val IE11: `11000` = js.native
  val IE7: `7000` = js.native
  val IE8: `8000` = js.native
  val IE9: `9000` = js.native
  def open(url: String): Class_WebView = js.native
  def open(url: String, opt: js.Object): Class_WebView = js.native
  def setVersion(ver: Double): Unit = js.native
}

