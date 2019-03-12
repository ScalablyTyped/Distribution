package typings
package gapiLib.gapiNs.clientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client")
@js.native
object ^ extends js.Object {
  def init(args: gapiLib.Anon_ApiKey): js.Promise[scala.Unit] = js.native
  def load(name: java.lang.String, version: java.lang.String): js.Promise[scala.Unit] = js.native
  def load(name: java.lang.String, version: java.lang.String, callback: js.Function0[_]): scala.Unit = js.native
  def load(
    name: java.lang.String,
    version: java.lang.String,
    callback: js.Function0[_],
    url: java.lang.String
  ): scala.Unit = js.native
  def request(args: RequestOptions): HttpRequest[_] = js.native
  def rpcRequest(method: java.lang.String): RpcRequest = js.native
  def rpcRequest(method: java.lang.String, version: java.lang.String): RpcRequest = js.native
  def rpcRequest(method: java.lang.String, version: java.lang.String, rpcParams: js.Any): RpcRequest = js.native
  def setApiKey(apiKey: java.lang.String): scala.Unit = js.native
  def setToken(): scala.Unit = js.native
  def setToken(token: TokenObject): scala.Unit = js.native
}

