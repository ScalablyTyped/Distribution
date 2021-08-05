package typings.gestalt.anon

import typings.react.mod.FocusEvent
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventValueString extends StObject {
  
  var event: FocusEvent[HTMLInputElement] | (typings.react.mod.SyntheticEvent[HTMLInputElement, typings.std.Event])
  
  var value: String
}
object EventValueString {
  
  inline def apply(
    event: FocusEvent[HTMLInputElement] | (typings.react.mod.SyntheticEvent[HTMLInputElement, typings.std.Event]),
    value: String
  ): EventValueString = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventValueString]
  }
  
  extension [Self <: EventValueString](x: Self) {
    
    inline def setEvent(
      value: FocusEvent[HTMLInputElement] | (typings.react.mod.SyntheticEvent[HTMLInputElement, typings.std.Event])
    ): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
