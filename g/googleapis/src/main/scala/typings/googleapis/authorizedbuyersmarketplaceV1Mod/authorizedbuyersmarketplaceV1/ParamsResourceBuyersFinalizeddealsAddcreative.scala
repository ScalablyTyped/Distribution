package typings.googleapis.authorizedbuyersmarketplaceV1Mod.authorizedbuyersmarketplaceV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceBuyersFinalizeddealsAddcreative
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Name of the finalized deal in the format of: `buyers/{accountId\}/finalizedDeals/{dealId\}`
    */
  var deal: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaAddCreativeRequest] = js.undefined
}
object ParamsResourceBuyersFinalizeddealsAddcreative {
  
  inline def apply(): ParamsResourceBuyersFinalizeddealsAddcreative = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceBuyersFinalizeddealsAddcreative]
  }
  
  extension [Self <: ParamsResourceBuyersFinalizeddealsAddcreative](x: Self) {
    
    inline def setDeal(value: String): Self = StObject.set(x, "deal", value.asInstanceOf[js.Any])
    
    inline def setDealUndefined: Self = StObject.set(x, "deal", js.undefined)
    
    inline def setRequestBody(value: SchemaAddCreativeRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
