package typings
package easyDashXDashHeadersLib.clusterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cluster", "Worker")
@js.native
class Worker ()
  extends easyDashXDashHeadersLib.eventsMod.EventEmitter {
  var id: java.lang.String = js.native
  var process: easyDashXDashHeadersLib.childUnderscoreProcessMod.ChildProcess = js.native
  var suicide: scala.Boolean = js.native
  def destroy(): scala.Unit = js.native
  def destroy(signal: java.lang.String): scala.Unit = js.native
  def disconnect(): scala.Unit = js.native
  def kill(): scala.Unit = js.native
  def kill(signal: java.lang.String): scala.Unit = js.native
  def send(message: js.Any): scala.Unit = js.native
  def send(message: js.Any, sendHandle: js.Any): scala.Unit = js.native
}

