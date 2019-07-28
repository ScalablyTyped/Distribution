package typings.freedom.freedomNs.TcpSocketNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SocketInfo extends js.Object {
  var connected: Boolean
  var localAddress: js.UndefOr[String] = js.undefined
  var localPort: js.UndefOr[Double] = js.undefined
  var peerAddress: js.UndefOr[String] = js.undefined
  var peerPort: js.UndefOr[Double] = js.undefined
}

object SocketInfo {
  @scala.inline
  def apply(
    connected: Boolean,
    localAddress: String = null,
    localPort: Int | Double = null,
    peerAddress: String = null,
    peerPort: Int | Double = null
  ): SocketInfo = {
    val __obj = js.Dynamic.literal(connected = connected)
    if (localAddress != null) __obj.updateDynamic("localAddress")(localAddress)
    if (localPort != null) __obj.updateDynamic("localPort")(localPort.asInstanceOf[js.Any])
    if (peerAddress != null) __obj.updateDynamic("peerAddress")(peerAddress)
    if (peerPort != null) __obj.updateDynamic("peerPort")(peerPort.asInstanceOf[js.Any])
    __obj.asInstanceOf[SocketInfo]
  }
}

