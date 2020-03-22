package typings.followRedirects

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.TopLevel
import typings.followRedirects.mod.FollowOptions
import typings.followRedirects.mod.FollowResponse
import typings.followRedirects.mod.RedirectableRequest
import typings.node.httpMod.ClientRequest
import typings.node.httpMod.IncomingMessage
import typings.node.httpsMod.RequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("follow-redirects/https", JSImport.Namespace)
@js.native
object httpsMod extends js.Object {
  @js.native
  class Agent ()
    extends typings.node.httpsMod.Agent
  
  @js.native
  class Server ()
    extends typings.node.httpsMod.Server
  
  @JSName("createServer")
  var createServer_Original: js.Function0[typings.node.httpsMod.Server] = js.native
  var globalAgent: typings.node.httpsMod.Agent = js.native
  def createServer(): typings.node.httpsMod.Server = js.native
  def get(options: RequestOptions with FollowOptions[RequestOptions]): RedirectableRequest[ClientRequest, IncomingMessage] = js.native
  def get(
    options: RequestOptions with FollowOptions[RequestOptions],
    callback: js.Function1[/* res */ IncomingMessage with FollowResponse, Unit]
  ): RedirectableRequest[ClientRequest, IncomingMessage] = js.native
  def get(options: String): RedirectableRequest[ClientRequest, IncomingMessage] = js.native
  def get(options: String, callback: js.Function1[/* res */ IncomingMessage with FollowResponse, Unit]): RedirectableRequest[ClientRequest, IncomingMessage] = js.native
  def request(options: RequestOptions with FollowOptions[RequestOptions]): RedirectableRequest[ClientRequest, IncomingMessage] = js.native
  def request(
    options: RequestOptions with FollowOptions[RequestOptions],
    callback: js.Function1[/* res */ IncomingMessage with FollowResponse, Unit]
  ): RedirectableRequest[ClientRequest, IncomingMessage] = js.native
  def request(options: String): RedirectableRequest[ClientRequest, IncomingMessage] = js.native
  def request(options: String, callback: js.Function1[/* res */ IncomingMessage with FollowResponse, Unit]): RedirectableRequest[ClientRequest, IncomingMessage] = js.native
  @js.native
  object Agent
    extends TopLevel[Instantiable0[typings.node.httpsMod.Agent]]
  
  @js.native
  object Server
    extends TopLevel[Instantiable0[typings.node.httpsMod.Server]]
  
}

