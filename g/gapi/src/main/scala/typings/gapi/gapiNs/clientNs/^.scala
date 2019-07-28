package typings.gapi.gapiNs.clientNs

import typings.gapi.Anon_ApiKey
import typings.gapi.GoogleApiOAuth2TokenObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client")
@js.native
object ^ extends js.Object {
  def getToken(): GoogleApiOAuth2TokenObject = js.native
  def init(args: Anon_ApiKey): js.Promise[Unit] = js.native
  def load(name: String, version: String): js.Promise[Unit] = js.native
  def load(name: String, version: String, callback: js.Function0[_]): Unit = js.native
  def load(name: String, version: String, callback: js.Function0[_], url: String): Unit = js.native
  def request(args: RequestOptions): HttpRequest[_] = js.native
  def rpcRequest(method: String): RpcRequest = js.native
  def rpcRequest(method: String, version: String): RpcRequest = js.native
  def rpcRequest(method: String, version: String, rpcParams: js.Any): RpcRequest = js.native
  def setApiKey(apiKey: String): Unit = js.native
  def setToken(): Unit = js.native
  def setToken(token: TokenObject): Unit = js.native
}

