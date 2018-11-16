package typings
package fibjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** module Or Internal Object */
/**
	* @brief timers 模块
	* @detail 
	*/
@JSImport("timers", JSImport.Namespace)
@js.native
object timersMod extends js.Object {
  def call(func: js.Function, timeout: scala.Double, args: js.Any*): js.Any = js.native
  def clearHrInterval(t: js.Any): scala.Unit = js.native
  def clearImmediate(t: js.Any): scala.Unit = js.native
  def clearInterval(t: js.Any): scala.Unit = js.native
  def clearTimeout(t: js.Any): scala.Unit = js.native
  def setHrInterval(callback: js.Function, timeout: scala.Double, args: js.Any*): fibjsLib.Class_Timer = js.native
  def setImmediate(callback: js.Function, args: js.Any*): fibjsLib.Class_Timer = js.native
  def setInterval(callback: js.Function, timeout: scala.Double, args: js.Any*): fibjsLib.Class_Timer = js.native
  def setTimeout(callback: js.Function): fibjsLib.Class_Timer = js.native
  def setTimeout(callback: js.Function, timeout: scala.Double, args: js.Any*): fibjsLib.Class_Timer = js.native
}

