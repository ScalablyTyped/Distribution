package typings.freedom.freedom

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Channels are ways that freedom modules can send each other messages.
trait Channel
  extends StObject
     with OnAndEmit[Any, Any] {
  
  def close(): Unit
}
object Channel {
  
  inline def apply(
    close: () => Unit,
    emit: (/* eventType */ String, /* value */ js.UndefOr[Any]) => Unit,
    on: (/* eventType */ String, /* handler */ js.Function1[Any, Unit]) => Unit
  ): Channel = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), emit = js.Any.fromFunction2(emit), on = js.Any.fromFunction2(on))
    __obj.asInstanceOf[Channel]
  }
  
  extension [Self <: Channel](x: Self) {
    
    inline def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
  }
}
