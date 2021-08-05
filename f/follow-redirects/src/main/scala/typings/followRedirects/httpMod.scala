package typings.followRedirects

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.followRedirects.mod.FollowOptions
import typings.followRedirects.mod.FollowResponse
import typings.followRedirects.mod.RedirectableRequest
import typings.node.httpMod.RequestOptions
import typings.node.netMod.Socket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined follow-redirects.follow-redirects.Override<{readonly request (options : node.http.RequestOptions): node.http.ClientRequest, readonly request (options : string): node.http.ClientRequest, readonly request (options : node.url.URL): node.http.ClientRequest, readonly request (options : node.http.RequestOptions, callback : (res : node.http.IncomingMessage): void): node.http.ClientRequest, readonly request (options : string, callback : (res : node.http.IncomingMessage): void): node.http.ClientRequest, readonly request (options : node.url.URL, callback : (res : node.http.IncomingMessage): void): node.http.ClientRequest, readonly request (url : string, options : node.http.RequestOptions): node.http.ClientRequest, readonly request (url : node.url.URL, options : node.http.RequestOptions): node.http.ClientRequest, readonly request (url : string, options : node.http.RequestOptions, callback : (res : node.http.IncomingMessage): void): node.http.ClientRequest, readonly request (url : node.url.URL, options : node.http.RequestOptions, callback : (res : node.http.IncomingMessage): void): node.http.ClientRequest,   IncomingMessage :new (socket : node.net.Socket): node.http.IncomingMessage,   ServerResponse :new (req : node.http.IncomingMessage): node.http.ServerResponse, readonly get (options : node.http.RequestOptions): node.http.ClientRequest, readonly get (options : string): node.http.ClientRequest, readonly get (options : node.url.URL): node.http.ClientRequest, readonly get (options : node.http.RequestOptions, callback : (res : node.http.IncomingMessage): void): node.http.ClientRequest, readonly get (options : string, callback : (res : node.http.IncomingMessage): void): node.http.ClientRequest, readonly get (options : node.url.URL, callback : (res : node.http.IncomingMessage): void): node.http.ClientRequest, readonly get (url : string, options : node.http.RequestOptions): node.http.ClientRequest, readonly get (url : node.url.URL, options : node.http.RequestOptions): node.http.ClientRequest, readonly get (url : string, options : node.http.RequestOptions, callback : (res : node.http.IncomingMessage): void): node.http.ClientRequest, readonly get (url : node.url.URL, options : node.http.RequestOptions, callback : (res : node.http.IncomingMessage): void): node.http.ClientRequest, readonly createServer (): node.http.Server, readonly createServer (requestListener : node.http.RequestListener): node.http.Server, readonly createServer (options : node.http.ServerOptions): node.http.Server, readonly createServer (options : node.http.ServerOptions, requestListener : node.http.RequestListener): node.http.Server,  readonly STATUS_CODES,   Agent :new (): node.http.Agent,  readonly maxHeaderSize :number,   ClientRequest :new (url : string): node.http.ClientRequest,   OutgoingMessage :new (): node.http.OutgoingMessage,   Server :new (): node.http.Server,   globalAgent :node.http.Agent,  readonly METHODS :std.Array<string>}, follow-redirects.follow-redirects.RedirectScheme<node.http.RequestOptions, node.http.ClientRequest, node.http.IncomingMessage>> */
object httpMod {
  
  @JSImport("follow-redirects/http", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("follow-redirects/http", "Agent")
  @js.native
  class Agent ()
    extends typings.node.httpMod.Agent
  @JSImport("follow-redirects/http", "Agent")
  @js.native
  def Agent: Instantiable0[typings.node.httpMod.Agent] = js.native
  inline def Agent_=(x: Instantiable0[typings.node.httpMod.Agent]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Agent")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("follow-redirects/http", "ClientRequest")
  @js.native
  class ClientRequest protected ()
    extends typings.node.httpMod.ClientRequest {
    def this(url: String) = this()
  }
  @JSImport("follow-redirects/http", "ClientRequest")
  @js.native
  def ClientRequest: Instantiable1[/* url */ String, typings.node.httpMod.ClientRequest] = js.native
  inline def ClientRequest_=(x: Instantiable1[/* url */ String, typings.node.httpMod.ClientRequest]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ClientRequest")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("follow-redirects/http", "IncomingMessage")
  @js.native
  class IncomingMessage protected ()
    extends typings.node.httpMod.IncomingMessage {
    def this(socket: Socket) = this()
  }
  @JSImport("follow-redirects/http", "IncomingMessage")
  @js.native
  def IncomingMessage: Instantiable1[/* socket */ Socket, typings.node.httpMod.IncomingMessage] = js.native
  inline def IncomingMessage_=(x: Instantiable1[/* socket */ Socket, typings.node.httpMod.IncomingMessage]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IncomingMessage")(x.asInstanceOf[js.Any])
  
  @JSImport("follow-redirects/http", "METHODS")
  @js.native
  def METHODS: js.Array[String] = js.native
  inline def METHODS_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("METHODS")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("follow-redirects/http", "OutgoingMessage")
  @js.native
  class OutgoingMessage ()
    extends typings.node.httpMod.OutgoingMessage
  @JSImport("follow-redirects/http", "OutgoingMessage")
  @js.native
  def OutgoingMessage: Instantiable0[typings.node.httpMod.OutgoingMessage] = js.native
  inline def OutgoingMessage_=(x: Instantiable0[typings.node.httpMod.OutgoingMessage]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OutgoingMessage")(x.asInstanceOf[js.Any])
  
  @JSImport("follow-redirects/http", "STATUS_CODES")
  @js.native
  def STATUS_CODES: js.Any = js.native
  inline def STATUS_CODES_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("STATUS_CODES")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("follow-redirects/http", "Server")
  @js.native
  class Server ()
    extends typings.node.httpMod.Server
  @JSImport("follow-redirects/http", "Server")
  @js.native
  def Server: Instantiable0[typings.node.httpMod.Server] = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("follow-redirects/http", "ServerResponse")
  @js.native
  class ServerResponse protected ()
    extends typings.node.httpMod.ServerResponse {
    def this(req: typings.node.httpMod.IncomingMessage) = this()
  }
  @JSImport("follow-redirects/http", "ServerResponse")
  @js.native
  def ServerResponse: Instantiable1[
    /* req */ typings.node.httpMod.IncomingMessage, 
    typings.node.httpMod.ServerResponse
  ] = js.native
  inline def ServerResponse_=(
    x: Instantiable1[
      /* req */ typings.node.httpMod.IncomingMessage, 
      typings.node.httpMod.ServerResponse
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ServerResponse")(x.asInstanceOf[js.Any])
  
  inline def Server_=(x: Instantiable0[typings.node.httpMod.Server]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Server")(x.asInstanceOf[js.Any])
  
  inline def createServer(): typings.node.httpMod.Server = ^.asInstanceOf[js.Dynamic].applyDynamic("createServer")().asInstanceOf[typings.node.httpMod.Server]
  @JSImport("follow-redirects/http", "createServer")
  @js.native
  def createServer_FhttpMod: js.Function0[typings.node.httpMod.Server] = js.native
  
  inline def createServer_FhttpMod_=(x: js.Function0[typings.node.httpMod.Server]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("createServer")(x.asInstanceOf[js.Any])
  
  inline def get(options: RequestOptions & FollowOptions[RequestOptions]): RedirectableRequest[typings.node.httpMod.ClientRequest, typings.node.httpMod.IncomingMessage] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(options.asInstanceOf[js.Any]).asInstanceOf[RedirectableRequest[typings.node.httpMod.ClientRequest, typings.node.httpMod.IncomingMessage]]
  inline def get(
    options: RequestOptions & FollowOptions[RequestOptions],
    callback: js.Function1[/* res */ typings.node.httpMod.IncomingMessage & FollowResponse, Unit]
  ): RedirectableRequest[typings.node.httpMod.ClientRequest, typings.node.httpMod.IncomingMessage] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[RedirectableRequest[typings.node.httpMod.ClientRequest, typings.node.httpMod.IncomingMessage]]
  inline def get(options: String): RedirectableRequest[typings.node.httpMod.ClientRequest, typings.node.httpMod.IncomingMessage] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(options.asInstanceOf[js.Any]).asInstanceOf[RedirectableRequest[typings.node.httpMod.ClientRequest, typings.node.httpMod.IncomingMessage]]
  inline def get(
    options: String,
    callback: js.Function1[/* res */ typings.node.httpMod.IncomingMessage & FollowResponse, Unit]
  ): RedirectableRequest[typings.node.httpMod.ClientRequest, typings.node.httpMod.IncomingMessage] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[RedirectableRequest[typings.node.httpMod.ClientRequest, typings.node.httpMod.IncomingMessage]]
  
  @JSImport("follow-redirects/http", "globalAgent")
  @js.native
  def globalAgent: typings.node.httpMod.Agent = js.native
  inline def globalAgent_=(x: typings.node.httpMod.Agent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("globalAgent")(x.asInstanceOf[js.Any])
  
  @JSImport("follow-redirects/http", "maxHeaderSize")
  @js.native
  def maxHeaderSize: Double = js.native
  inline def maxHeaderSize_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("maxHeaderSize")(x.asInstanceOf[js.Any])
  
  inline def request(options: RequestOptions & FollowOptions[RequestOptions]): RedirectableRequest[typings.node.httpMod.ClientRequest, typings.node.httpMod.IncomingMessage] = ^.asInstanceOf[js.Dynamic].applyDynamic("request")(options.asInstanceOf[js.Any]).asInstanceOf[RedirectableRequest[typings.node.httpMod.ClientRequest, typings.node.httpMod.IncomingMessage]]
  inline def request(
    options: RequestOptions & FollowOptions[RequestOptions],
    callback: js.Function1[/* res */ typings.node.httpMod.IncomingMessage & FollowResponse, Unit]
  ): RedirectableRequest[typings.node.httpMod.ClientRequest, typings.node.httpMod.IncomingMessage] = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[RedirectableRequest[typings.node.httpMod.ClientRequest, typings.node.httpMod.IncomingMessage]]
  inline def request(options: String): RedirectableRequest[typings.node.httpMod.ClientRequest, typings.node.httpMod.IncomingMessage] = ^.asInstanceOf[js.Dynamic].applyDynamic("request")(options.asInstanceOf[js.Any]).asInstanceOf[RedirectableRequest[typings.node.httpMod.ClientRequest, typings.node.httpMod.IncomingMessage]]
  inline def request(
    options: String,
    callback: js.Function1[/* res */ typings.node.httpMod.IncomingMessage & FollowResponse, Unit]
  ): RedirectableRequest[typings.node.httpMod.ClientRequest, typings.node.httpMod.IncomingMessage] = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[RedirectableRequest[typings.node.httpMod.ClientRequest, typings.node.httpMod.IncomingMessage]]
}
