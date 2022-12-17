package typings.gestalt.anon

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventSyntheticEvent extends StObject {
  
  val event: typings.react.mod.SyntheticEvent[Element, typings.std.Event]
}
object EventSyntheticEvent {
  
  inline def apply(event: typings.react.mod.SyntheticEvent[Element, typings.std.Event]): EventSyntheticEvent = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventSyntheticEvent]
  }
  
  extension [Self <: EventSyntheticEvent](x: Self) {
    
    inline def setEvent(value: typings.react.mod.SyntheticEvent[Element, typings.std.Event]): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
  }
}
