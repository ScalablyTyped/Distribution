package typings.engineIo

import org.scalablytyped.runtime.StringDictionary
import typings.engineIo.engineIoStrings.close
import typings.engineIo.engineIoStrings.closed
import typings.engineIo.engineIoStrings.closing
import typings.engineIo.engineIoStrings.connection
import typings.engineIo.engineIoStrings.drain
import typings.engineIo.engineIoStrings.error
import typings.engineIo.engineIoStrings.flush
import typings.engineIo.engineIoStrings.message
import typings.engineIo.engineIoStrings.open
import typings.engineIo.engineIoStrings.opening
import typings.engineIo.engineIoStrings.packet
import typings.engineIo.engineIoStrings.packetCreate
import typings.engineIo.engineIoStrings.uws
import typings.engineIo.engineIoStrings.ws
import typings.node.Buffer
import typings.node.eventsMod.EventEmitter
import typings.node.eventsMod.EventEmitterOptions
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import typings.std.ArrayBuffer
import typings.std.ArrayBufferView
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): Server = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Server]
  inline def apply(httpServer: Unit, opts: ServerOptions): Server = (^.asInstanceOf[js.Dynamic].apply(httpServer.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Server]
  inline def apply(httpServer: typings.node.netMod.Server): Server = ^.asInstanceOf[js.Dynamic].apply(httpServer.asInstanceOf[js.Any]).asInstanceOf[Server]
  inline def apply(httpServer: typings.node.netMod.Server, opts: ServerOptions): Server = (^.asInstanceOf[js.Dynamic].apply(httpServer.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Server]
  
  @JSImport("engine.io", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * The main server/manager. Inherits from EventEmitter.
    */
  @JSImport("engine.io", "Server")
  @js.native
  /**
    * Initializes the server
    */
  class Server () extends EventEmitter {
    def this(opts: ServerOptions) = this()
    
    /**
      * Attach this Server instance to an http.Server
      * Captures upgrade requests for a http.Server. In other words, makes a regular http.Server WebSocket-compatible.
      */
    def attach(http: typings.node.httpMod.Server): this.type = js.native
    def attach(http: typings.node.httpMod.Server, opts: AttachOptions): this.type = js.native
    
    /**
      * hash of connected clients by id.
      */
    var clients: StringDictionary[Socket] = js.native
    
    /**
      * number of connected clients.
      */
    var clientsCount: Double = js.native
    
    /**
      * Closes all clients
      */
    def close(): this.type = js.native
    
    /**
      * Generate a socket id.
      * Overwrite this method to generate your custom socket id.
      */
    def generateId(req: IncomingMessage): String = js.native
    
    /**
      * Called internally when a Engine request is intercepted.
      */
    def handleRequest(req: IncomingMessage, res: ServerResponse): this.type = js.native
    
    /**
      * Called internally when a Engine ws upgrade is intercepted.
      */
    def handleUpgrade(req: IncomingMessage, socket: typings.node.netMod.Socket, head: Buffer): this.type = js.native
    
    val httpServer: js.UndefOr[typings.node.httpMod.Server] = js.native
    
    /**
      * Fired when a new connection is established.
      */
    @JSName("on")
    def on_connection(ev: connection, fn: js.Function1[/* socket */ Socket, Unit]): this.type = js.native
    @JSName("on")
    def on_drain(ev: drain, fn: js.Function1[/* socket */ Socket, Unit]): this.type = js.native
    @JSName("on")
    def on_flush(ev: flush, fn: js.Function2[/* socket */ Socket, /* buffer */ js.Array[Packet], Unit]): this.type = js.native
  }
  
  /**
    * A representation of a client. Inherits from EventEmitter.
    */
  @JSImport("engine.io", "Socket")
  @js.native
  class Socket () extends EventEmitter {
    def this(options: EventEmitterOptions) = this()
    
    /**
      * Disconnects the client
      */
    def close(): this.type = js.native
    
    /**
      * unique identifier
      */
    var id: String = js.native
    
    /**
      * Fired when the client is disconnected.
      */
    @JSName("on")
    def on_close(ev: close, fn: js.Function2[/* reason */ String, /* description */ js.UndefOr[Error], Unit]): this.type = js.native
    /**
      * Called when the write buffer is drained
      */
    @JSName("on")
    def on_drain(ev: drain, fn: js.Function0[Unit]): this.type = js.native
    /**
      * Fired when an error occurs.
      */
    @JSName("on")
    def on_error(ev: error, fn: js.Function1[/* err */ Error, Unit]): this.type = js.native
    /**
      * Called when the write buffer is being flushed.
      */
    @JSName("on")
    def on_flush(ev: flush, fn: js.Function1[/* buffer */ js.Array[Packet], Unit]): this.type = js.native
    /**
      * Fired when the client sends a message.
      */
    @JSName("on")
    def on_message(ev: message, fn: js.Function1[/* data */ String | Buffer, Unit]): this.type = js.native
    /**
      * packet: Called when a socket received a packet (message, ping)
      * packetCreate: Called before a socket sends a packet (message, pong)
      */
    @JSName("on")
    def on_packet(ev: packet, fn: js.Function1[/* packet */ Packet, Unit]): this.type = js.native
    @JSName("on")
    def on_packetCreate(ev: packetCreate, fn: js.Function1[/* packet */ Packet, Unit]): this.type = js.native
    
    /**
      * readyState
      */
    var readyState: opening | open | closing | closed = js.native
    
    /**
      * request that originated the Socket
      */
    var request: IncomingMessage = js.native
    
    /**
      * Sends a message, performing message = toString(arguments[0]) unless sending binary data, which is sent as is.
      */
    def send(message: Message): Unit = js.native
    def send(message: Message, opts: Unit, fn: js.Function1[/* transport */ js.Any, Unit]): Unit = js.native
    def send(message: Message, opts: MessageOptions): Unit = js.native
    def send(message: Message, opts: MessageOptions, fn: js.Function1[/* transport */ js.Any, Unit]): Unit = js.native
    
    /**
      * engine parent reference
      */
    var server: Server = js.native
    
    /**
      * whether the transport has been upgraded
      */
    var upgraded: Boolean = js.native
  }
  
  inline def attach(http: typings.node.netMod.Server): Server = ^.asInstanceOf[js.Dynamic].applyDynamic("attach")(http.asInstanceOf[js.Any]).asInstanceOf[Server]
  inline def attach(http: typings.node.netMod.Server, opts: ServerAttachOptions): Server = (^.asInstanceOf[js.Dynamic].applyDynamic("attach")(http.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Server]
  
  inline def listen(port: Double): Server = ^.asInstanceOf[js.Dynamic].applyDynamic("listen")(port.asInstanceOf[js.Any]).asInstanceOf[Server]
  inline def listen(port: Double, opts: Unit, fn: js.Function0[Unit]): Server = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(port.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Server]
  inline def listen(port: Double, opts: ServerOptions): Server = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(port.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Server]
  inline def listen(port: Double, opts: ServerOptions, fn: js.Function0[Unit]): Server = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(port.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Server]
  
  @JSImport("engine.io", "protocol")
  @js.native
  val protocol: Double = js.native
  
  type AllowRequestFunction = js.Function2[
    /* req */ IncomingMessage, 
    /* fn */ js.Function2[/* err */ js.UndefOr[String | Null], /* success */ Boolean, Unit], 
    Unit
  ]
  
  trait AttachOptions extends StObject {
    
    /**
      * destroy unhandled upgrade requests (true)
      */
    var destroyUpgrade: js.UndefOr[Boolean] = js.undefined
    
    /**
      * milliseconds after which unhandled requests are ended (1000)
      */
    var destroyUpgradeTimeout: js.UndefOr[Double] = js.undefined
    
    /**
      * whether to let engine.io handle the OPTIONS requests. You can also pass a custom function to handle the requests (true)
      */
    var handlePreflightRequest: js.UndefOr[
        Boolean | (js.Function3[/* server */ Server, /* req */ IncomingMessage, /* res */ ServerResponse, Unit])
      ] = js.undefined
    
    /**
      * name of the path to capture (/engine.io).
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
      
      inline def setHandlePreflightRequest(
        value: Boolean | (js.Function3[/* server */ Server, /* req */ IncomingMessage, /* res */ ServerResponse, Unit])
      ): Self = StObject.set(x, "handlePreflightRequest", value.asInstanceOf[js.Any])
      
      inline def setHandlePreflightRequestFunction3(value: (/* server */ Server, /* req */ IncomingMessage, /* res */ ServerResponse) => Unit): Self = StObject.set(x, "handlePreflightRequest", js.Any.fromFunction3(value))
      
      inline def setHandlePreflightRequestUndefined: Self = StObject.set(x, "handlePreflightRequest", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    }
  }
  
  type Message = String | Buffer | ArrayBuffer | ArrayBufferView
  
  trait MessageOptions extends StObject {
    
    var compress: js.UndefOr[Boolean] = js.undefined
  }
  object MessageOptions {
    
    inline def apply(): MessageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MessageOptions]
    }
    
    extension [Self <: MessageOptions](x: Self) {
      
      inline def setCompress(value: Boolean): Self = StObject.set(x, "compress", value.asInstanceOf[js.Any])
      
      inline def setCompressUndefined: Self = StObject.set(x, "compress", js.undefined)
    }
  }
  
  trait Packet extends StObject {
    
    var data: js.UndefOr[Message] = js.undefined
    
    var options: js.UndefOr[MessageOptions] = js.undefined
    
    var `type`: String
  }
  object Packet {
    
    inline def apply(`type`: String): Packet = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Packet]
    }
    
    extension [Self <: Packet](x: Self) {
      
      inline def setData(value: Message): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setOptions(value: MessageOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait ServerAttachOptions
    extends StObject
       with ServerOptions
       with AttachOptions
  object ServerAttachOptions {
    
    inline def apply(): ServerAttachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ServerAttachOptions]
    }
  }
  
  trait ServerOptions extends StObject {
    
    /**
      * A function that receives a given handshake or upgrade request as its first parameter,
      * and can decide whether to continue or not. The second argument is a function that needs
      * to be called with the decided information: fn(err, success), where success is a boolean
      * value where false means that the request is rejected, and err is an error code.
      */
    var allowRequest: js.UndefOr[AllowRequestFunction] = js.undefined
    
    /**
      * whether to allow transport upgrades (true)
      */
    var allowUpgrades: js.UndefOr[Boolean] = js.undefined
    
    /**
      * name of the HTTP cookie that contains the client sid to send as part of handshake response headers. Set to false to not send one. (io)
      */
    var cookie: js.UndefOr[String | Boolean] = js.undefined
    
    /**
      * If true HttpOnly io cookie cannot be accessed by client-side APIs,
      * such as JavaScript. (true) This option has no effect
      * if cookie or cookiePath is set to false.
      */
    var cookieHttpOnly: js.UndefOr[Boolean] = js.undefined
    
    /**
      * path of the above cookie option. If false, no path will be sent,
      * which means browsers will only send the cookie on the engine.io
      * attached path (/engine.io). Set false to not save io cookie
      * on all requests. (/)
      */
    var cookiePath: js.UndefOr[String | Boolean] = js.undefined
    
    /**
      * parameters of the http compression for the polling transports (see zlib api docs). Set to false to disable. (true)
      */
    var httpCompression: js.UndefOr[js.Any] = js.undefined
    
    /**
      * an optional packet which will be concatenated to the handshake packet emitted by Engine.IO.
      */
    var initialPacket: js.UndefOr[Message] = js.undefined
    
    /**
      * how many bytes or characters a message can be, before closing the session (to avoid DoS). Default value is 10E6.
      */
    var maxHttpBufferSize: js.UndefOr[Double] = js.undefined
    
    /**
      * parameters of the WebSocket permessage-deflate extension (see ws module api docs). Set to false to disable. (true)
      */
    var perMessageDeflate: js.UndefOr[js.Any] = js.undefined
    
    /**
      * how many ms before sending a new ping packet (25000)
      */
    var pingInterval: js.UndefOr[Double] = js.undefined
    
    /**
      * how many ms without a pong packet to consider the connection closed (5000)
      */
    var pingTimeout: js.UndefOr[Double] = js.undefined
    
    /**
      * to allow connections to (['polling', 'websocket'])
      */
    var transports: js.UndefOr[js.Array[Transport]] = js.undefined
    
    /**
      * how many ms before an uncompleted transport upgrade is cancelled (10000)
      */
    var upgradeTimeout: js.UndefOr[Double] = js.undefined
    
    /**
      * what WebSocket server implementation to use. Specified module must
      * conform to the ws interface (see ws module api docs). Default value is ws.
      * An alternative c++ addon is also available by installing uws module.
      */
    var wsEngine: js.UndefOr[ws | uws] = js.undefined
  }
  object ServerOptions {
    
    inline def apply(): ServerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ServerOptions]
    }
    
    extension [Self <: ServerOptions](x: Self) {
      
      inline def setAllowRequest(
        value: (/* req */ IncomingMessage, /* fn */ js.Function2[/* err */ js.UndefOr[String | Null], /* success */ Boolean, Unit]) => Unit
      ): Self = StObject.set(x, "allowRequest", js.Any.fromFunction2(value))
      
      inline def setAllowRequestUndefined: Self = StObject.set(x, "allowRequest", js.undefined)
      
      inline def setAllowUpgrades(value: Boolean): Self = StObject.set(x, "allowUpgrades", value.asInstanceOf[js.Any])
      
      inline def setAllowUpgradesUndefined: Self = StObject.set(x, "allowUpgrades", js.undefined)
      
      inline def setCookie(value: String | Boolean): Self = StObject.set(x, "cookie", value.asInstanceOf[js.Any])
      
      inline def setCookieHttpOnly(value: Boolean): Self = StObject.set(x, "cookieHttpOnly", value.asInstanceOf[js.Any])
      
      inline def setCookieHttpOnlyUndefined: Self = StObject.set(x, "cookieHttpOnly", js.undefined)
      
      inline def setCookiePath(value: String | Boolean): Self = StObject.set(x, "cookiePath", value.asInstanceOf[js.Any])
      
      inline def setCookiePathUndefined: Self = StObject.set(x, "cookiePath", js.undefined)
      
      inline def setCookieUndefined: Self = StObject.set(x, "cookie", js.undefined)
      
      inline def setHttpCompression(value: js.Any): Self = StObject.set(x, "httpCompression", value.asInstanceOf[js.Any])
      
      inline def setHttpCompressionUndefined: Self = StObject.set(x, "httpCompression", js.undefined)
      
      inline def setInitialPacket(value: Message): Self = StObject.set(x, "initialPacket", value.asInstanceOf[js.Any])
      
      inline def setInitialPacketUndefined: Self = StObject.set(x, "initialPacket", js.undefined)
      
      inline def setMaxHttpBufferSize(value: Double): Self = StObject.set(x, "maxHttpBufferSize", value.asInstanceOf[js.Any])
      
      inline def setMaxHttpBufferSizeUndefined: Self = StObject.set(x, "maxHttpBufferSize", js.undefined)
      
      inline def setPerMessageDeflate(value: js.Any): Self = StObject.set(x, "perMessageDeflate", value.asInstanceOf[js.Any])
      
      inline def setPerMessageDeflateUndefined: Self = StObject.set(x, "perMessageDeflate", js.undefined)
      
      inline def setPingInterval(value: Double): Self = StObject.set(x, "pingInterval", value.asInstanceOf[js.Any])
      
      inline def setPingIntervalUndefined: Self = StObject.set(x, "pingInterval", js.undefined)
      
      inline def setPingTimeout(value: Double): Self = StObject.set(x, "pingTimeout", value.asInstanceOf[js.Any])
      
      inline def setPingTimeoutUndefined: Self = StObject.set(x, "pingTimeout", js.undefined)
      
      inline def setTransports(value: js.Array[Transport]): Self = StObject.set(x, "transports", value.asInstanceOf[js.Any])
      
      inline def setTransportsUndefined: Self = StObject.set(x, "transports", js.undefined)
      
      inline def setTransportsVarargs(value: Transport*): Self = StObject.set(x, "transports", js.Array(value :_*))
      
      inline def setUpgradeTimeout(value: Double): Self = StObject.set(x, "upgradeTimeout", value.asInstanceOf[js.Any])
      
      inline def setUpgradeTimeoutUndefined: Self = StObject.set(x, "upgradeTimeout", js.undefined)
      
      inline def setWsEngine(value: ws | uws): Self = StObject.set(x, "wsEngine", value.asInstanceOf[js.Any])
      
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
