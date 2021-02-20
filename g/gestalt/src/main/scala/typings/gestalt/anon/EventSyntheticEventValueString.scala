package typings.gestalt.anon

import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventSyntheticEventValueString extends StObject {
  
  var event: typings.react.mod.SyntheticEvent[HTMLInputElement, typings.std.Event] = js.native
  
  var value: String = js.native
}
object EventSyntheticEventValueString {
  
  @scala.inline
  def apply(event: typings.react.mod.SyntheticEvent[HTMLInputElement, typings.std.Event], value: String): EventSyntheticEventValueString = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventSyntheticEventValueString]
  }
  
  @scala.inline
  implicit class EventSyntheticEventValueStringMutableBuilder[Self <: EventSyntheticEventValueString] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEvent(value: typings.react.mod.SyntheticEvent[HTMLInputElement, typings.std.Event]): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
