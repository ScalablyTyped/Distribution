package typings.firebaseAdmin.messagingMod.messaging

import org.scalablytyped.runtime.StringDictionary
import typings.firebaseAdmin.anon.Action
import typings.firebaseAdmin.firebaseAdminStrings.auto
import typings.firebaseAdmin.firebaseAdminStrings.ltr
import typings.firebaseAdmin.firebaseAdminStrings.rtl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebpushNotification
  extends StObject
     with /* key */ StringDictionary[js.Any] {
  
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
  def apply(): WebpushNotification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebpushNotification]
  }
  
  @scala.inline
  implicit class WebpushNotificationMutableBuilder[Self <: WebpushNotification] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActions(value: js.Array[Action]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
    
    @scala.inline
    def setActionsVarargs(value: Action*): Self = StObject.set(x, "actions", js.Array(value :_*))
    
    @scala.inline
    def setBadge(value: String): Self = StObject.set(x, "badge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBadgeUndefined: Self = StObject.set(x, "badge", js.undefined)
    
    @scala.inline
    def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    @scala.inline
    def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setDir(value: auto | ltr | rtl): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
    
    @scala.inline
    def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    @scala.inline
    def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    @scala.inline
    def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
    
    @scala.inline
    def setRenotify(value: Boolean): Self = StObject.set(x, "renotify", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenotifyUndefined: Self = StObject.set(x, "renotify", js.undefined)
    
    @scala.inline
    def setRequireInteraction(value: Boolean): Self = StObject.set(x, "requireInteraction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequireInteractionUndefined: Self = StObject.set(x, "requireInteraction", js.undefined)
    
    @scala.inline
    def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
    
    @scala.inline
    def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
    
    @scala.inline
    def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setVibrate(value: Double | js.Array[Double]): Self = StObject.set(x, "vibrate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVibrateUndefined: Self = StObject.set(x, "vibrate", js.undefined)
    
    @scala.inline
    def setVibrateVarargs(value: Double*): Self = StObject.set(x, "vibrate", js.Array(value :_*))
  }
}
