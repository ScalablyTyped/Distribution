package typings.googleapis.cloudchannelV1Mod.cloudchannelV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudChannelV1ListTransferableOffersResponse extends StObject {
  
  /**
    * A token to retrieve the next page of results. Pass to ListTransferableOffersRequest.page_token to obtain that page.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Information about Offers for a customer that can be used for transfer.
    */
  var transferableOffers: js.UndefOr[js.Array[SchemaGoogleCloudChannelV1TransferableOffer]] = js.undefined
}
object SchemaGoogleCloudChannelV1ListTransferableOffersResponse {
  
  inline def apply(): SchemaGoogleCloudChannelV1ListTransferableOffersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudChannelV1ListTransferableOffersResponse]
  }
  
  extension [Self <: SchemaGoogleCloudChannelV1ListTransferableOffersResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setTransferableOffers(value: js.Array[SchemaGoogleCloudChannelV1TransferableOffer]): Self = StObject.set(x, "transferableOffers", value.asInstanceOf[js.Any])
    
    inline def setTransferableOffersUndefined: Self = StObject.set(x, "transferableOffers", js.undefined)
    
    inline def setTransferableOffersVarargs(value: SchemaGoogleCloudChannelV1TransferableOffer*): Self = StObject.set(x, "transferableOffers", js.Array(value*))
  }
}
