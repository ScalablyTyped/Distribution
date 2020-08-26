package typings.firefoxWebextBrowser.browser.notifications

import typings.firefoxWebextBrowser.anon.IconUrl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateNotificationOptions extends js.Object {
  /** A URL to the app icon mask. */
  var appIconMaskUrl: js.UndefOr[String] = js.native
  /**
    * Text and icons for up to two notification action buttons.
    * @deprecated Unsupported on Firefox at this time.
    */
  var buttons: js.UndefOr[js.Array[IconUrl]] = js.native
  /** Alternate notification content with a lower-weight font. */
  var contextMessage: js.UndefOr[String] = js.native
  /** A timestamp associated with the notification, in milliseconds past the epoch. */
  var eventTime: js.UndefOr[Double] = js.native
  /** A URL to the sender's avatar, app icon, or a thumbnail for image notifications. */
  var iconUrl: js.UndefOr[String] = js.native
  /** A URL to the image thumbnail for image-type notifications. */
  var imageUrl: js.UndefOr[String] = js.native
  /**
    * Whether to show UI indicating that the app will visibly respond to clicks on the body of a notification.
    */
  var isClickable: js.UndefOr[Boolean] = js.native
  /** Items for multi-item notifications. */
  var items: js.UndefOr[js.Array[NotificationItem]] = js.native
  /** Main notification content. */
  var message: js.UndefOr[String] = js.native
  /** Priority ranges from -2 to 2\. -2 is lowest priority. 2 is highest. Zero is default. */
  var priority: js.UndefOr[Double] = js.native
  /** Current progress ranges from 0 to 100. */
  var progress: js.UndefOr[Double] = js.native
  /** Title of the notification (e.g. sender name for email). */
  var title: js.UndefOr[String] = js.native
  /** Which type of notification to display. */
  var `type`: js.UndefOr[TemplateType] = js.native
}

object UpdateNotificationOptions {
  @scala.inline
  def apply(): UpdateNotificationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateNotificationOptions]
  }
  @scala.inline
  implicit class UpdateNotificationOptionsOps[Self <: UpdateNotificationOptions] (val x: Self) extends AnyVal {
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
    def setAppIconMaskUrl(value: String): Self = this.set("appIconMaskUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppIconMaskUrl: Self = this.set("appIconMaskUrl", js.undefined)
    @scala.inline
    def setButtonsVarargs(value: IconUrl*): Self = this.set("buttons", js.Array(value :_*))
    @scala.inline
    def setButtons(value: js.Array[IconUrl]): Self = this.set("buttons", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteButtons: Self = this.set("buttons", js.undefined)
    @scala.inline
    def setContextMessage(value: String): Self = this.set("contextMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContextMessage: Self = this.set("contextMessage", js.undefined)
    @scala.inline
    def setEventTime(value: Double): Self = this.set("eventTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEventTime: Self = this.set("eventTime", js.undefined)
    @scala.inline
    def setIconUrl(value: String): Self = this.set("iconUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIconUrl: Self = this.set("iconUrl", js.undefined)
    @scala.inline
    def setImageUrl(value: String): Self = this.set("imageUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageUrl: Self = this.set("imageUrl", js.undefined)
    @scala.inline
    def setIsClickable(value: Boolean): Self = this.set("isClickable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsClickable: Self = this.set("isClickable", js.undefined)
    @scala.inline
    def setItemsVarargs(value: NotificationItem*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[NotificationItem]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
    @scala.inline
    def setPriority(value: Double): Self = this.set("priority", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePriority: Self = this.set("priority", js.undefined)
    @scala.inline
    def setProgress(value: Double): Self = this.set("progress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProgress: Self = this.set("progress", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setType(value: TemplateType): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

