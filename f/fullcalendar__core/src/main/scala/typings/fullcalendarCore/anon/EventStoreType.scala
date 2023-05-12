package typings.fullcalendarCore.anon

import typings.fullcalendarCore.fullcalendarCoreStrings.RESET_EVENTS
import typings.fullcalendarCore.internalCommonMod.Action
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventStoreType
  extends StObject
     with Action {
  
  var eventStore: typings.fullcalendarCore.internalCommonMod.EventStore
  
  var `type`: RESET_EVENTS
}
object EventStoreType {
  
  inline def apply(eventStore: typings.fullcalendarCore.internalCommonMod.EventStore): EventStoreType = {
    val __obj = js.Dynamic.literal(eventStore = eventStore.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("RESET_EVENTS")
    __obj.asInstanceOf[EventStoreType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EventStoreType] (val x: Self) extends AnyVal {
    
    inline def setEventStore(value: typings.fullcalendarCore.internalCommonMod.EventStore): Self = StObject.set(x, "eventStore", value.asInstanceOf[js.Any])
    
    inline def setType(value: RESET_EVENTS): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
