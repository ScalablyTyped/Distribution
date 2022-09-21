package typings.fullcalendarCommon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventChangeArg extends StObject {
  
  var event: EventApi
  
  var oldEvent: EventApi
  
  var relatedEvents: js.Array[EventApi]
  
  def revert(): Unit
}
object EventChangeArg {
  
  inline def apply(event: EventApi, oldEvent: EventApi, relatedEvents: js.Array[EventApi], revert: () => Unit): EventChangeArg = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], oldEvent = oldEvent.asInstanceOf[js.Any], relatedEvents = relatedEvents.asInstanceOf[js.Any], revert = js.Any.fromFunction0(revert))
    __obj.asInstanceOf[EventChangeArg]
  }
  
  extension [Self <: EventChangeArg](x: Self) {
    
    inline def setEvent(value: EventApi): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setOldEvent(value: EventApi): Self = StObject.set(x, "oldEvent", value.asInstanceOf[js.Any])
    
    inline def setRelatedEvents(value: js.Array[EventApi]): Self = StObject.set(x, "relatedEvents", value.asInstanceOf[js.Any])
    
    inline def setRelatedEventsVarargs(value: EventApi*): Self = StObject.set(x, "relatedEvents", js.Array(value*))
    
    inline def setRevert(value: () => Unit): Self = StObject.set(x, "revert", js.Any.fromFunction0(value))
  }
}
