package typings.gapi.gapi.client

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client.RpcRequest")
@js.native
class RpcRequest () extends js.Object {
  /**
    * Executes the request and runs the supplied callback with the response.
    * @param callback The callback function which executes when the request succeeds or fails.
    */
  def callback(callback: js.Function2[/* jsonResp */ js.Any, /* rawResp */ String, Unit]): Unit = js.native
}

@JSGlobal("gapi.client.rpcRequest")
@js.native
object rpcRequest extends js.Object {
  def apply(method: String): RpcRequest = js.native
  def apply(method: String, version: String): RpcRequest = js.native
  def apply(method: String, version: String, rpcParams: js.Any): RpcRequest = js.native
}

