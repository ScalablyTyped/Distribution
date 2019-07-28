package typings.easyDashXDashHeaders.childUnderscoreProcessMod

import typings.easyDashXDashHeaders.eventsMod.EventEmitter
import typings.easyDashXDashHeaders.streamMod.Readable
import typings.easyDashXDashHeaders.streamMod.Writable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChildProcess extends EventEmitter {
  var pid: Double = js.native
  var stderr: Readable = js.native
  var stdin: Writable = js.native
  var stdout: Readable = js.native
  def disconnect(): Unit = js.native
  def kill(): Unit = js.native
  def kill(signal: String): Unit = js.native
  def send(message: js.Any): Unit = js.native
  def send(message: js.Any, sendHandle: js.Any): Unit = js.native
}

