package typings.atGoogleDashCloudPubsub.buildProtoPubsubMod.google.pubsub.v1

import typings.atGoogleDashCloudPubsub.buildProtoPubsubMod.google.protobuf.IFieldMask
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
  def apply(subscription: ISubscription = null, updateMask: IFieldMask = null): IUpdateSubscriptionRequest = {
    val __obj = js.Dynamic.literal()
    if (subscription != null) __obj.updateDynamic("subscription")(subscription.asInstanceOf[js.Any])
    if (updateMask != null) __obj.updateDynamic("updateMask")(updateMask.asInstanceOf[js.Any])
    __obj.asInstanceOf[IUpdateSubscriptionRequest]
  }
}

