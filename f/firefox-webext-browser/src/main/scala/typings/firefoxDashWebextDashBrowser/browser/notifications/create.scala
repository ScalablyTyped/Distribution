package typings.firefoxDashWebextDashBrowser.browser.notifications

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.notifications.create")
@js.native
object create extends js.Object {
  /**
    * Creates and displays a notification.
    * @param notificationId Identifier of the notification. If it is empty, this method generates an id. If it matches
    *     an existing notification, this method first clears that notification before proceeding with the create
    *     operation.
    * @param options Contents of the notification.
    */
  def apply(notificationId: String, options: CreateNotificationOptions): js.Promise[String] = js.native
  /* notifications functions */
  /**
    * Creates and displays a notification.
    * @param options Contents of the notification.
    */
  def apply(options: CreateNotificationOptions): js.Promise[String] = js.native
}

