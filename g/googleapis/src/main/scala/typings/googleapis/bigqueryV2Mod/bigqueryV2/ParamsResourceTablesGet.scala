package typings.googleapis.bigqueryV2Mod.bigqueryV2

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceTablesGet
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * Dataset ID of the requested table
    */
  var datasetId: js.UndefOr[String] = js.undefined
  
  /**
    * Project ID of the requested table
    */
  var projectId: js.UndefOr[String] = js.undefined
  
  /**
    * List of fields to return (comma-separated). If unspecified, all fields
    * are returned
    */
  var selectedFields: js.UndefOr[String] = js.undefined
  
  /**
    * Table ID of the requested table
    */
  var tableId: js.UndefOr[String] = js.undefined
}
object ParamsResourceTablesGet {
  
  inline def apply(): ParamsResourceTablesGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceTablesGet]
  }
  
  extension [Self <: ParamsResourceTablesGet](x: Self) {
    
    inline def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    inline def setDatasetId(value: String): Self = StObject.set(x, "datasetId", value.asInstanceOf[js.Any])
    
    inline def setDatasetIdUndefined: Self = StObject.set(x, "datasetId", js.undefined)
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    inline def setSelectedFields(value: String): Self = StObject.set(x, "selectedFields", value.asInstanceOf[js.Any])
    
    inline def setSelectedFieldsUndefined: Self = StObject.set(x, "selectedFields", js.undefined)
    
    inline def setTableId(value: String): Self = StObject.set(x, "tableId", value.asInstanceOf[js.Any])
    
    inline def setTableIdUndefined: Self = StObject.set(x, "tableId", js.undefined)
  }
}
