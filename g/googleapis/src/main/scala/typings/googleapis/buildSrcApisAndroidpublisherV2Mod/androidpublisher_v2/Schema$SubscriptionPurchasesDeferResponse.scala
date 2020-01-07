package typings.googleapis.buildSrcApisAndroidpublisherV2Mod.androidpublisher_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$SubscriptionPurchasesDeferResponse extends js.Object {
  /**
    * The new expiry time for the subscription in milliseconds since the Epoch.
    */
  var newExpiryTimeMillis: js.UndefOr[String] = js.native
}

object Schema$SubscriptionPurchasesDeferResponse {
  @scala.inline
  def apply(newExpiryTimeMillis: String = null): Schema$SubscriptionPurchasesDeferResponse = {
    val __obj = js.Dynamic.literal()
    if (newExpiryTimeMillis != null) __obj.updateDynamic("newExpiryTimeMillis")(newExpiryTimeMillis.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$SubscriptionPurchasesDeferResponse]
  }
}

