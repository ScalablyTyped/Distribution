package typings.googleapis.authorizedbuyersmarketplaceV1Mod.authorizedbuyersmarketplaceV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAuctionPackage extends StObject {
  
  /**
    * Output only. Time the auction package was created.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The buyer that created this auction package. Format: `buyers/{buyerAccountId\}`
    */
  var creator: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. A description of the auction package.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The display_name assigned to the auction package.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Immutable. The unique identifier for the auction package. Format: `buyers/{accountId\}/auctionPackages/{auctionPackageId\}` The auction_package_id part of name is sent in the BidRequest to all RTB bidders and is returned as deal_id by the bidder in the BidResponse.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The list of clients of the current buyer that are subscribed to the AuctionPackage. Format: `buyers/{buyerAccountId\}/clients/{clientAccountId\}`
    */
  var subscribedClients: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Output only. Time the auction package was last updated. This value is only increased when this auction package is updated but never when a buyer subscribed.
    */
  var updateTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaAuctionPackage {
  
  inline def apply(): SchemaAuctionPackage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAuctionPackage]
  }
  
  extension [Self <: SchemaAuctionPackage](x: Self) {
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setCreator(value: String): Self = StObject.set(x, "creator", value.asInstanceOf[js.Any])
    
    inline def setCreatorNull: Self = StObject.set(x, "creator", null)
    
    inline def setCreatorUndefined: Self = StObject.set(x, "creator", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSubscribedClients(value: js.Array[String]): Self = StObject.set(x, "subscribedClients", value.asInstanceOf[js.Any])
    
    inline def setSubscribedClientsNull: Self = StObject.set(x, "subscribedClients", null)
    
    inline def setSubscribedClientsUndefined: Self = StObject.set(x, "subscribedClients", js.undefined)
    
    inline def setSubscribedClientsVarargs(value: String*): Self = StObject.set(x, "subscribedClients", js.Array(value*))
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeNull: Self = StObject.set(x, "updateTime", null)
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
