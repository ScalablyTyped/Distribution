package typings.googleapis.bigqueryV2Mod.bigqueryV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceTabledataList
  extends StObject
     with StandardParameters {
  
  /**
    * Dataset ID of the table to read
    */
  var datasetId: js.UndefOr[String] = js.undefined
  
  /**
    * Maximum number of results to return
    */
  var maxResults: js.UndefOr[Double] = js.undefined
  
  /**
    * Page token, returned by a previous call, identifying the result set
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Project ID of the table to read
    */
  var projectId: js.UndefOr[String] = js.undefined
  
  /**
    * List of fields to return (comma-separated). If unspecified, all fields are returned
    */
  var selectedFields: js.UndefOr[String] = js.undefined
  
  /**
    * Zero-based index of the starting row to read
    */
  var startIndex: js.UndefOr[String] = js.undefined
  
  /**
    * Table ID of the table to read
    */
  var tableId: js.UndefOr[String] = js.undefined
}
object ParamsResourceTabledataList {
  
  inline def apply(): ParamsResourceTabledataList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceTabledataList]
  }
  
  extension [Self <: ParamsResourceTabledataList](x: Self) {
    
    inline def setDatasetId(value: String): Self = StObject.set(x, "datasetId", value.asInstanceOf[js.Any])
    
    inline def setDatasetIdUndefined: Self = StObject.set(x, "datasetId", js.undefined)
    
    inline def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    inline def setSelectedFields(value: String): Self = StObject.set(x, "selectedFields", value.asInstanceOf[js.Any])
    
    inline def setSelectedFieldsUndefined: Self = StObject.set(x, "selectedFields", js.undefined)
    
    inline def setStartIndex(value: String): Self = StObject.set(x, "startIndex", value.asInstanceOf[js.Any])
    
    inline def setStartIndexUndefined: Self = StObject.set(x, "startIndex", js.undefined)
    
    inline def setTableId(value: String): Self = StObject.set(x, "tableId", value.asInstanceOf[js.Any])
    
    inline def setTableIdUndefined: Self = StObject.set(x, "tableId", js.undefined)
  }
}
