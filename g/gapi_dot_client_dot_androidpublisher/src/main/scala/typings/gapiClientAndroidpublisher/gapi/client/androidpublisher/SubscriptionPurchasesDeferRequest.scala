package typings.gapiClientAndroidpublisher.gapi.client.androidpublisher

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubscriptionPurchasesDeferRequest extends js.Object {
  /** The information about the new desired expiry time for the subscription. */
  var deferralInfo: js.UndefOr[SubscriptionDeferralInfo] = js.undefined
}

object SubscriptionPurchasesDeferRequest {
  @scala.inline
  def apply(deferralInfo: SubscriptionDeferralInfo = null): SubscriptionPurchasesDeferRequest = {
    val __obj = js.Dynamic.literal()
    if (deferralInfo != null) __obj.updateDynamic("deferralInfo")(deferralInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscriptionPurchasesDeferRequest]
  }
}

