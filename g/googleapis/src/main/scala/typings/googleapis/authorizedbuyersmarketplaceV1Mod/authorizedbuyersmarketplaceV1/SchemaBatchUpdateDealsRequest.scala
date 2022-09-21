package typings.googleapis.authorizedbuyersmarketplaceV1Mod.authorizedbuyersmarketplaceV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBatchUpdateDealsRequest extends StObject {
  
  /**
    * Required. List of request messages to update deals.
    */
  var requests: js.UndefOr[js.Array[SchemaUpdateDealRequest]] = js.undefined
}
object SchemaBatchUpdateDealsRequest {
  
  inline def apply(): SchemaBatchUpdateDealsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBatchUpdateDealsRequest]
  }
  
  extension [Self <: SchemaBatchUpdateDealsRequest](x: Self) {
    
    inline def setRequests(value: js.Array[SchemaUpdateDealRequest]): Self = StObject.set(x, "requests", value.asInstanceOf[js.Any])
    
    inline def setRequestsUndefined: Self = StObject.set(x, "requests", js.undefined)
    
    inline def setRequestsVarargs(value: SchemaUpdateDealRequest*): Self = StObject.set(x, "requests", js.Array(value*))
  }
}
