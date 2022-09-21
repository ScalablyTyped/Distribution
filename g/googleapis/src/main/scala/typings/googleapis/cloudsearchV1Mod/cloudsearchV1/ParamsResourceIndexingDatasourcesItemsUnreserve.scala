package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceIndexingDatasourcesItemsUnreserve
  extends StObject
     with StandardParameters {
  
  /**
    * The name of the Data Source to unreserve all items. Format: datasources/{source_id\}
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaUnreserveItemsRequest] = js.undefined
}
object ParamsResourceIndexingDatasourcesItemsUnreserve {
  
  inline def apply(): ParamsResourceIndexingDatasourcesItemsUnreserve = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceIndexingDatasourcesItemsUnreserve]
  }
  
  extension [Self <: ParamsResourceIndexingDatasourcesItemsUnreserve](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequestBody(value: SchemaUnreserveItemsRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
