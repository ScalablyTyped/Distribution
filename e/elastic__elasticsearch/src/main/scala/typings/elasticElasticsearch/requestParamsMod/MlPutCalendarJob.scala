package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlPutCalendarJob
  extends StObject
     with Generic {
  
  var calendar_id: String
  
  var job_id: String
}
object MlPutCalendarJob {
  
  inline def apply(calendar_id: String, job_id: String): MlPutCalendarJob = {
    val __obj = js.Dynamic.literal(calendar_id = calendar_id.asInstanceOf[js.Any], job_id = job_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlPutCalendarJob]
  }
  
  extension [Self <: MlPutCalendarJob](x: Self) {
    
    inline def setCalendar_id(value: String): Self = StObject.set(x, "calendar_id", value.asInstanceOf[js.Any])
    
    inline def setJob_id(value: String): Self = StObject.set(x, "job_id", value.asInstanceOf[js.Any])
  }
}
