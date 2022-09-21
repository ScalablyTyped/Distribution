package typings.googleapis.bigqueryV2Mod.bigqueryV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceRoutinesDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Dataset ID of the routine to delete
    */
  var datasetId: js.UndefOr[String] = js.undefined
  
  /**
    * Required. Project ID of the routine to delete
    */
  var projectId: js.UndefOr[String] = js.undefined
  
  /**
    * Required. Routine ID of the routine to delete
    */
  var routineId: js.UndefOr[String] = js.undefined
}
object ParamsResourceRoutinesDelete {
  
  inline def apply(): ParamsResourceRoutinesDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceRoutinesDelete]
  }
  
  extension [Self <: ParamsResourceRoutinesDelete](x: Self) {
    
    inline def setDatasetId(value: String): Self = StObject.set(x, "datasetId", value.asInstanceOf[js.Any])
    
    inline def setDatasetIdUndefined: Self = StObject.set(x, "datasetId", js.undefined)
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    inline def setRoutineId(value: String): Self = StObject.set(x, "routineId", value.asInstanceOf[js.Any])
    
    inline def setRoutineIdUndefined: Self = StObject.set(x, "routineId", js.undefined)
  }
}
