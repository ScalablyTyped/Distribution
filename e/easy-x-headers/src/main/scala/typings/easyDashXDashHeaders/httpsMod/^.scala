package typings.easyDashXDashHeaders.httpsMod

import typings.easyDashXDashHeaders.httpMod.ClientRequest
import typings.easyDashXDashHeaders.httpMod.IncomingMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("https", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var globalAgent: Agent = js.native
  def createServer(options: ServerOptions): Server = js.native
  def createServer(options: ServerOptions, requestListener: js.Function): Server = js.native
  def get(options: RequestOptions): ClientRequest = js.native
  def get(options: RequestOptions, callback: js.Function1[/* res */ IncomingMessage, Unit]): ClientRequest = js.native
  def request(options: RequestOptions): ClientRequest = js.native
  def request(options: RequestOptions, callback: js.Function1[/* res */ IncomingMessage, Unit]): ClientRequest = js.native
}

