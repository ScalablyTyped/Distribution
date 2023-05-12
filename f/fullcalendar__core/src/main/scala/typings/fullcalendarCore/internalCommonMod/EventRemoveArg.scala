package typings.fullcalendarCore.internalCommonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventRemoveArg extends StObject {
  
  var event: EventImpl
  
  var relatedEvents: js.Array[EventImpl]
  
  def revert(): Unit
}
object EventRemoveArg {
  
  inline def apply(event: EventImpl, relatedEvents: js.Array[EventImpl], revert: () => Unit): EventRemoveArg = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], relatedEvents = relatedEvents.asInstanceOf[js.Any], revert = js.Any.fromFunction0(revert))
    __obj.asInstanceOf[EventRemoveArg]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EventRemoveArg] (val x: Self) extends AnyVal {
    
    inline def setEvent(value: EventImpl): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setRelatedEvents(value: js.Array[EventImpl]): Self = StObject.set(x, "relatedEvents", value.asInstanceOf[js.Any])
    
    inline def setRelatedEventsVarargs(value: EventImpl*): Self = StObject.set(x, "relatedEvents", js.Array(value*))
    
    inline def setRevert(value: () => Unit): Self = StObject.set(x, "revert", js.Any.fromFunction0(value))
  }
}
