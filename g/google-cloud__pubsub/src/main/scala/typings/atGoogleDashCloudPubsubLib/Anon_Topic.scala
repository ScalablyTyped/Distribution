package typings
package atGoogleDashCloudPubsubLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Topic extends js.Object {
  var topic: js.UndefOr[java.lang.String | atGoogleDashCloudPubsubLib.buildSrcTopicMod.Topic] = js.undefined
}

object Anon_Topic {
  @scala.inline
  def apply(topic: java.lang.String | atGoogleDashCloudPubsubLib.buildSrcTopicMod.Topic = null): Anon_Topic = {
    val __obj = js.Dynamic.literal()
    if (topic != null) __obj.updateDynamic("topic")(topic.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Topic]
  }
}

