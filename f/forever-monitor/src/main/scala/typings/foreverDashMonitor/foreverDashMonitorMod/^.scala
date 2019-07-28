package typings.foreverDashMonitor.foreverDashMonitorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("forever-monitor", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val version: String = js.native
  def checkProcess(pid: Double): Boolean = js.native
  def kill(pid: Double): Unit = js.native
  def kill(pid: Double, killTree: Boolean): Unit = js.native
  def kill(pid: Double, killTree: Boolean, signal: String): Unit = js.native
  def kill(pid: Double, killTree: Boolean, signal: String, callback: js.Function0[_]): Unit = js.native
  def start(script: String): Monitor = js.native
  def start(script: String, options: Options): Monitor = js.native
  def start(script: js.Array[String]): Monitor = js.native
  def start(script: js.Array[String], options: Options): Monitor = js.native
}

