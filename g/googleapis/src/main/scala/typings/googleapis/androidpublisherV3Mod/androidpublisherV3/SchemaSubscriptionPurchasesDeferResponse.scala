package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaSubscriptionPurchasesDeferResponse extends js.Object {
  /**
    * The new expiry time for the subscription in milliseconds since the Epoch.
    */
  var newExpiryTimeMillis: js.UndefOr[String] = js.native
}

object SchemaSubscriptionPurchasesDeferResponse {
  @scala.inline
  def apply(newExpiryTimeMillis: String = null): SchemaSubscriptionPurchasesDeferResponse = {
    val __obj = js.Dynamic.literal()
    if (newExpiryTimeMillis != null) __obj.updateDynamic("newExpiryTimeMillis")(newExpiryTimeMillis.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSubscriptionPurchasesDeferResponse]
  }
}

