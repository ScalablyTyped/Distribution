package typings.freedom.freedom

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// TODO: replace OnAndEmit with EventHandler and EventEmitter;
@js.native
trait OnAndEmit[T, T2] extends StObject {
  
  def emit(eventType: String): Unit = js.native
  def emit(eventType: String, value: T2): Unit = js.native
  @JSName("emit")
  var emit_Original: EventDispatchFn[T2] = js.native
  
  def on(eventType: String, handler: js.Function1[/* eventData */ T, Unit]): Unit = js.native
  @JSName("on")
  var on_Original: EventHandlerFn[T] = js.native
}
