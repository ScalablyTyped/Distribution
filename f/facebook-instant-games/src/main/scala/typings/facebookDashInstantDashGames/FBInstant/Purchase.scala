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
    val __obj = js.Dynamic.literal(paymentID = paymentID, productID = productID, purchaseTime = purchaseTime, purchaseToken = purchaseToken, signedRequest = signedRequest)
    if (developerPayload != null) __obj.updateDynamic("developerPayload")(developerPayload)
    __obj.asInstanceOf[Purchase]
  }
}

