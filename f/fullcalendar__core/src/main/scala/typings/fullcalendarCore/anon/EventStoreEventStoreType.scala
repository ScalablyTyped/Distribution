package typings.fullcalendarCore.anon

import typings.fullcalendarCore.fullcalendarCoreStrings.REMOVE_EVENTS
import typings.fullcalendarCore.internalCommonMod.Action
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventStoreEventStoreType
  extends StObject
     with Action {
  
  var eventStore: typings.fullcalendarCore.internalCommonMod.EventStore
  
  var `type`: REMOVE_EVENTS
}
object EventStoreEventStoreType {
  
  inline def apply(eventStore: typings.fullcalendarCore.internalCommonMod.EventStore): EventStoreEventStoreType = {
    val __obj = js.Dynamic.literal(eventStore = eventStore.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("REMOVE_EVENTS")
    __obj.asInstanceOf[EventStoreEventStoreType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EventStoreEventStoreType] (val x: Self) extends AnyVal {
    
    inline def setEventStore(value: typings.fullcalendarCore.internalCommonMod.EventStore): Self = StObject.set(x, "eventStore", value.asInstanceOf[js.Any])
    
    inline def setType(value: REMOVE_EVENTS): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
