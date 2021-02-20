package typings.gestalt.anon

import typings.react.mod.FocusEvent
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventValueString extends StObject {
  
  var event: FocusEvent[HTMLInputElement] | (typings.react.mod.SyntheticEvent[HTMLInputElement, typings.std.Event]) = js.native
  
  var value: String = js.native
}
object EventValueString {
  
  @scala.inline
  def apply(
    event: FocusEvent[HTMLInputElement] | (typings.react.mod.SyntheticEvent[HTMLInputElement, typings.std.Event]),
    value: String
  ): EventValueString = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventValueString]
  }
  
  @scala.inline
  implicit class EventValueStringMutableBuilder[Self <: EventValueString] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEvent(
      value: FocusEvent[HTMLInputElement] | (typings.react.mod.SyntheticEvent[HTMLInputElement, typings.std.Event])
    ): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
