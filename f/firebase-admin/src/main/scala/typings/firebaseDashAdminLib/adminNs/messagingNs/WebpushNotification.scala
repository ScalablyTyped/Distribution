package typings
package firebaseDashAdminLib.adminNs.messagingNs

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
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /**
    * An array of notification actions representing the actions
    * available to the user when the notification is presented.
    */
  var actions: js.UndefOr[js.Array[firebaseDashAdminLib.Anon_Action]] = js.undefined
  /**
    * URL of the image used to represent the notification when there is
    * not enough space to display the notification itself.
    */
  var badge: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Body text of the notification.
    */
  var body: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Arbitrary data that you want associated with the notification.
    * This can be of any data type.
    */
  var data: js.UndefOr[js.Any] = js.undefined
  /**
    * The direction in which to display the notification. Must be one
    * of `auto`, `ltr` or `rtl`.
    */
  var dir: js.UndefOr[
    firebaseDashAdminLib.firebaseDashAdminLibStrings.auto | firebaseDashAdminLib.firebaseDashAdminLibStrings.ltr | firebaseDashAdminLib.firebaseDashAdminLibStrings.rtl
  ] = js.undefined
  /**
    * URL to the notification icon.
    */
  var icon: js.UndefOr[java.lang.String] = js.undefined
  /**
    * URL of an image to be displayed in the notification.
    */
  var image: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The notification's language as a BCP 47 language tag.
    */
  var lang: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A boolean specifying whether the user should be notified after a
    * new notification replaces an old one. Defaults to false.
    */
  var renotify: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Indicates that a notification should remain active until the user
    * clicks or dismisses it, rather than closing automatically.
    * Defaults to false.
    */
  var requireInteraction: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * A boolean specifying whether the notification should be silent.
    * Defaults to false.
    */
  var silent: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * An identifying tag for the notification.
    */
  var tag: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Timestamp of the notification. Refer to
    * https://developer.mozilla.org/en-US/docs/Web/API/notification/timestamp
    * for details.
    */
  var timestamp: js.UndefOr[scala.Double] = js.undefined
  /**
    * Title text of the notification.
    */
  var title: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A vibration pattern for the device's vibration hardware to emit
    * when the notification fires.
    */
  var vibrate: js.UndefOr[scala.Double | js.Array[scala.Double]] = js.undefined
}

object WebpushNotification {
  @scala.inline
  def apply(
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    actions: js.Array[firebaseDashAdminLib.Anon_Action] = null,
    badge: java.lang.String = null,
    body: java.lang.String = null,
    data: js.Any = null,
    dir: firebaseDashAdminLib.firebaseDashAdminLibStrings.auto | firebaseDashAdminLib.firebaseDashAdminLibStrings.ltr | firebaseDashAdminLib.firebaseDashAdminLibStrings.rtl = null,
    icon: java.lang.String = null,
    image: java.lang.String = null,
    lang: java.lang.String = null,
    renotify: js.UndefOr[scala.Boolean] = js.undefined,
    requireInteraction: js.UndefOr[scala.Boolean] = js.undefined,
    silent: js.UndefOr[scala.Boolean] = js.undefined,
    tag: java.lang.String = null,
    timestamp: scala.Int | scala.Double = null,
    title: java.lang.String = null,
    vibrate: scala.Double | js.Array[scala.Double] = null
  ): WebpushNotification = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (actions != null) __obj.updateDynamic("actions")(actions)
    if (badge != null) __obj.updateDynamic("badge")(badge)
    if (body != null) __obj.updateDynamic("body")(body)
    if (data != null) __obj.updateDynamic("data")(data)
    if (dir != null) __obj.updateDynamic("dir")(dir.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (image != null) __obj.updateDynamic("image")(image)
    if (lang != null) __obj.updateDynamic("lang")(lang)
    if (!js.isUndefined(renotify)) __obj.updateDynamic("renotify")(renotify)
    if (!js.isUndefined(requireInteraction)) __obj.updateDynamic("requireInteraction")(requireInteraction)
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent)
    if (tag != null) __obj.updateDynamic("tag")(tag)
    if (timestamp != null) __obj.updateDynamic("timestamp")(timestamp.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title)
    if (vibrate != null) __obj.updateDynamic("vibrate")(vibrate.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebpushNotification]
  }
}

