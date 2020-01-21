package typings.googleCloudPubsub.pubsubMod.google.pubsub.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a ListTopicSubscriptionsRequest. */
trait IListTopicSubscriptionsRequest extends js.Object {
  /** ListTopicSubscriptionsRequest pageSize */
  var pageSize: js.UndefOr[Double | Null] = js.undefined
  /** ListTopicSubscriptionsRequest pageToken */
  var pageToken: js.UndefOr[String | Null] = js.undefined
  /** ListTopicSubscriptionsRequest topic */
  var topic: js.UndefOr[String | Null] = js.undefined
}

object IListTopicSubscriptionsRequest {
  @scala.inline
  def apply(pageSize: Int | Double = null, pageToken: String = null, topic: String = null): IListTopicSubscriptionsRequest = {
    val __obj = js.Dynamic.literal()
    if (pageSize != null) __obj.updateDynamic("pageSize")(pageSize.asInstanceOf[js.Any])
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken.asInstanceOf[js.Any])
    if (topic != null) __obj.updateDynamic("topic")(topic.asInstanceOf[js.Any])
    __obj.asInstanceOf[IListTopicSubscriptionsRequest]
  }
}

