package typings.firebaseAdmin.libMessagingMessagingApiMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotificationMessagePayload
  extends StObject
     with /* key */ StringDictionary[js.UndefOr[String]] {
  
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
    * {@link https://developer.apple.com/library/content/documentation/NetworkingInternet/Conceptual/RemoteNotificationsPG/PayloadKeyReference.html |
    * Payload Key Reference} and
    * {@link https://developer.apple.com/library/content/documentation/NetworkingInternet/Conceptual/RemoteNotificationsPG/CreatingtheNotificationPayload.html#//apple_ref/doc/uid/TP40008194-CH10-SW9 |
    * Localizing the Content of Your Remote Notifications} for more information.
    *
    * **Android:** See
    * {@link http://developer.android.com/guide/topics/resources/string-resource.html#FormattingAndStyling |
    * Formatting and Styling} for more information.
    *
    * **Platforms:** iOS, Android
    */
  var bodyLocArgs: js.UndefOr[String] = js.undefined
  
  /**
    * The key to the body string in the app's string resources to use to localize
    * the body text to the user's current localization.
    *
    * **iOS:** Corresponds to `loc-key` in the APNs payload. See
    * {@link https://developer.apple.com/library/content/documentation/NetworkingInternet/Conceptual/RemoteNotificationsPG/PayloadKeyReference.html |
    * Payload Key Reference} and
    * {@link https://developer.apple.com/library/content/documentation/NetworkingInternet/Conceptual/RemoteNotificationsPG/CreatingtheNotificationPayload.html#//apple_ref/doc/uid/TP40008194-CH10-SW9 |
    * Localizing the Content of Your Remote Notifications} for more information.
    *
    * **Android:** See
    * {@link http://developer.android.com/guide/topics/resources/string-resource.html | String Resources}
    * for more information.
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
    * The sound to be played when the device receives a notification. Supports
    * "default" for the default notification sound of the device or the filename of a
    * sound resource bundled in the app.
    * Sound files must reside in `/res/raw/`.
    *
    * **Platforms:** Android
    */
  var sound: js.UndefOr[String] = js.undefined
  
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
    * {@link https://developer.apple.com/library/content/documentation/NetworkingInternet/Conceptual/RemoteNotificationsPG/PayloadKeyReference.html |
    * Payload Key Reference} and
    * {@link https://developer.apple.com/library/content/documentation/NetworkingInternet/Conceptual/RemoteNotificationsPG/CreatingtheNotificationPayload.html#//apple_ref/doc/uid/TP40008194-CH10-SW9 |
    * Localizing the Content of Your Remote Notifications} for more information.
    *
    * **Android:** See
    * {@link http://developer.android.com/guide/topics/resources/string-resource.html#FormattingAndStyling |
    * Formatting and Styling} for more information.
    *
    * **Platforms:** iOS, Android
    */
  var titleLocArgs: js.UndefOr[String] = js.undefined
  
  /**
    * The key to the title string in the app's string resources to use to localize
    * the title text to the user's current localization.
    *
    * **iOS:** Corresponds to `title-loc-key` in the APNs payload. See
    * {@link https://developer.apple.com/library/content/documentation/NetworkingInternet/Conceptual/RemoteNotificationsPG/PayloadKeyReference.html |
    * Payload Key Reference} and
    * {@link https://developer.apple.com/library/content/documentation/NetworkingInternet/Conceptual/RemoteNotificationsPG/CreatingtheNotificationPayload.html#//apple_ref/doc/uid/TP40008194-CH10-SW9 |
    * Localizing the Content of Your Remote Notifications} for more information.
    *
    * **Android:** See
    * {@link http://developer.android.com/guide/topics/resources/string-resource.html | String Resources}
    * for more information.
    *
    * **Platforms:** iOS, Android
    */
  var titleLocKey: js.UndefOr[String] = js.undefined
}
object NotificationMessagePayload {
  
  inline def apply(): NotificationMessagePayload = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotificationMessagePayload]
  }
  
  extension [Self <: NotificationMessagePayload](x: Self) {
    
    inline def setBadge(value: String): Self = StObject.set(x, "badge", value.asInstanceOf[js.Any])
    
    inline def setBadgeUndefined: Self = StObject.set(x, "badge", js.undefined)
    
    inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyLocArgs(value: String): Self = StObject.set(x, "bodyLocArgs", value.asInstanceOf[js.Any])
    
    inline def setBodyLocArgsUndefined: Self = StObject.set(x, "bodyLocArgs", js.undefined)
    
    inline def setBodyLocKey(value: String): Self = StObject.set(x, "bodyLocKey", value.asInstanceOf[js.Any])
    
    inline def setBodyLocKeyUndefined: Self = StObject.set(x, "bodyLocKey", js.undefined)
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setClickAction(value: String): Self = StObject.set(x, "clickAction", value.asInstanceOf[js.Any])
    
    inline def setClickActionUndefined: Self = StObject.set(x, "clickAction", js.undefined)
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setSound(value: String): Self = StObject.set(x, "sound", value.asInstanceOf[js.Any])
    
    inline def setSoundUndefined: Self = StObject.set(x, "sound", js.undefined)
    
    inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleLocArgs(value: String): Self = StObject.set(x, "titleLocArgs", value.asInstanceOf[js.Any])
    
    inline def setTitleLocArgsUndefined: Self = StObject.set(x, "titleLocArgs", js.undefined)
    
    inline def setTitleLocKey(value: String): Self = StObject.set(x, "titleLocKey", value.asInstanceOf[js.Any])
    
    inline def setTitleLocKeyUndefined: Self = StObject.set(x, "titleLocKey", js.undefined)
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
