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
  def apply(): SchemaSubscriptionPurchasesDeferRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSubscriptionPurchasesDeferRequest]
  }
  @scala.inline
  implicit class SchemaSubscriptionPurchasesDeferRequestOps[Self <: SchemaSubscriptionPurchasesDeferRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDeferralInfo(value: SchemaSubscriptionDeferralInfo): Self = this.set("deferralInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeferralInfo: Self = this.set("deferralInfo", js.undefined)
  }
  
}

