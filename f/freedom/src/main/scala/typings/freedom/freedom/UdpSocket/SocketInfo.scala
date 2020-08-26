package typings.freedom.freedom.UdpSocket

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Type for the chrome.socket.getInfo callback:
//   https://developer.chrome.com/apps/sockets_udp#type-SocketInfo
// This is also the type returned by getInfo().
@js.native
trait SocketInfo extends js.Object {
  // Note that there are other fields but these are the ones we care about.
  var localAddress: String = js.native
  var localPort: Double = js.native
}

object SocketInfo {
  @scala.inline
  def apply(localAddress: String, localPort: Double): SocketInfo = {
    val __obj = js.Dynamic.literal(localAddress = localAddress.asInstanceOf[js.Any], localPort = localPort.asInstanceOf[js.Any])
    __obj.asInstanceOf[SocketInfo]
  }
  @scala.inline
  implicit class SocketInfoOps[Self <: SocketInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setLocalAddress(value: String): Self = this.set("localAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocalPort(value: Double): Self = this.set("localPort", value.asInstanceOf[js.Any])
  }
  
}

