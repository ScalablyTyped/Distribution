package typings.googleCloudPubsub.pubsubMod.google.pubsub.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a ListTopicSubscriptionsResponse. */
trait IListTopicSubscriptionsResponse extends js.Object {
  /** ListTopicSubscriptionsResponse nextPageToken */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  /** ListTopicSubscriptionsResponse subscriptions */
  var subscriptions: js.UndefOr[js.Array[String] | Null] = js.undefined
}

object IListTopicSubscriptionsResponse {
  @scala.inline
  def apply(nextPageToken: String = null, subscriptions: js.Array[String] = null): IListTopicSubscriptionsResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (subscriptions != null) __obj.updateDynamic("subscriptions")(subscriptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[IListTopicSubscriptionsResponse]
  }
}

