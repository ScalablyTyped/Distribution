package typings.googleapis.authorizedbuyersmarketplaceV1Mod.authorizedbuyersmarketplaceV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceBuyersAuctionpackagesList
  extends StObject
     with StandardParameters {
  
  /**
    * Requested page size. The server may return fewer results than requested. Max allowed page size is 500.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * The page token as returned. ListAuctionPackagesResponse.nextPageToken
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Required. Name of the parent buyer that can access the auction package. Format: `buyers/{accountId\}`
    */
  var parent: js.UndefOr[String] = js.undefined
}
object ParamsResourceBuyersAuctionpackagesList {
  
  inline def apply(): ParamsResourceBuyersAuctionpackagesList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceBuyersAuctionpackagesList]
  }
  
  extension [Self <: ParamsResourceBuyersAuctionpackagesList](x: Self) {
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
