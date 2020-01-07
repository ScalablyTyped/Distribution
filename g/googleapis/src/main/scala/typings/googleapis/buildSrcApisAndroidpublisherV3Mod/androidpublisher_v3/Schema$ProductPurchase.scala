package typings.googleapis.buildSrcApisAndroidpublisherV3Mod.androidpublisher_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A ProductPurchase resource indicates the status of a user&#39;s inapp
  * product purchase.
  */
@js.native
trait Schema$ProductPurchase extends js.Object {
  /**
    * The consumption state of the inapp product. Possible values are:   - Yet
    * to be consumed  - Consumed
    */
  var consumptionState: js.UndefOr[Double] = js.native
  /**
    * A developer-specified string that contains supplemental information about
    * an order.
    */
  var developerPayload: js.UndefOr[String] = js.native
  /**
    * This kind represents an inappPurchase object in the androidpublisher
    * service.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The order id associated with the purchase of the inapp product.
    */
  var orderId: js.UndefOr[String] = js.native
  /**
    * The purchase state of the order. Possible values are:   - Purchased  -
    * Canceled
    */
  var purchaseState: js.UndefOr[Double] = js.native
  /**
    * The time the product was purchased, in milliseconds since the epoch (Jan
    * 1, 1970).
    */
  var purchaseTimeMillis: js.UndefOr[String] = js.native
  /**
    * The type of purchase of the inapp product. This field is only set if this
    * purchase was not made using the standard in-app billing flow. Possible
    * values are:   - Test (i.e. purchased from a license testing account)  -
    * Promo (i.e. purchased using a promo code)  - Rewarded (i.e. from watching
    * a video ad instead of paying)
    */
  var purchaseType: js.UndefOr[Double] = js.native
}

object Schema$ProductPurchase {
  @scala.inline
  def apply(
    consumptionState: Int | Double = null,
    developerPayload: String = null,
    kind: String = null,
    orderId: String = null,
    purchaseState: Int | Double = null,
    purchaseTimeMillis: String = null,
    purchaseType: Int | Double = null
  ): Schema$ProductPurchase = {
    val __obj = js.Dynamic.literal()
    if (consumptionState != null) __obj.updateDynamic("consumptionState")(consumptionState.asInstanceOf[js.Any])
    if (developerPayload != null) __obj.updateDynamic("developerPayload")(developerPayload.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (orderId != null) __obj.updateDynamic("orderId")(orderId.asInstanceOf[js.Any])
    if (purchaseState != null) __obj.updateDynamic("purchaseState")(purchaseState.asInstanceOf[js.Any])
    if (purchaseTimeMillis != null) __obj.updateDynamic("purchaseTimeMillis")(purchaseTimeMillis.asInstanceOf[js.Any])
    if (purchaseType != null) __obj.updateDynamic("purchaseType")(purchaseType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ProductPurchase]
  }
}

