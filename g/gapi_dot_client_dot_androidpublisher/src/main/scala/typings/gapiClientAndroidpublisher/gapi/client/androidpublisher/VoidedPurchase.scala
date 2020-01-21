package typings.gapiClientAndroidpublisher.gapi.client.androidpublisher

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VoidedPurchase extends js.Object {
  /** This kind represents a voided purchase object in the androidpublisher service. */
  var kind: js.UndefOr[String] = js.undefined
  /** The time at which the purchase was made, in milliseconds since the epoch (Jan 1, 1970). */
  var purchaseTimeMillis: js.UndefOr[String] = js.undefined
  /** The token that was generated when a purchase was made. This uniquely identifies a purchase. */
  var purchaseToken: js.UndefOr[String] = js.undefined
  /** The time at which the purchase was cancelled/refunded/charged-back, in milliseconds since the epoch (Jan 1, 1970). */
  var voidedTimeMillis: js.UndefOr[String] = js.undefined
}

object VoidedPurchase {
  @scala.inline
  def apply(
    kind: String = null,
    purchaseTimeMillis: String = null,
    purchaseToken: String = null,
    voidedTimeMillis: String = null
  ): VoidedPurchase = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (purchaseTimeMillis != null) __obj.updateDynamic("purchaseTimeMillis")(purchaseTimeMillis.asInstanceOf[js.Any])
    if (purchaseToken != null) __obj.updateDynamic("purchaseToken")(purchaseToken.asInstanceOf[js.Any])
    if (voidedTimeMillis != null) __obj.updateDynamic("voidedTimeMillis")(voidedTimeMillis.asInstanceOf[js.Any])
    __obj.asInstanceOf[VoidedPurchase]
  }
}

