package typings.fullcalendarCore.internalCommonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventChangeArg extends StObject {
  
  var event: EventImpl
  
  var oldEvent: EventImpl
  
  var relatedEvents: js.Array[EventImpl]
  
  def revert(): Unit
}
object EventChangeArg {
  
  inline def apply(event: EventImpl, oldEvent: EventImpl, relatedEvents: js.Array[EventImpl], revert: () => Unit): EventChangeArg = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], oldEvent = oldEvent.asInstanceOf[js.Any], relatedEvents = relatedEvents.asInstanceOf[js.Any], revert = js.Any.fromFunction0(revert))
    __obj.asInstanceOf[EventChangeArg]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EventChangeArg] (val x: Self) extends AnyVal {
    
    inline def setEvent(value: EventImpl): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setOldEvent(value: EventImpl): Self = StObject.set(x, "oldEvent", value.asInstanceOf[js.Any])
    
    inline def setRelatedEvents(value: js.Array[EventImpl]): Self = StObject.set(x, "relatedEvents", value.asInstanceOf[js.Any])
    
    inline def setRelatedEventsVarargs(value: EventImpl*): Self = StObject.set(x, "relatedEvents", js.Array(value*))
    
    inline def setRevert(value: () => Unit): Self = StObject.set(x, "revert", js.Any.fromFunction0(value))
  }
}
