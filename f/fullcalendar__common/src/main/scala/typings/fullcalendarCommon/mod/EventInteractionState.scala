package typings.fullcalendarCommon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventInteractionState extends StObject {
  
  var affectedEvents: EventStore
  
  var isEvent: Boolean
  
  var mutatedEvents: EventStore
}
object EventInteractionState {
  
  inline def apply(affectedEvents: EventStore, isEvent: Boolean, mutatedEvents: EventStore): EventInteractionState = {
    val __obj = js.Dynamic.literal(affectedEvents = affectedEvents.asInstanceOf[js.Any], isEvent = isEvent.asInstanceOf[js.Any], mutatedEvents = mutatedEvents.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventInteractionState]
  }
  
  extension [Self <: EventInteractionState](x: Self) {
    
    inline def setAffectedEvents(value: EventStore): Self = StObject.set(x, "affectedEvents", value.asInstanceOf[js.Any])
    
    inline def setIsEvent(value: Boolean): Self = StObject.set(x, "isEvent", value.asInstanceOf[js.Any])
    
    inline def setMutatedEvents(value: EventStore): Self = StObject.set(x, "mutatedEvents", value.asInstanceOf[js.Any])
  }
}
