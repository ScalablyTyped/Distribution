package typings.fullcalendarCore.anon

import typings.fullcalendarCore.fullcalendarCoreStrings.RESET_RAW_EVENTS
import typings.fullcalendarCore.internalCommonMod.Action
import typings.fullcalendarCore.internalCommonMod.EventInput
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RawEvents
  extends StObject
     with Action {
  
  var rawEvents: js.Array[EventInput]
  
  var sourceId: String
  
  var `type`: RESET_RAW_EVENTS
}
object RawEvents {
  
  inline def apply(rawEvents: js.Array[EventInput], sourceId: String): RawEvents = {
    val __obj = js.Dynamic.literal(rawEvents = rawEvents.asInstanceOf[js.Any], sourceId = sourceId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("RESET_RAW_EVENTS")
    __obj.asInstanceOf[RawEvents]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RawEvents] (val x: Self) extends AnyVal {
    
    inline def setRawEvents(value: js.Array[EventInput]): Self = StObject.set(x, "rawEvents", value.asInstanceOf[js.Any])
    
    inline def setRawEventsVarargs(value: EventInput*): Self = StObject.set(x, "rawEvents", js.Array(value*))
    
    inline def setSourceId(value: String): Self = StObject.set(x, "sourceId", value.asInstanceOf[js.Any])
    
    inline def setType(value: RESET_RAW_EVENTS): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
