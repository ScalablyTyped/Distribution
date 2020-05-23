package typings.firebaseAdmin.admin.messaging

import org.scalablytyped.runtime.StringDictionary
import typings.firebaseAdmin.anon.Action
import typings.firebaseAdmin.firebaseAdminStrings.auto
import typings.firebaseAdmin.firebaseAdminStrings.ltr
import typings.firebaseAdmin.firebaseAdminStrings.rtl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the WebPush-specific notification options that can be included in
  * {@link admin.messaging.WebpushConfig}. This supports most of the standard
  * options as defined in the Web Notification
  * [specification](https://developer.mozilla.org/en-US/docs/Web/API/notification/Notification).
  */
trait WebpushNotification
  extends /* customData */ StringDictionary[js.Any] {
  /**
    * An array of notification actions representing the actions
    * available to the user when the notification is presented.
    */
  var actions: js.UndefOr[js.Array[Action]] = js.undefined
  /**
    * URL of the image used to represent the notification when there is
    * not enough space to display the notification itself.
    */
  var badge: js.UndefOr[String] = js.undefined
  /**
    * Body text of the notification.
    */
  var body: js.UndefOr[String] = js.undefined
  /**
    * Arbitrary data that you want associated with the notification.
    * This can be of any data type.
    */
  var data: js.UndefOr[js.Any] = js.undefined
  /**
    * The direction in which to display the notification. Must be one
    * of `auto`, `ltr` or `rtl`.
    */
  var dir: js.UndefOr[auto | ltr | rtl] = js.undefined
  /**
    * URL to the notification icon.
    */
  var icon: js.UndefOr[String] = js.undefined
  /**
    * URL of an image to be displayed in the notification.
    */
  var image: js.UndefOr[String] = js.undefined
  /**
    * The notification's language as a BCP 47 language tag.
    */
  var lang: js.UndefOr[String] = js.undefined
  /**
    * A boolean specifying whether the user should be notified after a
    * new notification replaces an old one. Defaults to false.
    */
  var renotify: js.UndefOr[Boolean] = js.undefined
  /**
    * Indicates that a notification should remain active until the user
    * clicks or dismisses it, rather than closing automatically.
    * Defaults to false.
    */
  var requireInteraction: js.UndefOr[Boolean] = js.undefined
  /**
    * A boolean specifying whether the notification should be silent.
    * Defaults to false.
    */
  var silent: js.UndefOr[Boolean] = js.undefined
  /**
    * An identifying tag for the notification.
    */
  var tag: js.UndefOr[String] = js.undefined
  /**
    * Timestamp of the notification. Refer to
    * https://developer.mozilla.org/en-US/docs/Web/API/notification/timestamp
    * for details.
    */
  var timestamp: js.UndefOr[Double] = js.undefined
  /**
    * Title text of the notification.
    */
  var title: js.UndefOr[String] = js.undefined
  /**
    * A vibration pattern for the device's vibration hardware to emit
    * when the notification fires.
    */
  var vibrate: js.UndefOr[Double | js.Array[Double]] = js.undefined
}

object WebpushNotification {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    actions: js.Array[Action] = null,
    badge: String = null,
    body: String = null,
    data: js.Any = null,
    dir: auto | ltr | rtl = null,
    icon: String = null,
    image: String = null,
    lang: String = null,
    renotify: js.UndefOr[Boolean] = js.undefined,
    requireInteraction: js.UndefOr[Boolean] = js.undefined,
    silent: js.UndefOr[Boolean] = js.undefined,
    tag: String = null,
    timestamp: js.UndefOr[Double] = js.undefined,
    title: String = null,
    vibrate: Double | js.Array[Double] = null
  ): WebpushNotification = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (actions != null) __obj.updateDynamic("actions")(actions.asInstanceOf[js.Any])
    if (badge != null) __obj.updateDynamic("badge")(badge.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (dir != null) __obj.updateDynamic("dir")(dir.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (lang != null) __obj.updateDynamic("lang")(lang.asInstanceOf[js.Any])
    if (!js.isUndefined(renotify)) __obj.updateDynamic("renotify")(renotify.get.asInstanceOf[js.Any])
    if (!js.isUndefined(requireInteraction)) __obj.updateDynamic("requireInteraction")(requireInteraction.get.asInstanceOf[js.Any])
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent.get.asInstanceOf[js.Any])
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    if (!js.isUndefined(timestamp)) __obj.updateDynamic("timestamp")(timestamp.get.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (vibrate != null) __obj.updateDynamic("vibrate")(vibrate.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebpushNotification]
  }
}

