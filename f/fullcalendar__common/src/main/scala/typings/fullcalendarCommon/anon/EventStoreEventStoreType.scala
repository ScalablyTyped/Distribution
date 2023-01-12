package typings.fullcalendarCommon.anon

import typings.fullcalendarCommon.fullcalendarCommonStrings.REMOVE_EVENTS
import typings.fullcalendarCommon.mod.Action
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventStoreEventStoreType
  extends StObject
     with Action {
  
  var eventStore: typings.fullcalendarCommon.mod.EventStore
  
  var `type`: REMOVE_EVENTS
}
object EventStoreEventStoreType {
  
  inline def apply(eventStore: typings.fullcalendarCommon.mod.EventStore): EventStoreEventStoreType = {
    val __obj = js.Dynamic.literal(eventStore = eventStore.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("REMOVE_EVENTS")
    __obj.asInstanceOf[EventStoreEventStoreType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EventStoreEventStoreType] (val x: Self) extends AnyVal {
    
    inline def setEventStore(value: typings.fullcalendarCommon.mod.EventStore): Self = StObject.set(x, "eventStore", value.asInstanceOf[js.Any])
    
    inline def setType(value: REMOVE_EVENTS): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
