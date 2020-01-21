package typings.googleCloudPubsub.pubsubMod.google.pubsub.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a PublishRequest. */
trait IPublishRequest extends js.Object {
  /** PublishRequest messages */
  var messages: js.UndefOr[js.Array[IPubsubMessage] | Null] = js.undefined
  /** PublishRequest topic */
  var topic: js.UndefOr[String | Null] = js.undefined
}

object IPublishRequest {
  @scala.inline
  def apply(messages: js.Array[IPubsubMessage] = null, topic: String = null): IPublishRequest = {
    val __obj = js.Dynamic.literal()
    if (messages != null) __obj.updateDynamic("messages")(messages.asInstanceOf[js.Any])
    if (topic != null) __obj.updateDynamic("topic")(topic.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPublishRequest]
  }
}

