package typings
package eventDashEmitterDashEs6Lib.eventDashEmitterDashEs6Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventEmitter extends js.Object {
  def destroy(): scala.Unit = js.native
  def emit(`type`: java.lang.String, eventArgs: js.Any*): scala.Unit = js.native
  def emitSync(`type`: java.lang.String, eventArgs: js.Any*): scala.Unit = js.native
  def off(`type`: java.lang.String): scala.Unit = js.native
  def off(`type`: java.lang.String, listener: Listener): scala.Unit = js.native
  def on(`type`: java.lang.String, listener: Listener): scala.Unit = js.native
  def once(`type`: java.lang.String, listener: Listener): scala.Unit = js.native
}

