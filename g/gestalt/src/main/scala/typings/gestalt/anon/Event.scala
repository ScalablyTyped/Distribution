package typings.gestalt.anon

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Event[T /* <: (typings.react.mod.SyntheticEvent[HTMLElement, typings.std.Event]) | typings.std.Event */] extends StObject {
  
  val event: T = js.native
}
object Event {
  
  @scala.inline
  def apply[T /* <: (typings.react.mod.SyntheticEvent[HTMLElement, typings.std.Event]) | typings.std.Event */](event: T): Event[T] = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event[T]]
  }
  
  @scala.inline
  implicit class EventMutableBuilder[Self <: Event[_], T /* <: (typings.react.mod.SyntheticEvent[HTMLElement, typings.std.Event]) | typings.std.Event */] (val x: Self with Event[T]) extends AnyVal {
    
    @scala.inline
    def setEvent(value: T): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
  }
}
