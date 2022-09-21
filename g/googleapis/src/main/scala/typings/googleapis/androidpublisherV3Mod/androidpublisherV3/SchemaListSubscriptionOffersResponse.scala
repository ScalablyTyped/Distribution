package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListSubscriptionOffersResponse extends StObject {
  
  /**
    * A token, which can be sent as `page_token` to retrieve the next page. If this field is omitted, there are no subsequent pages.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The subscription offers from the specified subscription.
    */
  var subscriptionOffers: js.UndefOr[js.Array[SchemaSubscriptionOffer]] = js.undefined
}
object SchemaListSubscriptionOffersResponse {
  
  inline def apply(): SchemaListSubscriptionOffersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListSubscriptionOffersResponse]
  }
  
  extension [Self <: SchemaListSubscriptionOffersResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setSubscriptionOffers(value: js.Array[SchemaSubscriptionOffer]): Self = StObject.set(x, "subscriptionOffers", value.asInstanceOf[js.Any])
    
    inline def setSubscriptionOffersUndefined: Self = StObject.set(x, "subscriptionOffers", js.undefined)
    
    inline def setSubscriptionOffersVarargs(value: SchemaSubscriptionOffer*): Self = StObject.set(x, "subscriptionOffers", js.Array(value*))
  }
}
