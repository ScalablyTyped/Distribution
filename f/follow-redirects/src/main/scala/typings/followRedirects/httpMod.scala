package typings.followRedirects

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.followRedirects.mod.FollowOptions
import typings.followRedirects.mod.FollowResponse
import typings.followRedirects.mod.RedirectableRequest
import typings.node.httpMod.RequestOptions
import typings.node.nodeColonnetMod.Socket
import typings.node.urlMod.URL_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined follow-redirects.follow-redirects.Override<{readonly request (options : node.http.RequestOptions): node.http.ClientRequest, readonly request (options : string): node.http.ClientRequest, readonly request (options : node.node:url.URL): node.http.ClientRequest, readonly request (options : node.http.RequestOptions, callback : (res : node.http.IncomingMessage): void): node.http.ClientRequest, readonly request (options : string, callback : (res : node.http.IncomingMessage): void): node.http.ClientRequest, readonly request (options : node.node:url.URL, callback : (res : node.http.IncomingMessage): void): node.http.ClientRequest, readonly request (url : string, options : node.http.RequestOptions): node.http.ClientRequest, readonly request (url : node.node:url.URL, options : node.http.RequestOptions): node.http.ClientRequest, readonly request (url : string, options : node.http.RequestOptions, callback : (res : node.http.IncomingMessage): void): node.http.ClientRequest, readonly request (url : node.node:url.URL, options : node.http.RequestOptions, callback : (res : node.http.IncomingMessage): void): node.http.ClientRequest, readonly validateHeaderValue (name : string, value : string): void,   IncomingMessage :new (socket : node.node:net.Socket): node.http.IncomingMessage,   ServerResponse :new <Request extends node.http.IncomingMessage = node.http.IncomingMessage>(req : / * import warning: RewrittenClass.unapply cls was tparam Request * / any): node.http.ServerResponse<Request>, readonly get (options : node.http.RequestOptions): node.http.ClientRequest, readonly get (options : string): node.http.ClientRequest, readonly get (options : node.node:url.URL): node.http.ClientRequest, readonly get (options : node.http.RequestOptions, callback : (res : node.http.IncomingMessage): void): node.http.ClientRequest, readonly get (options : string, callback : (res : node.http.IncomingMessage): void): node.http.ClientRequest, readonly get (options : node.node:url.URL, callback : (res : node.http.IncomingMessage): void): node.http.ClientRequest, readonly get (url : string, options : node.http.RequestOptions): node.http.ClientRequest, readonly get (url : node.node:url.URL, options : node.http.RequestOptions): node.http.ClientRequest, readonly get (url : string, options : node.http.RequestOptions, callback : (res : node.http.IncomingMessage): void): node.http.ClientRequest, readonly get (url : node.node:url.URL, options : node.http.RequestOptions, callback : (res : node.http.IncomingMessage): void): node.http.ClientRequest, readonly createServer <Request extends new (socket : node.node:net.Socket): node.http.IncomingMessage = new (socket : node.node:net.Socket): node.http.IncomingMessage, Response extends new <Request extends node.http.IncomingMessage = node.http.IncomingMessage>(req : / * import warning: RewrittenClass.unapply cls was tparam Request * / any): node.http.ServerResponse<Request> = new <Request extends node.http.IncomingMessage = node.http.IncomingMessage>(req : / * import warning: RewrittenClass.unapply cls was tparam Request * / any): node.http.ServerResponse<Request>>(): node.http.Server<Request, Response>, readonly createServer <Request extends new (socket : node.node:net.Socket): node.http.IncomingMessage = new (socket : node.node:net.Socket): node.http.IncomingMessage, Response extends new <Request extends node.http.IncomingMessage = node.http.IncomingMessage>(req : / * import warning: RewrittenClass.unapply cls was tparam Request * / any): node.http.ServerResponse<Request> = new <Request extends node.http.IncomingMessage = node.http.IncomingMessage>(req : / * import warning: RewrittenClass.unapply cls was tparam Request * / any): node.http.ServerResponse<Request>>(requestListener : node.http.RequestListener<Request, Response>): node.http.Server<Request, Response>, readonly createServer <Request extends new (socket : node.node:net.Socket): node.http.IncomingMessage = new (socket : node.node:net.Socket): node.http.IncomingMessage, Response extends new <Request extends node.http.IncomingMessage = node.http.IncomingMessage>(req : / * import warning: RewrittenClass.unapply cls was tparam Request * / any): node.http.ServerResponse<Request> = new <Request extends node.http.IncomingMessage = node.http.IncomingMessage>(req : / * import warning: RewrittenClass.unapply cls was tparam Request * / any): node.http.ServerResponse<Request>>(options : node.http.ServerOptions<Request, Response>): node.http.Server<Request, Response>, readonly createServer <Request extends new (socket : node.node:net.Socket): node.http.IncomingMessage = new (socket : node.node:net.Socket): node.http.IncomingMessage, Response extends new <Request extends node.http.IncomingMessage = node.http.IncomingMessage>(req : / * import warning: RewrittenClass.unapply cls was tparam Request * / any): node.http.ServerResponse<Request> = new <Request extends node.http.IncomingMessage = node.http.IncomingMessage>(req : / * import warning: RewrittenClass.unapply cls was tparam Request * / any): node.http.ServerResponse<Request>>(options : node.http.ServerOptions<Request, Response>, requestListener : node.http.RequestListener<Request, Response>): node.http.Server<Request, Response>,  readonly STATUS_CODES,   Agent :new (): node.http.Agent,  readonly maxHeaderSize :number,   ClientRequest :new (url : string): node.http.ClientRequest, readonly validateHeaderName (name : string): void,   OutgoingMessage :new <Request extends node.http.IncomingMessage = node.http.IncomingMessage>(): node.http.OutgoingMessage<Request>,   Server :new <Request extends new (socket : node.node:net.Socket): node.http.IncomingMessage = new (socket : node.node:net.Socket): node.http.IncomingMessage, Response extends new <Request extends node.http.IncomingMessage = node.http.IncomingMessage>(req : / * import warning: RewrittenClass.unapply cls was tparam Request * / any): node.http.ServerResponse<Request> = new <Request extends node.http.IncomingMessage = node.http.IncomingMessage>(req : / * import warning: RewrittenClass.unapply cls was tparam Request * / any): node.http.ServerResponse<Request>>(): node.http.Server<Request, Response>, readonly setMaxIdleHTTPParsers (max : number): void,   globalAgent :node.http.Agent,  readonly METHODS :std.Array<string>}, follow-redirects.follow-redirects.RedirectScheme<node.http.RequestOptions, node.http.ClientRequest, node.http.IncomingMessage>> */
object httpMod {
  
  @JSImport("follow-redirects/http", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("follow-redirects/http", "Agent")
  @js.native
  open class Agent ()
    extends typings.node.httpMod.Agent
  @JSImport("follow-redirects/http", "Agent")
  @js.native
  def Agent: Instantiable0[typings.node.httpMod.Agent] = js.native
  inline def Agent_=(x: Instantiable0[typings.node.httpMod.Agent]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Agent")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("follow-redirects/http", "ClientRequest")
  @js.native
  open class ClientRequest protected ()
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
  open class IncomingMessage protected ()
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
  open class OutgoingMessage[Request /* <: typings.node.httpMod.IncomingMessage */] ()
    extends typings.node.httpMod.OutgoingMessage[Request]
  @JSImport("follow-redirects/http", "OutgoingMessage")
  @js.native
  def OutgoingMessage: Instantiable0[typings.node.httpMod.OutgoingMessage[typings.node.httpMod.IncomingMessage]] = js.native
  inline def OutgoingMessage_=(x: Instantiable0[typings.node.httpMod.OutgoingMessage[typings.node.httpMod.IncomingMessage]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OutgoingMessage")(x.asInstanceOf[js.Any])
  
  @JSImport("follow-redirects/http", "STATUS_CODES")
  @js.native
  def STATUS_CODES: Any = js.native
  inline def STATUS_CODES_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("STATUS_CODES")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("follow-redirects/http", "Server")
  @js.native
  open class Server[Request /* <: Instantiable1[/* socket */ Socket, typings.node.httpMod.IncomingMessage] */, Response /* <: Instantiable1[
    /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
    typings.node.httpMod.ServerResponse[typings.node.httpMod.IncomingMessage]
  ] */] ()
    extends typings.node.httpMod.Server[Request, Response]
  @JSImport("follow-redirects/http", "Server")
  @js.native
  def Server: Instantiable0[
    typings.node.httpMod.Server[
      Instantiable1[/* socket */ Socket, typings.node.httpMod.IncomingMessage], 
      Instantiable1[
        /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
        typings.node.httpMod.ServerResponse[typings.node.httpMod.IncomingMessage]
      ]
    ]
  ] = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("follow-redirects/http", "ServerResponse")
  @js.native
  open class ServerResponse[Request /* <: typings.node.httpMod.IncomingMessage */] protected ()
    extends typings.node.httpMod.ServerResponse[Request] {
    def this(req: /* import warning: RewrittenClass.unapply cls was tparam Request */ Any) = this()
  }
  @JSImport("follow-redirects/http", "ServerResponse")
  @js.native
  def ServerResponse: Instantiable1[
    /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
    typings.node.httpMod.ServerResponse[typings.node.httpMod.IncomingMessage]
  ] = js.native
  inline def ServerResponse_=(
    x: Instantiable1[
      /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
      typings.node.httpMod.ServerResponse[typings.node.httpMod.IncomingMessage]
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ServerResponse")(x.asInstanceOf[js.Any])
  
  inline def Server_=(
    x: Instantiable0[
      typings.node.httpMod.Server[
        Instantiable1[/* socket */ Socket, typings.node.httpMod.IncomingMessage], 
        Instantiable1[
          /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
          typings.node.httpMod.ServerResponse[typings.node.httpMod.IncomingMessage]
        ]
      ]
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Server")(x.asInstanceOf[js.Any])
  
  inline def createServer[Request /* <: Instantiable1[/* socket */ Socket, typings.node.httpMod.IncomingMessage] */, Response /* <: Instantiable1[
    /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
    typings.node.httpMod.ServerResponse[typings.node.httpMod.IncomingMessage]
  ] */](): typings.node.httpMod.Server[Request, Response] = ^.asInstanceOf[js.Dynamic].applyDynamic("createServer")().asInstanceOf[typings.node.httpMod.Server[Request, Response]]
  @JSImport("follow-redirects/http", "createServer")
  @js.native
  def createServer_FhttpMod: js.Function0[
    typings.node.httpMod.Server[
      Instantiable1[/* socket */ Socket, typings.node.httpMod.IncomingMessage], 
      Instantiable1[
        /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
        typings.node.httpMod.ServerResponse[typings.node.httpMod.IncomingMessage]
      ]
    ]
  ] = js.native
  
  inline def createServer_FhttpMod_=(
    x: js.Function0[
      typings.node.httpMod.Server[
        Instantiable1[/* socket */ Socket, typings.node.httpMod.IncomingMessage], 
        Instantiable1[
          /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
          typings.node.httpMod.ServerResponse[typings.node.httpMod.IncomingMessage]
        ]
      ]
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("createServer")(x.asInstanceOf[js.Any])
  
  inline def get(url: RequestOptions & FollowOptions[RequestOptions]): RedirectableRequest[typings.node.httpMod.ClientRequest, typings.node.httpMod.IncomingMessage] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(url.asInstanceOf[js.Any]).asInstanceOf[RedirectableRequest[typings.node.httpMod.ClientRequest, typings.node.httpMod.IncomingMessage]]
  inline def get(
    url: RequestOptions & FollowOptions[RequestOptions],
    options: RequestOptions & FollowOptions[RequestOptions]
  ): RedirectableRequest[typings.node.httpMod.ClientRequest, typings.node.httpMod.IncomingMessage] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RedirectableRequest[typings.node.httpMod.ClientRequest, typings.node.httpMod.IncomingMessage]]
  inline def get(
    url: RequestOptions & FollowOptions[RequestOptions],
    options: RequestOptions & FollowOptions[RequestOptions],
    callback: js.Function1[/* res */ typings.node.httpMod.IncomingMessage & FollowResponse, Unit]
  ): RedirectableRequest[typings.node.httpMod.ClientRequest, typings.node.httpMod.IncomingMessage] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[RedirectableRequest[typings.node.httpMod.ClientRequest, typings.node.httpMod.IncomingMessage]]
  inline def get(
    url: RequestOptions & FollowOptions[RequestOptions],
    options: js.Function1[/* res */ typings.node.httpMod.IncomingMessage & FollowResponse, Unit]
  ): RedirectableRequest[typings.node.httpMod.ClientRequest, typings.node.httpMod.IncomingMessage] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RedirectableRequest[typings.node.httpMod.ClientRequest, typings.node.httpMod.IncomingMessage]]
  inline def get(
    url: RequestOptions & FollowOptions[RequestOptions],
    options: js.Function1[/* res */ typings.node.httpMod.IncomingMessage & FollowResponse, Unit],
    callback: js.Function1[/* res */ typings.node.httpMod.IncomingMessage & FollowResponse, Unit]
  ): RedirectableRequest[typings.node.httpMod.ClientRequest, typings.node.httpMod.IncomingMessage] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[RedirectableRequest[typings.node.httpMod.ClientRequest, typings.node.httpMod.IncomingMessage]]
  inline def get(
    url: RequestOptions & FollowOptions[RequestOptions],
    options: Unit,
    callback: js.Function1[/* res */ typings.node.httpMod.IncomingMessage & FollowResponse, Unit]
  ): RedirectableRequest[typings.node.httpMod.ClientRequest, typings.node.httpMod.IncomingMessage] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[RedirectableRequest[typings.node.httpMod.ClientRequest, typings.node.httpMod.IncomingMessage]]
  /**
    * This function has two overloads:
    * ```typescript
    * get(options: string | URL | Options, callback)
    * get(url: string | URL, options: Options, callback)
    * ```
    */
  inline def get(url: String): RedirectableRequest[typings.node.httpMod.ClientRequest, typings.node.httpMod.IncomingMessage] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(url.asInstanceOf[js.Any]).asInstanceOf[RedirectableRequest[typings.node.httpMod.ClientRequest, typings.node.httpMod.IncomingMessage]]
  inline def get(url: String, options: RequestOptions & FollowOptions[RequestOptions]): RedirectableRequest[typings.node.httpMod.ClientRequest, typings.node.httpMod.IncomingMessage] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RedirectableRequest[typings.node.httpMod.ClientRequest, typings.node.httpMod.IncomingMessage]]
  inline def get(
    url: String,
    options: RequestOptions & FollowOptions[RequestOptions],
    callback: js.Function1[/* res */ typings.node.httpMod.IncomingMessage & FollowResponse, Unit]
  ): RedirectableRequest[typings.node.httpMod.ClientRequest, typings.node.httpMod.IncomingMessage] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[RedirectableRequest[typings.node.httpMod.ClientRequest, typings.node.httpMod.IncomingMessage]]
  inline def get(
    url: String,
    options: js.Function1[/* res */ typings.node.httpMod.IncomingMessage & FollowResponse, Unit]
  ): RedirectableRequest[typings.node.httpMod.ClientRequest, typings.node.httpMod.IncomingMessage] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RedirectableRequest[typings.node.httpMod.ClientRequest, typings.node.httpMod.IncomingMessage]]
  inline def get(
    url: String,
    options: js.Function1[/* res */ typings.node.httpMod.IncomingMessage & FollowResponse, Unit],
    callback: js.Function1[/* res */ typings.node.httpMod.IncomingMessage & FollowResponse, Unit]
  ): RedirectableRequest[typings.node.httpMod.ClientRequest, typings.node.httpMod.IncomingMessage] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[RedirectableRequest[typings.node.httpMod.ClientRequest, typings.node.httpMod.IncomingMessage]]
  inline def get(
    url: String,
    options: Unit,
    callback: js.Function1[/* res */ typings.node.httpMod.IncomingMessage & FollowResponse, Unit]
  ): RedirectableRequest[typings.node.httpMod.ClientRequest, typings.node.httpMod.IncomingMessage] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[RedirectableRequest[typings.node.httpMod.ClientRequest, typings.node.httpMod.IncomingMessage]]
  inline def get(url: URL_): RedirectableRequest[typings.node.httpMod.ClientRequest, typings.node.httpMod.IncomingMessage] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(url.asInstanceOf[js.Any]).asInstanceOf[RedirectableRequest[typings.node.httpMod.ClientRequest, typings.node.httpMod.IncomingMessage]]
  inline def get(url: URL_, options: RequestOptions & FollowOptions[RequestOptions]): RedirectableRequest[typings.node.httpMod.ClientRequest, typings.node.httpMod.IncomingMessage] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RedirectableRequest[typings.node.httpMod.ClientRequest, typings.node.httpMod.IncomingMessage]]
  inline def get(
    url: URL_,
    options: RequestOptions & FollowOptions[RequestOptions],
    callback: js.Function1[/* res */ typings.node.httpMod.IncomingMessage & FollowResponse, Unit]
  ): RedirectableRequest[typings.node.httpMod.ClientRequest, typings.node.httpMod.IncomingMessage] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[RedirectableRequest[typings.node.httpMod.ClientRequest, typings.node.httpMod.IncomingMessage]]
  inline def get(
    url: URL_,
    options: js.Function1[/* res */ typings.node.httpMod.IncomingMessage & FollowResponse, Unit]
  ): RedirectableRequest[typings.node.httpMod.ClientRequest, typings.node.httpMod.IncomingMessage] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RedirectableRequest[typings.node.httpMod.ClientRequest, typings.node.httpMod.IncomingMessage]]
  inline def get(
    url: URL_,
    options: js.Function1[/* res */ typings.node.httpMod.IncomingMessage & FollowResponse, Unit],
    callback: js.Function1[/* res */ typings.node.httpMod.IncomingMessage & FollowResponse, Unit]
  ): RedirectableRequest[typings.node.httpMod.ClientRequest, typings.node.httpMod.IncomingMessage] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[RedirectableRequest[typings.node.httpMod.ClientRequest, typings.node.httpMod.IncomingMessage]]
  inline def get(
    url: URL_,
    options: Unit,
    callback: js.Function1[/* res */ typings.node.httpMod.IncomingMessage & FollowResponse, Unit]
  ): RedirectableRequest[typings.node.httpMod.ClientRequest, typings.node.httpMod.IncomingMessage] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[RedirectableRequest[typings.node.httpMod.ClientRequest, typings.node.httpMod.IncomingMessage]]
  
  @JSImport("follow-redirects/http", "globalAgent")
  @js.native
  def globalAgent: typings.node.httpMod.Agent = js.native
  inline def globalAgent_=(x: typings.node.httpMod.Agent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("globalAgent")(x.asInstanceOf[js.Any])
  
  @JSImport("follow-redirects/http", "maxHeaderSize")
  @js.native
  def maxHeaderSize: Double = js.native
  inline def maxHeaderSize_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("maxHeaderSize")(x.asInstanceOf[js.Any])
  
  inline def request(url: RequestOptions & FollowOptions[RequestOptions]): RedirectableRequest[typings.node.httpMod.ClientRequest, typings.node.httpMod.IncomingMessage] = ^.asInstanceOf[js.Dynamic].applyDynamic("request")(url.asInstanceOf[js.Any]).asInstanceOf[RedirectableRequest[typings.node.httpMod.ClientRequest, typings.node.httpMod.IncomingMessage]]
  inline def request(
    url: RequestOptions & FollowOptions[RequestOptions],
    options: RequestOptions & FollowOptions[RequestOptions]
  ): RedirectableRequest[typings.node.httpMod.ClientRequest, typings.node.httpMod.IncomingMessage] = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RedirectableRequest[typings.node.httpMod.ClientRequest, typings.node.httpMod.IncomingMessage]]
  inline def request(
    url: RequestOptions & FollowOptions[RequestOptions],
    options: RequestOptions & FollowOptions[RequestOptions],
    callback: js.Function1[/* res */ typings.node.httpMod.IncomingMessage & FollowResponse, Unit]
  ): RedirectableRequest[typings.node.httpMod.ClientRequest, typings.node.httpMod.IncomingMessage] = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[RedirectableRequest[typings.node.httpMod.ClientRequest, typings.node.httpMod.IncomingMessage]]
  inline def request(
    url: RequestOptions & FollowOptions[RequestOptions],
    options: js.Function1[/* res */ typings.node.httpMod.IncomingMessage & FollowResponse, Unit]
  ): RedirectableRequest[typings.node.httpMod.ClientRequest, typings.node.httpMod.IncomingMessage] = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RedirectableRequest[typings.node.httpMod.ClientRequest, typings.node.httpMod.IncomingMessage]]
  inline def request(
    url: RequestOptions & FollowOptions[RequestOptions],
    options: js.Function1[/* res */ typings.node.httpMod.IncomingMessage & FollowResponse, Unit],
    callback: js.Function1[/* res */ typings.node.httpMod.IncomingMessage & FollowResponse, Unit]
  ): RedirectableRequest[typings.node.httpMod.ClientRequest, typings.node.httpMod.IncomingMessage] = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[RedirectableRequest[typings.node.httpMod.ClientRequest, typings.node.httpMod.IncomingMessage]]
  inline def request(
    url: RequestOptions & FollowOptions[RequestOptions],
    options: Unit,
    callback: js.Function1[/* res */ typings.node.httpMod.IncomingMessage & FollowResponse, Unit]
  ): RedirectableRequest[typings.node.httpMod.ClientRequest, typings.node.httpMod.IncomingMessage] = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[RedirectableRequest[typings.node.httpMod.ClientRequest, typings.node.httpMod.IncomingMessage]]
  /**
    * This function has two overloads:
    * ```typescript
    * request(options: string | URL | Options, callback)
    * request(url: string | URL, options: Options, callback)
    * ```
    */
  inline def request(url: String): RedirectableRequest[typings.node.httpMod.ClientRequest, typings.node.httpMod.IncomingMessage] = ^.asInstanceOf[js.Dynamic].applyDynamic("request")(url.asInstanceOf[js.Any]).asInstanceOf[RedirectableRequest[typings.node.httpMod.ClientRequest, typings.node.httpMod.IncomingMessage]]
  inline def request(url: String, options: RequestOptions & FollowOptions[RequestOptions]): RedirectableRequest[typings.node.httpMod.ClientRequest, typings.node.httpMod.IncomingMessage] = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RedirectableRequest[typings.node.httpMod.ClientRequest, typings.node.httpMod.IncomingMessage]]
  inline def request(
    url: String,
    options: RequestOptions & FollowOptions[RequestOptions],
    callback: js.Function1[/* res */ typings.node.httpMod.IncomingMessage & FollowResponse, Unit]
  ): RedirectableRequest[typings.node.httpMod.ClientRequest, typings.node.httpMod.IncomingMessage] = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[RedirectableRequest[typings.node.httpMod.ClientRequest, typings.node.httpMod.IncomingMessage]]
  inline def request(
    url: String,
    options: js.Function1[/* res */ typings.node.httpMod.IncomingMessage & FollowResponse, Unit]
  ): RedirectableRequest[typings.node.httpMod.ClientRequest, typings.node.httpMod.IncomingMessage] = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RedirectableRequest[typings.node.httpMod.ClientRequest, typings.node.httpMod.IncomingMessage]]
  inline def request(
    url: String,
    options: js.Function1[/* res */ typings.node.httpMod.IncomingMessage & FollowResponse, Unit],
    callback: js.Function1[/* res */ typings.node.httpMod.IncomingMessage & FollowResponse, Unit]
  ): RedirectableRequest[typings.node.httpMod.ClientRequest, typings.node.httpMod.IncomingMessage] = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[RedirectableRequest[typings.node.httpMod.ClientRequest, typings.node.httpMod.IncomingMessage]]
  inline def request(
    url: String,
    options: Unit,
    callback: js.Function1[/* res */ typings.node.httpMod.IncomingMessage & FollowResponse, Unit]
  ): RedirectableRequest[typings.node.httpMod.ClientRequest, typings.node.httpMod.IncomingMessage] = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[RedirectableRequest[typings.node.httpMod.ClientRequest, typings.node.httpMod.IncomingMessage]]
  inline def request(url: URL_): RedirectableRequest[typings.node.httpMod.ClientRequest, typings.node.httpMod.IncomingMessage] = ^.asInstanceOf[js.Dynamic].applyDynamic("request")(url.asInstanceOf[js.Any]).asInstanceOf[RedirectableRequest[typings.node.httpMod.ClientRequest, typings.node.httpMod.IncomingMessage]]
  inline def request(url: URL_, options: RequestOptions & FollowOptions[RequestOptions]): RedirectableRequest[typings.node.httpMod.ClientRequest, typings.node.httpMod.IncomingMessage] = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RedirectableRequest[typings.node.httpMod.ClientRequest, typings.node.httpMod.IncomingMessage]]
  inline def request(
    url: URL_,
    options: RequestOptions & FollowOptions[RequestOptions],
    callback: js.Function1[/* res */ typings.node.httpMod.IncomingMessage & FollowResponse, Unit]
  ): RedirectableRequest[typings.node.httpMod.ClientRequest, typings.node.httpMod.IncomingMessage] = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[RedirectableRequest[typings.node.httpMod.ClientRequest, typings.node.httpMod.IncomingMessage]]
  inline def request(
    url: URL_,
    options: js.Function1[/* res */ typings.node.httpMod.IncomingMessage & FollowResponse, Unit]
  ): RedirectableRequest[typings.node.httpMod.ClientRequest, typings.node.httpMod.IncomingMessage] = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RedirectableRequest[typings.node.httpMod.ClientRequest, typings.node.httpMod.IncomingMessage]]
  inline def request(
    url: URL_,
    options: js.Function1[/* res */ typings.node.httpMod.IncomingMessage & FollowResponse, Unit],
    callback: js.Function1[/* res */ typings.node.httpMod.IncomingMessage & FollowResponse, Unit]
  ): RedirectableRequest[typings.node.httpMod.ClientRequest, typings.node.httpMod.IncomingMessage] = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[RedirectableRequest[typings.node.httpMod.ClientRequest, typings.node.httpMod.IncomingMessage]]
  inline def request(
    url: URL_,
    options: Unit,
    callback: js.Function1[/* res */ typings.node.httpMod.IncomingMessage & FollowResponse, Unit]
  ): RedirectableRequest[typings.node.httpMod.ClientRequest, typings.node.httpMod.IncomingMessage] = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[RedirectableRequest[typings.node.httpMod.ClientRequest, typings.node.httpMod.IncomingMessage]]
  
  @JSImport("follow-redirects/http", "setMaxIdleHTTPParsers")
  @js.native
  def setMaxIdleHTTPParsers: js.Function1[/* max */ Double, Unit] = js.native
  inline def setMaxIdleHTTPParsers(max: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setMaxIdleHTTPParsers")(max.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def setMaxIdleHTTPParsers_=(x: js.Function1[/* max */ Double, Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("setMaxIdleHTTPParsers")(x.asInstanceOf[js.Any])
  
  @JSImport("follow-redirects/http", "validateHeaderName")
  @js.native
  def validateHeaderName: js.Function1[/* name */ String, Unit] = js.native
  inline def validateHeaderName(name: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("validateHeaderName")(name.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def validateHeaderName_=(x: js.Function1[/* name */ String, Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("validateHeaderName")(x.asInstanceOf[js.Any])
  
  @JSImport("follow-redirects/http", "validateHeaderValue")
  @js.native
  def validateHeaderValue: js.Function2[/* name */ String, /* value */ String, Unit] = js.native
  inline def validateHeaderValue(name: String, value: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("validateHeaderValue")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def validateHeaderValue_=(x: js.Function2[/* name */ String, /* value */ String, Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("validateHeaderValue")(x.asInstanceOf[js.Any])
}
