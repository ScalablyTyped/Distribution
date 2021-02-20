package typings.gestalt.anon

import typings.react.mod.FocusEvent
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventFocusEvent extends StObject {
  
  var event: FocusEvent[HTMLInputElement] = js.native
  
  var value: String = js.native
}
object EventFocusEvent {
  
  @scala.inline
  def apply(event: FocusEvent[HTMLInputElement], value: String): EventFocusEvent = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventFocusEvent]
  }
  
  @scala.inline
  implicit class EventFocusEventMutableBuilder[Self <: EventFocusEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEvent(value: FocusEvent[HTMLInputElement]): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
