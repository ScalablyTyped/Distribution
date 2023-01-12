package typings.freedom.freedom

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// TODO: replace OnAndEmit with EventHandler and EventEmitter;
trait OnAndEmit[T, T2] extends StObject {
  
  def emit(eventType: String): Unit
  def emit(eventType: String, value: T2): Unit
  @JSName("emit")
  var emit_Original: EventDispatchFn[T2]
  
  def on(eventType: String, handler: js.Function1[/* eventData */ T, Unit]): Unit
  @JSName("on")
  var on_Original: EventHandlerFn[T]
}
object OnAndEmit {
  
  inline def apply[T, T2](
    emit: (/* eventType */ String, /* value */ js.UndefOr[T2]) => Unit,
    on: (/* eventType */ String, /* handler */ js.Function1[T, Unit]) => Unit
  ): OnAndEmit[T, T2] = {
    val __obj = js.Dynamic.literal(emit = js.Any.fromFunction2(emit), on = js.Any.fromFunction2(on))
    __obj.asInstanceOf[OnAndEmit[T, T2]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OnAndEmit[?, ?], T, T2] (val x: Self & (OnAndEmit[T, T2])) extends AnyVal {
    
    inline def setEmit(value: (/* eventType */ String, /* value */ js.UndefOr[T2]) => Unit): Self = StObject.set(x, "emit", js.Any.fromFunction2(value))
    
    inline def setOn(value: (/* eventType */ String, /* handler */ js.Function1[T, Unit]) => Unit): Self = StObject.set(x, "on", js.Any.fromFunction2(value))
  }
}
