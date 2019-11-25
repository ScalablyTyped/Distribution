package typings.atGoogleDashCloudPubsub

import typings.atGoogleDashCloudPubsub.buildSrcTopicMod.Topic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_TopicOptional extends js.Object {
  var topic: js.UndefOr[Topic] = js.undefined
}

object Anon_TopicOptional {
  @scala.inline
  def apply(topic: Topic = null): Anon_TopicOptional = {
    val __obj = js.Dynamic.literal()
    if (topic != null) __obj.updateDynamic("topic")(topic.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_TopicOptional]
  }
}

