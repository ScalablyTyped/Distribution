package typings.electronDashNotifications.electronDashNotificationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("electron-notifications", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def notify(title: String): NotificationWindow = js.native
  def notify(title: String, data: NotifierOptions): NotificationWindow = js.native
}

