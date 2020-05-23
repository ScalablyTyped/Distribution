package typings.fibjs

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
  val EDGE: /* 11001 */ Double = js.native
  val IE10: /* 10000 */ Double = js.native
  val IE11: /* 11000 */ Double = js.native
  val IE7: /* 7000 */ Double = js.native
  val IE8: /* 8000 */ Double = js.native
  val IE9: /* 9000 */ Double = js.native
  def open(url: String): ClassWebView = js.native
  def open(url: String, opt: js.Object): ClassWebView = js.native
  def setVersion(ver: Double): Unit = js.native
}

