package typings
package easyDashXDashHeadersLib.childUnderscoreProcessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChildProcess
  extends easyDashXDashHeadersLib.eventsMod.EventEmitter {
  var pid: scala.Double = js.native
  var stderr: easyDashXDashHeadersLib.streamMod.Readable = js.native
  var stdin: easyDashXDashHeadersLib.streamMod.Writable = js.native
  var stdout: easyDashXDashHeadersLib.streamMod.Readable = js.native
  def disconnect(): scala.Unit = js.native
  def kill(): scala.Unit = js.native
  def kill(signal: java.lang.String): scala.Unit = js.native
  def send(message: js.Any): scala.Unit = js.native
  def send(message: js.Any, sendHandle: js.Any): scala.Unit = js.native
}

