package typings.gestalt.anon

import typings.react.mod.FocusEvent
import typings.std.Element
import typings.std.HTMLTextAreaElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventFocusEventValueString extends StObject {
  
  var event: FocusEvent[HTMLTextAreaElement, Element]
  
  var value: String
}
object EventFocusEventValueString {
  
  inline def apply(event: FocusEvent[HTMLTextAreaElement, Element], value: String): EventFocusEventValueString = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventFocusEventValueString]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EventFocusEventValueString] (val x: Self) extends AnyVal {
    
    inline def setEvent(value: FocusEvent[HTMLTextAreaElement, Element]): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
