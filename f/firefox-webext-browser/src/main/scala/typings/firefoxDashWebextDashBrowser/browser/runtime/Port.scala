package typings.firefoxDashWebextDashBrowser.browser.runtime

import typings.firefoxDashWebextDashBrowser.WebExtEvent
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* runtime types */
/** An object which allows two way communication with other pages. */
trait Port extends js.Object {
  var error: js.UndefOr[Error] = js.undefined
  var name: String
  var onDisconnect: WebExtEvent[js.Function1[/* port */ this.type, Unit]]
  var onMessage: WebExtEvent[js.Function1[/* response */ js.Object, Unit]]
  /** This property will **only** be present on ports passed to onConnect/onConnectExternal listeners. */
  var sender: js.UndefOr[MessageSender] = js.undefined
  def disconnect(): Unit
  def postMessage(message: js.Object): Unit
}

object Port {
  @scala.inline
  def apply(
    disconnect: () => Unit,
    name: String,
    onDisconnect: WebExtEvent[js.Function1[Port, Unit]],
    onMessage: WebExtEvent[js.Function1[/* response */ js.Object, Unit]],
    postMessage: js.Object => Unit,
    error: Error = null,
    sender: MessageSender = null
  ): Port = {
    val __obj = js.Dynamic.literal(disconnect = js.Any.fromFunction0(disconnect), name = name, onDisconnect = onDisconnect, onMessage = onMessage, postMessage = js.Any.fromFunction1(postMessage))
    if (error != null) __obj.updateDynamic("error")(error)
    if (sender != null) __obj.updateDynamic("sender")(sender)
    __obj.asInstanceOf[Port]
  }
}

