package typings.googleapis.buildSrcApisAndroidpublisherV2Mod.androidpublisher_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$SubscriptionPurchasesDeferRequest extends js.Object {
  /**
    * The information about the new desired expiry time for the subscription.
    */
  var deferralInfo: js.UndefOr[Schema$SubscriptionDeferralInfo] = js.native
}

object Schema$SubscriptionPurchasesDeferRequest {
  @scala.inline
  def apply(deferralInfo: Schema$SubscriptionDeferralInfo = null): Schema$SubscriptionPurchasesDeferRequest = {
    val __obj = js.Dynamic.literal()
    if (deferralInfo != null) __obj.updateDynamic("deferralInfo")(deferralInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$SubscriptionPurchasesDeferRequest]
  }
}

