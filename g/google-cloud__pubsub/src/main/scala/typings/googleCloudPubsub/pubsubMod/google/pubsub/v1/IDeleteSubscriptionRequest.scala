package typings.googleCloudPubsub.pubsubMod.google.pubsub.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a DeleteSubscriptionRequest. */
trait IDeleteSubscriptionRequest extends js.Object {
  /** DeleteSubscriptionRequest subscription */
  var subscription: js.UndefOr[String | Null] = js.undefined
}

object IDeleteSubscriptionRequest {
  @scala.inline
  def apply(subscription: js.UndefOr[Null | String] = js.undefined): IDeleteSubscriptionRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(subscription)) __obj.updateDynamic("subscription")(subscription.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDeleteSubscriptionRequest]
  }
}

