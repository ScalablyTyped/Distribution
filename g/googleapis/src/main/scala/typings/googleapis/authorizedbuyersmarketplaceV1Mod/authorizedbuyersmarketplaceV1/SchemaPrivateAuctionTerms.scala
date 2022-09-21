package typings.googleapis.authorizedbuyersmarketplaceV1Mod.authorizedbuyersmarketplaceV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPrivateAuctionTerms extends StObject {
  
  /**
    * The minimum price buyer has to bid to compete in the private auction.
    */
  var floorPrice: js.UndefOr[SchemaPrice] = js.undefined
  
  /**
    * Output only. True if open auction buyers are allowed to compete with invited buyers in this private auction.
    */
  var openAuctionAllowed: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaPrivateAuctionTerms {
  
  inline def apply(): SchemaPrivateAuctionTerms = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPrivateAuctionTerms]
  }
  
  extension [Self <: SchemaPrivateAuctionTerms](x: Self) {
    
    inline def setFloorPrice(value: SchemaPrice): Self = StObject.set(x, "floorPrice", value.asInstanceOf[js.Any])
    
    inline def setFloorPriceUndefined: Self = StObject.set(x, "floorPrice", js.undefined)
    
    inline def setOpenAuctionAllowed(value: Boolean): Self = StObject.set(x, "openAuctionAllowed", value.asInstanceOf[js.Any])
    
    inline def setOpenAuctionAllowedNull: Self = StObject.set(x, "openAuctionAllowed", null)
    
    inline def setOpenAuctionAllowedUndefined: Self = StObject.set(x, "openAuctionAllowed", js.undefined)
  }
}
