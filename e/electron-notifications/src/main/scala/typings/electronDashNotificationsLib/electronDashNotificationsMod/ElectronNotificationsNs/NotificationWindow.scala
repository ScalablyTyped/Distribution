package typings
package electronDashNotificationsLib.electronDashNotificationsMod.ElectronNotificationsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotificationWindow
  extends electronLib.electronMod.BrowserWindow {
  /** When any one of the buttons are clicked, it will trigger a buttonClicked event, and pass the text that was clicked to the handler. */
  @JSName("on")
  def on_buttonClicked(
    event: electronDashNotificationsLib.electronDashNotificationsLibStrings.buttonClicked,
    listener: js.Function1[/* text */ java.lang.String, scala.Unit]
  ): this.type = js.native
  /** When the notification was clicked, but not dragged. This usually does the default action, or closes the notification. */
  @JSName("on")
  def on_clicked(
    event: electronDashNotificationsLib.electronDashNotificationsLibStrings.clicked,
    listener: js.Function
  ): this.type = js.native
  /** When the notification has been swiped to the right. This usually indiciated the user wants to dismiss the notification. */
  @JSName("on")
  def on_swipedRight(
    event: electronDashNotificationsLib.electronDashNotificationsLibStrings.swipedRight,
    listener: js.Function
  ): this.type = js.native
}

