package typings.googleCloudPubsub

import typings.googleCloudPubsub.topicMod.Topic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTopic extends js.Object {
  var topic: js.UndefOr[String | Topic] = js.undefined
}

object AnonTopic {
  @scala.inline
  def apply(topic: String | Topic = null): AnonTopic = {
    val __obj = js.Dynamic.literal()
    if (topic != null) __obj.updateDynamic("topic")(topic.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTopic]
  }
}

