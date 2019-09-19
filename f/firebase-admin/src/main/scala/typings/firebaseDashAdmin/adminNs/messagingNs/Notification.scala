package typings.firebaseDashAdmin.adminNs.messagingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A notification that can be included in {@link admin.messaging.Message}.
  */
trait Notification extends js.Object {
  /**
    * The notification body
    */
  var body: js.UndefOr[String] = js.undefined
  /**
    * URL of an image to be displayed in the notification.
    */
  var imageUrl: js.UndefOr[String] = js.undefined
  /**
    * The title of the notification.
    */
  var title: js.UndefOr[String] = js.undefined
}

object Notification {
  @scala.inline
  def apply(body: String = null, imageUrl: String = null, title: String = null): Notification = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body)
    if (imageUrl != null) __obj.updateDynamic("imageUrl")(imageUrl)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[Notification]
  }
}

