package typings.engineIoClient

import org.scalablytyped.runtime.StringDictionary
import typings.engineIoClient.anon.PartialSocketOptions
import typings.engineIoClient.anon.Threshold
import typings.engineIoClient.transportMod.CloseDetails
import typings.socketIoComponentEmitter.mod.Emitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object socketMod {
  
  @JSImport("engine.io-client/build/esm/socket", "Socket")
  @js.native
  open class Socket protected ()
    extends Emitter[js.Object, js.Object, SocketReservedEvents] {
    /**
      * Socket constructor.
      *
      * @param {String|Object} uri or options
      * @param {Object} opts - options
      * @api public
      */
    def this(uri: Any) = this()
    def this(uri: Any, opts: PartialSocketOptions) = this()
    
    var binaryType: String = js.native
    
    /* private */ var clearTimeoutFn: Any = js.native
    
    /**
      * Closes the connection.
      *
      * @api public
      */
    def close(): this.type = js.native
    
    /**
      * Creates transport of the given type.
      *
      * @param {String} transport name
      * @return {Transport}
      * @api private
      */
    /* private */ var createTransport: Any = js.native
    
    /**
      * Filters upgrades, returning only those matching client transports.
      *
      * @param {Array} server upgrades
      * @api private
      *
      */
    /* private */ var filterUpgrades: Any = js.native
    
    /**
      * Flush write buffers.
      *
      * @api private
      */
    /* private */ var flush: Any = js.native
    
    /**
      * Ensure the encoded size of the writeBuffer is below the maxPayload value sent by the server (only for HTTP
      * long-polling)
      *
      * @private
      */
    /* private */ var getWritablePackets: Any = js.native
    
    /* private */ val hostname: Any = js.native
    
    var id: String = js.native
    
    /* private */ var maxPayload: Any = js.native
    
    /* private */ var offlineEventListener: Any = js.native
    
    /**
      * Called upon transport close.
      *
      * @api private
      */
    /* private */ var onClose: Any = js.native
    
    /**
      * Called on `drain` event
      *
      * @api private
      */
    /* private */ var onDrain: Any = js.native
    
    /**
      * Called upon transport error
      *
      * @api private
      */
    /* private */ var onError: Any = js.native
    
    /**
      * Called upon handshake completion.
      *
      * @param {Object} data - handshake obj
      * @api private
      */
    /* private */ var onHandshake: Any = js.native
    
    /**
      * Called when connection is deemed open.
      *
      * @api private
      */
    /* private */ var onOpen: Any = js.native
    
    /**
      * Handles a packet.
      *
      * @api private
      */
    /* private */ var onPacket: Any = js.native
    
    /**
      * Initializes transport to use and starts probe.
      *
      * @api private
      */
    /* private */ var open: Any = js.native
    
    /* private */ val opts: Any = js.native
    
    /* private */ var pingInterval: Any = js.native
    
    /* private */ var pingTimeout: Any = js.native
    
    /* private */ var pingTimeoutTimer: Any = js.native
    
    /* private */ val port: Any = js.native
    
    /* private */ var prevBufferLen: Any = js.native
    
    /**
      * Probes a transport.
      *
      * @param {String} transport name
      * @api private
      */
    /* private */ var probe: Any = js.native
    
    /* private */ var readyState: Any = js.native
    
    /**
      * Sets and resets ping timeout timer based on server pings.
      *
      * @api private
      */
    /* private */ var resetPingTimeout: Any = js.native
    
    /* private */ val secure: Any = js.native
    
    def send(msg: Any, options: Any): this.type = js.native
    def send(msg: Any, options: Any, fn: Any): this.type = js.native
    
    /**
      * Sends a packet.
      *
      * @param {String} packet type.
      * @param {String} data.
      * @param {Object} options.
      * @param {Function} callback function.
      * @api private
      */
    /* private */ var sendPacket: Any = js.native
    
    /* private */ var setTimeoutFn: Any = js.native
    
    /**
      * Sets the current transport. Disables the existing one (if any).
      *
      * @api private
      */
    /* private */ var setTransport: Any = js.native
    
    var transport: Any = js.native
    
    /* private */ val transports: Any = js.native
    
    /* private */ var upgrades: Any = js.native
    
    /* private */ var upgrading: Any = js.native
    
    /**
      * Sends a message.
      *
      * @param {String} message.
      * @param {Function} callback function.
      * @param {Object} options.
      * @return {Socket} for chaining.
      * @api public
      */
    def write(msg: Any, options: Any): this.type = js.native
    def write(msg: Any, options: Any, fn: Any): this.type = js.native
    
    /* private */ var writeBuffer: Any = js.native
  }
  /* static members */
  object Socket {
    
    @JSImport("engine.io-client/build/esm/socket", "Socket")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("engine.io-client/build/esm/socket", "Socket.priorWebsocketSuccess")
    @js.native
    def priorWebsocketSuccess: Boolean = js.native
    inline def priorWebsocketSuccess_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("priorWebsocketSuccess")(x.asInstanceOf[js.Any])
    
    @JSImport("engine.io-client/build/esm/socket", "Socket.protocol")
    @js.native
    def protocol: Double = js.native
    inline def protocol_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("protocol")(x.asInstanceOf[js.Any])
  }
  
  trait SocketOptions extends StObject {
    
    /**
      * `http.Agent` to use, defaults to `false` (NodeJS only)
      */
    var agent: String | Boolean
    
    /**
      * weather we should unref the reconnect timer when it is
      * create automatically
      * @default false
      */
    var autoUnref: Boolean
    
    /**
      * (SSL) An authority certificate or array of authority certificates to
      * check the remote host against.. Can be used in Node.js client
      * environment to manually specify certificate information.
      */
    var ca: String | js.Array[String]
    
    /**
      * (SSL) Public x509 certificate to use. Can be used in Node.js client
      * environment to manually specify certificate information.
      */
    var cert: String
    
    /**
      * (SSL) A string describing the ciphers to use or exclude. Consult the
      * [cipher format list]
      * (http://www.openssl.org/docs/apps/ciphers.html#CIPHER_LIST_FORMAT) for
      * details on the format.. Can be used in Node.js client environment to
      * manually specify certificate information.
      */
    var ciphers: String
    
    /**
      * Whether to automatically close the connection whenever the beforeunload event is received.
      * @default true
      */
    var closeOnBeforeunload: Boolean
    
    /**
      * Headers that will be passed for each request to the server (via xhr-polling and via websockets).
      * These values then can be used during handshake or for special proxies.
      */
    var extraHeaders: js.UndefOr[StringDictionary[String]] = js.undefined
    
    /**
      * Forces base 64 encoding for polling transport even when XHR2
      * responseType is available and WebSocket even if the used standard
      * supports binary.
      */
    var forceBase64: Boolean
    
    /**
      * The host that we're connecting to. Set from the URI passed when connecting
      */
    var host: String
    
    /**
      * The hostname for our connection. Set from the URI passed when connecting
      */
    var hostname: String
    
    /**
      * (SSL) Private key to use for SSL. Can be used in Node.js client
      * environment to manually specify certificate information.
      */
    var key: String
    
    /**
      * Are we only interested in transports that support binary?
      */
    var onlyBinaryUpgrades: Boolean
    
    /**
      * (SSL) A string or passphrase for the private key or pfx. Can be
      * used in Node.js client environment to manually specify certificate
      * information.
      */
    var passphrase: String
    
    /**
      * The path to get our client file from, in the case of the server
      * serving it
      * @default '/engine.io'
      */
    var path: String
    
    /**
      * parameters of the WebSocket permessage-deflate extension (see ws module api docs). Set to false to disable.
      * @default false
      */
    var perMessageDeflate: Threshold
    
    /**
      * (SSL) Certificate, Private key and CA certificates to use for SSL.
      * Can be used in Node.js client environment to manually specify
      * certificate information.
      */
    var pfx: String
    
    /**
      * The port the policy server listens on
      * @default 843
      */
    var policyPost: Double
    
    /**
      * The port for our connection. Set from the URI passed when connecting
      */
    var port: String | Double
    
    /**
      * Either a single protocol string or an array of protocol strings. These strings are used to indicate sub-protocols,
      * so that a single server can implement multiple WebSocket sub-protocols (for example, you might want one server to
      * be able to handle different types of interactions depending on the specified protocol)
      * @default []
      */
    var protocols: String | js.Array[String]
    
    /**
      * Any query parameters in our uri. Set from the URI passed when connecting
      */
    var query: StringDictionary[Any]
    
    /**
      * (SSL) If true, the server certificate is verified against the list of
      * supplied CAs. An 'error' event is emitted if verification fails.
      * Verification happens at the connection level, before the HTTP request
      * is sent. Can be used in Node.js client environment to manually specify
      * certificate information.
      */
    var rejectUnauthorized: Boolean
    
    /**
      * If true and if the previous websocket connection to the server succeeded,
      * the connection attempt will bypass the normal upgrade process and will
      * initially try websocket. A connection attempt following a transport error
      * will use the normal upgrade process. It is recommended you turn this on
      * only when using SSL/TLS connections, or if you know that your network does
      * not block websockets.
      * @default false
      */
    var rememberUpgrade: Boolean
    
    /**
      * Timeout for xhr-polling requests in milliseconds (0) (only for polling transport)
      */
    var requestTimeout: Double
    
    /**
      * If this is a secure connection. Set from the URI passed when connecting
      */
    var secure: Boolean
    
    /**
      * The param name to use as our timestamp key
      * @default 't'
      */
    var timestampParam: String
    
    /**
      * Whether to add the timestamp with each transport request. Note: this
      * is ignored if the browser is IE or Android, in which case requests
      * are always stamped
      * @default false
      */
    var timestampRequests: Boolean
    
    /**
      * Transport options for Node.js client (headers etc)
      */
    var transportOptions: js.Object
    
    /**
      * A list of transports to try (in order). Engine.io always attempts to
      * connect directly with the first one, provided the feature detection test
      * for it passes.
      * @default ['polling','websocket']
      */
    var transports: js.Array[String]
    
    /**
      * Whether the client should try to upgrade the transport from
      * long-polling to something better.
      * @default true
      */
    var upgrade: Boolean
    
    /**
      * Whether to always use the native timeouts. This allows the client to
      * reconnect when the native timeout functions are overridden, such as when
      * mock clocks are installed.
      * @default false
      */
    var useNativeTimers: Boolean
    
    /**
      * Whether to include credentials (cookies, authorization headers, TLS
      * client certificates, etc.) with cross-origin XHR polling requests
      * @default false
      */
    var withCredentials: Boolean
  }
  object SocketOptions {
    
    inline def apply(
      agent: String | Boolean,
      autoUnref: Boolean,
      ca: String | js.Array[String],
      cert: String,
      ciphers: String,
      closeOnBeforeunload: Boolean,
      forceBase64: Boolean,
      host: String,
      hostname: String,
      key: String,
      onlyBinaryUpgrades: Boolean,
      passphrase: String,
      path: String,
      perMessageDeflate: Threshold,
      pfx: String,
      policyPost: Double,
      port: String | Double,
      protocols: String | js.Array[String],
      query: StringDictionary[Any],
      rejectUnauthorized: Boolean,
      rememberUpgrade: Boolean,
      requestTimeout: Double,
      secure: Boolean,
      timestampParam: String,
      timestampRequests: Boolean,
      transportOptions: js.Object,
      transports: js.Array[String],
      upgrade: Boolean,
      useNativeTimers: Boolean,
      withCredentials: Boolean
    ): SocketOptions = {
      val __obj = js.Dynamic.literal(agent = agent.asInstanceOf[js.Any], autoUnref = autoUnref.asInstanceOf[js.Any], ca = ca.asInstanceOf[js.Any], cert = cert.asInstanceOf[js.Any], ciphers = ciphers.asInstanceOf[js.Any], closeOnBeforeunload = closeOnBeforeunload.asInstanceOf[js.Any], forceBase64 = forceBase64.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], hostname = hostname.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], onlyBinaryUpgrades = onlyBinaryUpgrades.asInstanceOf[js.Any], passphrase = passphrase.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], perMessageDeflate = perMessageDeflate.asInstanceOf[js.Any], pfx = pfx.asInstanceOf[js.Any], policyPost = policyPost.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], protocols = protocols.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], rejectUnauthorized = rejectUnauthorized.asInstanceOf[js.Any], rememberUpgrade = rememberUpgrade.asInstanceOf[js.Any], requestTimeout = requestTimeout.asInstanceOf[js.Any], secure = secure.asInstanceOf[js.Any], timestampParam = timestampParam.asInstanceOf[js.Any], timestampRequests = timestampRequests.asInstanceOf[js.Any], transportOptions = transportOptions.asInstanceOf[js.Any], transports = transports.asInstanceOf[js.Any], upgrade = upgrade.asInstanceOf[js.Any], useNativeTimers = useNativeTimers.asInstanceOf[js.Any], withCredentials = withCredentials.asInstanceOf[js.Any])
      __obj.asInstanceOf[SocketOptions]
    }
    
    extension [Self <: SocketOptions](x: Self) {
      
      inline def setAgent(value: String | Boolean): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
      
      inline def setAutoUnref(value: Boolean): Self = StObject.set(x, "autoUnref", value.asInstanceOf[js.Any])
      
      inline def setCa(value: String | js.Array[String]): Self = StObject.set(x, "ca", value.asInstanceOf[js.Any])
      
      inline def setCaVarargs(value: String*): Self = StObject.set(x, "ca", js.Array(value*))
      
      inline def setCert(value: String): Self = StObject.set(x, "cert", value.asInstanceOf[js.Any])
      
      inline def setCiphers(value: String): Self = StObject.set(x, "ciphers", value.asInstanceOf[js.Any])
      
      inline def setCloseOnBeforeunload(value: Boolean): Self = StObject.set(x, "closeOnBeforeunload", value.asInstanceOf[js.Any])
      
      inline def setExtraHeaders(value: StringDictionary[String]): Self = StObject.set(x, "extraHeaders", value.asInstanceOf[js.Any])
      
      inline def setExtraHeadersUndefined: Self = StObject.set(x, "extraHeaders", js.undefined)
      
      inline def setForceBase64(value: Boolean): Self = StObject.set(x, "forceBase64", value.asInstanceOf[js.Any])
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setOnlyBinaryUpgrades(value: Boolean): Self = StObject.set(x, "onlyBinaryUpgrades", value.asInstanceOf[js.Any])
      
      inline def setPassphrase(value: String): Self = StObject.set(x, "passphrase", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPerMessageDeflate(value: Threshold): Self = StObject.set(x, "perMessageDeflate", value.asInstanceOf[js.Any])
      
      inline def setPfx(value: String): Self = StObject.set(x, "pfx", value.asInstanceOf[js.Any])
      
      inline def setPolicyPost(value: Double): Self = StObject.set(x, "policyPost", value.asInstanceOf[js.Any])
      
      inline def setPort(value: String | Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setProtocols(value: String | js.Array[String]): Self = StObject.set(x, "protocols", value.asInstanceOf[js.Any])
      
      inline def setProtocolsVarargs(value: String*): Self = StObject.set(x, "protocols", js.Array(value*))
      
      inline def setQuery(value: StringDictionary[Any]): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setRejectUnauthorized(value: Boolean): Self = StObject.set(x, "rejectUnauthorized", value.asInstanceOf[js.Any])
      
      inline def setRememberUpgrade(value: Boolean): Self = StObject.set(x, "rememberUpgrade", value.asInstanceOf[js.Any])
      
      inline def setRequestTimeout(value: Double): Self = StObject.set(x, "requestTimeout", value.asInstanceOf[js.Any])
      
      inline def setSecure(value: Boolean): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
      
      inline def setTimestampParam(value: String): Self = StObject.set(x, "timestampParam", value.asInstanceOf[js.Any])
      
      inline def setTimestampRequests(value: Boolean): Self = StObject.set(x, "timestampRequests", value.asInstanceOf[js.Any])
      
      inline def setTransportOptions(value: js.Object): Self = StObject.set(x, "transportOptions", value.asInstanceOf[js.Any])
      
      inline def setTransports(value: js.Array[String]): Self = StObject.set(x, "transports", value.asInstanceOf[js.Any])
      
      inline def setTransportsVarargs(value: String*): Self = StObject.set(x, "transports", js.Array(value*))
      
      inline def setUpgrade(value: Boolean): Self = StObject.set(x, "upgrade", value.asInstanceOf[js.Any])
      
      inline def setUseNativeTimers(value: Boolean): Self = StObject.set(x, "useNativeTimers", value.asInstanceOf[js.Any])
      
      inline def setWithCredentials(value: Boolean): Self = StObject.set(x, "withCredentials", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SocketReservedEvents extends StObject {
    
    def close(reason: String): Unit = js.native
    def close(reason: String, description: js.Error): Unit = js.native
    def close(reason: String, description: CloseDetails): Unit = js.native
    
    def data(data: Any): Unit = js.native
    
    def drain(): Unit = js.native
    
    def error(err: String): Unit = js.native
    def error(err: js.Error): Unit = js.native
    
    def flush(): Unit = js.native
    
    def handshake(data: Any): Unit = js.native
    
    def heartbeat(): Unit = js.native
    
    def message(data: Any): Unit = js.native
    
    def open(): Unit = js.native
    
    def packet(packet: Any): Unit = js.native
    
    def packetCreate(packet: Any): Unit = js.native
    
    def ping(): Unit = js.native
    
    def pong(): Unit = js.native
    
    def upgrade(transport: Any): Unit = js.native
    
    def upgradeError(err: js.Error): Unit = js.native
    
    def upgrading(transport: Any): Unit = js.native
  }
}
