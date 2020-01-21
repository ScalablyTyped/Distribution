package typings.googleapis.cloudiotV1Mod.cloudiotV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The configuration for notification of new states received from the device.
  */
@js.native
trait SchemaStateNotificationConfig extends js.Object {
  /**
    * A Cloud Pub/Sub topic name. For example,
    * `projects/myProject/topics/deviceEvents`.
    */
  var pubsubTopicName: js.UndefOr[String] = js.native
}

object SchemaStateNotificationConfig {
  @scala.inline
  def apply(pubsubTopicName: String = null): SchemaStateNotificationConfig = {
    val __obj = js.Dynamic.literal()
    if (pubsubTopicName != null) __obj.updateDynamic("pubsubTopicName")(pubsubTopicName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaStateNotificationConfig]
  }
}

