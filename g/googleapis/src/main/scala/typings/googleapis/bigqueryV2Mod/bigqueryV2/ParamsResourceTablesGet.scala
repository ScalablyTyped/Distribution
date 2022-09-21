package typings.googleapis.bigqueryV2Mod.bigqueryV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceTablesGet
  extends StObject
     with StandardParameters {
  
  /**
    * Dataset ID of the requested table
    */
  var datasetId: js.UndefOr[String] = js.undefined
  
  /**
    * Project ID of the requested table
    */
  var projectId: js.UndefOr[String] = js.undefined
  
  /**
    * List of fields to return (comma-separated). If unspecified, all fields are returned
    */
  var selectedFields: js.UndefOr[String] = js.undefined
  
  /**
    * Table ID of the requested table
    */
  var tableId: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the view that determines which table information is returned. By default, basic table information and storage statistics (STORAGE_STATS) are returned.
    */
  var view: js.UndefOr[String] = js.undefined
}
object ParamsResourceTablesGet {
  
  inline def apply(): ParamsResourceTablesGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceTablesGet]
  }
  
  extension [Self <: ParamsResourceTablesGet](x: Self) {
    
    inline def setDatasetId(value: String): Self = StObject.set(x, "datasetId", value.asInstanceOf[js.Any])
    
    inline def setDatasetIdUndefined: Self = StObject.set(x, "datasetId", js.undefined)
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    inline def setSelectedFields(value: String): Self = StObject.set(x, "selectedFields", value.asInstanceOf[js.Any])
    
    inline def setSelectedFieldsUndefined: Self = StObject.set(x, "selectedFields", js.undefined)
    
    inline def setTableId(value: String): Self = StObject.set(x, "tableId", value.asInstanceOf[js.Any])
    
    inline def setTableIdUndefined: Self = StObject.set(x, "tableId", js.undefined)
    
    inline def setView(value: String): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
