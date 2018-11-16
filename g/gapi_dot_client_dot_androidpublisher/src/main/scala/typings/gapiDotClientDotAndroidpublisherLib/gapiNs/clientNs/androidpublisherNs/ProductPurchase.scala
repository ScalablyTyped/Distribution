package typings
package gapiDotClientDotAndroidpublisherLib.gapiNs.clientNs.androidpublisherNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ProductPurchase extends js.Object {
  /**
               * The consumption state of the inapp product. Possible values are:
               * - Yet to be consumed
               * - Consumed
               */
  var consumptionState: js.UndefOr[scala.Double] = js.undefined
  /** A developer-specified string that contains supplemental information about an order. */
  var developerPayload: js.UndefOr[java.lang.String] = js.undefined
  /** This kind represents an inappPurchase object in the androidpublisher service. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The order id associated with the purchase of the inapp product. */
  var orderId: js.UndefOr[java.lang.String] = js.undefined
  /**
               * The purchase state of the order. Possible values are:
               * - Purchased
               * - Cancelled
               */
  var purchaseState: js.UndefOr[scala.Double] = js.undefined
  /** The time the product was purchased, in milliseconds since the epoch (Jan 1, 1970). */
  var purchaseTimeMillis: js.UndefOr[java.lang.String] = js.undefined
}

