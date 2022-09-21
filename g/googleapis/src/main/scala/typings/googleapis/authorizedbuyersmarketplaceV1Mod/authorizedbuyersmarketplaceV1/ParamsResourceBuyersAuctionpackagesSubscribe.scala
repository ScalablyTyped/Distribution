package typings.googleapis.authorizedbuyersmarketplaceV1Mod.authorizedbuyersmarketplaceV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceBuyersAuctionpackagesSubscribe
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Name of the auction package. Format: `buyers/{accountId\}/auctionPackages/{auctionPackageId\}`
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaSubscribeAuctionPackageRequest] = js.undefined
}
object ParamsResourceBuyersAuctionpackagesSubscribe {
  
  inline def apply(): ParamsResourceBuyersAuctionpackagesSubscribe = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceBuyersAuctionpackagesSubscribe]
  }
  
  extension [Self <: ParamsResourceBuyersAuctionpackagesSubscribe](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequestBody(value: SchemaSubscribeAuctionPackageRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
