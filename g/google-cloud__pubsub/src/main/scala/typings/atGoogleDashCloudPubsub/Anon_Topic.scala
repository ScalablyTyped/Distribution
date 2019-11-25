package typings.atGoogleDashCloudPubsub

import typings.atGoogleDashCloudPubsub.buildSrcTopicMod.Topic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Topic extends js.Object {
  var topic: js.UndefOr[String | Topic] = js.undefined
}

object Anon_Topic {
  @scala.inline
  def apply(topic: String | Topic = null): Anon_Topic = {
    val __obj = js.Dynamic.literal()
    if (topic != null) __obj.updateDynamic("topic")(topic.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Topic]
  }
}

