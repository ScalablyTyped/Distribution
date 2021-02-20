package typings.followRedirects

import org.scalablytyped.runtime.Instantiable0
import typings.followRedirects.mod.FollowOptions
import typings.followRedirects.mod.FollowResponse
import typings.followRedirects.mod.RedirectableRequest
import typings.node.httpMod.ClientRequest
import typings.node.httpMod.IncomingMessage
import typings.node.httpsMod.RequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined follow-redirects.follow-redirects.Override<{readonly request (options : node.https.RequestOptions): node.http.ClientRequest, readonly request (options : string): node.http.ClientRequest, readonly request (options : node.url.URL): node.http.ClientRequest, readonly request (options : node.https.RequestOptions, callback : (res : node.http.IncomingMessage): void): node.http.ClientRequest, readonly request (options : string, callback : (res : node.http.IncomingMessage): void): node.http.ClientRequest, readonly request (options : node.url.URL, callback : (res : node.http.IncomingMessage): void): node.http.ClientRequest, readonly request (url : string, options : node.https.RequestOptions): node.http.ClientRequest, readonly request (url : node.url.URL, options : node.https.RequestOptions): node.http.ClientRequest, readonly request (url : string, options : node.https.RequestOptions, callback : (res : node.http.IncomingMessage): void): node.http.ClientRequest, readonly request (url : node.url.URL, options : node.https.RequestOptions, callback : (res : node.http.IncomingMessage): void): node.http.ClientRequest, readonly get (options : node.https.RequestOptions): node.http.ClientRequest, readonly get (options : string): node.http.ClientRequest, readonly get (options : node.url.URL): node.http.ClientRequest, readonly get (options : node.https.RequestOptions, callback : (res : node.http.IncomingMessage): void): node.http.ClientRequest, readonly get (options : string, callback : (res : node.http.IncomingMessage): void): node.http.ClientRequest, readonly get (options : node.url.URL, callback : (res : node.http.IncomingMessage): void): node.http.ClientRequest, readonly get (url : string, options : node.https.RequestOptions): node.http.ClientRequest, readonly get (url : node.url.URL, options : node.https.RequestOptions): node.http.ClientRequest, readonly get (url : string, options : node.https.RequestOptions, callback : (res : node.http.IncomingMessage): void): node.http.ClientRequest, readonly get (url : node.url.URL, options : node.https.RequestOptions, callback : (res : node.http.IncomingMessage): void): node.http.ClientRequest, readonly createServer (): node.https.Server, readonly createServer (requestListener : node.http.RequestListener): node.https.Server, readonly createServer (options : node.https.ServerOptions): node.https.Server, readonly createServer (options : node.https.ServerOptions, requestListener : node.http.RequestListener): node.https.Server,   Agent :new (): node.https.Agent,   Server :new (): node.https.Server,   globalAgent :node.https.Agent}, follow-redirects.follow-redirects.RedirectScheme<node.https.RequestOptions, node.http.ClientRequest, node.http.IncomingMessage>> */
object httpsMod {
  
  @JSImport("follow-redirects/https", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("follow-redirects/https", "Agent")
  @js.native
  class Agent ()
    extends typings.node.httpsMod.Agent
  @JSImport("follow-redirects/https", "Agent")
  @js.native
  def Agent: Instantiable0[typings.node.httpsMod.Agent] = js.native
  @scala.inline
  def Agent_=(x: Instantiable0[typings.node.httpsMod.Agent]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Agent")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("follow-redirects/https", "Server")
  @js.native
  class Server ()
    extends typings.node.httpsMod.Server
  @JSImport("follow-redirects/https", "Server")
  @js.native
  def Server: Instantiable0[typings.node.httpsMod.Server] = js.native
  @scala.inline
  def Server_=(x: Instantiable0[typings.node.httpsMod.Server]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Server")(x.asInstanceOf[js.Any])
  
  @JSImport("follow-redirects/https", "createServer")
  @js.native
  def createServer(): typings.node.httpsMod.Server = js.native
  @JSImport("follow-redirects/https", "createServer")
  @js.native
  def createServer_FhttpsMod: js.Function0[typings.node.httpsMod.Server] = js.native
  
  @scala.inline
  def createServer_FhttpsMod_=(x: js.Function0[typings.node.httpsMod.Server]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("createServer")(x.asInstanceOf[js.Any])
  
  @JSImport("follow-redirects/https", "get")
  @js.native
  def get(options: RequestOptions with FollowOptions[RequestOptions]): RedirectableRequest[ClientRequest, IncomingMessage] = js.native
  @JSImport("follow-redirects/https", "get")
  @js.native
  def get(
    options: RequestOptions with FollowOptions[RequestOptions],
    callback: js.Function1[/* res */ IncomingMessage with FollowResponse, Unit]
  ): RedirectableRequest[ClientRequest, IncomingMessage] = js.native
  @JSImport("follow-redirects/https", "get")
  @js.native
  def get(options: String): RedirectableRequest[ClientRequest, IncomingMessage] = js.native
  @JSImport("follow-redirects/https", "get")
  @js.native
  def get(options: String, callback: js.Function1[/* res */ IncomingMessage with FollowResponse, Unit]): RedirectableRequest[ClientRequest, IncomingMessage] = js.native
  
  @JSImport("follow-redirects/https", "globalAgent")
  @js.native
  def globalAgent: typings.node.httpsMod.Agent = js.native
  @scala.inline
  def globalAgent_=(x: typings.node.httpsMod.Agent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("globalAgent")(x.asInstanceOf[js.Any])
  
  @JSImport("follow-redirects/https", "request")
  @js.native
  def request(options: RequestOptions with FollowOptions[RequestOptions]): RedirectableRequest[ClientRequest, IncomingMessage] = js.native
  @JSImport("follow-redirects/https", "request")
  @js.native
  def request(
    options: RequestOptions with FollowOptions[RequestOptions],
    callback: js.Function1[/* res */ IncomingMessage with FollowResponse, Unit]
  ): RedirectableRequest[ClientRequest, IncomingMessage] = js.native
  @JSImport("follow-redirects/https", "request")
  @js.native
  def request(options: String): RedirectableRequest[ClientRequest, IncomingMessage] = js.native
  @JSImport("follow-redirects/https", "request")
  @js.native
  def request(options: String, callback: js.Function1[/* res */ IncomingMessage with FollowResponse, Unit]): RedirectableRequest[ClientRequest, IncomingMessage] = js.native
}
