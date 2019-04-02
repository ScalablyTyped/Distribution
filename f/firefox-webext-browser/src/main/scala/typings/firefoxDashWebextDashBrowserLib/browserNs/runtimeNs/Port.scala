package typings
package firefoxDashWebextDashBrowserLib.browserNs.runtimeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* runtime types */
/** An object which allows two way communication with other pages. */
trait Port extends js.Object {
  var name: java.lang.String
  var onDisconnect: firefoxDashWebextDashBrowserLib.WebExtEvent[js.Function0[scala.Unit]]
  var onMessage: firefoxDashWebextDashBrowserLib.WebExtEvent[js.Function0[scala.Unit]]
  /** This property will **only** be present on ports passed to onConnect/onConnectExternal listeners. */
  var sender: js.UndefOr[MessageSender] = js.undefined
  def disconnect(): scala.Unit
  def postMessage(message: js.Object): scala.Unit
}

object Port {
  @scala.inline
  def apply(
    disconnect: () => scala.Unit,
    name: java.lang.String,
    onDisconnect: firefoxDashWebextDashBrowserLib.WebExtEvent[js.Function0[scala.Unit]],
    onMessage: firefoxDashWebextDashBrowserLib.WebExtEvent[js.Function0[scala.Unit]],
    postMessage: js.Object => scala.Unit,
    sender: MessageSender = null
  ): Port = {
    val __obj = js.Dynamic.literal(disconnect = js.Any.fromFunction0(disconnect), name = name, onDisconnect = onDisconnect, onMessage = onMessage, postMessage = js.Any.fromFunction1(postMessage))
    if (sender != null) __obj.updateDynamic("sender")(sender)
    __obj.asInstanceOf[Port]
  }
}

