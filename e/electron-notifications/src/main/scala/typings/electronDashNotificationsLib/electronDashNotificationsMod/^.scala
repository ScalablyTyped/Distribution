package typings
package electronDashNotificationsLib.electronDashNotificationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("electron-notifications", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def notify(title: java.lang.String): electronDashNotificationsLib.electronDashNotificationsMod.ElectronNotificationsNs.NotificationWindow = js.native
  def notify(
    title: java.lang.String,
    data: electronDashNotificationsLib.electronDashNotificationsMod.ElectronNotificationsNs.NotifierOptions
  ): electronDashNotificationsLib.electronDashNotificationsMod.ElectronNotificationsNs.NotificationWindow = js.native
}

