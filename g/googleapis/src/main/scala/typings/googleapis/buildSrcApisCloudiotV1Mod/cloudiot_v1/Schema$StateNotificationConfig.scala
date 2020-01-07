package typings.googleapis.buildSrcApisCloudiotV1Mod.cloudiot_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The configuration for notification of new states received from the device.
  */
@js.native
trait Schema$StateNotificationConfig extends js.Object {
  /**
    * A Cloud Pub/Sub topic name. For example,
    * `projects/myProject/topics/deviceEvents`.
    */
  var pubsubTopicName: js.UndefOr[String] = js.native
}

object Schema$StateNotificationConfig {
  @scala.inline
  def apply(pubsubTopicName: String = null): Schema$StateNotificationConfig = {
    val __obj = js.Dynamic.literal()
    if (pubsubTopicName != null) __obj.updateDynamic("pubsubTopicName")(pubsubTopicName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$StateNotificationConfig]
  }
}

