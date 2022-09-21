package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceIndexingDatasourcesItemsDeletequeueitems
  extends StObject
     with StandardParameters {
  
  /**
    * The name of the Data Source to delete items in a queue. Format: datasources/{source_id\}
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaDeleteQueueItemsRequest] = js.undefined
}
object ParamsResourceIndexingDatasourcesItemsDeletequeueitems {
  
  inline def apply(): ParamsResourceIndexingDatasourcesItemsDeletequeueitems = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceIndexingDatasourcesItemsDeletequeueitems]
  }
  
  extension [Self <: ParamsResourceIndexingDatasourcesItemsDeletequeueitems](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequestBody(value: SchemaDeleteQueueItemsRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
