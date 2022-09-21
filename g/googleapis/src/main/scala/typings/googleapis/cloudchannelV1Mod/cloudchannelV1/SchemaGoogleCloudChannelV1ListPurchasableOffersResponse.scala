package typings.googleapis.cloudchannelV1Mod.cloudchannelV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudChannelV1ListPurchasableOffersResponse extends StObject {
  
  /**
    * A token to retrieve the next page of results.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The list of Offers requested.
    */
  var purchasableOffers: js.UndefOr[js.Array[SchemaGoogleCloudChannelV1PurchasableOffer]] = js.undefined
}
object SchemaGoogleCloudChannelV1ListPurchasableOffersResponse {
  
  inline def apply(): SchemaGoogleCloudChannelV1ListPurchasableOffersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudChannelV1ListPurchasableOffersResponse]
  }
  
  extension [Self <: SchemaGoogleCloudChannelV1ListPurchasableOffersResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setPurchasableOffers(value: js.Array[SchemaGoogleCloudChannelV1PurchasableOffer]): Self = StObject.set(x, "purchasableOffers", value.asInstanceOf[js.Any])
    
    inline def setPurchasableOffersUndefined: Self = StObject.set(x, "purchasableOffers", js.undefined)
    
    inline def setPurchasableOffersVarargs(value: SchemaGoogleCloudChannelV1PurchasableOffer*): Self = StObject.set(x, "purchasableOffers", js.Array(value*))
  }
}
