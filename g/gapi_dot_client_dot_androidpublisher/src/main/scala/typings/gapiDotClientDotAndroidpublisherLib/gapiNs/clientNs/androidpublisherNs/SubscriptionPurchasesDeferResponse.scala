package typings
package gapiDotClientDotAndroidpublisherLib.gapiNs.clientNs.androidpublisherNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubscriptionPurchasesDeferResponse extends js.Object {
  /** The new expiry time for the subscription in milliseconds since the Epoch. */
  var newExpiryTimeMillis: js.UndefOr[java.lang.String] = js.undefined
}

object SubscriptionPurchasesDeferResponse {
  @scala.inline
  def apply(newExpiryTimeMillis: java.lang.String = null): SubscriptionPurchasesDeferResponse = {
    val __obj = js.Dynamic.literal()
    if (newExpiryTimeMillis != null) __obj.updateDynamic("newExpiryTimeMillis")(newExpiryTimeMillis)
    __obj.asInstanceOf[SubscriptionPurchasesDeferResponse]
  }
}

