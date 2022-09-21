package typings.googleapis.bigqueryV2Mod.bigqueryV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceTablesPatch
  extends StObject
     with StandardParameters {
  
  /**
    * When true will autodetect schema, else will keep original schema
    */
  var autodetect_schema: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Dataset ID of the table to update
    */
  var datasetId: js.UndefOr[String] = js.undefined
  
  /**
    * Project ID of the table to update
    */
  var projectId: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaTable] = js.undefined
  
  /**
    * Table ID of the table to update
    */
  var tableId: js.UndefOr[String] = js.undefined
}
object ParamsResourceTablesPatch {
  
  inline def apply(): ParamsResourceTablesPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceTablesPatch]
  }
  
  extension [Self <: ParamsResourceTablesPatch](x: Self) {
    
    inline def setAutodetect_schema(value: Boolean): Self = StObject.set(x, "autodetect_schema", value.asInstanceOf[js.Any])
    
    inline def setAutodetect_schemaUndefined: Self = StObject.set(x, "autodetect_schema", js.undefined)
    
    inline def setDatasetId(value: String): Self = StObject.set(x, "datasetId", value.asInstanceOf[js.Any])
    
    inline def setDatasetIdUndefined: Self = StObject.set(x, "datasetId", js.undefined)
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    inline def setRequestBody(value: SchemaTable): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setTableId(value: String): Self = StObject.set(x, "tableId", value.asInstanceOf[js.Any])
    
    inline def setTableIdUndefined: Self = StObject.set(x, "tableId", js.undefined)
  }
}
