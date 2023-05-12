package typings.gestalt.anon

import typings.react.mod.SyntheticEvent
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Event[T /* <: (SyntheticEvent[HTMLElement, typings.std.Event]) | typings.std.Event */] extends StObject {
  
  val event: T
}
object Event {
  
  inline def apply[T /* <: (SyntheticEvent[HTMLElement, typings.std.Event]) | typings.std.Event */](event: T): Event[T] = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Event[?], T /* <: (SyntheticEvent[HTMLElement, typings.std.Event]) | typings.std.Event */] (val x: Self & Event[T]) extends AnyVal {
    
    inline def setEvent(value: T): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
  }
}
