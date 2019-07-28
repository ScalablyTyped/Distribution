package typings.freedom.freedomNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// TODO: replace OnAndEmit with EventHandler and EventEmitter;
@js.native
trait OnAndEmit[T, T2] extends js.Object {
  @JSName("emit")
  var emit_Original: EventDispatchFn[T2] = js.native
  @JSName("on")
  var on_Original: EventHandlerFn[T] = js.native
  def emit(eventType: String): Unit = js.native
  def emit(eventType: String, value: T2): Unit = js.native
  def on(eventType: String, handler: js.Function1[/* eventData */ T, Unit]): Unit = js.native
}

