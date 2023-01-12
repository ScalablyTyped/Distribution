package typings.gestalt.anon

import typings.react.mod.FocusEvent
import typings.std.Element
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventFocusEvent extends StObject {
  
  var event: FocusEvent[HTMLInputElement, Element]
  
  var value: String
}
object EventFocusEvent {
  
  inline def apply(event: FocusEvent[HTMLInputElement, Element], value: String): EventFocusEvent = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventFocusEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EventFocusEvent] (val x: Self) extends AnyVal {
    
    inline def setEvent(value: FocusEvent[HTMLInputElement, Element]): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
