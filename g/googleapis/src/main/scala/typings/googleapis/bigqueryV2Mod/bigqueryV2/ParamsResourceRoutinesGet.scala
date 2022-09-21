package typings.googleapis.bigqueryV2Mod.bigqueryV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceRoutinesGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Dataset ID of the requested routine
    */
  var datasetId: js.UndefOr[String] = js.undefined
  
  /**
    * Required. Project ID of the requested routine
    */
  var projectId: js.UndefOr[String] = js.undefined
  
  /**
    * If set, only the Routine fields in the field mask are returned in the response. If unset, all Routine fields are returned.
    */
  var readMask: js.UndefOr[String] = js.undefined
  
  /**
    * Required. Routine ID of the requested routine
    */
  var routineId: js.UndefOr[String] = js.undefined
}
object ParamsResourceRoutinesGet {
  
  inline def apply(): ParamsResourceRoutinesGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceRoutinesGet]
  }
  
  extension [Self <: ParamsResourceRoutinesGet](x: Self) {
    
    inline def setDatasetId(value: String): Self = StObject.set(x, "datasetId", value.asInstanceOf[js.Any])
    
    inline def setDatasetIdUndefined: Self = StObject.set(x, "datasetId", js.undefined)
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    inline def setReadMask(value: String): Self = StObject.set(x, "readMask", value.asInstanceOf[js.Any])
    
    inline def setReadMaskUndefined: Self = StObject.set(x, "readMask", js.undefined)
    
    inline def setRoutineId(value: String): Self = StObject.set(x, "routineId", value.asInstanceOf[js.Any])
    
    inline def setRoutineIdUndefined: Self = StObject.set(x, "routineId", js.undefined)
  }
}
