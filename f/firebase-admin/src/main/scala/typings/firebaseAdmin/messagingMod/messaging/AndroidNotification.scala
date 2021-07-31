package typings.firebaseAdmin.messagingMod.messaging

import typings.firebaseAdmin.firebaseAdminStrings.`private`
import typings.firebaseAdmin.firebaseAdminStrings.default
import typings.firebaseAdmin.firebaseAdminStrings.high
import typings.firebaseAdmin.firebaseAdminStrings.low
import typings.firebaseAdmin.firebaseAdminStrings.max
import typings.firebaseAdmin.firebaseAdminStrings.min
import typings.firebaseAdmin.firebaseAdminStrings.public
import typings.firebaseAdmin.firebaseAdminStrings.secret
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AndroidNotification extends StObject {
  
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
  def apply(): AndroidNotification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AndroidNotification]
  }
  
  @scala.inline
  implicit class AndroidNotificationMutableBuilder[Self <: AndroidNotification] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyLocArgs(value: js.Array[String]): Self = StObject.set(x, "bodyLocArgs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyLocArgsUndefined: Self = StObject.set(x, "bodyLocArgs", js.undefined)
    
    @scala.inline
    def setBodyLocArgsVarargs(value: String*): Self = StObject.set(x, "bodyLocArgs", js.Array(value :_*))
    
    @scala.inline
    def setBodyLocKey(value: String): Self = StObject.set(x, "bodyLocKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyLocKeyUndefined: Self = StObject.set(x, "bodyLocKey", js.undefined)
    
    @scala.inline
    def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    @scala.inline
    def setChannelId(value: String): Self = StObject.set(x, "channelId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelIdUndefined: Self = StObject.set(x, "channelId", js.undefined)
    
    @scala.inline
    def setClickAction(value: String): Self = StObject.set(x, "clickAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClickActionUndefined: Self = StObject.set(x, "clickAction", js.undefined)
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setDefaultLightSettings(value: Boolean): Self = StObject.set(x, "defaultLightSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultLightSettingsUndefined: Self = StObject.set(x, "defaultLightSettings", js.undefined)
    
    @scala.inline
    def setDefaultSound(value: Boolean): Self = StObject.set(x, "defaultSound", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultSoundUndefined: Self = StObject.set(x, "defaultSound", js.undefined)
    
    @scala.inline
    def setDefaultVibrateTimings(value: Boolean): Self = StObject.set(x, "defaultVibrateTimings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultVibrateTimingsUndefined: Self = StObject.set(x, "defaultVibrateTimings", js.undefined)
    
    @scala.inline
    def setEventTimestamp(value: Date): Self = StObject.set(x, "eventTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventTimestampUndefined: Self = StObject.set(x, "eventTimestamp", js.undefined)
    
    @scala.inline
    def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    @scala.inline
    def setImageUrl(value: String): Self = StObject.set(x, "imageUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageUrlUndefined: Self = StObject.set(x, "imageUrl", js.undefined)
    
    @scala.inline
    def setLightSettings(value: LightSettings): Self = StObject.set(x, "lightSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLightSettingsUndefined: Self = StObject.set(x, "lightSettings", js.undefined)
    
    @scala.inline
    def setLocalOnly(value: Boolean): Self = StObject.set(x, "localOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalOnlyUndefined: Self = StObject.set(x, "localOnly", js.undefined)
    
    @scala.inline
    def setNotificationCount(value: Double): Self = StObject.set(x, "notificationCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotificationCountUndefined: Self = StObject.set(x, "notificationCount", js.undefined)
    
    @scala.inline
    def setPriority(value: min | low | default | high | max): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    @scala.inline
    def setSound(value: String): Self = StObject.set(x, "sound", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSoundUndefined: Self = StObject.set(x, "sound", js.undefined)
    
    @scala.inline
    def setSticky(value: Boolean): Self = StObject.set(x, "sticky", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStickyUndefined: Self = StObject.set(x, "sticky", js.undefined)
    
    @scala.inline
    def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
    
    @scala.inline
    def setTicker(value: String): Self = StObject.set(x, "ticker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTickerUndefined: Self = StObject.set(x, "ticker", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleLocArgs(value: js.Array[String]): Self = StObject.set(x, "titleLocArgs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleLocArgsUndefined: Self = StObject.set(x, "titleLocArgs", js.undefined)
    
    @scala.inline
    def setTitleLocArgsVarargs(value: String*): Self = StObject.set(x, "titleLocArgs", js.Array(value :_*))
    
    @scala.inline
    def setTitleLocKey(value: String): Self = StObject.set(x, "titleLocKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleLocKeyUndefined: Self = StObject.set(x, "titleLocKey", js.undefined)
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setVibrateTimingsMillis(value: js.Array[Double]): Self = StObject.set(x, "vibrateTimingsMillis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVibrateTimingsMillisUndefined: Self = StObject.set(x, "vibrateTimingsMillis", js.undefined)
    
    @scala.inline
    def setVibrateTimingsMillisVarargs(value: Double*): Self = StObject.set(x, "vibrateTimingsMillis", js.Array(value :_*))
    
    @scala.inline
    def setVisibility(value: `private` | public | secret): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibilityUndefined: Self = StObject.set(x, "visibility", js.undefined)
  }
}
