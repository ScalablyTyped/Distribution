package typings.gapi.gapi.client

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RpcRequest extends js.Object {
  /**
    * Executes the request and runs the supplied callback with the response.
    * @param callback The callback function which executes when the request succeeds or fails.
    */
  def callback(callback: js.Function2[/* jsonResp */ js.Any, /* rawResp */ String, Unit]): Unit
}

object RpcRequest {
  @scala.inline
  def apply(callback: js.Function2[/* jsonResp */ js.Any, /* rawResp */ String, Unit] => Unit): RpcRequest = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction1(callback))
    __obj.asInstanceOf[RpcRequest]
  }
}

