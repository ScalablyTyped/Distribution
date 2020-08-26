package typings.googleapis.classroomV1Mod.classroomV1

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
trait SchemaCloudPubsubTopic extends js.Object {
  /**
    * The `name` field of a Cloud Pub/Sub
    * [Topic](https://cloud.google.com/pubsub/docs/reference/rest/v1/projects.topics#Topic).
    */
  var topicName: js.UndefOr[String] = js.native
}

object SchemaCloudPubsubTopic {
  @scala.inline
  def apply(): SchemaCloudPubsubTopic = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCloudPubsubTopic]
  }
  @scala.inline
  implicit class SchemaCloudPubsubTopicOps[Self <: SchemaCloudPubsubTopic] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setTopicName(value: String): Self = this.set("topicName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTopicName: Self = this.set("topicName", js.undefined)
  }
  
}

