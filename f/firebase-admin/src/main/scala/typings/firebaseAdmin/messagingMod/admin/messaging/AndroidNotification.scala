package typings.firebaseAdmin.messagingMod.admin.messaging

import typings.firebaseAdmin.firebaseAdminStrings.`private`
import typings.firebaseAdmin.firebaseAdminStrings.default
import typings.firebaseAdmin.firebaseAdminStrings.high
import typings.firebaseAdmin.firebaseAdminStrings.low
import typings.firebaseAdmin.firebaseAdminStrings.max
import typings.firebaseAdmin.firebaseAdminStrings.min
import typings.firebaseAdmin.firebaseAdminStrings.public
import typings.firebaseAdmin.firebaseAdminStrings.secret
import typings.std.Date
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
    * If set to `true`, use the Android framework's default LED light settings
    * for the notification. Default values are specified in [`config.xml`](https://android.googlesource.com/platform/frameworks/base/+/master/core/res/res/values/config.xml).
    * If `default_light_settings` is set to `true` and `light_settings` is also set,
    * the user-specified `light_settings` is used instead of the default value.
    */
  var defaultLightSettings: js.UndefOr[Boolean] = js.undefined
  /**
    * If set to `true`, use the Android framework's default sound for the notification.
    * Default values are specified in [`config.xml`](https://android.googlesource.com/platform/frameworks/base/+/master/core/res/res/values/config.xml).
    */
  var defaultSound: js.UndefOr[Boolean] = js.undefined
  /**
    * If set to `true`, use the Android framework's default vibrate pattern for the
    * notification. Default values are specified in [`config.xml`](https://android.googlesource.com/platform/frameworks/base/+/master/core/res/res/values/config.xml).
    * If `default_vibrate_timings` is set to `true` and `vibrate_timings` is also set,
    * the default value is used instead of the user-specified `vibrate_timings`.
    */
  var defaultVibrateTimings: js.UndefOr[Boolean] = js.undefined
  /**
    * For notifications that inform users about events with an absolute time reference, sets
    * the time that the event in the notification occurred. Notifications
    * in the panel are sorted by this time.
    */
  var eventTimestamp: js.UndefOr[Date] = js.undefined
  /**
    * Icon resource for the Android notification.
    */
  var icon: js.UndefOr[String] = js.undefined
  /**
    * URL of an image to be displayed in the notification.
    */
  var imageUrl: js.UndefOr[String] = js.undefined
  /**
    * Settings to control the notification's LED blinking rate and color if LED is
    * available on the device. The total blinking time is controlled by the OS.
    */
  var lightSettings: js.UndefOr[LightSettings] = js.undefined
  /**
    * Sets whether or not this notification is relevant only to the current device.
    * Some notifications can be bridged to other devices for remote display, such as
    * a Wear OS watch. This hint can be set to recommend this notification not be bridged.
    * See [Wear OS guides](https://developer.android.com/training/wearables/notifications/bridger#existing-method-of-preventing-bridging)
    */
  var localOnly: js.UndefOr[Boolean] = js.undefined
  /**
    * Sets the number of items this notification represents. May be displayed as a
    * badge count for Launchers that support badging. See [`NotificationBadge`(https://developer.android.com/training/notify-user/badges).
    * For example, this might be useful if you're using just one notification to
    * represent multiple new messages but you want the count here to represent
    * the number of total new messages. If zero or unspecified, systems
    * that support badging use the default, which is to increment a number
    * displayed on the long-press menu each time a new notification arrives.
    */
  var notificationCount: js.UndefOr[Double] = js.undefined
  /**
    * Sets the relative priority for this notification. Low-priority notifications
    * may be hidden from the user in certain situations. Note this priority differs
    * from `AndroidMessagePriority`. This priority is processed by the client after
    * the message has been delivered. Whereas `AndroidMessagePriority` is an FCM concept
    * that controls when the message is delivered.
    */
  var priority: js.UndefOr[min | low | default | high | max] = js.undefined
  /**
    * File name of the sound to be played when the device receives the
    * notification.
    */
  var sound: js.UndefOr[String] = js.undefined
  /**
    * When set to `false` or unset, the notification is automatically dismissed when
    * the user clicks it in the panel. When set to `true`, the notification persists
    * even when the user clicks it.
    */
  var sticky: js.UndefOr[Boolean] = js.undefined
  /**
    * Notification tag. This is an identifier used to replace existing
    * notifications in the notification drawer. If not specified, each request
    * creates a new notification.
    */
  var tag: js.UndefOr[String] = js.undefined
  /**
    * Sets the "ticker" text, which is sent to accessibility services. Prior to
    * API level 21 (Lollipop), sets the text that is displayed in the status bar
    * when the notification first arrives.
    */
  var ticker: js.UndefOr[String] = js.undefined
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
  /**
    * Sets the vibration pattern to use. Pass in an array of milliseconds to
    * turn the vibrator on or off. The first value indicates the duration to wait before
    * turning the vibrator on. The next value indicates the duration to keep the
    * vibrator on. Subsequent values alternate between duration to turn the vibrator
    * off and to turn the vibrator on. If `vibrate_timings` is set and `default_vibrate_timings`
    * is set to `true`, the default value is used instead of the user-specified `vibrate_timings`.
    */
  var vibrateTimingsMillis: js.UndefOr[js.Array[Double]] = js.undefined
  /**
    * Sets the visibility of the notification. Must be either `private`, `public`,
    * or `secret`. If unspecified, defaults to `private`.
    */
  var visibility: js.UndefOr[`private` | public | secret] = js.undefined
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
    defaultLightSettings: js.UndefOr[Boolean] = js.undefined,
    defaultSound: js.UndefOr[Boolean] = js.undefined,
    defaultVibrateTimings: js.UndefOr[Boolean] = js.undefined,
    eventTimestamp: Date = null,
    icon: String = null,
    imageUrl: String = null,
    lightSettings: LightSettings = null,
    localOnly: js.UndefOr[Boolean] = js.undefined,
    notificationCount: js.UndefOr[Double] = js.undefined,
    priority: min | low | default | high | max = null,
    sound: String = null,
    sticky: js.UndefOr[Boolean] = js.undefined,
    tag: String = null,
    ticker: String = null,
    title: String = null,
    titleLocArgs: js.Array[String] = null,
    titleLocKey: String = null,
    vibrateTimingsMillis: js.Array[Double] = null,
    visibility: `private` | public | secret = null
  ): AndroidNotification = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (bodyLocArgs != null) __obj.updateDynamic("bodyLocArgs")(bodyLocArgs.asInstanceOf[js.Any])
    if (bodyLocKey != null) __obj.updateDynamic("bodyLocKey")(bodyLocKey.asInstanceOf[js.Any])
    if (channelId != null) __obj.updateDynamic("channelId")(channelId.asInstanceOf[js.Any])
    if (clickAction != null) __obj.updateDynamic("clickAction")(clickAction.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultLightSettings)) __obj.updateDynamic("defaultLightSettings")(defaultLightSettings.get.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultSound)) __obj.updateDynamic("defaultSound")(defaultSound.get.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultVibrateTimings)) __obj.updateDynamic("defaultVibrateTimings")(defaultVibrateTimings.get.asInstanceOf[js.Any])
    if (eventTimestamp != null) __obj.updateDynamic("eventTimestamp")(eventTimestamp.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (imageUrl != null) __obj.updateDynamic("imageUrl")(imageUrl.asInstanceOf[js.Any])
    if (lightSettings != null) __obj.updateDynamic("lightSettings")(lightSettings.asInstanceOf[js.Any])
    if (!js.isUndefined(localOnly)) __obj.updateDynamic("localOnly")(localOnly.get.asInstanceOf[js.Any])
    if (!js.isUndefined(notificationCount)) __obj.updateDynamic("notificationCount")(notificationCount.get.asInstanceOf[js.Any])
    if (priority != null) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    if (sound != null) __obj.updateDynamic("sound")(sound.asInstanceOf[js.Any])
    if (!js.isUndefined(sticky)) __obj.updateDynamic("sticky")(sticky.get.asInstanceOf[js.Any])
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    if (ticker != null) __obj.updateDynamic("ticker")(ticker.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (titleLocArgs != null) __obj.updateDynamic("titleLocArgs")(titleLocArgs.asInstanceOf[js.Any])
    if (titleLocKey != null) __obj.updateDynamic("titleLocKey")(titleLocKey.asInstanceOf[js.Any])
    if (vibrateTimingsMillis != null) __obj.updateDynamic("vibrateTimingsMillis")(vibrateTimingsMillis.asInstanceOf[js.Any])
    if (visibility != null) __obj.updateDynamic("visibility")(visibility.asInstanceOf[js.Any])
    __obj.asInstanceOf[AndroidNotification]
  }
}

