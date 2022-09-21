package typings.googleapis.bigqueryV2Mod.bigqueryV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceDatasetsDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Dataset ID of dataset being deleted
    */
  var datasetId: js.UndefOr[String] = js.undefined
  
  /**
    * If True, delete all the tables in the dataset. If False and the dataset contains tables, the request will fail. Default is False
    */
  var deleteContents: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Project ID of the dataset being deleted
    */
  var projectId: js.UndefOr[String] = js.undefined
}
object ParamsResourceDatasetsDelete {
  
  inline def apply(): ParamsResourceDatasetsDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceDatasetsDelete]
  }
  
  extension [Self <: ParamsResourceDatasetsDelete](x: Self) {
    
    inline def setDatasetId(value: String): Self = StObject.set(x, "datasetId", value.asInstanceOf[js.Any])
    
    inline def setDatasetIdUndefined: Self = StObject.set(x, "datasetId", js.undefined)
    
    inline def setDeleteContents(value: Boolean): Self = StObject.set(x, "deleteContents", value.asInstanceOf[js.Any])
    
    inline def setDeleteContentsUndefined: Self = StObject.set(x, "deleteContents", js.undefined)
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
  }
}
