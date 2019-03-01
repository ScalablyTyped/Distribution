package typings
package firefoxDashWebextDashBrowserLib.browserNs.notificationsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateNotificationOptions extends js.Object {
  /** A URL to the app icon mask. */
  var appIconMaskUrl: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Text and icons for up to two notification action buttons.
    * @deprecated Unsupported on Firefox at this time.
    */
  var buttons: js.UndefOr[js.Array[firefoxDashWebextDashBrowserLib.Anon_IconUrl]] = js.undefined
  /** Alternate notification content with a lower-weight font. */
  var contextMessage: js.UndefOr[java.lang.String] = js.undefined
  /** A timestamp associated with the notification, in milliseconds past the epoch. */
  var eventTime: js.UndefOr[scala.Double] = js.undefined
  /** A URL to the sender's avatar, app icon, or a thumbnail for image notifications. */
  var iconUrl: js.UndefOr[java.lang.String] = js.undefined
  /** A URL to the image thumbnail for image-type notifications. */
  var imageUrl: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Whether to show UI indicating that the app will visibly respond to clicks on the body of a notification.
    */
  var isClickable: js.UndefOr[scala.Boolean] = js.undefined
  /** Items for multi-item notifications. */
  var items: js.UndefOr[js.Array[NotificationItem]] = js.undefined
  /** Main notification content. */
  var message: java.lang.String
  /** Priority ranges from -2 to 2\. -2 is lowest priority. 2 is highest. Zero is default. */
  var priority: js.UndefOr[scala.Double] = js.undefined
  /** Current progress ranges from 0 to 100. */
  var progress: js.UndefOr[scala.Double] = js.undefined
  /** Title of the notification (e.g. sender name for email). */
  var title: java.lang.String
  /** Which type of notification to display. */
  var `type`: TemplateType
}

object CreateNotificationOptions {
  @scala.inline
  def apply(
    message: java.lang.String,
    title: java.lang.String,
    `type`: TemplateType,
    appIconMaskUrl: java.lang.String = null,
    buttons: js.Array[firefoxDashWebextDashBrowserLib.Anon_IconUrl] = null,
    contextMessage: java.lang.String = null,
    eventTime: scala.Int | scala.Double = null,
    iconUrl: java.lang.String = null,
    imageUrl: java.lang.String = null,
    isClickable: js.UndefOr[scala.Boolean] = js.undefined,
    items: js.Array[NotificationItem] = null,
    priority: scala.Int | scala.Double = null,
    progress: scala.Int | scala.Double = null
  ): CreateNotificationOptions = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("message")(message)
    __obj.updateDynamic("title")(title)
    if (appIconMaskUrl != null) __obj.updateDynamic("appIconMaskUrl")(appIconMaskUrl)
    if (buttons != null) __obj.updateDynamic("buttons")(buttons)
    if (contextMessage != null) __obj.updateDynamic("contextMessage")(contextMessage)
    if (eventTime != null) __obj.updateDynamic("eventTime")(eventTime.asInstanceOf[js.Any])
    if (iconUrl != null) __obj.updateDynamic("iconUrl")(iconUrl)
    if (imageUrl != null) __obj.updateDynamic("imageUrl")(imageUrl)
    if (!js.isUndefined(isClickable)) __obj.updateDynamic("isClickable")(isClickable)
    if (items != null) __obj.updateDynamic("items")(items)
    if (priority != null) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    if (progress != null) __obj.updateDynamic("progress")(progress.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateNotificationOptions]
  }
}

