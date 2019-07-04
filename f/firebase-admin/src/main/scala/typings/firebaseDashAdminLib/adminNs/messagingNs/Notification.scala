package typings
package firebaseDashAdminLib.adminNs.messagingNs

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
  var body: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The title of the notification.
    */
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object Notification {
  @scala.inline
  def apply(body: java.lang.String = null, title: java.lang.String = null): Notification = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[Notification]
  }
}

