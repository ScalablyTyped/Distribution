package typings.googleapis.authorizedbuyersmarketplaceV1Mod.authorizedbuyersmarketplaceV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceBuyersFinalizeddealsSetreadytoserve
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Format: `buyers/{accountId\}/finalizedDeals/{dealId\}`
    */
  var deal: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaSetReadyToServeRequest] = js.undefined
}
object ParamsResourceBuyersFinalizeddealsSetreadytoserve {
  
  inline def apply(): ParamsResourceBuyersFinalizeddealsSetreadytoserve = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceBuyersFinalizeddealsSetreadytoserve]
  }
  
  extension [Self <: ParamsResourceBuyersFinalizeddealsSetreadytoserve](x: Self) {
    
    inline def setDeal(value: String): Self = StObject.set(x, "deal", value.asInstanceOf[js.Any])
    
    inline def setDealUndefined: Self = StObject.set(x, "deal", js.undefined)
    
    inline def setRequestBody(value: SchemaSetReadyToServeRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
