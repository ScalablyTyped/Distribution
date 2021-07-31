package typings.followRedirects

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.followRedirects.anon.Http
import typings.followRedirects.anon.Location
import typings.followRedirects.followRedirectsStrings.error
import typings.followRedirects.followRedirectsStrings.response
import typings.node.httpMod.ClientRequest
import typings.node.httpMod.IncomingHttpHeaders
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.RequestOptions
import typings.node.netMod.Socket
import typings.node.streamMod.Writable
import typings.std.Error
import typings.std.Exclude
import typings.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("follow-redirects", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* Inlined follow-redirects.follow-redirects.Override<{readonly request (options : node.http.RequestOptions): node.http.ClientRequest, readonly request (options : string): node.http.ClientRequest, readonly request (options : node.url.URL): node.http.ClientRequest, readonly request (options : node.http.RequestOptions, callback : (res : node.http.IncomingMessage): void): node.http.ClientRequest, readonly request (options : string, callback : (res : node.http.IncomingMessage): void): node.http.ClientRequest, readonly request (options : node.url.URL, callback : (res : node.http.IncomingMessage): void): node.http.ClientRequest, readonly request (url : string, options : node.http.RequestOptions): node.http.ClientRequest, readonly request (url : node.url.URL, options : node.http.RequestOptions): node.http.ClientRequest, readonly request (url : string, options : node.http.RequestOptions, callback : (res : node.http.IncomingMessage): void): node.http.ClientRequest, readonly request (url : node.url.URL, options : node.http.RequestOptions, callback : (res : node.http.IncomingMessage): void): node.http.ClientRequest,   IncomingMessage :new (socket : node.net.Socket): node.http.IncomingMessage,   ServerResponse :new (req : node.http.IncomingMessage): node.http.ServerResponse, readonly get (options : node.http.RequestOptions): node.http.ClientRequest, readonly get (options : string): node.http.ClientRequest, readonly get (options : node.url.URL): node.http.ClientRequest, readonly get (options : node.http.RequestOptions, callback : (res : node.http.IncomingMessage): void): node.http.ClientRequest, readonly get (options : string, callback : (res : node.http.IncomingMessage): void): node.http.ClientRequest, readonly get (options : node.url.URL, callback : (res : node.http.IncomingMessage): void): node.http.ClientRequest, readonly get (url : string, options : node.http.RequestOptions): node.http.ClientRequest, readonly get (url : node.url.URL, options : node.http.RequestOptions): node.http.ClientRequest, readonly get (url : string, options : node.http.RequestOptions, callback : (res : node.http.IncomingMessage): void): node.http.ClientRequest, readonly get (url : node.url.URL, options : node.http.RequestOptions, callback : (res : node.http.IncomingMessage): void): node.http.ClientRequest, readonly createServer (): node.http.Server, readonly createServer (requestListener : node.http.RequestListener): node.http.Server, readonly createServer (options : node.http.ServerOptions): node.http.Server, readonly createServer (options : node.http.ServerOptions, requestListener : node.http.RequestListener): node.http.Server,  readonly STATUS_CODES,   Agent :new (): node.http.Agent,  readonly maxHeaderSize :number,   ClientRequest :new (url : string): node.http.ClientRequest,   OutgoingMessage :new (): node.http.OutgoingMessage,   Server :new (): node.http.Server,   globalAgent :node.http.Agent,  readonly METHODS :std.Array<string>}, follow-redirects.follow-redirects.RedirectScheme<node.http.RequestOptions, node.http.ClientRequest, node.http.IncomingMessage>> */
  object http {
    
    @JSImport("follow-redirects", "http")
    @js.native
    val ^ : js.Any = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("follow-redirects", "http.Agent")
    @js.native
    class Agent ()
      extends typings.node.httpMod.Agent
    @JSImport("follow-redirects", "http.Agent")
    @js.native
    def Agent: Instantiable0[typings.node.httpMod.Agent] = js.native
    @scala.inline
    def Agent_=(x: Instantiable0[typings.node.httpMod.Agent]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Agent")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("follow-redirects", "http.ClientRequest")
    @js.native
    class ClientRequest protected ()
      extends typings.node.httpMod.ClientRequest {
      def this(url: String) = this()
    }
    @JSImport("follow-redirects", "http.ClientRequest")
    @js.native
    def ClientRequest: Instantiable1[/* url */ String, typings.node.httpMod.ClientRequest] = js.native
    @scala.inline
    def ClientRequest_=(x: Instantiable1[/* url */ String, typings.node.httpMod.ClientRequest]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ClientRequest")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("follow-redirects", "http.IncomingMessage")
    @js.native
    class IncomingMessage protected ()
      extends typings.node.httpMod.IncomingMessage {
      def this(socket: Socket) = this()
    }
    @JSImport("follow-redirects", "http.IncomingMessage")
    @js.native
    def IncomingMessage: Instantiable1[/* socket */ Socket, typings.node.httpMod.IncomingMessage] = js.native
    @scala.inline
    def IncomingMessage_=(x: Instantiable1[/* socket */ Socket, typings.node.httpMod.IncomingMessage]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IncomingMessage")(x.asInstanceOf[js.Any])
    
    @JSImport("follow-redirects", "http.METHODS")
    @js.native
    def METHODS: js.Array[String] = js.native
    @scala.inline
    def METHODS_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("METHODS")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("follow-redirects", "http.OutgoingMessage")
    @js.native
    class OutgoingMessage ()
      extends typings.node.httpMod.OutgoingMessage
    @JSImport("follow-redirects", "http.OutgoingMessage")
    @js.native
    def OutgoingMessage: Instantiable0[typings.node.httpMod.OutgoingMessage] = js.native
    @scala.inline
    def OutgoingMessage_=(x: Instantiable0[typings.node.httpMod.OutgoingMessage]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OutgoingMessage")(x.asInstanceOf[js.Any])
    
    @JSImport("follow-redirects", "http.STATUS_CODES")
    @js.native
    def STATUS_CODES: js.Any = js.native
    @scala.inline
    def STATUS_CODES_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("STATUS_CODES")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("follow-redirects", "http.Server")
    @js.native
    class Server ()
      extends typings.node.httpMod.Server
    @JSImport("follow-redirects", "http.Server")
    @js.native
    def Server: Instantiable0[typings.node.httpMod.Server] = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("follow-redirects", "http.ServerResponse")
    @js.native
    class ServerResponse protected ()
      extends typings.node.httpMod.ServerResponse {
      def this(req: typings.node.httpMod.IncomingMessage) = this()
    }
    @JSImport("follow-redirects", "http.ServerResponse")
    @js.native
    def ServerResponse: Instantiable1[
        /* req */ typings.node.httpMod.IncomingMessage, 
        typings.node.httpMod.ServerResponse
      ] = js.native
    @scala.inline
    def ServerResponse_=(
      x: Instantiable1[
          /* req */ typings.node.httpMod.IncomingMessage, 
          typings.node.httpMod.ServerResponse
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ServerResponse")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def Server_=(x: Instantiable0[typings.node.httpMod.Server]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Server")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def createServer(): typings.node.httpMod.Server = ^.asInstanceOf[js.Dynamic].applyDynamic("createServer")().asInstanceOf[typings.node.httpMod.Server]
    @JSImport("follow-redirects", "http.createServer")
    @js.native
    def createServer_Fhttp: js.Function0[typings.node.httpMod.Server] = js.native
    
    @scala.inline
    def createServer_Fhttp_=(x: js.Function0[typings.node.httpMod.Server]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("createServer")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def get(options: RequestOptions & FollowOptions[RequestOptions]): RedirectableRequest[typings.node.httpMod.ClientRequest, typings.node.httpMod.IncomingMessage] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(options.asInstanceOf[js.Any]).asInstanceOf[RedirectableRequest[typings.node.httpMod.ClientRequest, typings.node.httpMod.IncomingMessage]]
    @scala.inline
    def get(
      options: RequestOptions & FollowOptions[RequestOptions],
      callback: js.Function1[/* res */ typings.node.httpMod.IncomingMessage & FollowResponse, Unit]
    ): RedirectableRequest[typings.node.httpMod.ClientRequest, typings.node.httpMod.IncomingMessage] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[RedirectableRequest[typings.node.httpMod.ClientRequest, typings.node.httpMod.IncomingMessage]]
    @scala.inline
    def get(options: String): RedirectableRequest[typings.node.httpMod.ClientRequest, typings.node.httpMod.IncomingMessage] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(options.asInstanceOf[js.Any]).asInstanceOf[RedirectableRequest[typings.node.httpMod.ClientRequest, typings.node.httpMod.IncomingMessage]]
    @scala.inline
    def get(
      options: String,
      callback: js.Function1[/* res */ typings.node.httpMod.IncomingMessage & FollowResponse, Unit]
    ): RedirectableRequest[typings.node.httpMod.ClientRequest, typings.node.httpMod.IncomingMessage] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[RedirectableRequest[typings.node.httpMod.ClientRequest, typings.node.httpMod.IncomingMessage]]
    
    @JSImport("follow-redirects", "http.globalAgent")
    @js.native
    def globalAgent: typings.node.httpMod.Agent = js.native
    @scala.inline
    def globalAgent_=(x: typings.node.httpMod.Agent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("globalAgent")(x.asInstanceOf[js.Any])
    
    @JSImport("follow-redirects", "http.maxHeaderSize")
    @js.native
    def maxHeaderSize: Double = js.native
    @scala.inline
    def maxHeaderSize_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("maxHeaderSize")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def request(options: RequestOptions & FollowOptions[RequestOptions]): RedirectableRequest[typings.node.httpMod.ClientRequest, typings.node.httpMod.IncomingMessage] = ^.asInstanceOf[js.Dynamic].applyDynamic("request")(options.asInstanceOf[js.Any]).asInstanceOf[RedirectableRequest[typings.node.httpMod.ClientRequest, typings.node.httpMod.IncomingMessage]]
    @scala.inline
    def request(
      options: RequestOptions & FollowOptions[RequestOptions],
      callback: js.Function1[/* res */ typings.node.httpMod.IncomingMessage & FollowResponse, Unit]
    ): RedirectableRequest[typings.node.httpMod.ClientRequest, typings.node.httpMod.IncomingMessage] = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[RedirectableRequest[typings.node.httpMod.ClientRequest, typings.node.httpMod.IncomingMessage]]
    @scala.inline
    def request(options: String): RedirectableRequest[typings.node.httpMod.ClientRequest, typings.node.httpMod.IncomingMessage] = ^.asInstanceOf[js.Dynamic].applyDynamic("request")(options.asInstanceOf[js.Any]).asInstanceOf[RedirectableRequest[typings.node.httpMod.ClientRequest, typings.node.httpMod.IncomingMessage]]
    @scala.inline
    def request(
      options: String,
      callback: js.Function1[/* res */ typings.node.httpMod.IncomingMessage & FollowResponse, Unit]
    ): RedirectableRequest[typings.node.httpMod.ClientRequest, typings.node.httpMod.IncomingMessage] = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[RedirectableRequest[typings.node.httpMod.ClientRequest, typings.node.httpMod.IncomingMessage]]
  }
  
  /* Inlined follow-redirects.follow-redirects.Override<{readonly request (options : node.https.RequestOptions): node.http.ClientRequest, readonly request (options : string): node.http.ClientRequest, readonly request (options : node.url.URL): node.http.ClientRequest, readonly request (options : node.https.RequestOptions, callback : (res : node.http.IncomingMessage): void): node.http.ClientRequest, readonly request (options : string, callback : (res : node.http.IncomingMessage): void): node.http.ClientRequest, readonly request (options : node.url.URL, callback : (res : node.http.IncomingMessage): void): node.http.ClientRequest, readonly request (url : string, options : node.https.RequestOptions): node.http.ClientRequest, readonly request (url : node.url.URL, options : node.https.RequestOptions): node.http.ClientRequest, readonly request (url : string, options : node.https.RequestOptions, callback : (res : node.http.IncomingMessage): void): node.http.ClientRequest, readonly request (url : node.url.URL, options : node.https.RequestOptions, callback : (res : node.http.IncomingMessage): void): node.http.ClientRequest, readonly get (options : node.https.RequestOptions): node.http.ClientRequest, readonly get (options : string): node.http.ClientRequest, readonly get (options : node.url.URL): node.http.ClientRequest, readonly get (options : node.https.RequestOptions, callback : (res : node.http.IncomingMessage): void): node.http.ClientRequest, readonly get (options : string, callback : (res : node.http.IncomingMessage): void): node.http.ClientRequest, readonly get (options : node.url.URL, callback : (res : node.http.IncomingMessage): void): node.http.ClientRequest, readonly get (url : string, options : node.https.RequestOptions): node.http.ClientRequest, readonly get (url : node.url.URL, options : node.https.RequestOptions): node.http.ClientRequest, readonly get (url : string, options : node.https.RequestOptions, callback : (res : node.http.IncomingMessage): void): node.http.ClientRequest, readonly get (url : node.url.URL, options : node.https.RequestOptions, callback : (res : node.http.IncomingMessage): void): node.http.ClientRequest, readonly createServer (): node.https.Server, readonly createServer (requestListener : node.http.RequestListener): node.https.Server, readonly createServer (options : node.https.ServerOptions): node.https.Server, readonly createServer (options : node.https.ServerOptions, requestListener : node.http.RequestListener): node.https.Server,   Agent :new (): node.https.Agent,   Server :new (): node.https.Server,   globalAgent :node.https.Agent}, follow-redirects.follow-redirects.RedirectScheme<node.https.RequestOptions, node.http.ClientRequest, node.http.IncomingMessage>> */
  object https {
    
    @JSImport("follow-redirects", "https")
    @js.native
    val ^ : js.Any = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("follow-redirects", "https.Agent")
    @js.native
    class Agent ()
      extends typings.node.httpsMod.Agent
    @JSImport("follow-redirects", "https.Agent")
    @js.native
    def Agent: Instantiable0[typings.node.httpsMod.Agent] = js.native
    @scala.inline
    def Agent_=(x: Instantiable0[typings.node.httpsMod.Agent]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Agent")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("follow-redirects", "https.Server")
    @js.native
    class Server ()
      extends typings.node.httpsMod.Server
    @JSImport("follow-redirects", "https.Server")
    @js.native
    def Server: Instantiable0[typings.node.httpsMod.Server] = js.native
    @scala.inline
    def Server_=(x: Instantiable0[typings.node.httpsMod.Server]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Server")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def createServer(): typings.node.httpsMod.Server = ^.asInstanceOf[js.Dynamic].applyDynamic("createServer")().asInstanceOf[typings.node.httpsMod.Server]
    @JSImport("follow-redirects", "https.createServer")
    @js.native
    def createServer_Fhttps: js.Function0[typings.node.httpsMod.Server] = js.native
    
    @scala.inline
    def createServer_Fhttps_=(x: js.Function0[typings.node.httpsMod.Server]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("createServer")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def get(
      options: typings.node.httpsMod.RequestOptions & FollowOptions[typings.node.httpsMod.RequestOptions]
    ): RedirectableRequest[ClientRequest, IncomingMessage] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(options.asInstanceOf[js.Any]).asInstanceOf[RedirectableRequest[ClientRequest, IncomingMessage]]
    @scala.inline
    def get(
      options: typings.node.httpsMod.RequestOptions & FollowOptions[typings.node.httpsMod.RequestOptions],
      callback: js.Function1[/* res */ IncomingMessage & FollowResponse, Unit]
    ): RedirectableRequest[ClientRequest, IncomingMessage] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[RedirectableRequest[ClientRequest, IncomingMessage]]
    @scala.inline
    def get(options: String): RedirectableRequest[ClientRequest, IncomingMessage] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(options.asInstanceOf[js.Any]).asInstanceOf[RedirectableRequest[ClientRequest, IncomingMessage]]
    @scala.inline
    def get(options: String, callback: js.Function1[/* res */ IncomingMessage & FollowResponse, Unit]): RedirectableRequest[ClientRequest, IncomingMessage] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[RedirectableRequest[ClientRequest, IncomingMessage]]
    
    @JSImport("follow-redirects", "https.globalAgent")
    @js.native
    def globalAgent: typings.node.httpsMod.Agent = js.native
    @scala.inline
    def globalAgent_=(x: typings.node.httpsMod.Agent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("globalAgent")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def request(
      options: typings.node.httpsMod.RequestOptions & FollowOptions[typings.node.httpsMod.RequestOptions]
    ): RedirectableRequest[ClientRequest, IncomingMessage] = ^.asInstanceOf[js.Dynamic].applyDynamic("request")(options.asInstanceOf[js.Any]).asInstanceOf[RedirectableRequest[ClientRequest, IncomingMessage]]
    @scala.inline
    def request(
      options: typings.node.httpsMod.RequestOptions & FollowOptions[typings.node.httpsMod.RequestOptions],
      callback: js.Function1[/* res */ IncomingMessage & FollowResponse, Unit]
    ): RedirectableRequest[ClientRequest, IncomingMessage] = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[RedirectableRequest[ClientRequest, IncomingMessage]]
    @scala.inline
    def request(options: String): RedirectableRequest[ClientRequest, IncomingMessage] = ^.asInstanceOf[js.Dynamic].applyDynamic("request")(options.asInstanceOf[js.Any]).asInstanceOf[RedirectableRequest[ClientRequest, IncomingMessage]]
    @scala.inline
    def request(options: String, callback: js.Function1[/* res */ IncomingMessage & FollowResponse, Unit]): RedirectableRequest[ClientRequest, IncomingMessage] = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[RedirectableRequest[ClientRequest, IncomingMessage]]
  }
  
  @scala.inline
  def wrap[T /* <: StringDictionary[Scheme[js.Any, js.Any, js.Any]] */](protocols: T): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]: follow-redirects.follow-redirects.WrappedScheme<T[K]>}
    */ typings.followRedirects.followRedirectsStrings.wrap & TopLevel[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(protocols.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]: follow-redirects.follow-redirects.WrappedScheme<T[K]>}
    */ typings.followRedirects.followRedirectsStrings.wrap & TopLevel[T]]
  
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
    
    @scala.inline
    def apply[Options](): FollowOptions[Options] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FollowOptions[Options]]
    }
    
    @scala.inline
    implicit class FollowOptionsMutableBuilder[Self <: FollowOptions[?], Options] (val x: Self & FollowOptions[Options]) extends AnyVal {
      
      @scala.inline
      def setAgents(value: Http): Self = StObject.set(x, "agents", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAgentsUndefined: Self = StObject.set(x, "agents", js.undefined)
      
      @scala.inline
      def setBeforeRedirect(
        value: (/* options */ Options & FollowOptions[Options], /* responseDetails */ ResponseDetails) => Unit
      ): Self = StObject.set(x, "beforeRedirect", js.Any.fromFunction2(value))
      
      @scala.inline
      def setBeforeRedirectUndefined: Self = StObject.set(x, "beforeRedirect", js.undefined)
      
      @scala.inline
      def setFollowRedirects(value: Boolean): Self = StObject.set(x, "followRedirects", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFollowRedirectsUndefined: Self = StObject.set(x, "followRedirects", js.undefined)
      
      @scala.inline
      def setMaxBodyLength(value: Double): Self = StObject.set(x, "maxBodyLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxBodyLengthUndefined: Self = StObject.set(x, "maxBodyLength", js.undefined)
      
      @scala.inline
      def setMaxRedirects(value: Double): Self = StObject.set(x, "maxRedirects", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxRedirectsUndefined: Self = StObject.set(x, "maxRedirects", js.undefined)
      
      @scala.inline
      def setTrackRedirects(value: Boolean): Self = StObject.set(x, "trackRedirects", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrackRedirectsUndefined: Self = StObject.set(x, "trackRedirects", js.undefined)
    }
  }
  
  trait FollowResponse extends StObject {
    
    var redirects: js.Array[Redirect]
    
    var responseUrl: String
  }
  object FollowResponse {
    
    @scala.inline
    def apply(redirects: js.Array[Redirect], responseUrl: String): FollowResponse = {
      val __obj = js.Dynamic.literal(redirects = redirects.asInstanceOf[js.Any], responseUrl = responseUrl.asInstanceOf[js.Any])
      __obj.asInstanceOf[FollowResponse]
    }
    
    @scala.inline
    implicit class FollowResponseMutableBuilder[Self <: FollowResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRedirects(value: js.Array[Redirect]): Self = StObject.set(x, "redirects", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRedirectsVarargs(value: Redirect*): Self = StObject.set(x, "redirects", js.Array(value :_*))
      
      @scala.inline
      def setResponseUrl(value: String): Self = StObject.set(x, "responseUrl", value.asInstanceOf[js.Any])
    }
  }
  
  type Override[T, U] = (Pick[T, Exclude[/* keyof T */ String, /* keyof U */ String]]) & U
  
  trait Redirect extends StObject {
    
    var headers: IncomingHttpHeaders
    
    var statusCode: Double
    
    var url: String
  }
  object Redirect {
    
    @scala.inline
    def apply(headers: IncomingHttpHeaders, statusCode: Double, url: String): Redirect = {
      val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Redirect]
    }
    
    @scala.inline
    implicit class RedirectMutableBuilder[Self <: Redirect] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeaders(value: IncomingHttpHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RedirectScheme[Options, Request /* <: WrappableRequest */, Response] extends StObject {
    
    def get(options: Options & FollowOptions[Options]): RedirectableRequest[Request, Response] = js.native
    def get(
      options: Options & FollowOptions[Options],
      callback: js.Function1[/* res */ Response & FollowResponse, Unit]
    ): RedirectableRequest[Request, Response] = js.native
    def get(options: String): RedirectableRequest[Request, Response] = js.native
    def get(options: String, callback: js.Function1[/* res */ Response & FollowResponse, Unit]): RedirectableRequest[Request, Response] = js.native
    
    def request(options: Options & FollowOptions[Options]): RedirectableRequest[Request, Response] = js.native
    def request(
      options: Options & FollowOptions[Options],
      callback: js.Function1[/* res */ Response & FollowResponse, Unit]
    ): RedirectableRequest[Request, Response] = js.native
    def request(options: String): RedirectableRequest[Request, Response] = js.native
    def request(options: String, callback: js.Function1[/* res */ Response & FollowResponse, Unit]): RedirectableRequest[Request, Response] = js.native
  }
  
  @js.native
  trait RedirectableRequest[Request /* <: WrappableRequest */, Response] extends Writable {
    
    var abort: /* import warning: importer.ImportType#apply Failed type conversion: Request['abort'] */ js.Any = js.native
    
    @JSName("addListener")
    def addListener_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_response(event: response, listener: js.Function1[/* response */ Response, Unit]): this.type = js.native
    
    @JSName("emit")
    def emit_error(event: error, err: Error): Boolean = js.native
    @JSName("emit")
    def emit_response(event: response, response: Response): Boolean = js.native
    
    var flushHeaders: /* import warning: importer.ImportType#apply Failed type conversion: Request['flushHeaders'] */ js.Any = js.native
    
    var getHeader: /* import warning: importer.ImportType#apply Failed type conversion: Request['getHeader'] */ js.Any = js.native
    
    @JSName("on")
    def on_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
    @JSName("on")
    def on_response(event: response, listener: js.Function1[/* response */ Response, Unit]): this.type = js.native
    
    @JSName("once")
    def once_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
    @JSName("once")
    def once_response(event: response, listener: js.Function1[/* response */ Response, Unit]): this.type = js.native
    
    @JSName("prependListener")
    def prependListener_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_response(event: response, listener: js.Function1[/* response */ Response, Unit]): this.type = js.native
    
    @JSName("prependOnceListener")
    def prependOnceListener_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
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
    
    @scala.inline
    def apply(headers: IncomingHttpHeaders): ResponseDetails = {
      val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResponseDetails]
    }
    
    @scala.inline
    implicit class ResponseDetailsMutableBuilder[Self <: ResponseDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeaders(value: IncomingHttpHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Scheme[Options, Request /* <: WrappableRequest */, Response] extends StObject {
    
    def request(options: Options): Request = js.native
    def request(options: Options, callback: js.Function1[/* res */ Response, js.Any]): Request = js.native
  }
  
  trait WrappableRequest extends StObject {
    
    var abort: js.UndefOr[js.Function1[/* repeated */ js.Any, js.Any]] = js.undefined
    
    var flushHeaders: js.UndefOr[js.Function1[/* repeated */ js.Any, js.Any]] = js.undefined
    
    var getHeader: js.UndefOr[js.Function1[/* repeated */ js.Any, js.Any]] = js.undefined
    
    def removeHeader(args: js.Any*): js.Any
    
    def setHeader(args: js.Any*): js.Any
    
    var setNoDelay: js.UndefOr[js.Function1[/* repeated */ js.Any, js.Any]] = js.undefined
    
    var setSocketKeepAlive: js.UndefOr[js.Function1[/* repeated */ js.Any, js.Any]] = js.undefined
    
    var setTimeout: js.UndefOr[js.Function1[/* repeated */ js.Any, js.Any]] = js.undefined
  }
  object WrappableRequest {
    
    @scala.inline
    def apply(removeHeader: /* repeated */ js.Any => js.Any, setHeader: /* repeated */ js.Any => js.Any): WrappableRequest = {
      val __obj = js.Dynamic.literal(removeHeader = js.Any.fromFunction1(removeHeader), setHeader = js.Any.fromFunction1(setHeader))
      __obj.asInstanceOf[WrappableRequest]
    }
    
    @scala.inline
    implicit class WrappableRequestMutableBuilder[Self <: WrappableRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAbort(value: /* repeated */ js.Any => js.Any): Self = StObject.set(x, "abort", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAbortUndefined: Self = StObject.set(x, "abort", js.undefined)
      
      @scala.inline
      def setFlushHeaders(value: /* repeated */ js.Any => js.Any): Self = StObject.set(x, "flushHeaders", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFlushHeadersUndefined: Self = StObject.set(x, "flushHeaders", js.undefined)
      
      @scala.inline
      def setGetHeader(value: /* repeated */ js.Any => js.Any): Self = StObject.set(x, "getHeader", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetHeaderUndefined: Self = StObject.set(x, "getHeader", js.undefined)
      
      @scala.inline
      def setRemoveHeader(value: /* repeated */ js.Any => js.Any): Self = StObject.set(x, "removeHeader", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetHeader(value: /* repeated */ js.Any => js.Any): Self = StObject.set(x, "setHeader", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetNoDelay(value: /* repeated */ js.Any => js.Any): Self = StObject.set(x, "setNoDelay", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetNoDelayUndefined: Self = StObject.set(x, "setNoDelay", js.undefined)
      
      @scala.inline
      def setSetSocketKeepAlive(value: /* repeated */ js.Any => js.Any): Self = StObject.set(x, "setSocketKeepAlive", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetSocketKeepAliveUndefined: Self = StObject.set(x, "setSocketKeepAlive", js.undefined)
      
      @scala.inline
      def setSetTimeout(value: /* repeated */ js.Any => js.Any): Self = StObject.set(x, "setTimeout", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetTimeoutUndefined: Self = StObject.set(x, "setTimeout", js.undefined)
    }
  }
  
  trait WrappableResponse extends StObject {
    
    def destroy(): js.Any
    
    var headers: Location
    
    var statusCode: js.UndefOr[Double] = js.undefined
  }
  object WrappableResponse {
    
    @scala.inline
    def apply(destroy: () => js.Any, headers: Location): WrappableResponse = {
      val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), headers = headers.asInstanceOf[js.Any])
      __obj.asInstanceOf[WrappableResponse]
    }
    
    @scala.inline
    implicit class WrappableResponseMutableBuilder[Self <: WrappableResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDestroy(value: () => js.Any): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      @scala.inline
      def setHeaders(value: Location): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusCodeUndefined: Self = StObject.set(x, "statusCode", js.undefined)
    }
  }
  
  type WrappedScheme[T /* <: Scheme[js.Any, js.Any, js.Any] */] = Override[T, RedirectScheme[js.Any, js.Any, js.Any]]
}
