package typings.googleapis.buildSrcApisMirrorV1Mod.mirror_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Controls how notifications for a timeline item are presented to the user.
  */
@js.native
trait Schema$NotificationConfig extends js.Object {
  /**
    * The time at which the notification should be delivered.
    */
  var deliveryTime: js.UndefOr[String] = js.native
  /**
    * Describes how important the notification is. Allowed values are:   -
    * DEFAULT - Notifications of default importance. A chime will be played to
    * alert users.
    */
  var level: js.UndefOr[String] = js.native
}

object Schema$NotificationConfig {
  @scala.inline
  def apply(deliveryTime: String = null, level: String = null): Schema$NotificationConfig = {
    val __obj = js.Dynamic.literal()
    if (deliveryTime != null) __obj.updateDynamic("deliveryTime")(deliveryTime.asInstanceOf[js.Any])
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$NotificationConfig]
  }
}

