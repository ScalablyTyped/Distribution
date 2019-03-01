package typings
package gapiDotClientDotAndroidpublisherLib.gapiNs.clientNs.androidpublisherNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VoidedPurchase extends js.Object {
  /** This kind represents a voided purchase object in the androidpublisher service. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The time at which the purchase was made, in milliseconds since the epoch (Jan 1, 1970). */
  var purchaseTimeMillis: js.UndefOr[java.lang.String] = js.undefined
  /** The token that was generated when a purchase was made. This uniquely identifies a purchase. */
  var purchaseToken: js.UndefOr[java.lang.String] = js.undefined
  /** The time at which the purchase was cancelled/refunded/charged-back, in milliseconds since the epoch (Jan 1, 1970). */
  var voidedTimeMillis: js.UndefOr[java.lang.String] = js.undefined
}

object VoidedPurchase {
  @scala.inline
  def apply(
    kind: java.lang.String = null,
    purchaseTimeMillis: java.lang.String = null,
    purchaseToken: java.lang.String = null,
    voidedTimeMillis: java.lang.String = null
  ): VoidedPurchase = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (purchaseTimeMillis != null) __obj.updateDynamic("purchaseTimeMillis")(purchaseTimeMillis)
    if (purchaseToken != null) __obj.updateDynamic("purchaseToken")(purchaseToken)
    if (voidedTimeMillis != null) __obj.updateDynamic("voidedTimeMillis")(voidedTimeMillis)
    __obj.asInstanceOf[VoidedPurchase]
  }
}

