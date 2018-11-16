package typings
package easyDashXapiDashSupertestLib.childUnderscoreProcessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChildProcess
  extends easyDashXapiDashSupertestLib.eventsMod.EventEmitter {
  var pid: scala.Double = js.native
  var stderr: easyDashXapiDashSupertestLib.streamMod.Readable = js.native
  var stdin: easyDashXapiDashSupertestLib.streamMod.Writable = js.native
  var stdout: easyDashXapiDashSupertestLib.streamMod.Readable = js.native
  def disconnect(): scala.Unit = js.native
  def kill(): scala.Unit = js.native
  def kill(signal: java.lang.String): scala.Unit = js.native
  def send(message: js.Any): scala.Unit = js.native
  def send(message: js.Any, sendHandle: js.Any): scala.Unit = js.native
}

