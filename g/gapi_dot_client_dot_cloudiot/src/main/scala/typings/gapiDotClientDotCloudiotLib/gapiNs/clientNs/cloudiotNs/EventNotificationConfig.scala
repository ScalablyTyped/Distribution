package typings
package gapiDotClientDotCloudiotLib.gapiNs.clientNs.cloudiotNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventNotificationConfig extends js.Object {
  /**
    * A Cloud Pub/Sub topic name. For example,
    * `projects/myProject/topics/deviceEvents`.
    */
  var pubsubTopicName: js.UndefOr[java.lang.String] = js.undefined
}

object EventNotificationConfig {
  @scala.inline
  def apply(pubsubTopicName: java.lang.String = null): EventNotificationConfig = {
    val __obj = js.Dynamic.literal()
    if (pubsubTopicName != null) __obj.updateDynamic("pubsubTopicName")(pubsubTopicName)
    __obj.asInstanceOf[EventNotificationConfig]
  }
}

