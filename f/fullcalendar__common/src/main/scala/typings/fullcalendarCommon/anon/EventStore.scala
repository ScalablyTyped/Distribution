package typings.fullcalendarCommon.anon

import typings.fullcalendarCommon.fullcalendarCommonStrings.ADD_EVENTS
import typings.fullcalendarCommon.mod.Action
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventStore
  extends StObject
     with Action {
  
  var eventStore: typings.fullcalendarCommon.mod.EventStore
  
  var `type`: ADD_EVENTS
}
object EventStore {
  
  inline def apply(eventStore: typings.fullcalendarCommon.mod.EventStore): EventStore = {
    val __obj = js.Dynamic.literal(eventStore = eventStore.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ADD_EVENTS")
    __obj.asInstanceOf[EventStore]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EventStore] (val x: Self) extends AnyVal {
    
    inline def setEventStore(value: typings.fullcalendarCommon.mod.EventStore): Self = StObject.set(x, "eventStore", value.asInstanceOf[js.Any])
    
    inline def setType(value: ADD_EVENTS): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
