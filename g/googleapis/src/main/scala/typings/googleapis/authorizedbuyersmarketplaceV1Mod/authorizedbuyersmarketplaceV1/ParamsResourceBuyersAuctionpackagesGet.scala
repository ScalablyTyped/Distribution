package typings.googleapis.authorizedbuyersmarketplaceV1Mod.authorizedbuyersmarketplaceV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceBuyersAuctionpackagesGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Name of auction package to get. Format: `buyers/{accountId\}/auctionPackages/{auctionPackageId\}`
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceBuyersAuctionpackagesGet {
  
  inline def apply(): ParamsResourceBuyersAuctionpackagesGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceBuyersAuctionpackagesGet]
  }
  
  extension [Self <: ParamsResourceBuyersAuctionpackagesGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
