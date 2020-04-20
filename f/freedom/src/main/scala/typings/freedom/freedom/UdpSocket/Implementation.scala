package typings.freedom.freedom.UdpSocket

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Implementation extends js.Object {
  def bind(address: String, port: Double, continuation: js.Function0[Unit]): Unit
  def destroy(continuation: js.Function0[Unit]): Unit
  def getInfo(continuation: js.Function1[/* socketInfo */ SocketInfo, Unit]): Unit
  def sendTo(
    data: ArrayBuffer,
    address: String,
    port: Double,
    continuation: js.Function1[/* bytesWritten */ Double, Unit]
  ): Unit
}

object Implementation {
  @scala.inline
  def apply(
    bind: (String, Double, js.Function0[Unit]) => Unit,
    destroy: js.Function0[Unit] => Unit,
    getInfo: js.Function1[/* socketInfo */ SocketInfo, Unit] => Unit,
    sendTo: (ArrayBuffer, String, Double, js.Function1[/* bytesWritten */ Double, Unit]) => Unit
  ): Implementation = {
    val __obj = js.Dynamic.literal(bind = js.Any.fromFunction3(bind), destroy = js.Any.fromFunction1(destroy), getInfo = js.Any.fromFunction1(getInfo), sendTo = js.Any.fromFunction4(sendTo))
    __obj.asInstanceOf[Implementation]
  }
}

