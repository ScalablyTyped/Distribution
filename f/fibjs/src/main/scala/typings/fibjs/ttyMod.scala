package typings.fibjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** module Or Internal Object */
/**
	* @brief tty 模块
	* @detail 使用方法：,```JavaScript,const tty = require('tty');,```
	*/
@JSImport("tty", JSImport.Namespace)
@js.native
object ttyMod extends js.Object {
  def isatty(fd: Double): Boolean = js.native
}

