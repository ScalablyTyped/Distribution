package typings.electron.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotificationConstructorOptions extends js.Object {
  /**
    * Actions to add to the notification. Please read the available actions and
    * limitations in the NotificationAction documentation.
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
    */
  var closeButtonText: js.UndefOr[String] = js.undefined
  /**
    * Whether or not to add an inline reply option to the notification.
    */
  var hasReply: js.UndefOr[Boolean] = js.undefined
  /**
    * An icon to use in the notification.
    */
  var icon: js.UndefOr[String | NativeImage] = js.undefined
  /**
    * The placeholder to write in the inline reply input field.
    */
  var replyPlaceholder: js.UndefOr[String] = js.undefined
  /**
    * Whether or not to emit an OS notification noise when showing the notification.
    */
  var silent: js.UndefOr[Boolean] = js.undefined
  /**
    * The name of the sound file to play when the notification is shown.
    */
  var sound: js.UndefOr[String] = js.undefined
  /**
    * A subtitle for the notification, which will be displayed below the title.
    */
  var subtitle: js.UndefOr[String] = js.undefined
  /**
    * A title for the notification, which will be shown at the top of the notification
    * window when it is shown.
    */
  var title: String
}

object NotificationConstructorOptions {
  @scala.inline
  def apply(
    body: String,
    title: String,
    actions: js.Array[NotificationAction] = null,
    closeButtonText: String = null,
    hasReply: js.UndefOr[Boolean] = js.undefined,
    icon: String | NativeImage = null,
    replyPlaceholder: String = null,
    silent: js.UndefOr[Boolean] = js.undefined,
    sound: String = null,
    subtitle: String = null
  ): NotificationConstructorOptions = {
    val __obj = js.Dynamic.literal(body = body, title = title)
    if (actions != null) __obj.updateDynamic("actions")(actions)
    if (closeButtonText != null) __obj.updateDynamic("closeButtonText")(closeButtonText)
    if (!js.isUndefined(hasReply)) __obj.updateDynamic("hasReply")(hasReply)
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (replyPlaceholder != null) __obj.updateDynamic("replyPlaceholder")(replyPlaceholder)
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent)
    if (sound != null) __obj.updateDynamic("sound")(sound)
    if (subtitle != null) __obj.updateDynamic("subtitle")(subtitle)
    __obj.asInstanceOf[NotificationConstructorOptions]
  }
}

