package typings.electron.Electron

import typings.electron.electronStrings.critical
import typings.electron.electronStrings.default
import typings.electron.electronStrings.low
import typings.electron.electronStrings.never
import typings.electron.electronStrings.normal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotificationConstructorOptions extends StObject {
  
  /**
    * Actions to add to the notification. Please read the available actions and
    * limitations in the `NotificationAction` documentation.
    *
    * @platform darwin
    */
  var actions: js.UndefOr[js.Array[NotificationAction]] = js.undefined
  
  /**
    * The body text of the notification, which will be displayed below the title or
    * subtitle.
    */
  var body: js.UndefOr[String] = js.undefined
  
  /**
    * A custom title for the close button of an alert. An empty string will cause the
    * default localized text to be used.
    *
    * @platform darwin
    */
  var closeButtonText: js.UndefOr[String] = js.undefined
  
  /**
    * Whether or not to add an inline reply option to the notification.
    *
    * @platform darwin
    */
  var hasReply: js.UndefOr[Boolean] = js.undefined
  
  /**
    * An icon to use in the notification.
    */
  var icon: js.UndefOr[String | NativeImage_] = js.undefined
  
  /**
    * The placeholder to write in the inline reply input field.
    *
    * @platform darwin
    */
  var replyPlaceholder: js.UndefOr[String] = js.undefined
  
  /**
    * Whether or not to suppress the OS notification noise when showing the
    * notification.
    */
  var silent: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The name of the sound file to play when the notification is shown.
    *
    * @platform darwin
    */
  var sound: js.UndefOr[String] = js.undefined
  
  /**
    * A subtitle for the notification, which will be displayed below the title.
    *
    * @platform darwin
    */
  var subtitle: js.UndefOr[String] = js.undefined
  
  /**
    * The timeout duration of the notification. Can be 'default' or 'never'.
    *
    * @platform linux,win32
    */
  var timeoutType: js.UndefOr[default | never] = js.undefined
  
  /**
    * A title for the notification, which will be displayed at the top of the
    * notification window when it is shown.
    */
  var title: js.UndefOr[String] = js.undefined
  
  /**
    * A custom description of the Notification on Windows superseding all properties
    * above. Provides full customization of design and behavior of the notification.
    *
    * @platform win32
    */
  var toastXml: js.UndefOr[String] = js.undefined
  
  /**
    * The urgency level of the notification. Can be 'normal', 'critical', or 'low'.
    *
    * @platform linux
    */
  var urgency: js.UndefOr[normal | critical | low] = js.undefined
}
object NotificationConstructorOptions {
  
  inline def apply(): NotificationConstructorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotificationConstructorOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NotificationConstructorOptions] (val x: Self) extends AnyVal {
    
    inline def setActions(value: js.Array[NotificationAction]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    inline def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
    
    inline def setActionsVarargs(value: NotificationAction*): Self = StObject.set(x, "actions", js.Array(value*))
    
    inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setCloseButtonText(value: String): Self = StObject.set(x, "closeButtonText", value.asInstanceOf[js.Any])
    
    inline def setCloseButtonTextUndefined: Self = StObject.set(x, "closeButtonText", js.undefined)
    
    inline def setHasReply(value: Boolean): Self = StObject.set(x, "hasReply", value.asInstanceOf[js.Any])
    
    inline def setHasReplyUndefined: Self = StObject.set(x, "hasReply", js.undefined)
    
    inline def setIcon(value: String | NativeImage_): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setReplyPlaceholder(value: String): Self = StObject.set(x, "replyPlaceholder", value.asInstanceOf[js.Any])
    
    inline def setReplyPlaceholderUndefined: Self = StObject.set(x, "replyPlaceholder", js.undefined)
    
    inline def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
    
    inline def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
    
    inline def setSound(value: String): Self = StObject.set(x, "sound", value.asInstanceOf[js.Any])
    
    inline def setSoundUndefined: Self = StObject.set(x, "sound", js.undefined)
    
    inline def setSubtitle(value: String): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
    
    inline def setSubtitleUndefined: Self = StObject.set(x, "subtitle", js.undefined)
    
    inline def setTimeoutType(value: default | never): Self = StObject.set(x, "timeoutType", value.asInstanceOf[js.Any])
    
    inline def setTimeoutTypeUndefined: Self = StObject.set(x, "timeoutType", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setToastXml(value: String): Self = StObject.set(x, "toastXml", value.asInstanceOf[js.Any])
    
    inline def setToastXmlUndefined: Self = StObject.set(x, "toastXml", js.undefined)
    
    inline def setUrgency(value: normal | critical | low): Self = StObject.set(x, "urgency", value.asInstanceOf[js.Any])
    
    inline def setUrgencyUndefined: Self = StObject.set(x, "urgency", js.undefined)
  }
}
