package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaSubscriptionPurchasesDeferRequest extends js.Object {
  /**
    * The information about the new desired expiry time for the subscription.
    */
  var deferralInfo: js.UndefOr[SchemaSubscriptionDeferralInfo] = js.native
}

object SchemaSubscriptionPurchasesDeferRequest {
  @scala.inline
  def apply(deferralInfo: SchemaSubscriptionDeferralInfo = null): SchemaSubscriptionPurchasesDeferRequest = {
    val __obj = js.Dynamic.literal()
    if (deferralInfo != null) __obj.updateDynamic("deferralInfo")(deferralInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSubscriptionPurchasesDeferRequest]
  }
}

