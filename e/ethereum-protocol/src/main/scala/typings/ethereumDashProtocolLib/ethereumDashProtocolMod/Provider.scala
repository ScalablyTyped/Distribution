package typings
package ethereumDashProtocolLib.ethereumDashProtocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Provider extends js.Object {
  def sendAsync(payload: JSONRPCRequestPayload, callback: JSONRPCErrorCallback): scala.Unit
}

object Provider {
  @scala.inline
  def apply(sendAsync: js.Function2[JSONRPCRequestPayload, JSONRPCErrorCallback, scala.Unit]): Provider = {
    val __obj = js.Dynamic.literal(sendAsync = sendAsync)
  
    __obj.asInstanceOf[Provider]
  }
}

