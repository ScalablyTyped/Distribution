package typings.googleapis.bigqueryV2Mod.bigqueryV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceRowaccesspoliciesList
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Dataset ID of row access policies to list.
    */
  var datasetId: js.UndefOr[String] = js.undefined
  
  /**
    * The maximum number of results to return in a single response page. Leverage the page tokens to iterate through the entire collection.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * Page token, returned by a previous call, to request the next page of results.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Required. Project ID of the row access policies to list.
    */
  var projectId: js.UndefOr[String] = js.undefined
  
  /**
    * Required. Table ID of the table to list row access policies.
    */
  var tableId: js.UndefOr[String] = js.undefined
}
object ParamsResourceRowaccesspoliciesList {
  
  inline def apply(): ParamsResourceRowaccesspoliciesList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceRowaccesspoliciesList]
  }
  
  extension [Self <: ParamsResourceRowaccesspoliciesList](x: Self) {
    
    inline def setDatasetId(value: String): Self = StObject.set(x, "datasetId", value.asInstanceOf[js.Any])
    
    inline def setDatasetIdUndefined: Self = StObject.set(x, "datasetId", js.undefined)
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    inline def setTableId(value: String): Self = StObject.set(x, "tableId", value.asInstanceOf[js.Any])
    
    inline def setTableIdUndefined: Self = StObject.set(x, "tableId", js.undefined)
  }
}
