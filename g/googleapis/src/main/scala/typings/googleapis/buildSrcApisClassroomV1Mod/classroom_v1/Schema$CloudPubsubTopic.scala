package typings.googleapis.buildSrcApisClassroomV1Mod.classroom_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A reference to a Cloud Pub/Sub topic.  To register for notifications, the
  * owner of the topic must grant
  * `classroom-notifications@system.gserviceaccount.com` the
  * `projects.topics.publish` permission.
  */
@js.native
trait Schema$CloudPubsubTopic extends js.Object {
  /**
    * The `name` field of a Cloud Pub/Sub
    * [Topic](https://cloud.google.com/pubsub/docs/reference/rest/v1/projects.topics#Topic).
    */
  var topicName: js.UndefOr[String] = js.native
}

object Schema$CloudPubsubTopic {
  @scala.inline
  def apply(topicName: String = null): Schema$CloudPubsubTopic = {
    val __obj = js.Dynamic.literal()
    if (topicName != null) __obj.updateDynamic("topicName")(topicName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$CloudPubsubTopic]
  }
}

