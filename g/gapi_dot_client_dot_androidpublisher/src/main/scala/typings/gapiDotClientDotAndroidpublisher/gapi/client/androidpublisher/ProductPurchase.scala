package typings.gapiDotClientDotAndroidpublisher.gapi.client.androidpublisher

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProductPurchase extends js.Object {
  /**
    * The consumption state of the inapp product. Possible values are:
    * - Yet to be consumed
    * - Consumed
    */
  var consumptionState: js.UndefOr[Double] = js.undefined
  /** A developer-specified string that contains supplemental information about an order. */
  var developerPayload: js.UndefOr[String] = js.undefined
  /** This kind represents an inappPurchase object in the androidpublisher service. */
  var kind: js.UndefOr[String] = js.undefined
  /** The order id associated with the purchase of the inapp product. */
  var orderId: js.UndefOr[String] = js.undefined
  /**
    * The purchase state of the order. Possible values are:
    * - Purchased
    * - Cancelled
    */
  var purchaseState: js.UndefOr[Double] = js.undefined
  /** The time the product was purchased, in milliseconds since the epoch (Jan 1, 1970). */
  var purchaseTimeMillis: js.UndefOr[String] = js.undefined
}

object ProductPurchase {
  @scala.inline
  def apply(
    consumptionState: Int | Double = null,
    developerPayload: String = null,
    kind: String = null,
    orderId: String = null,
    purchaseState: Int | Double = null,
    purchaseTimeMillis: String = null
  ): ProductPurchase = {
    val __obj = js.Dynamic.literal()
    if (consumptionState != null) __obj.updateDynamic("consumptionState")(consumptionState.asInstanceOf[js.Any])
    if (developerPayload != null) __obj.updateDynamic("developerPayload")(developerPayload.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (orderId != null) __obj.updateDynamic("orderId")(orderId.asInstanceOf[js.Any])
    if (purchaseState != null) __obj.updateDynamic("purchaseState")(purchaseState.asInstanceOf[js.Any])
    if (purchaseTimeMillis != null) __obj.updateDynamic("purchaseTimeMillis")(purchaseTimeMillis.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProductPurchase]
  }
}

