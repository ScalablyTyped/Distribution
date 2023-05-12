package typings.fullcalendarCore.anon

import typings.fullcalendarCore.fullcalendarCoreStrings.ADD_EVENTS
import typings.fullcalendarCore.internalCommonMod.Action
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// need all these?
trait EventStore
  extends StObject
     with Action {
  
  var eventStore: typings.fullcalendarCore.internalCommonMod.EventStore
  
  var `type`: ADD_EVENTS
}
object EventStore {
  
  inline def apply(eventStore: typings.fullcalendarCore.internalCommonMod.EventStore): EventStore = {
    val __obj = js.Dynamic.literal(eventStore = eventStore.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ADD_EVENTS")
    __obj.asInstanceOf[EventStore]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EventStore] (val x: Self) extends AnyVal {
    
    inline def setEventStore(value: typings.fullcalendarCore.internalCommonMod.EventStore): Self = StObject.set(x, "eventStore", value.asInstanceOf[js.Any])
    
    inline def setType(value: ADD_EVENTS): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
