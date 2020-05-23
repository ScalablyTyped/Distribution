package typings.electron.Electron

import typings.electron.electronStrings.critical
import typings.electron.electronStrings.default
import typings.electron.electronStrings.low
import typings.electron.electronStrings.never
import typings.electron.electronStrings.normal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotificationConstructorOptions extends js.Object {
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
  def apply(
    body: String,
    title: String,
    actions: js.Array[NotificationAction] = null,
    closeButtonText: String = null,
    hasReply: js.UndefOr[Boolean] = js.undefined,
    icon: String | NativeImage_ = null,
    replyPlaceholder: String = null,
    silent: js.UndefOr[Boolean] = js.undefined,
    sound: String = null,
    subtitle: String = null,
    timeoutType: default | never = null,
    urgency: normal | critical | low = null
  ): NotificationConstructorOptions = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    if (actions != null) __obj.updateDynamic("actions")(actions.asInstanceOf[js.Any])
    if (closeButtonText != null) __obj.updateDynamic("closeButtonText")(closeButtonText.asInstanceOf[js.Any])
    if (!js.isUndefined(hasReply)) __obj.updateDynamic("hasReply")(hasReply.get.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (replyPlaceholder != null) __obj.updateDynamic("replyPlaceholder")(replyPlaceholder.asInstanceOf[js.Any])
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent.get.asInstanceOf[js.Any])
    if (sound != null) __obj.updateDynamic("sound")(sound.asInstanceOf[js.Any])
    if (subtitle != null) __obj.updateDynamic("subtitle")(subtitle.asInstanceOf[js.Any])
    if (timeoutType != null) __obj.updateDynamic("timeoutType")(timeoutType.asInstanceOf[js.Any])
    if (urgency != null) __obj.updateDynamic("urgency")(urgency.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationConstructorOptions]
  }
}

