package typings.googleCloudPubsub.protosMod.google.pubsub.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a GetSubscriptionRequest. */
trait IGetSubscriptionRequest extends js.Object {
  /** GetSubscriptionRequest subscription */
  var subscription: js.UndefOr[String | Null] = js.undefined
}

object IGetSubscriptionRequest {
  @scala.inline
  def apply(subscription: js.UndefOr[Null | String] = js.undefined): IGetSubscriptionRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(subscription)) __obj.updateDynamic("subscription")(subscription.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGetSubscriptionRequest]
  }
}

