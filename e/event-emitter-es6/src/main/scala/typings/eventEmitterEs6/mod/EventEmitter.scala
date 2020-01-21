package typings.eventEmitterEs6.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventEmitter extends js.Object {
  def destroy(): Unit = js.native
  def emit(`type`: String, eventArgs: js.Any*): Unit = js.native
  def emitSync(`type`: String, eventArgs: js.Any*): Unit = js.native
  def off(`type`: String): Unit = js.native
  def off(`type`: String, listener: Listener): Unit = js.native
  def on(`type`: String, listener: Listener): Unit = js.native
  def once(`type`: String, listener: Listener): Unit = js.native
}

