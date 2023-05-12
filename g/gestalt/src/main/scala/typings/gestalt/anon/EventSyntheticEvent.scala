package typings.gestalt.anon

import typings.react.mod.SyntheticEvent
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventSyntheticEvent extends StObject {
  
  val event: SyntheticEvent[Element, typings.std.Event]
}
object EventSyntheticEvent {
  
  inline def apply(event: SyntheticEvent[Element, typings.std.Event]): EventSyntheticEvent = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventSyntheticEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EventSyntheticEvent] (val x: Self) extends AnyVal {
    
    inline def setEvent(value: SyntheticEvent[Element, typings.std.Event]): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
  }
}
