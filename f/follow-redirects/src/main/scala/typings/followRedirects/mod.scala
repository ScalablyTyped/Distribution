package typings.followRedirects

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typings.followRedirects.anon.Http
import typings.followRedirects.anon.Location
import typings.followRedirects.followRedirectsStrings.error
import typings.followRedirects.followRedirectsStrings.response
import typings.node.httpMod.ClientRequest
import typings.node.httpMod.IncomingHttpHeaders
import typings.node.httpMod.RequestOptions
import typings.node.nodeColonhttpMod.IncomingMessage
import typings.node.nodeColonhttpMod.ServerResponse
import typings.node.nodeColonnetMod.Socket
import typings.node.streamMod.Writable
import typings.node.urlMod.URL_
import typings.std.Exclude
import typings.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("follow-redirects", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* Inlined follow-redirects.follow-redirects.Override<{readonly request (options : node.http.RequestOptions): node.http.ClientRequest, readonly request (options : string): node.http.ClientRequest, readonly request (options : node.node:url.URL): node.http.ClientRequest, readonly request (options : node.http.RequestOptions, callback : (res : node.http.IncomingMessage): void): node.http.ClientRequest, readonly request (options : string, callback : (res : node.http.IncomingMessage): void): node.http.ClientRequest, readonly request (options : node.node:url.URL, callback : (res : node.http.IncomingMessage): void): node.http.ClientRequest, readonly request (url : string, options : node.http.RequestOptions): node.http.ClientRequest, readonly request (url : node.node:url.URL, options : node.http.RequestOptions): node.http.ClientRequest, readonly request (url : string, options : node.http.RequestOptions, callback : (res : node.http.IncomingMessage): void): node.http.ClientRequest, readonly request (url : node.node:url.URL, options : node.http.RequestOptions, callback : (res : node.http.IncomingMessage): void): node.http.ClientRequest, readonly validateHeaderValue (name : string, value : string): void,   IncomingMessage :new (socket : node.node:net.Socket): node.http.IncomingMessage,   ServerResponse :new <Request extends node.http.IncomingMessage = node.http.IncomingMessage>(req : / * import warning: RewrittenClass.unapply cls was tparam Request * / any): node.http.ServerResponse<Request>, readonly get (options : node.http.RequestOptions): node.http.ClientRequest, readonly get (options : string): node.http.ClientRequest, readonly get (options : node.node:url.URL): node.http.ClientRequest, readonly get (options : node.http.RequestOptions, callback : (res : node.http.IncomingMessage): void): node.http.ClientRequest, readonly get (options : string, callback : (res : node.http.IncomingMessage): void): node.http.ClientRequest, readonly get (options : node.node:url.URL, callback : (res : node.http.IncomingMessage): void): node.http.ClientRequest, readonly get (url : string, options : node.http.RequestOptions): node.http.ClientRequest, readonly get (url : node.node:url.URL, options : node.http.RequestOptions): node.http.ClientRequest, readonly get (url : string, options : node.http.RequestOptions, callback : (res : node.http.IncomingMessage): void): node.http.ClientRequest, readonly get (url : node.node:url.URL, options : node.http.RequestOptions, callback : (res : node.http.IncomingMessage): void): node.http.ClientRequest, readonly createServer <Request extends new (socket : node.node:net.Socket): node.http.IncomingMessage = new (socket : node.node:net.Socket): node.http.IncomingMessage, Response extends new <Request extends node.http.IncomingMessage = node.http.IncomingMessage>(req : / * import warning: RewrittenClass.unapply cls was tparam Request * / any): node.http.ServerResponse<Request> = new <Request extends node.http.IncomingMessage = node.http.IncomingMessage>(req : / * import warning: RewrittenClass.unapply cls was tparam Request * / any): node.http.ServerResponse<Request>>(): node.http.Server<Request, Response>, readonly createServer <Request extends new (socket : node.node:net.Socket): node.http.IncomingMessage = new (socket : node.node:net.Socket): node.http.IncomingMessage, Response extends new <Request extends node.http.IncomingMessage = node.http.IncomingMessage>(req : / * import warning: RewrittenClass.unapply cls was tparam Request * / any): node.http.ServerResponse<Request> = new <Request extends node.http.IncomingMessage = node.http.IncomingMessage>(req : / * import warning: RewrittenClass.unapply cls was tparam Request * / any): node.http.ServerResponse<Request>>(requestListener : node.http.RequestListener<Request, Response>): node.http.Server<Request, Response>, readonly createServer <Request extends new (socket : node.node:net.Socket): node.http.IncomingMessage = new (socket : node.node:net.Socket): node.http.IncomingMessage, Response extends new <Request extends node.http.IncomingMessage = node.http.IncomingMessage>(req : / * import warning: RewrittenClass.unapply cls was tparam Request * / any): node.http.ServerResponse<Request> = new <Request extends node.http.IncomingMessage = node.http.IncomingMessage>(req : / * import warning: RewrittenClass.unapply cls was tparam Request * / any): node.http.ServerResponse<Request>>(options : node.http.ServerOptions<Request, Response>): node.http.Server<Request, Response>, readonly createServer <Request extends new (socket : node.node:net.Socket): node.http.IncomingMessage = new (socket : node.node:net.Socket): node.http.IncomingMessage, Response extends new <Request extends node.http.IncomingMessage = node.http.IncomingMessage>(req : / * import warning: RewrittenClass.unapply cls was tparam Request * / any): node.http.ServerResponse<Request> = new <Request extends node.http.IncomingMessage = node.http.IncomingMessage>(req : / * import warning: RewrittenClass.unapply cls was tparam Request * / any): node.http.ServerResponse<Request>>(options : node.http.ServerOptions<Request, Response>, requestListener : node.http.RequestListener<Request, Response>): node.http.Server<Request, Response>,  readonly STATUS_CODES,   Agent :new (): node.http.Agent,  readonly maxHeaderSize :number,   ClientRequest :new (url : string): node.http.ClientRequest, readonly validateHeaderName (name : string): void,   OutgoingMessage :new <Request extends node.http.IncomingMessage = node.http.IncomingMessage>(): node.http.OutgoingMessage<Request>,   Server :new <Request extends new (socket : node.node:net.Socket): node.http.IncomingMessage = new (socket : node.node:net.Socket): node.http.IncomingMessage, Response extends new <Request extends node.http.IncomingMessage = node.http.IncomingMessage>(req : / * import warning: RewrittenClass.unapply cls was tparam Request * / any): node.http.ServerResponse<Request> = new <Request extends node.http.IncomingMessage = node.http.IncomingMessage>(req : / * import warning: RewrittenClass.unapply cls was tparam Request * / any): node.http.ServerResponse<Request>>(): node.http.Server<Request, Response>, readonly setMaxIdleHTTPParsers (count : number): void,   globalAgent :node.http.Agent,  readonly METHODS :std.Array<string>}, follow-redirects.follow-redirects.RedirectScheme<node.http.RequestOptions, node.http.ClientRequest, node.http.IncomingMessage>> */
  object http {
    
    @JSImport("follow-redirects", "http")
    @js.native
    val ^ : js.Any = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("follow-redirects", "http.Agent")
    @js.native
    open class Agent ()
      extends typings.node.httpMod.Agent
    @JSImport("follow-redirects", "http.Agent")
    @js.native
    def Agent: Instantiable0[typings.node.httpMod.Agent] = js.native
    inline def Agent_=(x: Instantiable0[typings.node.httpMod.Agent]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Agent")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("follow-redirects", "http.ClientRequest")
    @js.native
    open class ClientRequest protected ()
      extends typings.node.httpMod.ClientRequest {
      def this(url: String) = this()
    }
    @JSImport("follow-redirects", "http.ClientRequest")
    @js.native
    def ClientRequest: Instantiable1[/* url */ String, typings.node.httpMod.ClientRequest] = js.native
    inline def ClientRequest_=(x: Instantiable1[/* url */ String, typings.node.httpMod.ClientRequest]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ClientRequest")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("follow-redirects", "http.IncomingMessage")
    @js.native
    open class IncomingMessage protected ()
      extends typings.node.httpMod.IncomingMessage {
      def this(socket: Socket) = this()
    }
    @JSImport("follow-redirects", "http.IncomingMessage")
    @js.native
    def IncomingMessage: Instantiable1[/* socket */ Socket, typings.node.httpMod.IncomingMessage] = js.native
    inline def IncomingMessage_=(x: Instantiable1[/* socket */ Socket, typings.node.httpMod.IncomingMessage]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IncomingMessage")(x.asInstanceOf[js.Any])
    
    @JSImport("follow-redirects", "http.METHODS")
    @js.native
    def METHODS: js.Array[String] = js.native
    inline def METHODS_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("METHODS")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("follow-redirects", "http.OutgoingMessage")
    @js.native
    open class OutgoingMessage[Request /* <: typings.node.httpMod.IncomingMessage */] ()
      extends typings.node.httpMod.OutgoingMessage[Request]
    @JSImport("follow-redirects", "http.OutgoingMessage")
    @js.native
    def OutgoingMessage: Instantiable0[typings.node.httpMod.OutgoingMessage[typings.node.httpMod.IncomingMessage]] = js.native
    inline def OutgoingMessage_=(x: Instantiable0[typings.node.httpMod.OutgoingMessage[typings.node.httpMod.IncomingMessage]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OutgoingMessage")(x.asInstanceOf[js.Any])
    
    @JSImport("follow-redirects", "http.STATUS_CODES")
    @js.native
    def STATUS_CODES: Any = js.native
    inline def STATUS_CODES_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("STATUS_CODES")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("follow-redirects", "http.Server")
    @js.native
    open class Server[Request /* <: Instantiable1[/* socket */ Socket, typings.node.httpMod.IncomingMessage] */, Response /* <: Instantiable1[
        /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
        typings.node.httpMod.ServerResponse[typings.node.httpMod.IncomingMessage]
      ] */] ()
      extends typings.node.httpMod.Server[Request, Response]
    @JSImport("follow-redirects", "http.Server")
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
    @JSImport("follow-redirects", "http.ServerResponse")
    @js.native
    open class ServerResponse[Request /* <: typings.node.httpMod.IncomingMessage */] protected ()
      extends typings.node.httpMod.ServerResponse[Request] {
      def this(req: /* import warning: RewrittenClass.unapply cls was tparam Request */ Any) = this()
    }
    @JSImport("follow-redirects", "http.ServerResponse")
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
    @JSImport("follow-redirects", "http.createServer")
    @js.native
    def createServer_Fhttp: js.Function0[
        typings.node.httpMod.Server[
          Instantiable1[/* socket */ Socket, typings.node.httpMod.IncomingMessage], 
          Instantiable1[
            /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
            typings.node.httpMod.ServerResponse[typings.node.httpMod.IncomingMessage]
          ]
        ]
      ] = js.native
    
    inline def createServer_Fhttp_=(
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
    
    @JSImport("follow-redirects", "http.globalAgent")
    @js.native
    def globalAgent: typings.node.httpMod.Agent = js.native
    inline def globalAgent_=(x: typings.node.httpMod.Agent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("globalAgent")(x.asInstanceOf[js.Any])
    
    @JSImport("follow-redirects", "http.maxHeaderSize")
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
    
    @JSImport("follow-redirects", "http.setMaxIdleHTTPParsers")
    @js.native
    def setMaxIdleHTTPParsers: js.Function1[/* count */ Double, Unit] = js.native
    inline def setMaxIdleHTTPParsers(count: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setMaxIdleHTTPParsers")(count.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def setMaxIdleHTTPParsers_=(x: js.Function1[/* count */ Double, Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("setMaxIdleHTTPParsers")(x.asInstanceOf[js.Any])
    
    @JSImport("follow-redirects", "http.validateHeaderName")
    @js.native
    def validateHeaderName: js.Function1[/* name */ String, Unit] = js.native
    inline def validateHeaderName(name: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("validateHeaderName")(name.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def validateHeaderName_=(x: js.Function1[/* name */ String, Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("validateHeaderName")(x.asInstanceOf[js.Any])
    
    @JSImport("follow-redirects", "http.validateHeaderValue")
    @js.native
    def validateHeaderValue: js.Function2[/* name */ String, /* value */ String, Unit] = js.native
    inline def validateHeaderValue(name: String, value: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("validateHeaderValue")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def validateHeaderValue_=(x: js.Function2[/* name */ String, /* value */ String, Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("validateHeaderValue")(x.asInstanceOf[js.Any])
  }
  
  /* Inlined follow-redirects.follow-redirects.Override<{readonly request (options : node.https.RequestOptions): node.node:http.ClientRequest, readonly request (options : string): node.node:http.ClientRequest, readonly request (options : node.node:url.URL): node.node:http.ClientRequest, readonly request (options : node.https.RequestOptions, callback : (res : node.node:http.IncomingMessage): void): node.node:http.ClientRequest, readonly request (options : string, callback : (res : node.node:http.IncomingMessage): void): node.node:http.ClientRequest, readonly request (options : node.node:url.URL, callback : (res : node.node:http.IncomingMessage): void): node.node:http.ClientRequest, readonly request (url : string, options : node.https.RequestOptions): node.node:http.ClientRequest, readonly request (url : node.node:url.URL, options : node.https.RequestOptions): node.node:http.ClientRequest, readonly request (url : string, options : node.https.RequestOptions, callback : (res : node.node:http.IncomingMessage): void): node.node:http.ClientRequest, readonly request (url : node.node:url.URL, options : node.https.RequestOptions, callback : (res : node.node:http.IncomingMessage): void): node.node:http.ClientRequest, readonly get (options : node.https.RequestOptions): node.node:http.ClientRequest, readonly get (options : string): node.node:http.ClientRequest, readonly get (options : node.node:url.URL): node.node:http.ClientRequest, readonly get (options : node.https.RequestOptions, callback : (res : node.node:http.IncomingMessage): void): node.node:http.ClientRequest, readonly get (options : string, callback : (res : node.node:http.IncomingMessage): void): node.node:http.ClientRequest, readonly get (options : node.node:url.URL, callback : (res : node.node:http.IncomingMessage): void): node.node:http.ClientRequest, readonly get (url : string, options : node.https.RequestOptions): node.node:http.ClientRequest, readonly get (url : node.node:url.URL, options : node.https.RequestOptions): node.node:http.ClientRequest, readonly get (url : string, options : node.https.RequestOptions, callback : (res : node.node:http.IncomingMessage): void): node.node:http.ClientRequest, readonly get (url : node.node:url.URL, options : node.https.RequestOptions, callback : (res : node.node:http.IncomingMessage): void): node.node:http.ClientRequest, readonly createServer <Request extends new (socket : node.node:net.Socket): node.node:http.IncomingMessage = new (socket : node.node:net.Socket): node.node:http.IncomingMessage, Response extends new <Request extends node.http.IncomingMessage = node.http.IncomingMessage>(req : / * import warning: RewrittenClass.unapply cls was tparam Request * / any): node.node:http.ServerResponse<Request> = new <Request extends node.http.IncomingMessage = node.http.IncomingMessage>(req : / * import warning: RewrittenClass.unapply cls was tparam Request * / any): node.node:http.ServerResponse<Request>>(): node.https.Server<Request, Response>, readonly createServer <Request extends new (socket : node.node:net.Socket): node.node:http.IncomingMessage = new (socket : node.node:net.Socket): node.node:http.IncomingMessage, Response extends new <Request extends node.http.IncomingMessage = node.http.IncomingMessage>(req : / * import warning: RewrittenClass.unapply cls was tparam Request * / any): node.node:http.ServerResponse<Request> = new <Request extends node.http.IncomingMessage = node.http.IncomingMessage>(req : / * import warning: RewrittenClass.unapply cls was tparam Request * / any): node.node:http.ServerResponse<Request>>(requestListener : node.http.RequestListener<Request, Response>): node.https.Server<Request, Response>, readonly createServer <Request extends new (socket : node.node:net.Socket): node.node:http.IncomingMessage = new (socket : node.node:net.Socket): node.node:http.IncomingMessage, Response extends new <Request extends node.http.IncomingMessage = node.http.IncomingMessage>(req : / * import warning: RewrittenClass.unapply cls was tparam Request * / any): node.node:http.ServerResponse<Request> = new <Request extends node.http.IncomingMessage = node.http.IncomingMessage>(req : / * import warning: RewrittenClass.unapply cls was tparam Request * / any): node.node:http.ServerResponse<Request>>(options : node.https.ServerOptions<Request, Response>): node.https.Server<Request, Response>, readonly createServer <Request extends new (socket : node.node:net.Socket): node.node:http.IncomingMessage = new (socket : node.node:net.Socket): node.node:http.IncomingMessage, Response extends new <Request extends node.http.IncomingMessage = node.http.IncomingMessage>(req : / * import warning: RewrittenClass.unapply cls was tparam Request * / any): node.node:http.ServerResponse<Request> = new <Request extends node.http.IncomingMessage = node.http.IncomingMessage>(req : / * import warning: RewrittenClass.unapply cls was tparam Request * / any): node.node:http.ServerResponse<Request>>(options : node.https.ServerOptions<Request, Response>, requestListener : node.http.RequestListener<Request, Response>): node.https.Server<Request, Response>,   Agent :new (): node.https.Agent,   Server :new <Request extends new (socket : node.node:net.Socket): node.node:http.IncomingMessage = new (socket : node.node:net.Socket): node.node:http.IncomingMessage, Response extends new <Request extends node.http.IncomingMessage = node.http.IncomingMessage>(req : / * import warning: RewrittenClass.unapply cls was tparam Request * / any): node.node:http.ServerResponse<Request> = new <Request extends node.http.IncomingMessage = node.http.IncomingMessage>(req : / * import warning: RewrittenClass.unapply cls was tparam Request * / any): node.node:http.ServerResponse<Request>>(): node.https.Server<Request, Response>,   globalAgent :node.https.Agent}, follow-redirects.follow-redirects.RedirectScheme<node.https.RequestOptions, node.http.ClientRequest, node.http.IncomingMessage>> */
  object https {
    
    @JSImport("follow-redirects", "https")
    @js.native
    val ^ : js.Any = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("follow-redirects", "https.Agent")
    @js.native
    open class Agent ()
      extends typings.node.httpsMod.Agent
    @JSImport("follow-redirects", "https.Agent")
    @js.native
    def Agent: Instantiable0[typings.node.httpsMod.Agent] = js.native
    inline def Agent_=(x: Instantiable0[typings.node.httpsMod.Agent]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Agent")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("follow-redirects", "https.Server")
    @js.native
    open class Server[Request /* <: Instantiable1[/* socket */ Socket, IncomingMessage] */, Response /* <: Instantiable1[
        /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
        ServerResponse[typings.node.httpMod.IncomingMessage]
      ] */] ()
      extends typings.node.httpsMod.Server[Request, Response]
    @JSImport("follow-redirects", "https.Server")
    @js.native
    def Server: Instantiable0[
        typings.node.httpsMod.Server[
          Instantiable1[/* socket */ Socket, IncomingMessage], 
          Instantiable1[
            /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
            ServerResponse[typings.node.httpMod.IncomingMessage]
          ]
        ]
      ] = js.native
    inline def Server_=(
      x: Instantiable0[
          typings.node.httpsMod.Server[
            Instantiable1[/* socket */ Socket, IncomingMessage], 
            Instantiable1[
              /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
              ServerResponse[typings.node.httpMod.IncomingMessage]
            ]
          ]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Server")(x.asInstanceOf[js.Any])
    
    inline def createServer[Request /* <: Instantiable1[/* socket */ Socket, IncomingMessage] */, Response /* <: Instantiable1[
        /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
        ServerResponse[typings.node.httpMod.IncomingMessage]
      ] */](): typings.node.httpsMod.Server[Request, Response] = ^.asInstanceOf[js.Dynamic].applyDynamic("createServer")().asInstanceOf[typings.node.httpsMod.Server[Request, Response]]
    @JSImport("follow-redirects", "https.createServer")
    @js.native
    def createServer_Fhttps: js.Function0[
        typings.node.httpsMod.Server[
          Instantiable1[/* socket */ Socket, IncomingMessage], 
          Instantiable1[
            /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
            ServerResponse[typings.node.httpMod.IncomingMessage]
          ]
        ]
      ] = js.native
    
    inline def createServer_Fhttps_=(
      x: js.Function0[
          typings.node.httpsMod.Server[
            Instantiable1[/* socket */ Socket, IncomingMessage], 
            Instantiable1[
              /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
              ServerResponse[typings.node.httpMod.IncomingMessage]
            ]
          ]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("createServer")(x.asInstanceOf[js.Any])
    
    inline def get(url: typings.node.httpsMod.RequestOptions & FollowOptions[typings.node.httpsMod.RequestOptions]): RedirectableRequest[ClientRequest, typings.node.httpMod.IncomingMessage] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(url.asInstanceOf[js.Any]).asInstanceOf[RedirectableRequest[ClientRequest, typings.node.httpMod.IncomingMessage]]
    inline def get(
      url: typings.node.httpsMod.RequestOptions & FollowOptions[typings.node.httpsMod.RequestOptions],
      options: typings.node.httpsMod.RequestOptions & FollowOptions[typings.node.httpsMod.RequestOptions]
    ): RedirectableRequest[ClientRequest, typings.node.httpMod.IncomingMessage] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RedirectableRequest[ClientRequest, typings.node.httpMod.IncomingMessage]]
    inline def get(
      url: typings.node.httpsMod.RequestOptions & FollowOptions[typings.node.httpsMod.RequestOptions],
      options: typings.node.httpsMod.RequestOptions & FollowOptions[typings.node.httpsMod.RequestOptions],
      callback: js.Function1[/* res */ typings.node.httpMod.IncomingMessage & FollowResponse, Unit]
    ): RedirectableRequest[ClientRequest, typings.node.httpMod.IncomingMessage] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[RedirectableRequest[ClientRequest, typings.node.httpMod.IncomingMessage]]
    inline def get(
      url: typings.node.httpsMod.RequestOptions & FollowOptions[typings.node.httpsMod.RequestOptions],
      options: js.Function1[/* res */ typings.node.httpMod.IncomingMessage & FollowResponse, Unit]
    ): RedirectableRequest[ClientRequest, typings.node.httpMod.IncomingMessage] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RedirectableRequest[ClientRequest, typings.node.httpMod.IncomingMessage]]
    inline def get(
      url: typings.node.httpsMod.RequestOptions & FollowOptions[typings.node.httpsMod.RequestOptions],
      options: js.Function1[/* res */ typings.node.httpMod.IncomingMessage & FollowResponse, Unit],
      callback: js.Function1[/* res */ typings.node.httpMod.IncomingMessage & FollowResponse, Unit]
    ): RedirectableRequest[ClientRequest, typings.node.httpMod.IncomingMessage] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[RedirectableRequest[ClientRequest, typings.node.httpMod.IncomingMessage]]
    inline def get(
      url: typings.node.httpsMod.RequestOptions & FollowOptions[typings.node.httpsMod.RequestOptions],
      options: Unit,
      callback: js.Function1[/* res */ typings.node.httpMod.IncomingMessage & FollowResponse, Unit]
    ): RedirectableRequest[ClientRequest, typings.node.httpMod.IncomingMessage] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[RedirectableRequest[ClientRequest, typings.node.httpMod.IncomingMessage]]
    /**
      * This function has two overloads:
      * ```typescript
      * get(options: string | URL | Options, callback)
      * get(url: string | URL, options: Options, callback)
      * ```
      */
    inline def get(url: String): RedirectableRequest[ClientRequest, typings.node.httpMod.IncomingMessage] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(url.asInstanceOf[js.Any]).asInstanceOf[RedirectableRequest[ClientRequest, typings.node.httpMod.IncomingMessage]]
    inline def get(
      url: String,
      options: typings.node.httpsMod.RequestOptions & FollowOptions[typings.node.httpsMod.RequestOptions]
    ): RedirectableRequest[ClientRequest, typings.node.httpMod.IncomingMessage] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RedirectableRequest[ClientRequest, typings.node.httpMod.IncomingMessage]]
    inline def get(
      url: String,
      options: typings.node.httpsMod.RequestOptions & FollowOptions[typings.node.httpsMod.RequestOptions],
      callback: js.Function1[/* res */ typings.node.httpMod.IncomingMessage & FollowResponse, Unit]
    ): RedirectableRequest[ClientRequest, typings.node.httpMod.IncomingMessage] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[RedirectableRequest[ClientRequest, typings.node.httpMod.IncomingMessage]]
    inline def get(
      url: String,
      options: js.Function1[/* res */ typings.node.httpMod.IncomingMessage & FollowResponse, Unit]
    ): RedirectableRequest[ClientRequest, typings.node.httpMod.IncomingMessage] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RedirectableRequest[ClientRequest, typings.node.httpMod.IncomingMessage]]
    inline def get(
      url: String,
      options: js.Function1[/* res */ typings.node.httpMod.IncomingMessage & FollowResponse, Unit],
      callback: js.Function1[/* res */ typings.node.httpMod.IncomingMessage & FollowResponse, Unit]
    ): RedirectableRequest[ClientRequest, typings.node.httpMod.IncomingMessage] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[RedirectableRequest[ClientRequest, typings.node.httpMod.IncomingMessage]]
    inline def get(
      url: String,
      options: Unit,
      callback: js.Function1[/* res */ typings.node.httpMod.IncomingMessage & FollowResponse, Unit]
    ): RedirectableRequest[ClientRequest, typings.node.httpMod.IncomingMessage] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[RedirectableRequest[ClientRequest, typings.node.httpMod.IncomingMessage]]
    inline def get(url: URL_): RedirectableRequest[ClientRequest, typings.node.httpMod.IncomingMessage] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(url.asInstanceOf[js.Any]).asInstanceOf[RedirectableRequest[ClientRequest, typings.node.httpMod.IncomingMessage]]
    inline def get(
      url: URL_,
      options: typings.node.httpsMod.RequestOptions & FollowOptions[typings.node.httpsMod.RequestOptions]
    ): RedirectableRequest[ClientRequest, typings.node.httpMod.IncomingMessage] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RedirectableRequest[ClientRequest, typings.node.httpMod.IncomingMessage]]
    inline def get(
      url: URL_,
      options: typings.node.httpsMod.RequestOptions & FollowOptions[typings.node.httpsMod.RequestOptions],
      callback: js.Function1[/* res */ typings.node.httpMod.IncomingMessage & FollowResponse, Unit]
    ): RedirectableRequest[ClientRequest, typings.node.httpMod.IncomingMessage] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[RedirectableRequest[ClientRequest, typings.node.httpMod.IncomingMessage]]
    inline def get(
      url: URL_,
      options: js.Function1[/* res */ typings.node.httpMod.IncomingMessage & FollowResponse, Unit]
    ): RedirectableRequest[ClientRequest, typings.node.httpMod.IncomingMessage] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RedirectableRequest[ClientRequest, typings.node.httpMod.IncomingMessage]]
    inline def get(
      url: URL_,
      options: js.Function1[/* res */ typings.node.httpMod.IncomingMessage & FollowResponse, Unit],
      callback: js.Function1[/* res */ typings.node.httpMod.IncomingMessage & FollowResponse, Unit]
    ): RedirectableRequest[ClientRequest, typings.node.httpMod.IncomingMessage] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[RedirectableRequest[ClientRequest, typings.node.httpMod.IncomingMessage]]
    inline def get(
      url: URL_,
      options: Unit,
      callback: js.Function1[/* res */ typings.node.httpMod.IncomingMessage & FollowResponse, Unit]
    ): RedirectableRequest[ClientRequest, typings.node.httpMod.IncomingMessage] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[RedirectableRequest[ClientRequest, typings.node.httpMod.IncomingMessage]]
    
    @JSImport("follow-redirects", "https.globalAgent")
    @js.native
    def globalAgent: typings.node.httpsMod.Agent = js.native
    inline def globalAgent_=(x: typings.node.httpsMod.Agent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("globalAgent")(x.asInstanceOf[js.Any])
    
    inline def request(url: typings.node.httpsMod.RequestOptions & FollowOptions[typings.node.httpsMod.RequestOptions]): RedirectableRequest[ClientRequest, typings.node.httpMod.IncomingMessage] = ^.asInstanceOf[js.Dynamic].applyDynamic("request")(url.asInstanceOf[js.Any]).asInstanceOf[RedirectableRequest[ClientRequest, typings.node.httpMod.IncomingMessage]]
    inline def request(
      url: typings.node.httpsMod.RequestOptions & FollowOptions[typings.node.httpsMod.RequestOptions],
      options: typings.node.httpsMod.RequestOptions & FollowOptions[typings.node.httpsMod.RequestOptions]
    ): RedirectableRequest[ClientRequest, typings.node.httpMod.IncomingMessage] = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RedirectableRequest[ClientRequest, typings.node.httpMod.IncomingMessage]]
    inline def request(
      url: typings.node.httpsMod.RequestOptions & FollowOptions[typings.node.httpsMod.RequestOptions],
      options: typings.node.httpsMod.RequestOptions & FollowOptions[typings.node.httpsMod.RequestOptions],
      callback: js.Function1[/* res */ typings.node.httpMod.IncomingMessage & FollowResponse, Unit]
    ): RedirectableRequest[ClientRequest, typings.node.httpMod.IncomingMessage] = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[RedirectableRequest[ClientRequest, typings.node.httpMod.IncomingMessage]]
    inline def request(
      url: typings.node.httpsMod.RequestOptions & FollowOptions[typings.node.httpsMod.RequestOptions],
      options: js.Function1[/* res */ typings.node.httpMod.IncomingMessage & FollowResponse, Unit]
    ): RedirectableRequest[ClientRequest, typings.node.httpMod.IncomingMessage] = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RedirectableRequest[ClientRequest, typings.node.httpMod.IncomingMessage]]
    inline def request(
      url: typings.node.httpsMod.RequestOptions & FollowOptions[typings.node.httpsMod.RequestOptions],
      options: js.Function1[/* res */ typings.node.httpMod.IncomingMessage & FollowResponse, Unit],
      callback: js.Function1[/* res */ typings.node.httpMod.IncomingMessage & FollowResponse, Unit]
    ): RedirectableRequest[ClientRequest, typings.node.httpMod.IncomingMessage] = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[RedirectableRequest[ClientRequest, typings.node.httpMod.IncomingMessage]]
    inline def request(
      url: typings.node.httpsMod.RequestOptions & FollowOptions[typings.node.httpsMod.RequestOptions],
      options: Unit,
      callback: js.Function1[/* res */ typings.node.httpMod.IncomingMessage & FollowResponse, Unit]
    ): RedirectableRequest[ClientRequest, typings.node.httpMod.IncomingMessage] = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[RedirectableRequest[ClientRequest, typings.node.httpMod.IncomingMessage]]
    /**
      * This function has two overloads:
      * ```typescript
      * request(options: string | URL | Options, callback)
      * request(url: string | URL, options: Options, callback)
      * ```
      */
    inline def request(url: String): RedirectableRequest[ClientRequest, typings.node.httpMod.IncomingMessage] = ^.asInstanceOf[js.Dynamic].applyDynamic("request")(url.asInstanceOf[js.Any]).asInstanceOf[RedirectableRequest[ClientRequest, typings.node.httpMod.IncomingMessage]]
    inline def request(
      url: String,
      options: typings.node.httpsMod.RequestOptions & FollowOptions[typings.node.httpsMod.RequestOptions]
    ): RedirectableRequest[ClientRequest, typings.node.httpMod.IncomingMessage] = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RedirectableRequest[ClientRequest, typings.node.httpMod.IncomingMessage]]
    inline def request(
      url: String,
      options: typings.node.httpsMod.RequestOptions & FollowOptions[typings.node.httpsMod.RequestOptions],
      callback: js.Function1[/* res */ typings.node.httpMod.IncomingMessage & FollowResponse, Unit]
    ): RedirectableRequest[ClientRequest, typings.node.httpMod.IncomingMessage] = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[RedirectableRequest[ClientRequest, typings.node.httpMod.IncomingMessage]]
    inline def request(
      url: String,
      options: js.Function1[/* res */ typings.node.httpMod.IncomingMessage & FollowResponse, Unit]
    ): RedirectableRequest[ClientRequest, typings.node.httpMod.IncomingMessage] = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RedirectableRequest[ClientRequest, typings.node.httpMod.IncomingMessage]]
    inline def request(
      url: String,
      options: js.Function1[/* res */ typings.node.httpMod.IncomingMessage & FollowResponse, Unit],
      callback: js.Function1[/* res */ typings.node.httpMod.IncomingMessage & FollowResponse, Unit]
    ): RedirectableRequest[ClientRequest, typings.node.httpMod.IncomingMessage] = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[RedirectableRequest[ClientRequest, typings.node.httpMod.IncomingMessage]]
    inline def request(
      url: String,
      options: Unit,
      callback: js.Function1[/* res */ typings.node.httpMod.IncomingMessage & FollowResponse, Unit]
    ): RedirectableRequest[ClientRequest, typings.node.httpMod.IncomingMessage] = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[RedirectableRequest[ClientRequest, typings.node.httpMod.IncomingMessage]]
    inline def request(url: URL_): RedirectableRequest[ClientRequest, typings.node.httpMod.IncomingMessage] = ^.asInstanceOf[js.Dynamic].applyDynamic("request")(url.asInstanceOf[js.Any]).asInstanceOf[RedirectableRequest[ClientRequest, typings.node.httpMod.IncomingMessage]]
    inline def request(
      url: URL_,
      options: typings.node.httpsMod.RequestOptions & FollowOptions[typings.node.httpsMod.RequestOptions]
    ): RedirectableRequest[ClientRequest, typings.node.httpMod.IncomingMessage] = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RedirectableRequest[ClientRequest, typings.node.httpMod.IncomingMessage]]
    inline def request(
      url: URL_,
      options: typings.node.httpsMod.RequestOptions & FollowOptions[typings.node.httpsMod.RequestOptions],
      callback: js.Function1[/* res */ typings.node.httpMod.IncomingMessage & FollowResponse, Unit]
    ): RedirectableRequest[ClientRequest, typings.node.httpMod.IncomingMessage] = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[RedirectableRequest[ClientRequest, typings.node.httpMod.IncomingMessage]]
    inline def request(
      url: URL_,
      options: js.Function1[/* res */ typings.node.httpMod.IncomingMessage & FollowResponse, Unit]
    ): RedirectableRequest[ClientRequest, typings.node.httpMod.IncomingMessage] = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RedirectableRequest[ClientRequest, typings.node.httpMod.IncomingMessage]]
    inline def request(
      url: URL_,
      options: js.Function1[/* res */ typings.node.httpMod.IncomingMessage & FollowResponse, Unit],
      callback: js.Function1[/* res */ typings.node.httpMod.IncomingMessage & FollowResponse, Unit]
    ): RedirectableRequest[ClientRequest, typings.node.httpMod.IncomingMessage] = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[RedirectableRequest[ClientRequest, typings.node.httpMod.IncomingMessage]]
    inline def request(
      url: URL_,
      options: Unit,
      callback: js.Function1[/* res */ typings.node.httpMod.IncomingMessage & FollowResponse, Unit]
    ): RedirectableRequest[ClientRequest, typings.node.httpMod.IncomingMessage] = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[RedirectableRequest[ClientRequest, typings.node.httpMod.IncomingMessage]]
  }
  
  inline def wrap[T /* <: StringDictionary[Scheme[Any, Any, Any]] */](protocols: T): /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: follow-redirects.follow-redirects.WrappedScheme<T[K]>} */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(protocols.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: follow-redirects.follow-redirects.WrappedScheme<T[K]>} */ js.Any]
  
  trait FollowOptions[Options] extends StObject {
    
    var agents: js.UndefOr[Http] = js.undefined
    
    var beforeRedirect: js.UndefOr[
        js.Function2[
          /* options */ Options & FollowOptions[Options], 
          /* responseDetails */ ResponseDetails, 
          Unit
        ]
      ] = js.undefined
    
    var followRedirects: js.UndefOr[Boolean] = js.undefined
    
    var maxBodyLength: js.UndefOr[Double] = js.undefined
    
    var maxRedirects: js.UndefOr[Double] = js.undefined
    
    var trackRedirects: js.UndefOr[Boolean] = js.undefined
  }
  object FollowOptions {
    
    inline def apply[Options](): FollowOptions[Options] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FollowOptions[Options]]
    }
    
    extension [Self <: FollowOptions[?], Options](x: Self & FollowOptions[Options]) {
      
      inline def setAgents(value: Http): Self = StObject.set(x, "agents", value.asInstanceOf[js.Any])
      
      inline def setAgentsUndefined: Self = StObject.set(x, "agents", js.undefined)
      
      inline def setBeforeRedirect(
        value: (/* options */ Options & FollowOptions[Options], /* responseDetails */ ResponseDetails) => Unit
      ): Self = StObject.set(x, "beforeRedirect", js.Any.fromFunction2(value))
      
      inline def setBeforeRedirectUndefined: Self = StObject.set(x, "beforeRedirect", js.undefined)
      
      inline def setFollowRedirects(value: Boolean): Self = StObject.set(x, "followRedirects", value.asInstanceOf[js.Any])
      
      inline def setFollowRedirectsUndefined: Self = StObject.set(x, "followRedirects", js.undefined)
      
      inline def setMaxBodyLength(value: Double): Self = StObject.set(x, "maxBodyLength", value.asInstanceOf[js.Any])
      
      inline def setMaxBodyLengthUndefined: Self = StObject.set(x, "maxBodyLength", js.undefined)
      
      inline def setMaxRedirects(value: Double): Self = StObject.set(x, "maxRedirects", value.asInstanceOf[js.Any])
      
      inline def setMaxRedirectsUndefined: Self = StObject.set(x, "maxRedirects", js.undefined)
      
      inline def setTrackRedirects(value: Boolean): Self = StObject.set(x, "trackRedirects", value.asInstanceOf[js.Any])
      
      inline def setTrackRedirectsUndefined: Self = StObject.set(x, "trackRedirects", js.undefined)
    }
  }
  
  trait FollowResponse extends StObject {
    
    var redirects: js.Array[Redirect]
    
    var responseUrl: String
  }
  object FollowResponse {
    
    inline def apply(redirects: js.Array[Redirect], responseUrl: String): FollowResponse = {
      val __obj = js.Dynamic.literal(redirects = redirects.asInstanceOf[js.Any], responseUrl = responseUrl.asInstanceOf[js.Any])
      __obj.asInstanceOf[FollowResponse]
    }
    
    extension [Self <: FollowResponse](x: Self) {
      
      inline def setRedirects(value: js.Array[Redirect]): Self = StObject.set(x, "redirects", value.asInstanceOf[js.Any])
      
      inline def setRedirectsVarargs(value: Redirect*): Self = StObject.set(x, "redirects", js.Array(value*))
      
      inline def setResponseUrl(value: String): Self = StObject.set(x, "responseUrl", value.asInstanceOf[js.Any])
    }
  }
  
  type Override[T, U] = (Pick[T, Exclude[/* keyof T */ String, /* keyof U */ String]]) & U
  
  trait Redirect extends StObject {
    
    var headers: IncomingHttpHeaders
    
    var statusCode: Double
    
    var url: String
  }
  object Redirect {
    
    inline def apply(headers: IncomingHttpHeaders, statusCode: Double, url: String): Redirect = {
      val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Redirect]
    }
    
    extension [Self <: Redirect](x: Self) {
      
      inline def setHeaders(value: IncomingHttpHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RedirectScheme[Options, Request /* <: WrappableRequest */, Response] extends StObject {
    
    def get(url: Options & FollowOptions[Options]): RedirectableRequest[Request, Response] = js.native
    def get(url: Options & FollowOptions[Options], options: Options & FollowOptions[Options]): RedirectableRequest[Request, Response] = js.native
    def get(
      url: Options & FollowOptions[Options],
      options: Options & FollowOptions[Options],
      callback: js.Function1[/* res */ Response & FollowResponse, Unit]
    ): RedirectableRequest[Request, Response] = js.native
    def get(
      url: Options & FollowOptions[Options],
      options: js.Function1[/* res */ Response & FollowResponse, Unit]
    ): RedirectableRequest[Request, Response] = js.native
    def get(
      url: Options & FollowOptions[Options],
      options: js.Function1[/* res */ Response & FollowResponse, Unit],
      callback: js.Function1[/* res */ Response & FollowResponse, Unit]
    ): RedirectableRequest[Request, Response] = js.native
    def get(
      url: Options & FollowOptions[Options],
      options: Unit,
      callback: js.Function1[/* res */ Response & FollowResponse, Unit]
    ): RedirectableRequest[Request, Response] = js.native
    /**
      * This function has two overloads:
      * ```typescript
      * get(options: string | URL | Options, callback)
      * get(url: string | URL, options: Options, callback)
      * ```
      */
    def get(url: String): RedirectableRequest[Request, Response] = js.native
    def get(url: String, options: Options & FollowOptions[Options]): RedirectableRequest[Request, Response] = js.native
    def get(
      url: String,
      options: Options & FollowOptions[Options],
      callback: js.Function1[/* res */ Response & FollowResponse, Unit]
    ): RedirectableRequest[Request, Response] = js.native
    def get(url: String, options: js.Function1[/* res */ Response & FollowResponse, Unit]): RedirectableRequest[Request, Response] = js.native
    def get(
      url: String,
      options: js.Function1[/* res */ Response & FollowResponse, Unit],
      callback: js.Function1[/* res */ Response & FollowResponse, Unit]
    ): RedirectableRequest[Request, Response] = js.native
    def get(url: String, options: Unit, callback: js.Function1[/* res */ Response & FollowResponse, Unit]): RedirectableRequest[Request, Response] = js.native
    def get(url: URL_): RedirectableRequest[Request, Response] = js.native
    def get(url: URL_, options: Options & FollowOptions[Options]): RedirectableRequest[Request, Response] = js.native
    def get(
      url: URL_,
      options: Options & FollowOptions[Options],
      callback: js.Function1[/* res */ Response & FollowResponse, Unit]
    ): RedirectableRequest[Request, Response] = js.native
    def get(url: URL_, options: js.Function1[/* res */ Response & FollowResponse, Unit]): RedirectableRequest[Request, Response] = js.native
    def get(
      url: URL_,
      options: js.Function1[/* res */ Response & FollowResponse, Unit],
      callback: js.Function1[/* res */ Response & FollowResponse, Unit]
    ): RedirectableRequest[Request, Response] = js.native
    def get(url: URL_, options: Unit, callback: js.Function1[/* res */ Response & FollowResponse, Unit]): RedirectableRequest[Request, Response] = js.native
    
    def request(url: Options & FollowOptions[Options]): RedirectableRequest[Request, Response] = js.native
    def request(url: Options & FollowOptions[Options], options: Options & FollowOptions[Options]): RedirectableRequest[Request, Response] = js.native
    def request(
      url: Options & FollowOptions[Options],
      options: Options & FollowOptions[Options],
      callback: js.Function1[/* res */ Response & FollowResponse, Unit]
    ): RedirectableRequest[Request, Response] = js.native
    def request(
      url: Options & FollowOptions[Options],
      options: js.Function1[/* res */ Response & FollowResponse, Unit]
    ): RedirectableRequest[Request, Response] = js.native
    def request(
      url: Options & FollowOptions[Options],
      options: js.Function1[/* res */ Response & FollowResponse, Unit],
      callback: js.Function1[/* res */ Response & FollowResponse, Unit]
    ): RedirectableRequest[Request, Response] = js.native
    def request(
      url: Options & FollowOptions[Options],
      options: Unit,
      callback: js.Function1[/* res */ Response & FollowResponse, Unit]
    ): RedirectableRequest[Request, Response] = js.native
    /**
      * This function has two overloads:
      * ```typescript
      * request(options: string | URL | Options, callback)
      * request(url: string | URL, options: Options, callback)
      * ```
      */
    def request(url: String): RedirectableRequest[Request, Response] = js.native
    def request(url: String, options: Options & FollowOptions[Options]): RedirectableRequest[Request, Response] = js.native
    def request(
      url: String,
      options: Options & FollowOptions[Options],
      callback: js.Function1[/* res */ Response & FollowResponse, Unit]
    ): RedirectableRequest[Request, Response] = js.native
    def request(url: String, options: js.Function1[/* res */ Response & FollowResponse, Unit]): RedirectableRequest[Request, Response] = js.native
    def request(
      url: String,
      options: js.Function1[/* res */ Response & FollowResponse, Unit],
      callback: js.Function1[/* res */ Response & FollowResponse, Unit]
    ): RedirectableRequest[Request, Response] = js.native
    def request(url: String, options: Unit, callback: js.Function1[/* res */ Response & FollowResponse, Unit]): RedirectableRequest[Request, Response] = js.native
    def request(url: URL_): RedirectableRequest[Request, Response] = js.native
    def request(url: URL_, options: Options & FollowOptions[Options]): RedirectableRequest[Request, Response] = js.native
    def request(
      url: URL_,
      options: Options & FollowOptions[Options],
      callback: js.Function1[/* res */ Response & FollowResponse, Unit]
    ): RedirectableRequest[Request, Response] = js.native
    def request(url: URL_, options: js.Function1[/* res */ Response & FollowResponse, Unit]): RedirectableRequest[Request, Response] = js.native
    def request(
      url: URL_,
      options: js.Function1[/* res */ Response & FollowResponse, Unit],
      callback: js.Function1[/* res */ Response & FollowResponse, Unit]
    ): RedirectableRequest[Request, Response] = js.native
    def request(url: URL_, options: Unit, callback: js.Function1[/* res */ Response & FollowResponse, Unit]): RedirectableRequest[Request, Response] = js.native
  }
  
  @js.native
  trait RedirectableRequest[Request /* <: WrappableRequest */, Response] extends Writable {
    
    var abort: /* import warning: importer.ImportType#apply Failed type conversion: Request['abort'] */ js.Any = js.native
    
    @JSName("addListener")
    def addListener_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_response(event: response, listener: js.Function1[/* response */ Response, Unit]): this.type = js.native
    
    @JSName("emit")
    def emit_error(event: error, err: js.Error): Boolean = js.native
    @JSName("emit")
    def emit_response(event: response, response: Response): Boolean = js.native
    
    var flushHeaders: /* import warning: importer.ImportType#apply Failed type conversion: Request['flushHeaders'] */ js.Any = js.native
    
    var getHeader: /* import warning: importer.ImportType#apply Failed type conversion: Request['getHeader'] */ js.Any = js.native
    
    @JSName("on")
    def on_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
    @JSName("on")
    def on_response(event: response, listener: js.Function1[/* response */ Response, Unit]): this.type = js.native
    
    @JSName("once")
    def once_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
    @JSName("once")
    def once_response(event: response, listener: js.Function1[/* response */ Response, Unit]): this.type = js.native
    
    @JSName("prependListener")
    def prependListener_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_response(event: response, listener: js.Function1[/* response */ Response, Unit]): this.type = js.native
    
    @JSName("prependOnceListener")
    def prependOnceListener_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_response(event: response, listener: js.Function1[/* response */ Response, Unit]): this.type = js.native
    
    var removeHeader: /* import warning: importer.ImportType#apply Failed type conversion: Request['removeHeader'] */ js.Any = js.native
    
    var setHeader: /* import warning: importer.ImportType#apply Failed type conversion: Request['setHeader'] */ js.Any = js.native
    
    var setNoDelay: /* import warning: importer.ImportType#apply Failed type conversion: Request['setNoDelay'] */ js.Any = js.native
    
    var setSocketKeepAlive: /* import warning: importer.ImportType#apply Failed type conversion: Request['setSocketKeepAlive'] */ js.Any = js.native
    
    var setTimeout: /* import warning: importer.ImportType#apply Failed type conversion: Request['setTimeout'] */ js.Any = js.native
  }
  
  trait ResponseDetails extends StObject {
    
    var headers: IncomingHttpHeaders
  }
  object ResponseDetails {
    
    inline def apply(headers: IncomingHttpHeaders): ResponseDetails = {
      val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResponseDetails]
    }
    
    extension [Self <: ResponseDetails](x: Self) {
      
      inline def setHeaders(value: IncomingHttpHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Scheme[Options, Request /* <: WrappableRequest */, Response] extends StObject {
    
    def request(options: Options): Request = js.native
    def request(options: Options, callback: js.Function1[/* res */ Response, Any]): Request = js.native
  }
  
  trait WrappableRequest extends StObject {
    
    var abort: js.UndefOr[js.Function1[/* repeated */ Any, Any]] = js.undefined
    
    var flushHeaders: js.UndefOr[js.Function1[/* repeated */ Any, Any]] = js.undefined
    
    var getHeader: js.UndefOr[js.Function1[/* repeated */ Any, Any]] = js.undefined
    
    def removeHeader(args: Any*): Any
    
    def setHeader(args: Any*): Any
    
    var setNoDelay: js.UndefOr[js.Function1[/* repeated */ Any, Any]] = js.undefined
    
    var setSocketKeepAlive: js.UndefOr[js.Function1[/* repeated */ Any, Any]] = js.undefined
    
    var setTimeout: js.UndefOr[js.Function1[/* repeated */ Any, Any]] = js.undefined
  }
  object WrappableRequest {
    
    inline def apply(removeHeader: /* repeated */ Any => Any, setHeader: /* repeated */ Any => Any): WrappableRequest = {
      val __obj = js.Dynamic.literal(removeHeader = js.Any.fromFunction1(removeHeader), setHeader = js.Any.fromFunction1(setHeader))
      __obj.asInstanceOf[WrappableRequest]
    }
    
    extension [Self <: WrappableRequest](x: Self) {
      
      inline def setAbort(value: /* repeated */ Any => Any): Self = StObject.set(x, "abort", js.Any.fromFunction1(value))
      
      inline def setAbortUndefined: Self = StObject.set(x, "abort", js.undefined)
      
      inline def setFlushHeaders(value: /* repeated */ Any => Any): Self = StObject.set(x, "flushHeaders", js.Any.fromFunction1(value))
      
      inline def setFlushHeadersUndefined: Self = StObject.set(x, "flushHeaders", js.undefined)
      
      inline def setGetHeader(value: /* repeated */ Any => Any): Self = StObject.set(x, "getHeader", js.Any.fromFunction1(value))
      
      inline def setGetHeaderUndefined: Self = StObject.set(x, "getHeader", js.undefined)
      
      inline def setRemoveHeader(value: /* repeated */ Any => Any): Self = StObject.set(x, "removeHeader", js.Any.fromFunction1(value))
      
      inline def setSetHeader(value: /* repeated */ Any => Any): Self = StObject.set(x, "setHeader", js.Any.fromFunction1(value))
      
      inline def setSetNoDelay(value: /* repeated */ Any => Any): Self = StObject.set(x, "setNoDelay", js.Any.fromFunction1(value))
      
      inline def setSetNoDelayUndefined: Self = StObject.set(x, "setNoDelay", js.undefined)
      
      inline def setSetSocketKeepAlive(value: /* repeated */ Any => Any): Self = StObject.set(x, "setSocketKeepAlive", js.Any.fromFunction1(value))
      
      inline def setSetSocketKeepAliveUndefined: Self = StObject.set(x, "setSocketKeepAlive", js.undefined)
      
      inline def setSetTimeout(value: /* repeated */ Any => Any): Self = StObject.set(x, "setTimeout", js.Any.fromFunction1(value))
      
      inline def setSetTimeoutUndefined: Self = StObject.set(x, "setTimeout", js.undefined)
    }
  }
  
  trait WrappableResponse extends StObject {
    
    def destroy(): Any
    
    var headers: Location
    
    var statusCode: js.UndefOr[Double] = js.undefined
  }
  object WrappableResponse {
    
    inline def apply(destroy: () => Any, headers: Location): WrappableResponse = {
      val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), headers = headers.asInstanceOf[js.Any])
      __obj.asInstanceOf[WrappableResponse]
    }
    
    extension [Self <: WrappableResponse](x: Self) {
      
      inline def setDestroy(value: () => Any): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      inline def setHeaders(value: Location): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
      
      inline def setStatusCodeUndefined: Self = StObject.set(x, "statusCode", js.undefined)
    }
  }
  
  type WrappedScheme[T /* <: Scheme[Any, Any, Any] */] = Override[
    T, 
    RedirectScheme[
      /* import warning: importer.ImportType#apply Failed type conversion: T extends follow-redirects.follow-redirects.Scheme<infer Options, any, any> ? Options : never */ js.Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: T extends follow-redirects.follow-redirects.Scheme<any, infer Request, any> ? Request : never */ js.Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: T extends follow-redirects.follow-redirects.Scheme<any, any, infer Response> ? Response : never */ js.Any
    ]
  ]
}
