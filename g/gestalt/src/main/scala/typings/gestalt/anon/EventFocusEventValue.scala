package typings.gestalt.anon

import typings.react.mod.FocusEvent
import typings.std.Element
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventFocusEventValue extends StObject {
  
  var event: FocusEvent[HTMLInputElement, Element]
  
  var value: js.UndefOr[Double] = js.undefined
}
object EventFocusEventValue {
  
  inline def apply(event: FocusEvent[HTMLInputElement, Element]): EventFocusEventValue = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventFocusEventValue]
  }
  
  extension [Self <: EventFocusEventValue](x: Self) {
    
    inline def setEvent(value: FocusEvent[HTMLInputElement, Element]): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
