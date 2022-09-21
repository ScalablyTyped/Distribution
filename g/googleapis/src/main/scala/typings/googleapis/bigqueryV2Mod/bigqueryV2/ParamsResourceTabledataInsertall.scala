package typings.googleapis.bigqueryV2Mod.bigqueryV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceTabledataInsertall
  extends StObject
     with StandardParameters {
  
  /**
    * Dataset ID of the destination table.
    */
  var datasetId: js.UndefOr[String] = js.undefined
  
  /**
    * Project ID of the destination table.
    */
  var projectId: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaTableDataInsertAllRequest] = js.undefined
  
  /**
    * Table ID of the destination table.
    */
  var tableId: js.UndefOr[String] = js.undefined
}
object ParamsResourceTabledataInsertall {
  
  inline def apply(): ParamsResourceTabledataInsertall = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceTabledataInsertall]
  }
  
  extension [Self <: ParamsResourceTabledataInsertall](x: Self) {
    
    inline def setDatasetId(value: String): Self = StObject.set(x, "datasetId", value.asInstanceOf[js.Any])
    
    inline def setDatasetIdUndefined: Self = StObject.set(x, "datasetId", js.undefined)
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    inline def setRequestBody(value: SchemaTableDataInsertAllRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setTableId(value: String): Self = StObject.set(x, "tableId", value.asInstanceOf[js.Any])
    
    inline def setTableIdUndefined: Self = StObject.set(x, "tableId", js.undefined)
  }
}
