package typings.googleapis.authorizedbuyersmarketplaceV1Mod.authorizedbuyersmarketplaceV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListFinalizedDealsResponse extends StObject {
  
  /**
    * The list of finalized deals.
    */
  var finalizedDeals: js.UndefOr[js.Array[SchemaFinalizedDeal]] = js.undefined
  
  /**
    * Token to fetch the next page of results.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaListFinalizedDealsResponse {
  
  inline def apply(): SchemaListFinalizedDealsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListFinalizedDealsResponse]
  }
  
  extension [Self <: SchemaListFinalizedDealsResponse](x: Self) {
    
    inline def setFinalizedDeals(value: js.Array[SchemaFinalizedDeal]): Self = StObject.set(x, "finalizedDeals", value.asInstanceOf[js.Any])
    
    inline def setFinalizedDealsUndefined: Self = StObject.set(x, "finalizedDeals", js.undefined)
    
    inline def setFinalizedDealsVarargs(value: SchemaFinalizedDeal*): Self = StObject.set(x, "finalizedDeals", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
