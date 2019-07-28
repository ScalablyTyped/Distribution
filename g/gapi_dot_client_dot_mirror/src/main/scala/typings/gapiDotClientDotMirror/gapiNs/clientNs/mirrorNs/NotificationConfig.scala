package typings.gapiDotClientDotMirror.gapiNs.clientNs.mirrorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotificationConfig extends js.Object {
  /** The time at which the notification should be delivered. */
  var deliveryTime: js.UndefOr[String] = js.undefined
  /**
    * Describes how important the notification is. Allowed values are:
    * - DEFAULT - Notifications of default importance. A chime will be played to alert users.
    */
  var level: js.UndefOr[String] = js.undefined
}

object NotificationConfig {
  @scala.inline
  def apply(deliveryTime: String = null, level: String = null): NotificationConfig = {
    val __obj = js.Dynamic.literal()
    if (deliveryTime != null) __obj.updateDynamic("deliveryTime")(deliveryTime)
    if (level != null) __obj.updateDynamic("level")(level)
    __obj.asInstanceOf[NotificationConfig]
  }
}

