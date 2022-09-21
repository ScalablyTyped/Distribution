package typings.googleapis.authorizedbuyersmarketplaceV1Mod.authorizedbuyersmarketplaceV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceBuyersAuctionpackagesUnsubscribeclients
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Name of the auction package. Format: `buyers/{accountId\}/auctionPackages/{auctionPackageId\}`
    */
  var auctionPackage: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaUnsubscribeClientsRequest] = js.undefined
}
object ParamsResourceBuyersAuctionpackagesUnsubscribeclients {
  
  inline def apply(): ParamsResourceBuyersAuctionpackagesUnsubscribeclients = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceBuyersAuctionpackagesUnsubscribeclients]
  }
  
  extension [Self <: ParamsResourceBuyersAuctionpackagesUnsubscribeclients](x: Self) {
    
    inline def setAuctionPackage(value: String): Self = StObject.set(x, "auctionPackage", value.asInstanceOf[js.Any])
    
    inline def setAuctionPackageUndefined: Self = StObject.set(x, "auctionPackage", js.undefined)
    
    inline def setRequestBody(value: SchemaUnsubscribeClientsRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
