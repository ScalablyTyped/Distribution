package typings.googleCloudPubsub.protosMod.google.pubsub.v1

import typings.googleCloudPubsub.protosMod.google.protobuf.IFieldMask
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of an UpdateSubscriptionRequest. */
trait IUpdateSubscriptionRequest extends js.Object {
  /** UpdateSubscriptionRequest subscription */
  var subscription: js.UndefOr[ISubscription | Null] = js.undefined
  /** UpdateSubscriptionRequest updateMask */
  var updateMask: js.UndefOr[IFieldMask | Null] = js.undefined
}

object IUpdateSubscriptionRequest {
  @scala.inline
  def apply(
    subscription: js.UndefOr[Null | ISubscription] = js.undefined,
    updateMask: js.UndefOr[Null | IFieldMask] = js.undefined
  ): IUpdateSubscriptionRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(subscription)) __obj.updateDynamic("subscription")(subscription.asInstanceOf[js.Any])
    if (!js.isUndefined(updateMask)) __obj.updateDynamic("updateMask")(updateMask.asInstanceOf[js.Any])
    __obj.asInstanceOf[IUpdateSubscriptionRequest]
  }
}

