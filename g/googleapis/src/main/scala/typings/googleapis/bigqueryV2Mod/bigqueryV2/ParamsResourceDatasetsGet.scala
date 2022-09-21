package typings.googleapis.bigqueryV2Mod.bigqueryV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceDatasetsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Dataset ID of the requested dataset
    */
  var datasetId: js.UndefOr[String] = js.undefined
  
  /**
    * Project ID of the requested dataset
    */
  var projectId: js.UndefOr[String] = js.undefined
}
object ParamsResourceDatasetsGet {
  
  inline def apply(): ParamsResourceDatasetsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceDatasetsGet]
  }
  
  extension [Self <: ParamsResourceDatasetsGet](x: Self) {
    
    inline def setDatasetId(value: String): Self = StObject.set(x, "datasetId", value.asInstanceOf[js.Any])
    
    inline def setDatasetIdUndefined: Self = StObject.set(x, "datasetId", js.undefined)
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
  }
}
