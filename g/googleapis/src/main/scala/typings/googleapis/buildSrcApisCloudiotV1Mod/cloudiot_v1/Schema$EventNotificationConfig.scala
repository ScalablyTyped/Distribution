package typings.googleapis.buildSrcApisCloudiotV1Mod.cloudiot_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The configuration for forwarding telemetry events.
  */
@js.native
trait Schema$EventNotificationConfig extends js.Object {
  /**
    * A Cloud Pub/Sub topic name. For example,
    * `projects/myProject/topics/deviceEvents`.
    */
  var pubsubTopicName: js.UndefOr[String] = js.native
  /**
    * If the subfolder name matches this string exactly, this configuration
    * will be used. The string must not include the leading &#39;/&#39;
    * character. If empty, all strings are matched. This field is used only for
    * telemetry events; subfolders are not supported for state changes.
    */
  var subfolderMatches: js.UndefOr[String] = js.native
}

object Schema$EventNotificationConfig {
  @scala.inline
  def apply(pubsubTopicName: String = null, subfolderMatches: String = null): Schema$EventNotificationConfig = {
    val __obj = js.Dynamic.literal()
    if (pubsubTopicName != null) __obj.updateDynamic("pubsubTopicName")(pubsubTopicName.asInstanceOf[js.Any])
    if (subfolderMatches != null) __obj.updateDynamic("subfolderMatches")(subfolderMatches.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$EventNotificationConfig]
  }
}

