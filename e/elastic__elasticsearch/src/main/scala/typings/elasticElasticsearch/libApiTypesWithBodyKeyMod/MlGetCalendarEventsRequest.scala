package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlGetCalendarEventsRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var calendar_id: Id
  
  var end: js.UndefOr[DateTime] = js.undefined
  
  var from: js.UndefOr[integer] = js.undefined
  
  var job_id: js.UndefOr[Id] = js.undefined
  
  var size: js.UndefOr[integer] = js.undefined
  
  var start: js.UndefOr[DateTime] = js.undefined
}
object MlGetCalendarEventsRequest {
  
  inline def apply(calendar_id: Id): MlGetCalendarEventsRequest = {
    val __obj = js.Dynamic.literal(calendar_id = calendar_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlGetCalendarEventsRequest]
  }
  
  extension [Self <: MlGetCalendarEventsRequest](x: Self) {
    
    inline def setCalendar_id(value: Id): Self = StObject.set(x, "calendar_id", value.asInstanceOf[js.Any])
    
    inline def setEnd(value: DateTime): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    inline def setFrom(value: integer): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    inline def setJob_id(value: Id): Self = StObject.set(x, "job_id", value.asInstanceOf[js.Any])
    
    inline def setJob_idUndefined: Self = StObject.set(x, "job_id", js.undefined)
    
    inline def setSize(value: integer): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setStart(value: DateTime): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
  }
}
