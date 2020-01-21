package typings.firefoxWebextBrowser.browser.notifications

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.notifications.clear")
@js.native
object clear extends js.Object {
  /**
    * Clears an existing notification.
    * @param notificationId The id of the notification to be updated.
    */
  def apply(notificationId: String): js.Promise[Boolean] = js.native
}

