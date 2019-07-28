package typings.firebaseDashAdmin.adminNs.messagingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents options for features provided by the FCM SDK for Web
  * (which are not part of the Webpush standard).
  */
trait WebpushFcmOptions extends js.Object {
  /**
    * The link to open when the user clicks on the notification.
    * For all URL values, HTTPS is required.
    */
  var link: js.UndefOr[String] = js.undefined
}

object WebpushFcmOptions {
  @scala.inline
  def apply(link: String = null): WebpushFcmOptions = {
    val __obj = js.Dynamic.literal()
    if (link != null) __obj.updateDynamic("link")(link)
    __obj.asInstanceOf[WebpushFcmOptions]
  }
}

