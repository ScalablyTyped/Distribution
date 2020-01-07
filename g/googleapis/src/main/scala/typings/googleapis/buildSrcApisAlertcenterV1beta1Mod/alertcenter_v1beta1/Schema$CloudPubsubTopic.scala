package typings.googleapis.buildSrcApisAlertcenterV1beta1Mod.alertcenter_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A reference to a Cloud Pubsub topic.  To register for notifications, the
  * owner of the topic must grant
  * `alerts-api-push-notifications@system.gserviceaccount.com` the
  * `projects.topics.publish` permission.
  */
@js.native
trait Schema$CloudPubsubTopic extends js.Object {
  /**
    * Optional. The format of the payload that would be sent. If not specified
    * the format will be JSON.
    */
  var payloadFormat: js.UndefOr[String] = js.native
  /**
    * The `name` field of a Cloud Pubsub [Topic]
    * (https://cloud.google.com/pubsub/docs/reference/rest/v1/projects.topics#Topic).
    */
  var topicName: js.UndefOr[String] = js.native
}

object Schema$CloudPubsubTopic {
  @scala.inline
  def apply(payloadFormat: String = null, topicName: String = null): Schema$CloudPubsubTopic = {
    val __obj = js.Dynamic.literal()
    if (payloadFormat != null) __obj.updateDynamic("payloadFormat")(payloadFormat.asInstanceOf[js.Any])
    if (topicName != null) __obj.updateDynamic("topicName")(topicName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$CloudPubsubTopic]
  }
}

