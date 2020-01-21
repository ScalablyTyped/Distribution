package typings.firebaseMessaging.tokenDetailsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TokenDetails extends js.Object {
  var createTime: Double
  /** Does not exist in Safari since it's not using Push API. */
  var subscriptionOptions: js.UndefOr[SubscriptionOptions] = js.undefined
  var token: String
}

object TokenDetails {
  @scala.inline
  def apply(createTime: Double, token: String, subscriptionOptions: SubscriptionOptions = null): TokenDetails = {
    val __obj = js.Dynamic.literal(createTime = createTime.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
    if (subscriptionOptions != null) __obj.updateDynamic("subscriptionOptions")(subscriptionOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[TokenDetails]
  }
}

