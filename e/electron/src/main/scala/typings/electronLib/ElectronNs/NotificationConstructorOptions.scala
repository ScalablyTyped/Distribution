package typings
package electronLib.ElectronNs

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
  var body: java.lang.String
  /**
    * A custom title for the close button of an alert. An empty string will cause the
    * default localized text to be used.
    */
  var closeButtonText: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Whether or not to add an inline reply option to the notification.
    */
  var hasReply: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * An icon to use in the notification.
    */
  var icon: js.UndefOr[java.lang.String | NativeImage] = js.undefined
  /**
    * The placeholder to write in the inline reply input field.
    */
  var replyPlaceholder: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Whether or not to emit an OS notification noise when showing the notification.
    */
  var silent: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The name of the sound file to play when the notification is shown.
    */
  var sound: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A subtitle for the notification, which will be displayed below the title.
    */
  var subtitle: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A title for the notification, which will be shown at the top of the notification
    * window when it is shown.
    */
  var title: java.lang.String
}

