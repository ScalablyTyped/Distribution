package typings.fullcalendarCore.anon

import typings.fullcalendarCore.fullcalendarCoreStrings.RECEIVE_EVENTS
import typings.fullcalendarCore.internalCommonMod.Action
import typings.fullcalendarCore.internalCommonMod.DateRange
import typings.fullcalendarCore.internalCommonMod.EventInput
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// if no sourceIds, fetch all
trait FetchId
  extends StObject
     with Action {
  
  var fetchId: String
  
  var fetchRange: DateRange | Null
  
  var rawEvents: js.Array[EventInput]
  
  var sourceId: String
  
  var `type`: RECEIVE_EVENTS
}
object FetchId {
  
  inline def apply(fetchId: String, rawEvents: js.Array[EventInput], sourceId: String): FetchId = {
    val __obj = js.Dynamic.literal(fetchId = fetchId.asInstanceOf[js.Any], rawEvents = rawEvents.asInstanceOf[js.Any], sourceId = sourceId.asInstanceOf[js.Any], fetchRange = null)
    __obj.updateDynamic("type")("RECEIVE_EVENTS")
    __obj.asInstanceOf[FetchId]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FetchId] (val x: Self) extends AnyVal {
    
    inline def setFetchId(value: String): Self = StObject.set(x, "fetchId", value.asInstanceOf[js.Any])
    
    inline def setFetchRange(value: DateRange): Self = StObject.set(x, "fetchRange", value.asInstanceOf[js.Any])
    
    inline def setFetchRangeNull: Self = StObject.set(x, "fetchRange", null)
    
    inline def setRawEvents(value: js.Array[EventInput]): Self = StObject.set(x, "rawEvents", value.asInstanceOf[js.Any])
    
    inline def setRawEventsVarargs(value: EventInput*): Self = StObject.set(x, "rawEvents", js.Array(value*))
    
    inline def setSourceId(value: String): Self = StObject.set(x, "sourceId", value.asInstanceOf[js.Any])
    
    inline def setType(value: RECEIVE_EVENTS): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
