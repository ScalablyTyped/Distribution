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
  var body: String
  
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
    * Whether or not to emit an OS notification noise when showing the notification.
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
    * A title for the notification, which will be shown at the top of the notification
    * window when it is shown.
    */
  var title: String
  
  /**
    * The urgency level of the notification. Can be 'normal', 'critical', or 'low'.
    *
    * @platform linux
    */
  var urgency: js.UndefOr[normal | critical | low] = js.undefined
}
object NotificationConstructorOptions {
  
  @scala.inline
  def apply(body: String, title: String): NotificationConstructorOptions = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationConstructorOptions]
  }
  
  @scala.inline
  implicit class NotificationConstructorOptionsMutableBuilder[Self <: NotificationConstructorOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActions(value: js.Array[NotificationAction]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
    
    @scala.inline
    def setActionsVarargs(value: NotificationAction*): Self = StObject.set(x, "actions", js.Array(value :_*))
    
    @scala.inline
    def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloseButtonText(value: String): Self = StObject.set(x, "closeButtonText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloseButtonTextUndefined: Self = StObject.set(x, "closeButtonText", js.undefined)
    
    @scala.inline
    def setHasReply(value: Boolean): Self = StObject.set(x, "hasReply", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasReplyUndefined: Self = StObject.set(x, "hasReply", js.undefined)
    
    @scala.inline
    def setIcon(value: String | NativeImage_): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    @scala.inline
    def setReplyPlaceholder(value: String): Self = StObject.set(x, "replyPlaceholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplyPlaceholderUndefined: Self = StObject.set(x, "replyPlaceholder", js.undefined)
    
    @scala.inline
    def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
    
    @scala.inline
    def setSound(value: String): Self = StObject.set(x, "sound", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSoundUndefined: Self = StObject.set(x, "sound", js.undefined)
    
    @scala.inline
    def setSubtitle(value: String): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubtitleUndefined: Self = StObject.set(x, "subtitle", js.undefined)
    
    @scala.inline
    def setTimeoutType(value: default | never): Self = StObject.set(x, "timeoutType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutTypeUndefined: Self = StObject.set(x, "timeoutType", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrgency(value: normal | critical | low): Self = StObject.set(x, "urgency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrgencyUndefined: Self = StObject.set(x, "urgency", js.undefined)
  }
}
