package typings
package gapiLib.gapiNs.clientNs

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
  def callback(callback: js.Function2[/* jsonResp */ js.Any, /* rawResp */ java.lang.String, scala.Unit]): scala.Unit = js.native
}

