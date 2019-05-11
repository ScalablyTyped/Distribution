package typings
package atGoogleDashCloudPubsubLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_TopicOptional extends js.Object {
  var topic: js.UndefOr[atGoogleDashCloudPubsubLib.buildSrcTopicMod.Topic] = js.undefined
}

object Anon_TopicOptional {
  @scala.inline
  def apply(topic: atGoogleDashCloudPubsubLib.buildSrcTopicMod.Topic = null): Anon_TopicOptional = {
    val __obj = js.Dynamic.literal()
    if (topic != null) __obj.updateDynamic("topic")(topic)
    __obj.asInstanceOf[Anon_TopicOptional]
  }
}

