package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlPutCalendarResponse extends StObject {
  
  var calendar_id: Id
  
  var description: js.UndefOr[String] = js.undefined
  
  var job_ids: Ids
}
object MlPutCalendarResponse {
  
  inline def apply(calendar_id: Id, job_ids: Ids): MlPutCalendarResponse = {
    val __obj = js.Dynamic.literal(calendar_id = calendar_id.asInstanceOf[js.Any], job_ids = job_ids.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlPutCalendarResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MlPutCalendarResponse] (val x: Self) extends AnyVal {
    
    inline def setCalendar_id(value: Id): Self = StObject.set(x, "calendar_id", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setJob_ids(value: Ids): Self = StObject.set(x, "job_ids", value.asInstanceOf[js.Any])
    
    inline def setJob_idsVarargs(value: Id*): Self = StObject.set(x, "job_ids", js.Array(value*))
  }
}
