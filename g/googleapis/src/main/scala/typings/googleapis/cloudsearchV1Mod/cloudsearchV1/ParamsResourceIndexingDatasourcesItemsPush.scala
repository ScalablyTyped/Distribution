package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceIndexingDatasourcesItemsPush
  extends StObject
     with StandardParameters {
  
  /**
    * The name of the item to push into the indexing queue. Format: datasources/{source_id\}/items/{ID\} This is a required field. The maximum length is 1536 characters.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaPushItemRequest] = js.undefined
}
object ParamsResourceIndexingDatasourcesItemsPush {
  
  inline def apply(): ParamsResourceIndexingDatasourcesItemsPush = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceIndexingDatasourcesItemsPush]
  }
  
  extension [Self <: ParamsResourceIndexingDatasourcesItemsPush](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequestBody(value: SchemaPushItemRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
