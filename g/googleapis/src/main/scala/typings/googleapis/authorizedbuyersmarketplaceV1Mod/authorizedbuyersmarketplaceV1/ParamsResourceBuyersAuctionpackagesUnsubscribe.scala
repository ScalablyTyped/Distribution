package typings.googleapis.authorizedbuyersmarketplaceV1Mod.authorizedbuyersmarketplaceV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceBuyersAuctionpackagesUnsubscribe
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Name of the auction package. Format: `buyers/{accountId\}/auctionPackages/{auctionPackageId\}`
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaUnsubscribeAuctionPackageRequest] = js.undefined
}
object ParamsResourceBuyersAuctionpackagesUnsubscribe {
  
  inline def apply(): ParamsResourceBuyersAuctionpackagesUnsubscribe = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceBuyersAuctionpackagesUnsubscribe]
  }
  
  extension [Self <: ParamsResourceBuyersAuctionpackagesUnsubscribe](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequestBody(value: SchemaUnsubscribeAuctionPackageRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
