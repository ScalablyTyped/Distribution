package typings
package ethereumDashProtocolLib.ethereumDashProtocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Provider extends js.Object {
  def sendAsync(payload: JSONRPCRequestPayload, callback: JSONRPCErrorCallback): scala.Unit
}

