package typings.googleCloudPubsub

import typings.googleCloudPubsub.topicMod.Topic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTopicOptional extends js.Object {
  var topic: js.UndefOr[Topic] = js.undefined
}

object AnonTopicOptional {
  @scala.inline
  def apply(topic: Topic = null): AnonTopicOptional = {
    val __obj = js.Dynamic.literal()
    if (topic != null) __obj.updateDynamic("topic")(topic.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTopicOptional]
  }
}

