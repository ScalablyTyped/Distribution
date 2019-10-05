package typings.easyDashXDashHeaders.clusterMod

import org.scalablytyped.runtime.TopLevel
import typings.easyDashXDashHeaders.childUnderscoreProcessMod.ChildProcess
import typings.easyDashXDashHeaders.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cluster", "Worker")
@js.native
class Worker () extends EventEmitter {
  var id: String = js.native
  var process: ChildProcess = js.native
  var suicide: Boolean = js.native
  def destroy(): Unit = js.native
  def destroy(signal: String): Unit = js.native
  def disconnect(): Unit = js.native
  def kill(): Unit = js.native
  def kill(signal: String): Unit = js.native
  def send(message: js.Any): Unit = js.native
  def send(message: js.Any, sendHandle: js.Any): Unit = js.native
}

@JSImport("cluster", "worker")
@js.native
object worker extends TopLevel[Worker]

