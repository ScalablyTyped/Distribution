package typings
package firefoxDashWebextDashBrowserLib.browserNs.runtimeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* runtime types */
/** An object which allows two way communication with other pages. */

trait Port extends js.Object {
  var name: java.lang.String
  var onDisconnect: firefoxDashWebextDashBrowserLib.browserNs.eventsNs.Event
  var onMessage: firefoxDashWebextDashBrowserLib.browserNs.eventsNs.Event
  /** This property will **only** be present on ports passed to onConnect/onConnectExternal listeners. */
  var sender: js.UndefOr[MessageSender] = js.undefined
  def disconnect(): scala.Unit
  def postMessage(message: js.Object): scala.Unit
}

