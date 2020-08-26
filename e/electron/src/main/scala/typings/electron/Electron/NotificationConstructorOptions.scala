package typings.electron.Electron

import typings.electron.electronStrings.critical
import typings.electron.electronStrings.default
import typings.electron.electronStrings.low
import typings.electron.electronStrings.never
import typings.electron.electronStrings.normal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotificationConstructorOptions extends js.Object {
  /**
    * Actions to add to the notification. Please read the available actions and
    * limitations in the `NotificationAction` documentation.
    *
    * @platform darwin
    */
  var actions: js.UndefOr[js.Array[NotificationAction]] = js.native
  /**
    * The body text of the notification, which will be displayed below the title or
    * subtitle.
    */
  var body: String = js.native
  /**
    * A custom title for the close button of an alert. An empty string will cause the
    * default localized text to be used.
    *
    * @platform darwin
    */
  var closeButtonText: js.UndefOr[String] = js.native
  /**
    * Whether or not to add an inline reply option to the notification.
    *
    * @platform darwin
    */
  var hasReply: js.UndefOr[Boolean] = js.native
  /**
    * An icon to use in the notification.
    */
  var icon: js.UndefOr[String | NativeImage_] = js.native
  /**
    * The placeholder to write in the inline reply input field.
    *
    * @platform darwin
    */
  var replyPlaceholder: js.UndefOr[String] = js.native
  /**
    * Whether or not to emit an OS notification noise when showing the notification.
    */
  var silent: js.UndefOr[Boolean] = js.native
  /**
    * The name of the sound file to play when the notification is shown.
    *
    * @platform darwin
    */
  var sound: js.UndefOr[String] = js.native
  /**
    * A subtitle for the notification, which will be displayed below the title.
    *
    * @platform darwin
    */
  var subtitle: js.UndefOr[String] = js.native
  /**
    * The timeout duration of the notification. Can be 'default' or 'never'.
    *
    * @platform linux,win32
    */
  var timeoutType: js.UndefOr[default | never] = js.native
  /**
    * A title for the notification, which will be shown at the top of the notification
    * window when it is shown.
    */
  var title: String = js.native
  /**
    * The urgency level of the notification. Can be 'normal', 'critical', or 'low'.
    *
    * @platform linux
    */
  var urgency: js.UndefOr[normal | critical | low] = js.native
}

object NotificationConstructorOptions {
  @scala.inline
  def apply(body: String, title: String): NotificationConstructorOptions = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationConstructorOptions]
  }
  @scala.inline
  implicit class NotificationConstructorOptionsOps[Self <: NotificationConstructorOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBody(value: String): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def setActionsVarargs(value: NotificationAction*): Self = this.set("actions", js.Array(value :_*))
    @scala.inline
    def setActions(value: js.Array[NotificationAction]): Self = this.set("actions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActions: Self = this.set("actions", js.undefined)
    @scala.inline
    def setCloseButtonText(value: String): Self = this.set("closeButtonText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCloseButtonText: Self = this.set("closeButtonText", js.undefined)
    @scala.inline
    def setHasReply(value: Boolean): Self = this.set("hasReply", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHasReply: Self = this.set("hasReply", js.undefined)
    @scala.inline
    def setIcon(value: String | NativeImage_): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    @scala.inline
    def setReplyPlaceholder(value: String): Self = this.set("replyPlaceholder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplyPlaceholder: Self = this.set("replyPlaceholder", js.undefined)
    @scala.inline
    def setSilent(value: Boolean): Self = this.set("silent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSilent: Self = this.set("silent", js.undefined)
    @scala.inline
    def setSound(value: String): Self = this.set("sound", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSound: Self = this.set("sound", js.undefined)
    @scala.inline
    def setSubtitle(value: String): Self = this.set("subtitle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubtitle: Self = this.set("subtitle", js.undefined)
    @scala.inline
    def setTimeoutType(value: default | never): Self = this.set("timeoutType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeoutType: Self = this.set("timeoutType", js.undefined)
    @scala.inline
    def setUrgency(value: normal | critical | low): Self = this.set("urgency", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrgency: Self = this.set("urgency", js.undefined)
  }
  
}

