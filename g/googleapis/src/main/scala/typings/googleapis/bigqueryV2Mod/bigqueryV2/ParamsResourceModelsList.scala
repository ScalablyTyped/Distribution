package typings.googleapis.bigqueryV2Mod.bigqueryV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceModelsList
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Dataset ID of the models to list.
    */
  var datasetId: js.UndefOr[String] = js.undefined
  
  /**
    * The maximum number of results to return in a single response page. Leverage the page tokens to iterate through the entire collection.
    */
  var maxResults: js.UndefOr[Double] = js.undefined
  
  /**
    * Page token, returned by a previous call to request the next page of results
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Required. Project ID of the models to list.
    */
  var projectId: js.UndefOr[String] = js.undefined
}
object ParamsResourceModelsList {
  
  inline def apply(): ParamsResourceModelsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceModelsList]
  }
  
  extension [Self <: ParamsResourceModelsList](x: Self) {
    
    inline def setDatasetId(value: String): Self = StObject.set(x, "datasetId", value.asInstanceOf[js.Any])
    
    inline def setDatasetIdUndefined: Self = StObject.set(x, "datasetId", js.undefined)
    
    inline def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
  }
}
