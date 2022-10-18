package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlCalendarEvent extends StObject {
  
  var calendar_id: js.UndefOr[Id] = js.undefined
  
  var description: String
  
  var end_time: DateTime
  
  var event_id: js.UndefOr[Id] = js.undefined
  
  var start_time: DateTime
}
object MlCalendarEvent {
  
  inline def apply(description: String, end_time: DateTime, start_time: DateTime): MlCalendarEvent = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], end_time = end_time.asInstanceOf[js.Any], start_time = start_time.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlCalendarEvent]
  }
  
  extension [Self <: MlCalendarEvent](x: Self) {
    
    inline def setCalendar_id(value: Id): Self = StObject.set(x, "calendar_id", value.asInstanceOf[js.Any])
    
    inline def setCalendar_idUndefined: Self = StObject.set(x, "calendar_id", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setEnd_time(value: DateTime): Self = StObject.set(x, "end_time", value.asInstanceOf[js.Any])
    
    inline def setEvent_id(value: Id): Self = StObject.set(x, "event_id", value.asInstanceOf[js.Any])
    
    inline def setEvent_idUndefined: Self = StObject.set(x, "event_id", js.undefined)
    
    inline def setStart_time(value: DateTime): Self = StObject.set(x, "start_time", value.asInstanceOf[js.Any])
  }
}
