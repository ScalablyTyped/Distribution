package typings.fullcalendarCore.anon

import typings.fullcalendarCore.fullcalendarCoreStrings.MERGE_EVENTS
import typings.fullcalendarCore.internalCommonMod.Action
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventStoreEventStore
  extends StObject
     with Action {
  
  var eventStore: typings.fullcalendarCore.internalCommonMod.EventStore
  
  var `type`: MERGE_EVENTS
}
object EventStoreEventStore {
  
  inline def apply(eventStore: typings.fullcalendarCore.internalCommonMod.EventStore): EventStoreEventStore = {
    val __obj = js.Dynamic.literal(eventStore = eventStore.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("MERGE_EVENTS")
    __obj.asInstanceOf[EventStoreEventStore]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EventStoreEventStore] (val x: Self) extends AnyVal {
    
    inline def setEventStore(value: typings.fullcalendarCore.internalCommonMod.EventStore): Self = StObject.set(x, "eventStore", value.asInstanceOf[js.Any])
    
    inline def setType(value: MERGE_EVENTS): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
