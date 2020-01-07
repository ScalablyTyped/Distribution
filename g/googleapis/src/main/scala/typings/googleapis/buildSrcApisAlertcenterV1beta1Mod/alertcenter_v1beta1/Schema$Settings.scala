package typings.googleapis.buildSrcApisAlertcenterV1beta1Mod.alertcenter_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Customer-level settings.
  */
@js.native
trait Schema$Settings extends js.Object {
  /**
    * The list of notifications.
    */
  var notifications: js.UndefOr[js.Array[Schema$Notification]] = js.native
}

object Schema$Settings {
  @scala.inline
  def apply(notifications: js.Array[Schema$Notification] = null): Schema$Settings = {
    val __obj = js.Dynamic.literal()
    if (notifications != null) __obj.updateDynamic("notifications")(notifications.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Settings]
  }
}

