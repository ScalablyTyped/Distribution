package typings.googleapis.cloudchannelV1Mod.cloudchannelV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudChannelV1ListOffersResponse extends StObject {
  
  /**
    * A token to retrieve the next page of results.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The list of Offers requested.
    */
  var offers: js.UndefOr[js.Array[SchemaGoogleCloudChannelV1Offer]] = js.undefined
}
object SchemaGoogleCloudChannelV1ListOffersResponse {
  
  inline def apply(): SchemaGoogleCloudChannelV1ListOffersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudChannelV1ListOffersResponse]
  }
  
  extension [Self <: SchemaGoogleCloudChannelV1ListOffersResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setOffers(value: js.Array[SchemaGoogleCloudChannelV1Offer]): Self = StObject.set(x, "offers", value.asInstanceOf[js.Any])
    
    inline def setOffersUndefined: Self = StObject.set(x, "offers", js.undefined)
    
    inline def setOffersVarargs(value: SchemaGoogleCloudChannelV1Offer*): Self = StObject.set(x, "offers", js.Array(value*))
  }
}
