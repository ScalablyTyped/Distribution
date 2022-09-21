package typings.gestalt.anon

import typings.std.HTMLTextAreaElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventSyntheticEventValueString extends StObject {
  
  var event: typings.react.mod.SyntheticEvent[HTMLTextAreaElement, typings.std.Event]
  
  var value: String
}
object EventSyntheticEventValueString {
  
  inline def apply(event: typings.react.mod.SyntheticEvent[HTMLTextAreaElement, typings.std.Event], value: String): EventSyntheticEventValueString = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventSyntheticEventValueString]
  }
  
  extension [Self <: EventSyntheticEventValueString](x: Self) {
    
    inline def setEvent(value: typings.react.mod.SyntheticEvent[HTMLTextAreaElement, typings.std.Event]): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
