package typings
package foreverDashMonitorLib.foreverDashMonitorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("forever-monitor", JSImport.Namespace)
@js.native
object foreverDashMonitorModMembers extends js.Object {
  val version: java.lang.String = js.native
  def checkProcess(pid: scala.Double): scala.Boolean = js.native
  def kill(pid: scala.Double): scala.Unit = js.native
  def kill(pid: scala.Double, killTree: scala.Boolean): scala.Unit = js.native
  def kill(pid: scala.Double, killTree: scala.Boolean, signal: java.lang.String): scala.Unit = js.native
  def kill(pid: scala.Double, killTree: scala.Boolean, signal: java.lang.String, callback: js.Function0[_]): scala.Unit = js.native
  def start(script: java.lang.String): Monitor = js.native
  def start(script: java.lang.String, options: Options): Monitor = js.native
  def start(script: js.Array[java.lang.String]): Monitor = js.native
  def start(script: js.Array[java.lang.String], options: Options): Monitor = js.native
}

