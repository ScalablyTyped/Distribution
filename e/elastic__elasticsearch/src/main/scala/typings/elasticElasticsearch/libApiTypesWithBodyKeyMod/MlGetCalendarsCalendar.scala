package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlGetCalendarsCalendar extends StObject {
  
  var calendar_id: Id
  
  var description: js.UndefOr[String] = js.undefined
  
  var job_ids: js.Array[Id]
}
object MlGetCalendarsCalendar {
  
  inline def apply(calendar_id: Id, job_ids: js.Array[Id]): MlGetCalendarsCalendar = {
    val __obj = js.Dynamic.literal(calendar_id = calendar_id.asInstanceOf[js.Any], job_ids = job_ids.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlGetCalendarsCalendar]
  }
  
  extension [Self <: MlGetCalendarsCalendar](x: Self) {
    
    inline def setCalendar_id(value: Id): Self = StObject.set(x, "calendar_id", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setJob_ids(value: js.Array[Id]): Self = StObject.set(x, "job_ids", value.asInstanceOf[js.Any])
    
    inline def setJob_idsVarargs(value: Id*): Self = StObject.set(x, "job_ids", js.Array(value*))
  }
}
