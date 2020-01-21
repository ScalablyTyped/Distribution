package typings.firebaseMessaging.messagePayloadMod

import typings.std.NotificationAction
import typings.std.NotificationDirection
import typings.std.NotificationOptions
import typings.std.VibratePattern
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotificationDetails extends NotificationOptions {
  var click_action: js.UndefOr[String] = js.undefined
  var title: String
}

object NotificationDetails {
  @scala.inline
  def apply(
    title: String,
    actions: js.Array[NotificationAction] = null,
    badge: String = null,
    body: String = null,
    click_action: String = null,
    data: js.Any = null,
    dir: NotificationDirection = null,
    icon: String = null,
    image: String = null,
    lang: String = null,
    renotify: js.UndefOr[Boolean] = js.undefined,
    requireInteraction: js.UndefOr[Boolean] = js.undefined,
    silent: js.UndefOr[Boolean] = js.undefined,
    tag: String = null,
    timestamp: Int | Double = null,
    vibrate: VibratePattern = null
  ): NotificationDetails = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    if (actions != null) __obj.updateDynamic("actions")(actions.asInstanceOf[js.Any])
    if (badge != null) __obj.updateDynamic("badge")(badge.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (click_action != null) __obj.updateDynamic("click_action")(click_action.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (dir != null) __obj.updateDynamic("dir")(dir.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (lang != null) __obj.updateDynamic("lang")(lang.asInstanceOf[js.Any])
    if (!js.isUndefined(renotify)) __obj.updateDynamic("renotify")(renotify.asInstanceOf[js.Any])
    if (!js.isUndefined(requireInteraction)) __obj.updateDynamic("requireInteraction")(requireInteraction.asInstanceOf[js.Any])
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent.asInstanceOf[js.Any])
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    if (timestamp != null) __obj.updateDynamic("timestamp")(timestamp.asInstanceOf[js.Any])
    if (vibrate != null) __obj.updateDynamic("vibrate")(vibrate.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationDetails]
  }
}

