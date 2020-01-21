package typings.googleCloudPubsub.pubsubMod.google.pubsub.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a GetTopicRequest. */
trait IGetTopicRequest extends js.Object {
  /** GetTopicRequest topic */
  var topic: js.UndefOr[String | Null] = js.undefined
}

object IGetTopicRequest {
  @scala.inline
  def apply(topic: String = null): IGetTopicRequest = {
    val __obj = js.Dynamic.literal()
    if (topic != null) __obj.updateDynamic("topic")(topic.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGetTopicRequest]
  }
}

