package typings
package freedomLib.freedomNs.UdpSocketNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Implementation extends js.Object {
  def bind(address: java.lang.String, port: scala.Double, continuation: js.Function0[scala.Unit]): scala.Unit
  def destroy(continuation: js.Function0[scala.Unit]): scala.Unit
  def getInfo(continuation: js.Function1[/* socketInfo */ SocketInfo, scala.Unit]): scala.Unit
  def sendTo(
    data: stdLib.ArrayBuffer,
    address: java.lang.String,
    port: scala.Double,
    continuation: js.Function1[/* bytesWritten */ scala.Double, scala.Unit]
  ): scala.Unit
}

object Implementation {
  @scala.inline
  def apply(
    bind: (java.lang.String, scala.Double, js.Function0[scala.Unit]) => scala.Unit,
    destroy: js.Function0[scala.Unit] => scala.Unit,
    getInfo: js.Function1[/* socketInfo */ SocketInfo, scala.Unit] => scala.Unit,
    sendTo: (stdLib.ArrayBuffer, java.lang.String, scala.Double, js.Function1[/* bytesWritten */ scala.Double, scala.Unit]) => scala.Unit
  ): Implementation = {
    val __obj = js.Dynamic.literal(bind = js.Any.fromFunction3(bind), destroy = js.Any.fromFunction1(destroy), getInfo = js.Any.fromFunction1(getInfo), sendTo = js.Any.fromFunction4(sendTo))
  
    __obj.asInstanceOf[Implementation]
  }
}

