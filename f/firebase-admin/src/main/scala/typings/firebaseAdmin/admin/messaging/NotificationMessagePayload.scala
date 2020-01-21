package typings.firebaseAdmin.admin.messaging

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface representing an FCM legacy API notification message payload.
  * Notification messages let developers send up to 4KB of predefined
  * key-value pairs. Accepted keys are outlined below.
  *
  * See [Build send requests](/docs/cloud-messaging/send-message)
  * for code samples and detailed documentation.
  */
trait NotificationMessagePayload
  extends /* key */ StringDictionary[js.UndefOr[String]] {
  /**
    * The value of the badge on the home screen app icon.
    *
    * If not specified, the badge is not changed.
    *
    * If set to `0`, the badge is removed.
    *
    * **Platforms:** iOS
    */
  var badge: js.UndefOr[String] = js.undefined
  /**
    * The notification's body text.
    *
    * **Platforms:** iOS, Android, Web
    */
  var body: js.UndefOr[String] = js.undefined
  /**
    * Variable string values to be used in place of the format specifiers in
    * `body_loc_key` to use to localize the body text to the user's current
    * localization.
    *
    * The value should be a stringified JSON array.
    *
    * **iOS:** Corresponds to `loc-args` in the APNs payload. See
    * [Payload Key Reference](https://developer.apple.com/library/content/documentation/NetworkingInternet/Conceptual/RemoteNotificationsPG/PayloadKeyReference.html)
    * and
    * [Localizing the Content of Your Remote Notifications](https://developer.apple.com/library/content/documentation/NetworkingInternet/Conceptual/RemoteNotificationsPG/CreatingtheNotificationPayload.html#//apple_ref/doc/uid/TP40008194-CH10-SW9)
    * for more information.
    *
    * **Android:** See
    * [Formatting and Styling](http://developer.android.com/guide/topics/resources/string-resource.html#FormattingAndStyling)
    * for more information.
    *
    * **Platforms:** iOS, Android
    */
  var bodyLocArgs: js.UndefOr[String] = js.undefined
  /**
    * The key to the body string in the app's string resources to use to localize
    * the body text to the user's current localization.
    *
    * **iOS:** Corresponds to `loc-key` in the APNs payload. See
    * [Payload Key Reference](https://developer.apple.com/library/content/documentation/NetworkingInternet/Conceptual/RemoteNotificationsPG/PayloadKeyReference.html)
    * and
    * [Localizing the Content of Your Remote Notifications](https://developer.apple.com/library/content/documentation/NetworkingInternet/Conceptual/RemoteNotificationsPG/CreatingtheNotificationPayload.html#//apple_ref/doc/uid/TP40008194-CH10-SW9)
    * for more information.
    *
    * **Android:** See
    * [String Resources](http://developer.android.com/guide/topics/resources/string-resource.html)      * for more information.
    *
    * **Platforms:** iOS, Android
    */
  var bodyLocKey: js.UndefOr[String] = js.undefined
  /**
    * Action associated with a user click on the notification. If specified, an
    * activity with a matching Intent Filter is launched when a user clicks on the
    * notification.
    *
    *   * **Platforms:** Android
    */
  var clickAction: js.UndefOr[String] = js.undefined
  /**
    * The notification icon's color, expressed in `#rrggbb` format.
    *
    * **Platforms:** Android
    */
  var color: js.UndefOr[String] = js.undefined
  /**
    * The notification's icon.
    *
    * **Android:** Sets the notification icon to `myicon` for drawable resource
    * `myicon`. If you don't send this key in the request, FCM displays the
    * launcher icon specified in your app manifest.
    *
    * **Web:** The URL to use for the notification's icon.
    *
    * **Platforms:** Android, Web
    */
  var icon: js.UndefOr[String] = js.undefined
  /**
    * Identifier used to replace existing notifications in the notification drawer.
    *
    * If not specified, each request creates a new notification.
    *
    * If specified and a notification with the same tag is already being shown,
    * the new notification replaces the existing one in the notification drawer.
    *
    * **Platforms:** Android
    */
  var sound: js.UndefOr[String] = js.undefined
  var tag: js.UndefOr[String] = js.undefined
  /**
    * The notification's title.
    *
    * **Platforms:** iOS, Android, Web
    */
  var title: js.UndefOr[String] = js.undefined
  /**
    * Variable string values to be used in place of the format specifiers in
    * `title_loc_key` to use to localize the title text to the user's current
    * localization.
    *
    * The value should be a stringified JSON array.
    *
    * **iOS:** Corresponds to `title-loc-args` in the APNs payload. See
    * [Payload Key Reference](https://developer.apple.com/library/content/documentation/NetworkingInternet/Conceptual/RemoteNotificationsPG/PayloadKeyReference.html)
    * and
    * [Localizing the Content of Your Remote Notifications](https://developer.apple.com/library/content/documentation/NetworkingInternet/Conceptual/RemoteNotificationsPG/CreatingtheNotificationPayload.html#//apple_ref/doc/uid/TP40008194-CH10-SW9)
    * for more information.
    *
    * **Android:** See
    * [Formatting and Styling](http://developer.android.com/guide/topics/resources/string-resource.html#FormattingAndStyling)
    * for more information.
    *
    * **Platforms:** iOS, Android
    */
  var titleLocArgs: js.UndefOr[String] = js.undefined
  /**
    * The key to the title string in the app's string resources to use to localize
    * the title text to the user's current localization.
    *
    * **iOS:** Corresponds to `title-loc-key` in the APNs payload. See
    * [Payload Key Reference](https://developer.apple.com/library/content/documentation/NetworkingInternet/Conceptual/RemoteNotificationsPG/PayloadKeyReference.html)
    * and
    * [Localizing the Content of Your Remote Notifications](https://developer.apple.com/library/content/documentation/NetworkingInternet/Conceptual/RemoteNotificationsPG/CreatingtheNotificationPayload.html#//apple_ref/doc/uid/TP40008194-CH10-SW9)
    * for more information.
    *
    * **Android:** See
    * [String Resources](http://developer.android.com/guide/topics/resources/string-resource.html)
    * for more information.
    *
    * **Platforms:** iOS, Android
    */
  var titleLocKey: js.UndefOr[String] = js.undefined
}

object NotificationMessagePayload {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.UndefOr[String]] = null,
    badge: String = null,
    body: String = null,
    bodyLocArgs: String = null,
    bodyLocKey: String = null,
    clickAction: String = null,
    color: String = null,
    icon: String = null,
    sound: String = null,
    tag: String = null,
    title: String = null,
    titleLocArgs: String = null,
    titleLocKey: String = null
  ): NotificationMessagePayload = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (badge != null) __obj.updateDynamic("badge")(badge.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (bodyLocArgs != null) __obj.updateDynamic("bodyLocArgs")(bodyLocArgs.asInstanceOf[js.Any])
    if (bodyLocKey != null) __obj.updateDynamic("bodyLocKey")(bodyLocKey.asInstanceOf[js.Any])
    if (clickAction != null) __obj.updateDynamic("clickAction")(clickAction.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (sound != null) __obj.updateDynamic("sound")(sound.asInstanceOf[js.Any])
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (titleLocArgs != null) __obj.updateDynamic("titleLocArgs")(titleLocArgs.asInstanceOf[js.Any])
    if (titleLocKey != null) __obj.updateDynamic("titleLocKey")(titleLocKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationMessagePayload]
  }
}

