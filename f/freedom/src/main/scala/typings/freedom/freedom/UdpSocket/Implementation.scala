package typings.freedom.freedom.UdpSocket

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Implementation extends js.Object {
  def bind(address: String, port: Double, continuation: js.Function0[Unit]): Unit = js.native
  def destroy(continuation: js.Function0[Unit]): Unit = js.native
  def getInfo(continuation: js.Function1[/* socketInfo */ SocketInfo, Unit]): Unit = js.native
  def sendTo(
    data: ArrayBuffer,
    address: String,
    port: Double,
    continuation: js.Function1[/* bytesWritten */ Double, Unit]
  ): Unit = js.native
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
  @scala.inline
  implicit class ImplementationOps[Self <: Implementation] (val x: Self) extends AnyVal {
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
    def setBind(value: (String, Double, js.Function0[Unit]) => Unit): Self = this.set("bind", js.Any.fromFunction3(value))
    @scala.inline
    def setDestroy(value: js.Function0[Unit] => Unit): Self = this.set("destroy", js.Any.fromFunction1(value))
    @scala.inline
    def setGetInfo(value: js.Function1[/* socketInfo */ SocketInfo, Unit] => Unit): Self = this.set("getInfo", js.Any.fromFunction1(value))
    @scala.inline
    def setSendTo(value: (ArrayBuffer, String, Double, js.Function1[/* bytesWritten */ Double, Unit]) => Unit): Self = this.set("sendTo", js.Any.fromFunction4(value))
  }
  
}

