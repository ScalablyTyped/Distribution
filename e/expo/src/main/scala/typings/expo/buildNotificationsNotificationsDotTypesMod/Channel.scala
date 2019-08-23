package typings.expo.buildNotificationsNotificationsDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Channel extends js.Object {
  var badge: js.UndefOr[Boolean] = js.undefined
  var description: js.UndefOr[String] = js.undefined
  var name: String
  var priority: js.UndefOr[String] = js.undefined
  var sound: js.UndefOr[Boolean] = js.undefined
  var vibrate: js.UndefOr[Boolean | js.Array[Double]] = js.undefined
}

object Channel {
  @scala.inline
  def apply(
    name: String,
    badge: js.UndefOr[Boolean] = js.undefined,
    description: String = null,
    priority: String = null,
    sound: js.UndefOr[Boolean] = js.undefined,
    vibrate: Boolean | js.Array[Double] = null
  ): Channel = {
    val __obj = js.Dynamic.literal(name = name)
    if (!js.isUndefined(badge)) __obj.updateDynamic("badge")(badge)
    if (description != null) __obj.updateDynamic("description")(description)
    if (priority != null) __obj.updateDynamic("priority")(priority)
    if (!js.isUndefined(sound)) __obj.updateDynamic("sound")(sound)
    if (vibrate != null) __obj.updateDynamic("vibrate")(vibrate.asInstanceOf[js.Any])
    __obj.asInstanceOf[Channel]
  }
}

