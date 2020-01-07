package typings.googleapis.buildSrcApisPubsubV1Mod.pubsub_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request for the UpdateSubscription method.
  */
@js.native
trait Schema$UpdateSubscriptionRequest extends js.Object {
  /**
    * The updated subscription object.
    */
  var subscription: js.UndefOr[Schema$Subscription] = js.native
  /**
    * Indicates which fields in the provided subscription to update. Must be
    * specified and non-empty.
    */
  var updateMask: js.UndefOr[String] = js.native
}

object Schema$UpdateSubscriptionRequest {
  @scala.inline
  def apply(subscription: Schema$Subscription = null, updateMask: String = null): Schema$UpdateSubscriptionRequest = {
    val __obj = js.Dynamic.literal()
    if (subscription != null) __obj.updateDynamic("subscription")(subscription.asInstanceOf[js.Any])
    if (updateMask != null) __obj.updateDynamic("updateMask")(updateMask.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$UpdateSubscriptionRequest]
  }
}

