package typings.electronNotifications.mod

import typings.electron.mod.BrowserWindow
import typings.electronNotifications.electronNotificationsStrings.buttonClicked
import typings.electronNotifications.electronNotificationsStrings.clicked
import typings.electronNotifications.electronNotificationsStrings.swipedRight
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("electron-notifications", "NotificationWindow")
@js.native
class NotificationWindow () extends BrowserWindow {
  
  def on(event: String, listener: js.Function): this.type = js.native
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
