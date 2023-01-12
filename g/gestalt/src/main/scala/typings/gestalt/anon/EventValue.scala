package typings.gestalt.anon

import typings.react.mod.FocusEvent
import typings.std.Element
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventValue extends StObject {
  
  var event: (FocusEvent[HTMLInputElement, Element]) | (typings.react.mod.SyntheticEvent[HTMLInputElement, typings.std.Event])
  
  var value: String
}
object EventValue {
  
  inline def apply(
    event: (FocusEvent[HTMLInputElement, Element]) | (typings.react.mod.SyntheticEvent[HTMLInputElement, typings.std.Event]),
    value: String
  ): EventValue = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EventValue] (val x: Self) extends AnyVal {
    
    inline def setEvent(
      value: (FocusEvent[HTMLInputElement, Element]) | (typings.react.mod.SyntheticEvent[HTMLInputElement, typings.std.Event])
    ): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
