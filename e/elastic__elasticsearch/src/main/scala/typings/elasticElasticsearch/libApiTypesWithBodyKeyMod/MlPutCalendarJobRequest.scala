package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlPutCalendarJobRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var calendar_id: Id
  
  var job_id: Id
}
object MlPutCalendarJobRequest {
  
  inline def apply(calendar_id: Id, job_id: Id): MlPutCalendarJobRequest = {
    val __obj = js.Dynamic.literal(calendar_id = calendar_id.asInstanceOf[js.Any], job_id = job_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlPutCalendarJobRequest]
  }
  
  extension [Self <: MlPutCalendarJobRequest](x: Self) {
    
    inline def setCalendar_id(value: Id): Self = StObject.set(x, "calendar_id", value.asInstanceOf[js.Any])
    
    inline def setJob_id(value: Id): Self = StObject.set(x, "job_id", value.asInstanceOf[js.Any])
  }
}
