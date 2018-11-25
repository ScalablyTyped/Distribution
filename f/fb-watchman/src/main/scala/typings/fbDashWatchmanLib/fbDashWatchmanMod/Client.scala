package typings
package fbDashWatchmanLib.fbDashWatchmanMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fb-watchman", "Client")
@js.native
class Client ()
  extends eventsLib.eventsMod.EventEmitter {
  def this(options: ClientOptions) = this()
  def cancelCommands(why: java.lang.String): scala.Unit = js.native
  def capabilityCheck(caps: Capabilities, done: doneCallback): scala.Unit = js.native
  def command(args: js.Any, done: doneCallback): scala.Unit = js.native
  def connect(): scala.Unit = js.native
  def end(): scala.Unit = js.native
  def sendNextCommand(): scala.Unit = js.native
}

