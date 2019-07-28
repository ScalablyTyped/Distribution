package typings.gapiDotClientDotAndroidpublisher.gapiNs.clientNs.androidpublisherNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubscriptionDeferralInfo extends js.Object {
  /**
    * The desired next expiry time to assign to the subscription, in milliseconds since the Epoch. The given time must be later/greater than the current
    * expiry time for the subscription.
    */
  var desiredExpiryTimeMillis: js.UndefOr[String] = js.undefined
  /**
    * The expected expiry time for the subscription. If the current expiry time for the subscription is not the value specified here, the deferral will not
    * occur.
    */
  var expectedExpiryTimeMillis: js.UndefOr[String] = js.undefined
}

object SubscriptionDeferralInfo {
  @scala.inline
  def apply(desiredExpiryTimeMillis: String = null, expectedExpiryTimeMillis: String = null): SubscriptionDeferralInfo = {
    val __obj = js.Dynamic.literal()
    if (desiredExpiryTimeMillis != null) __obj.updateDynamic("desiredExpiryTimeMillis")(desiredExpiryTimeMillis)
    if (expectedExpiryTimeMillis != null) __obj.updateDynamic("expectedExpiryTimeMillis")(expectedExpiryTimeMillis)
    __obj.asInstanceOf[SubscriptionDeferralInfo]
  }
}

