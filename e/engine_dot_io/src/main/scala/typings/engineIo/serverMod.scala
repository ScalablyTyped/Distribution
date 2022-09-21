package typings.engineIo

import org.scalablytyped.runtime.Instantiable1
import typings.cors.mod.CorsOptions
import typings.cors.mod.CorsOptionsDelegate
import typings.cors.mod.CorsRequest
import typings.engineIo.anon.BADHANDSHAKEMETHOD
import typings.engineIo.anon.CookieSerializeOptionsnam
import typings.engineIo.anon.`0`
import typings.node.eventsMod.EventEmitter
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import typings.node.nodeNetMod.Socket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serverMod {
  
  @JSImport("engine.io/build/server", "BaseServer")
  @js.native
  /**
    * Server constructor.
    *
    * @param {Object} opts - options
    * @api public
    */
  abstract class BaseServer () extends EventEmitter {
    def this(opts: ServerOptions) = this()
    
    /* protected */ def cleanup(): Any = js.native
    
    /* protected */ var clients: Any = js.native
    
    /* private */ var clientsCount: Any = js.native
    
    /**
      * Closes all clients.
      *
      * @api public
      */
    def close(): this.type = js.native
    
    /* protected */ var corsMiddleware: js.Function = js.native
    
    /* protected */ def createTransport(transportName: Any, req: Any): Any = js.native
    
    /**
      * generate a socket id.
      * Overwrite this method to generate your custom socket id
      *
      * @param {Object} request object
      * @api public
      */
    def generateId(req: Any): Any = js.native
    
    /**
      * Handshakes a new client.
      *
      * @param {String} transport name
      * @param {Object} request object
      * @param {Function} closeConnection
      *
      * @api protected
      */
    /* protected */ def handshake(transportName: Any, req: Any, closeConnection: Any): js.Promise[Any] = js.native
    
    /* protected */ def init(): Any = js.native
    
    var opts: ServerOptions = js.native
    
    /**
      * Returns a list of available transports for upgrade given a certain transport.
      *
      * @return {Array}
      * @api public
      */
    def upgrades(transport: Any): Any = js.native
    
    /**
      * Verifies a request.
      *
      * @param {http.IncomingMessage}
      * @return {Boolean} whether the request is valid
      * @api private
      */
    /* protected */ def verify(req: Any, upgrade: Any, fn: Any): Any = js.native
  }
  /* static members */
  object BaseServer {
    
    @JSImport("engine.io/build/server", "BaseServer")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("engine.io/build/server", "BaseServer.errorMessages")
    @js.native
    def errorMessages: `0` = js.native
    inline def errorMessages_=(x: `0`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("errorMessages")(x.asInstanceOf[js.Any])
    
    /**
      * Protocol errors mappings.
      */
    @JSImport("engine.io/build/server", "BaseServer.errors")
    @js.native
    def errors: BADHANDSHAKEMETHOD = js.native
    inline def errors_=(x: BADHANDSHAKEMETHOD): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("errors")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("engine.io/build/server", "Server")
  @js.native
  /**
    * Server constructor.
    *
    * @param {Object} opts - options
    * @api public
    */
  open class Server () extends BaseServer {
    def this(opts: ServerOptions) = this()
    
    /**
      * Captures upgrade requests for a http.Server.
      *
      * @param {http.Server} server
      * @param {Object} options
      * @api public
      */
    def attach(
      server: typings.node.httpMod.Server[
          Instantiable1[/* socket */ Socket, IncomingMessage], 
          Instantiable1[
            /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
            ServerResponse[IncomingMessage]
          ]
        ]
    ): Unit = js.native
    def attach(
      server: typings.node.httpMod.Server[
          Instantiable1[/* socket */ Socket, IncomingMessage], 
          Instantiable1[
            /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
            ServerResponse[IncomingMessage]
          ]
        ],
      options: AttachOptions
    ): Unit = js.native
    
    /**
      * Handles an Engine.IO HTTP request.
      *
      * @param {http.IncomingMessage} request
      * @param {http.ServerResponse|http.OutgoingMessage} response
      * @api public
      */
    def handleRequest(req: Any, res: Any): Unit = js.native
    
    /**
      * Handles an Engine.IO HTTP Upgrade.
      *
      * @api public
      */
    def handleUpgrade(req: Any, socket: Any, upgradeHead: Any): Unit = js.native
    
    var httpServer: js.UndefOr[
        typings.node.httpMod.Server[
          Instantiable1[/* socket */ Socket, IncomingMessage], 
          Instantiable1[
            /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
            ServerResponse[IncomingMessage]
          ]
        ]
      ] = js.native
    
    /**
      * Called upon a ws.io connection.
      *
      * @param {ws.Socket} websocket
      * @api private
      */
    /* private */ var onWebSocket: Any = js.native
    
    /**
      * Prepares a request by processing the query string.
      *
      * @api private
      */
    /* private */ var prepare: Any = js.native
    
    /* private */ var ws: Any = js.native
  }
  
  trait AttachOptions extends StObject {
    
    /**
      * destroy unhandled upgrade requests
      * @default true
      */
    var destroyUpgrade: js.UndefOr[Boolean] = js.undefined
    
    /**
      * milliseconds after which unhandled requests are ended
      * @default 1000
      */
    var destroyUpgradeTimeout: js.UndefOr[Double] = js.undefined
    
    /**
      * name of the path to capture
      * @default "/engine.io"
      */
    var path: js.UndefOr[String] = js.undefined
  }
  object AttachOptions {
    
    inline def apply(): AttachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AttachOptions]
    }
    
    extension [Self <: AttachOptions](x: Self) {
      
      inline def setDestroyUpgrade(value: Boolean): Self = StObject.set(x, "destroyUpgrade", value.asInstanceOf[js.Any])
      
      inline def setDestroyUpgradeTimeout(value: Double): Self = StObject.set(x, "destroyUpgradeTimeout", value.asInstanceOf[js.Any])
      
      inline def setDestroyUpgradeTimeoutUndefined: Self = StObject.set(x, "destroyUpgradeTimeout", js.undefined)
      
      inline def setDestroyUpgradeUndefined: Self = StObject.set(x, "destroyUpgrade", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    }
  }
  
  trait ServerOptions extends StObject {
    
    /**
      * whether to enable compatibility with Socket.IO v2 clients
      * @default false
      */
    var allowEIO3: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A function that receives a given handshake or upgrade request as its first parameter,
      * and can decide whether to continue or not. The second argument is a function that needs
      * to be called with the decided information: fn(err, success), where success is a boolean
      * value where false means that the request is rejected, and err is an error code.
      */
    var allowRequest: js.UndefOr[
        js.Function2[
          /* req */ IncomingMessage, 
          /* fn */ js.Function2[/* err */ js.UndefOr[String | Null], /* success */ Boolean, Unit], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * whether to allow transport upgrades
      * @default true
      */
    var allowUpgrades: js.UndefOr[Boolean] = js.undefined
    
    /**
      * configuration of the cookie that contains the client sid to send as part of handshake response headers. This cookie
      * might be used for sticky-session. Defaults to not sending any cookie.
      * @default false
      */
    var cookie: js.UndefOr[CookieSerializeOptionsnam | Boolean] = js.undefined
    
    /**
      * the options that will be forwarded to the cors module
      */
    var cors: js.UndefOr[CorsOptions | CorsOptionsDelegate[CorsRequest]] = js.undefined
    
    /**
      * parameters of the http compression for the polling transports (see zlib api docs). Set to false to disable.
      * @default true
      */
    var httpCompression: js.UndefOr[Boolean | js.Object] = js.undefined
    
    /**
      * an optional packet which will be concatenated to the handshake packet emitted by Engine.IO.
      */
    var initialPacket: js.UndefOr[Any] = js.undefined
    
    /**
      * how many bytes or characters a message can be, before closing the session (to avoid DoS).
      * @default 1e5 (100 KB)
      */
    var maxHttpBufferSize: js.UndefOr[Double] = js.undefined
    
    /**
      * parameters of the WebSocket permessage-deflate extension (see ws module api docs). Set to false to disable.
      * @default false
      */
    var perMessageDeflate: js.UndefOr[Boolean | js.Object] = js.undefined
    
    /**
      * how many ms before sending a new ping packet
      * @default 25000
      */
    var pingInterval: js.UndefOr[Double] = js.undefined
    
    /**
      * how many ms without a pong packet to consider the connection closed
      * @default 20000
      */
    var pingTimeout: js.UndefOr[Double] = js.undefined
    
    /**
      * the low-level transports that are enabled
      * @default ["polling", "websocket"]
      */
    var transports: js.UndefOr[js.Array[Transport]] = js.undefined
    
    /**
      * how many ms before an uncompleted transport upgrade is cancelled
      * @default 10000
      */
    var upgradeTimeout: js.UndefOr[Double] = js.undefined
    
    /**
      * what WebSocket server implementation to use. Specified module must
      * conform to the ws interface (see ws module api docs).
      * An alternative c++ addon is also available by installing eiows module.
      *
      * @default `require("ws").Server`
      */
    var wsEngine: js.UndefOr[Any] = js.undefined
  }
  object ServerOptions {
    
    inline def apply(): ServerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ServerOptions]
    }
    
    extension [Self <: ServerOptions](x: Self) {
      
      inline def setAllowEIO3(value: Boolean): Self = StObject.set(x, "allowEIO3", value.asInstanceOf[js.Any])
      
      inline def setAllowEIO3Undefined: Self = StObject.set(x, "allowEIO3", js.undefined)
      
      inline def setAllowRequest(
        value: (/* req */ IncomingMessage, /* fn */ js.Function2[/* err */ js.UndefOr[String | Null], /* success */ Boolean, Unit]) => Unit
      ): Self = StObject.set(x, "allowRequest", js.Any.fromFunction2(value))
      
      inline def setAllowRequestUndefined: Self = StObject.set(x, "allowRequest", js.undefined)
      
      inline def setAllowUpgrades(value: Boolean): Self = StObject.set(x, "allowUpgrades", value.asInstanceOf[js.Any])
      
      inline def setAllowUpgradesUndefined: Self = StObject.set(x, "allowUpgrades", js.undefined)
      
      inline def setCookie(value: CookieSerializeOptionsnam | Boolean): Self = StObject.set(x, "cookie", value.asInstanceOf[js.Any])
      
      inline def setCookieUndefined: Self = StObject.set(x, "cookie", js.undefined)
      
      inline def setCors(value: CorsOptions | CorsOptionsDelegate[CorsRequest]): Self = StObject.set(x, "cors", value.asInstanceOf[js.Any])
      
      inline def setCorsFunction2(
        value: (CorsRequest, /* callback */ js.Function2[/* err */ js.Error | Null, /* options */ js.UndefOr[CorsOptions], Unit]) => Unit
      ): Self = StObject.set(x, "cors", js.Any.fromFunction2(value))
      
      inline def setCorsUndefined: Self = StObject.set(x, "cors", js.undefined)
      
      inline def setHttpCompression(value: Boolean | js.Object): Self = StObject.set(x, "httpCompression", value.asInstanceOf[js.Any])
      
      inline def setHttpCompressionUndefined: Self = StObject.set(x, "httpCompression", js.undefined)
      
      inline def setInitialPacket(value: Any): Self = StObject.set(x, "initialPacket", value.asInstanceOf[js.Any])
      
      inline def setInitialPacketUndefined: Self = StObject.set(x, "initialPacket", js.undefined)
      
      inline def setMaxHttpBufferSize(value: Double): Self = StObject.set(x, "maxHttpBufferSize", value.asInstanceOf[js.Any])
      
      inline def setMaxHttpBufferSizeUndefined: Self = StObject.set(x, "maxHttpBufferSize", js.undefined)
      
      inline def setPerMessageDeflate(value: Boolean | js.Object): Self = StObject.set(x, "perMessageDeflate", value.asInstanceOf[js.Any])
      
      inline def setPerMessageDeflateUndefined: Self = StObject.set(x, "perMessageDeflate", js.undefined)
      
      inline def setPingInterval(value: Double): Self = StObject.set(x, "pingInterval", value.asInstanceOf[js.Any])
      
      inline def setPingIntervalUndefined: Self = StObject.set(x, "pingInterval", js.undefined)
      
      inline def setPingTimeout(value: Double): Self = StObject.set(x, "pingTimeout", value.asInstanceOf[js.Any])
      
      inline def setPingTimeoutUndefined: Self = StObject.set(x, "pingTimeout", js.undefined)
      
      inline def setTransports(value: js.Array[Transport]): Self = StObject.set(x, "transports", value.asInstanceOf[js.Any])
      
      inline def setTransportsUndefined: Self = StObject.set(x, "transports", js.undefined)
      
      inline def setTransportsVarargs(value: Transport*): Self = StObject.set(x, "transports", js.Array(value*))
      
      inline def setUpgradeTimeout(value: Double): Self = StObject.set(x, "upgradeTimeout", value.asInstanceOf[js.Any])
      
      inline def setUpgradeTimeoutUndefined: Self = StObject.set(x, "upgradeTimeout", js.undefined)
      
      inline def setWsEngine(value: Any): Self = StObject.set(x, "wsEngine", value.asInstanceOf[js.Any])
      
      inline def setWsEngineUndefined: Self = StObject.set(x, "wsEngine", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.engineIo.engineIoStrings.polling
    - typings.engineIo.engineIoStrings.websocket
  */
  trait Transport extends StObject
  object Transport {
    
    inline def polling: typings.engineIo.engineIoStrings.polling = "polling".asInstanceOf[typings.engineIo.engineIoStrings.polling]
    
    inline def websocket: typings.engineIo.engineIoStrings.websocket = "websocket".asInstanceOf[typings.engineIo.engineIoStrings.websocket]
  }
}
