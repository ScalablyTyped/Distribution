package typings.electronDashNotifications.electronDashNotificationsMod

import typings.electron.electronMod.BrowserWindow
import typings.electronDashNotifications.electronDashNotificationsStrings.buttonClicked
import typings.electronDashNotifications.electronDashNotificationsStrings.clicked
import typings.electronDashNotifications.electronDashNotificationsStrings.swipedRight
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("electron-notifications", "NotificationWindow")
@js.native
class NotificationWindow () extends BrowserWindow {
  /** When any one of the buttons are clicked, it will trigger a buttonClicked event, and pass the text that was clicked to the handler. */
  @JSName("on")
  def on_buttonClicked(event: buttonClicked, listener: js.Function1[/* text */ String, Unit]): this.type = js.native
  /** When the notification was clicked, but not dragged. This usually does the default action, or closes the notification. */
  @JSName("on")
  def on_clicked(event: clicked, listener: js.Function): this.type = js.native
  /** When the notification has been swiped to the right. This usually indiciated the user wants to dismiss the notification. */
  @JSName("on")
  def on_swipedRight(event: swipedRight, listener: js.Function): this.type = js.native
}

