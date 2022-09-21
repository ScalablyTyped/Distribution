package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceIndexingDatasourcesItemsUpload
  extends StObject
     with StandardParameters {
  
  /**
    * The name of the Item to start a resumable upload. Format: datasources/{source_id\}/items/{item_id\}. The maximum length is 1536 bytes.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaStartUploadItemRequest] = js.undefined
}
object ParamsResourceIndexingDatasourcesItemsUpload {
  
  inline def apply(): ParamsResourceIndexingDatasourcesItemsUpload = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceIndexingDatasourcesItemsUpload]
  }
  
  extension [Self <: ParamsResourceIndexingDatasourcesItemsUpload](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequestBody(value: SchemaStartUploadItemRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
