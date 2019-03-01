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

object ProductPurchase {
  @scala.inline
  def apply(
    consumptionState: scala.Int | scala.Double = null,
    developerPayload: java.lang.String = null,
    kind: java.lang.String = null,
    orderId: java.lang.String = null,
    purchaseState: scala.Int | scala.Double = null,
    purchaseTimeMillis: java.lang.String = null
  ): ProductPurchase = {
    val __obj = js.Dynamic.literal()
    if (consumptionState != null) __obj.updateDynamic("consumptionState")(consumptionState.asInstanceOf[js.Any])
    if (developerPayload != null) __obj.updateDynamic("developerPayload")(developerPayload)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (orderId != null) __obj.updateDynamic("orderId")(orderId)
    if (purchaseState != null) __obj.updateDynamic("purchaseState")(purchaseState.asInstanceOf[js.Any])
    if (purchaseTimeMillis != null) __obj.updateDynamic("purchaseTimeMillis")(purchaseTimeMillis)
    __obj.asInstanceOf[ProductPurchase]
  }
}

