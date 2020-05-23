package typings.googleCloudPubsub.protosMod.google.pubsub.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a ListSubscriptionsResponse. */
trait IListSubscriptionsResponse extends js.Object {
  /** ListSubscriptionsResponse nextPageToken */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  /** ListSubscriptionsResponse subscriptions */
  var subscriptions: js.UndefOr[js.Array[ISubscription] | Null] = js.undefined
}

object IListSubscriptionsResponse {
  @scala.inline
  def apply(
    nextPageToken: js.UndefOr[Null | String] = js.undefined,
    subscriptions: js.UndefOr[Null | js.Array[ISubscription]] = js.undefined
  ): IListSubscriptionsResponse = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(nextPageToken)) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (!js.isUndefined(subscriptions)) __obj.updateDynamic("subscriptions")(subscriptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[IListSubscriptionsResponse]
  }
}

