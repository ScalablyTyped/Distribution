package typings.ethereumProtocol.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Provider extends js.Object {
  def sendAsync(payload: JSONRPCRequestPayload, callback: JSONRPCErrorCallback): scala.Unit
}

object Provider {
  @scala.inline
  def apply(sendAsync: (JSONRPCRequestPayload, JSONRPCErrorCallback) => scala.Unit): Provider = {
    val __obj = js.Dynamic.literal(sendAsync = js.Any.fromFunction2(sendAsync))
  
    __obj.asInstanceOf[Provider]
  }
}

