package typings.facebookInstantGames.FBInstant

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents an individual purchase of a game product.
  */
trait Purchase extends StObject {
  
  /**
    * A developer-specified string, provided during the purchase of the product
    */
  var developerPayload: js.UndefOr[String] = js.undefined
  
  /**
    * The identifier for the purchase transaction
    */
  var paymentID: String
  
  /**
    *  The product's game-specified identifier
    */
  var productID: String
  
  /**
    * Unix timestamp of when the purchase occurred
    */
  var purchaseTime: String
  
  /**
    *  A token representing the purchase that may be used to consume the purchase
    */
  var purchaseToken: String
  
  /**
    *  Server-signed encoding of the purchase request
    */
  var signedRequest: SignedPurchaseRequest
}
object Purchase {
  
  inline def apply(
    paymentID: String,
    productID: String,
    purchaseTime: String,
    purchaseToken: String,
    signedRequest: SignedPurchaseRequest
  ): Purchase = {
    val __obj = js.Dynamic.literal(paymentID = paymentID.asInstanceOf[js.Any], productID = productID.asInstanceOf[js.Any], purchaseTime = purchaseTime.asInstanceOf[js.Any], purchaseToken = purchaseToken.asInstanceOf[js.Any], signedRequest = signedRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[Purchase]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Purchase] (val x: Self) extends AnyVal {
    
    inline def setDeveloperPayload(value: String): Self = StObject.set(x, "developerPayload", value.asInstanceOf[js.Any])
    
    inline def setDeveloperPayloadUndefined: Self = StObject.set(x, "developerPayload", js.undefined)
    
    inline def setPaymentID(value: String): Self = StObject.set(x, "paymentID", value.asInstanceOf[js.Any])
    
    inline def setProductID(value: String): Self = StObject.set(x, "productID", value.asInstanceOf[js.Any])
    
    inline def setPurchaseTime(value: String): Self = StObject.set(x, "purchaseTime", value.asInstanceOf[js.Any])
    
    inline def setPurchaseToken(value: String): Self = StObject.set(x, "purchaseToken", value.asInstanceOf[js.Any])
    
    inline def setSignedRequest(value: SignedPurchaseRequest): Self = StObject.set(x, "signedRequest", value.asInstanceOf[js.Any])
  }
}
