package typings.gapiDotClientDotCloudiot.gapi.client.cloudiot

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StateNotificationConfig extends js.Object {
  /**
    * A Cloud Pub/Sub topic name. For example,
    * `projects/myProject/topics/deviceEvents`.
    */
  var pubsubTopicName: js.UndefOr[String] = js.undefined
}

object StateNotificationConfig {
  @scala.inline
  def apply(pubsubTopicName: String = null): StateNotificationConfig = {
    val __obj = js.Dynamic.literal()
    if (pubsubTopicName != null) __obj.updateDynamic("pubsubTopicName")(pubsubTopicName)
    __obj.asInstanceOf[StateNotificationConfig]
  }
}

