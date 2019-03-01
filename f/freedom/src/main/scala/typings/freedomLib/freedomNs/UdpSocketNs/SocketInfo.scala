package typings
package freedomLib.freedomNs.UdpSocketNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Type for the chrome.socket.getInfo callback:
//   https://developer.chrome.com/apps/sockets_udp#type-SocketInfo
// This is also the type returned by getInfo().
trait SocketInfo extends js.Object {
  // Note that there are other fields but these are the ones we care about.
  var localAddress: java.lang.String
  var localPort: scala.Double
}

object SocketInfo {
  @scala.inline
  def apply(localAddress: java.lang.String, localPort: scala.Double): SocketInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("localAddress")(localAddress)
    __obj.updateDynamic("localPort")(localPort)
    __obj.asInstanceOf[SocketInfo]
  }
}

