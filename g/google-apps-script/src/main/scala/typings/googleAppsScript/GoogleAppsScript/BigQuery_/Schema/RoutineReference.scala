package typings.googleAppsScript.GoogleAppsScript.BigQuery_.Schema

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RoutineReference extends StObject {
  
  var datasetId: js.UndefOr[String] = js.undefined
  
  var projectId: js.UndefOr[String] = js.undefined
  
  var routineId: js.UndefOr[String] = js.undefined
}
object RoutineReference {
  
  inline def apply(): RoutineReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RoutineReference]
  }
  
  extension [Self <: RoutineReference](x: Self) {
    
    inline def setDatasetId(value: String): Self = StObject.set(x, "datasetId", value.asInstanceOf[js.Any])
    
    inline def setDatasetIdUndefined: Self = StObject.set(x, "datasetId", js.undefined)
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    inline def setRoutineId(value: String): Self = StObject.set(x, "routineId", value.asInstanceOf[js.Any])
    
    inline def setRoutineIdUndefined: Self = StObject.set(x, "routineId", js.undefined)
  }
}
