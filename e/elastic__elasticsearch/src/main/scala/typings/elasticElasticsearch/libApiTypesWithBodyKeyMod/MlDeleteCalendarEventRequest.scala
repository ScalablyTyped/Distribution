package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlDeleteCalendarEventRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var calendar_id: Id
  
  var event_id: Id
}
object MlDeleteCalendarEventRequest {
  
  inline def apply(calendar_id: Id, event_id: Id): MlDeleteCalendarEventRequest = {
    val __obj = js.Dynamic.literal(calendar_id = calendar_id.asInstanceOf[js.Any], event_id = event_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlDeleteCalendarEventRequest]
  }
  
  extension [Self <: MlDeleteCalendarEventRequest](x: Self) {
    
    inline def setCalendar_id(value: Id): Self = StObject.set(x, "calendar_id", value.asInstanceOf[js.Any])
    
    inline def setEvent_id(value: Id): Self = StObject.set(x, "event_id", value.asInstanceOf[js.Any])
  }
}
