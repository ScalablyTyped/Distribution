package typings.foreverMonitor.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("forever-monitor", "kill")
@js.native
object kill extends js.Object {
  def apply(pid: Double): Unit = js.native
  def apply(pid: Double, killTree: Boolean): Unit = js.native
  def apply(pid: Double, killTree: Boolean, signal: String): Unit = js.native
  def apply(pid: Double, killTree: Boolean, signal: String, callback: js.Function0[_]): Unit = js.native
}

