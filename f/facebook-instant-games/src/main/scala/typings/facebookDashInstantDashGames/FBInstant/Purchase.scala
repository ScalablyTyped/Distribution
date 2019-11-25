package typings.facebookDashInstantDashGames.FBInstant

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents an individual purchase of a game product.
  */
trait Purchase extends js.Object {
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
  @scala.inline
  def apply(
    paymentID: String,
    productID: String,
    purchaseTime: String,
    purchaseToken: String,
    signedRequest: SignedPurchaseRequest,
    developerPayload: String = null
  ): Purchase = {
    val __obj = js.Dynamic.literal(paymentID = paymentID.asInstanceOf[js.Any], productID = productID.asInstanceOf[js.Any], purchaseTime = purchaseTime.asInstanceOf[js.Any], purchaseToken = purchaseToken.asInstanceOf[js.Any], signedRequest = signedRequest.asInstanceOf[js.Any])
    if (developerPayload != null) __obj.updateDynamic("developerPayload")(developerPayload.asInstanceOf[js.Any])
    __obj.asInstanceOf[Purchase]
  }
}

