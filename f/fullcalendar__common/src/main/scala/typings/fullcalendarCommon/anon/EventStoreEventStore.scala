package typings.fullcalendarCommon.anon

import typings.fullcalendarCommon.fullcalendarCommonStrings.MERGE_EVENTS
import typings.fullcalendarCommon.mod.Action
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventStoreEventStore
  extends StObject
     with Action {
  
  var eventStore: typings.fullcalendarCommon.mod.EventStore
  
  var `type`: MERGE_EVENTS
}
object EventStoreEventStore {
  
  inline def apply(eventStore: typings.fullcalendarCommon.mod.EventStore): EventStoreEventStore = {
    val __obj = js.Dynamic.literal(eventStore = eventStore.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("MERGE_EVENTS")
    __obj.asInstanceOf[EventStoreEventStore]
  }
  
  extension [Self <: EventStoreEventStore](x: Self) {
    
    inline def setEventStore(value: typings.fullcalendarCommon.mod.EventStore): Self = StObject.set(x, "eventStore", value.asInstanceOf[js.Any])
    
    inline def setType(value: MERGE_EVENTS): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
