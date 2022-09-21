package typings.googleapis.bigqueryV2Mod.bigqueryV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceModelsDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Dataset ID of the model to delete.
    */
  var datasetId: js.UndefOr[String] = js.undefined
  
  /**
    * Required. Model ID of the model to delete.
    */
  var modelId: js.UndefOr[String] = js.undefined
  
  /**
    * Required. Project ID of the model to delete.
    */
  var projectId: js.UndefOr[String] = js.undefined
}
object ParamsResourceModelsDelete {
  
  inline def apply(): ParamsResourceModelsDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceModelsDelete]
  }
  
  extension [Self <: ParamsResourceModelsDelete](x: Self) {
    
    inline def setDatasetId(value: String): Self = StObject.set(x, "datasetId", value.asInstanceOf[js.Any])
    
    inline def setDatasetIdUndefined: Self = StObject.set(x, "datasetId", js.undefined)
    
    inline def setModelId(value: String): Self = StObject.set(x, "modelId", value.asInstanceOf[js.Any])
    
    inline def setModelIdUndefined: Self = StObject.set(x, "modelId", js.undefined)
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
  }
}
