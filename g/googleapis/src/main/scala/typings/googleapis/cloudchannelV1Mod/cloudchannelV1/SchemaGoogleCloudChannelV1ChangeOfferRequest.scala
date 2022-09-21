package typings.googleapis.cloudchannelV1Mod.cloudchannelV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudChannelV1ChangeOfferRequest extends StObject {
  
  /**
    * Required. New Offer. Format: accounts/{account_id\}/offers/{offer_id\}.
    */
  var offer: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. Parameters needed to purchase the Offer. To view the available Parameters refer to the Offer.parameter_definitions from the desired offer.
    */
  var parameters: js.UndefOr[js.Array[SchemaGoogleCloudChannelV1Parameter]] = js.undefined
  
  /**
    * Optional. Purchase order id provided by the reseller.
    */
  var purchaseOrderId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. You can specify an optional unique request ID, and if you need to retry your request, the server will know to ignore the request if it's complete. For example, you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if it received the original operation with the same request ID. If it did, it will ignore the second request. The request ID must be a valid [UUID](https://tools.ietf.org/html/rfc4122) with the exception that zero UUID is not supported (`00000000-0000-0000-0000-000000000000`).
    */
  var requestId: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudChannelV1ChangeOfferRequest {
  
  inline def apply(): SchemaGoogleCloudChannelV1ChangeOfferRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudChannelV1ChangeOfferRequest]
  }
  
  extension [Self <: SchemaGoogleCloudChannelV1ChangeOfferRequest](x: Self) {
    
    inline def setOffer(value: String): Self = StObject.set(x, "offer", value.asInstanceOf[js.Any])
    
    inline def setOfferNull: Self = StObject.set(x, "offer", null)
    
    inline def setOfferUndefined: Self = StObject.set(x, "offer", js.undefined)
    
    inline def setParameters(value: js.Array[SchemaGoogleCloudChannelV1Parameter]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    inline def setParametersVarargs(value: SchemaGoogleCloudChannelV1Parameter*): Self = StObject.set(x, "parameters", js.Array(value*))
    
    inline def setPurchaseOrderId(value: String): Self = StObject.set(x, "purchaseOrderId", value.asInstanceOf[js.Any])
    
    inline def setPurchaseOrderIdNull: Self = StObject.set(x, "purchaseOrderId", null)
    
    inline def setPurchaseOrderIdUndefined: Self = StObject.set(x, "purchaseOrderId", js.undefined)
    
    inline def setRequestId(value: String): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    inline def setRequestIdNull: Self = StObject.set(x, "requestId", null)
    
    inline def setRequestIdUndefined: Self = StObject.set(x, "requestId", js.undefined)
  }
}
