package typings.firebaseDashAdmin.admin.messaging

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the Android-specific notification options that can be included in
  * {@link admin.messaging.AndroidConfig}.
  */
trait AndroidNotification extends js.Object {
  /**
    * Body of the Android notification. When provided, overrides the body set via
    * `admin.messaging.Notification`.
    */
  var body: js.UndefOr[String] = js.undefined
  /**
    * An array of resource keys that will be used in place of the format
    * specifiers in `bodyLocKey`.
    */
  var bodyLocArgs: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Key of the body string in the app's string resource to use to localize the
    * body text.
    *
    */
  var bodyLocKey: js.UndefOr[String] = js.undefined
  /**
    * The Android notification channel ID (new in Android O). The app must create
    * a channel with this channel ID before any notification with this channel ID
    * can be received. If you don't send this channel ID in the request, or if the
    * channel ID provided has not yet been created by the app, FCM uses the channel
    * ID specified in the app manifest.
    */
  var channelId: js.UndefOr[String] = js.undefined
  /**
    * Action associated with a user click on the notification. If specified, an
    * activity with a matching Intent Filter is launched when a user clicks on the
    * notification.
    */
  var clickAction: js.UndefOr[String] = js.undefined
  /**
    * Notification icon color in `#rrggbb` format.
    */
  var color: js.UndefOr[String] = js.undefined
  /**
    * Icon resource for the Android notification.
    */
  var icon: js.UndefOr[String] = js.undefined
  /**
    * URL of an image to be displayed in the notification.
    */
  var imageUrl: js.UndefOr[String] = js.undefined
  /**
    * File name of the sound to be played when the device receives the
    * notification.
    */
  var sound: js.UndefOr[String] = js.undefined
  /**
    * Notification tag. This is an identifier used to replace existing
    * notifications in the notification drawer. If not specified, each request
    * creates a new notification.
    */
  var tag: js.UndefOr[String] = js.undefined
  /**
    * Title of the Android notification. When provided, overrides the title set via
    * `admin.messaging.Notification`.
    */
  var title: js.UndefOr[String] = js.undefined
  /**
    * An array of resource keys that will be used in place of the format
    * specifiers in `titleLocKey`.
    */
  var titleLocArgs: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Key of the title string in the app's string resource to use to localize the
    * title text.
    */
  var titleLocKey: js.UndefOr[String] = js.undefined
}

object AndroidNotification {
  @scala.inline
  def apply(
    body: String = null,
    bodyLocArgs: js.Array[String] = null,
    bodyLocKey: String = null,
    channelId: String = null,
    clickAction: String = null,
    color: String = null,
    icon: String = null,
    imageUrl: String = null,
    sound: String = null,
    tag: String = null,
    title: String = null,
    titleLocArgs: js.Array[String] = null,
    titleLocKey: String = null
  ): AndroidNotification = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body)
    if (bodyLocArgs != null) __obj.updateDynamic("bodyLocArgs")(bodyLocArgs)
    if (bodyLocKey != null) __obj.updateDynamic("bodyLocKey")(bodyLocKey)
    if (channelId != null) __obj.updateDynamic("channelId")(channelId)
    if (clickAction != null) __obj.updateDynamic("clickAction")(clickAction)
    if (color != null) __obj.updateDynamic("color")(color)
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (imageUrl != null) __obj.updateDynamic("imageUrl")(imageUrl)
    if (sound != null) __obj.updateDynamic("sound")(sound)
    if (tag != null) __obj.updateDynamic("tag")(tag)
    if (title != null) __obj.updateDynamic("title")(title)
    if (titleLocArgs != null) __obj.updateDynamic("titleLocArgs")(titleLocArgs)
    if (titleLocKey != null) __obj.updateDynamic("titleLocKey")(titleLocKey)
    __obj.asInstanceOf[AndroidNotification]
  }
}

