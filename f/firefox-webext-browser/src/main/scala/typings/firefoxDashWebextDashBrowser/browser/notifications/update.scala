package typings.firefoxDashWebextDashBrowser.browser.notifications

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.notifications.update")
@js.native
object update extends js.Object {
  /**
    * Updates an existing notification.
    * @param notificationId The id of the notification to be updated.
    * @param options Contents of the notification to update to.
    * @deprecated Unsupported on Firefox at this time.
    */
  def apply(notificationId: String, options: UpdateNotificationOptions): js.Promise[js.UndefOr[Boolean]] = js.native
}

