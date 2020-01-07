package typings.googleapis.buildSrcApisAlertcenterV1beta1Mod.alertcenter_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Settings for callback notifications. For more details see [G Suite Alert
  * Notification](/admin-sdk/alertcenter/guides/notifications).
  */
@js.native
trait Schema$Notification extends js.Object {
  /**
    * A Google Cloud Pub/sub topic destination.
    */
  var cloudPubsubTopic: js.UndefOr[Schema$CloudPubsubTopic] = js.native
}

object Schema$Notification {
  @scala.inline
  def apply(cloudPubsubTopic: Schema$CloudPubsubTopic = null): Schema$Notification = {
    val __obj = js.Dynamic.literal()
    if (cloudPubsubTopic != null) __obj.updateDynamic("cloudPubsubTopic")(cloudPubsubTopic.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Notification]
  }
}

