package typings.freedom.freedom.UdpSocket

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Type for the chrome.socket.recvFrom callback:
//   http://developer.chrome.com/apps/socket#method-recvFrom
// This is also the type returned to onData callbacks.
@js.native
trait RecvFromInfo extends js.Object {
  var address: String = js.native
  var data: ArrayBuffer = js.native
  var port: Double = js.native
  var resultCode: Double = js.native
}

object RecvFromInfo {
  @scala.inline
  def apply(address: String, data: ArrayBuffer, port: Double, resultCode: Double): RecvFromInfo = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], resultCode = resultCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecvFromInfo]
  }
  @scala.inline
  implicit class RecvFromInfoOps[Self <: RecvFromInfo] (val x: Self) extends AnyVal {
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
    def setAddress(value: String): Self = this.set("address", value.asInstanceOf[js.Any])
    @scala.inline
    def setData(value: ArrayBuffer): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    @scala.inline
    def setResultCode(value: Double): Self = this.set("resultCode", value.asInstanceOf[js.Any])
  }
  
}

