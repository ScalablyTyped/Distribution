package typings.googleapis.authorizedbuyersmarketplaceV1Mod.authorizedbuyersmarketplaceV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListAuctionPackagesResponse extends StObject {
  
  /**
    * The list of auction packages.
    */
  var auctionPackages: js.UndefOr[js.Array[SchemaAuctionPackage]] = js.undefined
  
  /**
    * Continuation token for fetching the next page of results. Pass this value in the ListAuctionPackagesRequest.pageToken field in the subsequent call to the `ListAuctionPackages` method to retrieve the next page of results.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaListAuctionPackagesResponse {
  
  inline def apply(): SchemaListAuctionPackagesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListAuctionPackagesResponse]
  }
  
  extension [Self <: SchemaListAuctionPackagesResponse](x: Self) {
    
    inline def setAuctionPackages(value: js.Array[SchemaAuctionPackage]): Self = StObject.set(x, "auctionPackages", value.asInstanceOf[js.Any])
    
    inline def setAuctionPackagesUndefined: Self = StObject.set(x, "auctionPackages", js.undefined)
    
    inline def setAuctionPackagesVarargs(value: SchemaAuctionPackage*): Self = StObject.set(x, "auctionPackages", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
