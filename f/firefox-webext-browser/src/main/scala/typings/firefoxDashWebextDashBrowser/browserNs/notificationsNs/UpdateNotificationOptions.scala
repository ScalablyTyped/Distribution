package typings.firefoxDashWebextDashBrowser.browserNs.notificationsNs

import typings.firefoxDashWebextDashBrowser.Anon_IconUrl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateNotificationOptions extends js.Object {
  /** A URL to the app icon mask. */
  var appIconMaskUrl: js.UndefOr[String] = js.undefined
  /**
    * Text and icons for up to two notification action buttons.
    * @deprecated Unsupported on Firefox at this time.
    */
  var buttons: js.UndefOr[js.Array[Anon_IconUrl]] = js.undefined
  /** Alternate notification content with a lower-weight font. */
  var contextMessage: js.UndefOr[String] = js.undefined
  /** A timestamp associated with the notification, in milliseconds past the epoch. */
  var eventTime: js.UndefOr[Double] = js.undefined
  /** A URL to the sender's avatar, app icon, or a thumbnail for image notifications. */
  var iconUrl: js.UndefOr[String] = js.undefined
  /** A URL to the image thumbnail for image-type notifications. */
  var imageUrl: js.UndefOr[String] = js.undefined
  /**
    * Whether to show UI indicating that the app will visibly respond to clicks on the body of a notification.
    */
  var isClickable: js.UndefOr[Boolean] = js.undefined
  /** Items for multi-item notifications. */
  var items: js.UndefOr[js.Array[NotificationItem]] = js.undefined
  /** Main notification content. */
  var message: js.UndefOr[String] = js.undefined
  /** Priority ranges from -2 to 2\. -2 is lowest priority. 2 is highest. Zero is default. */
  var priority: js.UndefOr[Double] = js.undefined
  /** Current progress ranges from 0 to 100. */
  var progress: js.UndefOr[Double] = js.undefined
  /** Title of the notification (e.g. sender name for email). */
  var title: js.UndefOr[String] = js.undefined
  /** Which type of notification to display. */
  var `type`: js.UndefOr[TemplateType] = js.undefined
}

object UpdateNotificationOptions {
  @scala.inline
  def apply(
    appIconMaskUrl: String = null,
    buttons: js.Array[Anon_IconUrl] = null,
    contextMessage: String = null,
    eventTime: Int | Double = null,
    iconUrl: String = null,
    imageUrl: String = null,
    isClickable: js.UndefOr[Boolean] = js.undefined,
    items: js.Array[NotificationItem] = null,
    message: String = null,
    priority: Int | Double = null,
    progress: Int | Double = null,
    title: String = null,
    `type`: TemplateType = null
  ): UpdateNotificationOptions = {
    val __obj = js.Dynamic.literal()
    if (appIconMaskUrl != null) __obj.updateDynamic("appIconMaskUrl")(appIconMaskUrl)
    if (buttons != null) __obj.updateDynamic("buttons")(buttons)
    if (contextMessage != null) __obj.updateDynamic("contextMessage")(contextMessage)
    if (eventTime != null) __obj.updateDynamic("eventTime")(eventTime.asInstanceOf[js.Any])
    if (iconUrl != null) __obj.updateDynamic("iconUrl")(iconUrl)
    if (imageUrl != null) __obj.updateDynamic("imageUrl")(imageUrl)
    if (!js.isUndefined(isClickable)) __obj.updateDynamic("isClickable")(isClickable)
    if (items != null) __obj.updateDynamic("items")(items)
    if (message != null) __obj.updateDynamic("message")(message)
    if (priority != null) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    if (progress != null) __obj.updateDynamic("progress")(progress.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[UpdateNotificationOptions]
  }
}

