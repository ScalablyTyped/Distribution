package typings
package facebookDashInstantDashGamesLib.FBInstantNs

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
  var developerPayload: js.UndefOr[java.lang.String] = js.undefined
  /**
           * The identifier for the purchase transaction
           */
  var paymentID: java.lang.String
  /**
           *  The product's game-specified identifier
           */
  var productID: java.lang.String
  /**
           * Unix timestamp of when the purchase occurred
           */
  var purchaseTime: java.lang.String
  /**
           *  A token representing the purchase that may be used to consume the purchase
           */
  var purchaseToken: java.lang.String
  /**
           *  Server-signed encoding of the purchase request
           */
  var signedRequest: SignedPurchaseRequest
}

