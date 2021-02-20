package typings.engineIoClient

import org.scalablytyped.runtime.StringDictionary
import typings.engineIoClient.engineIoClientBooleans.`false`
import typings.engineIoClient.engineIoClientStrings.arraybuffer
import typings.engineIoClient.engineIoClientStrings.blob
import typings.engineIoClient.engineIoClientStrings.close
import typings.engineIoClient.engineIoClientStrings.drain
import typings.engineIoClient.engineIoClientStrings.error
import typings.engineIoClient.engineIoClientStrings.flush
import typings.engineIoClient.engineIoClientStrings.message
import typings.engineIoClient.engineIoClientStrings.open
import typings.engineIoClient.engineIoClientStrings.ping
import typings.engineIoClient.engineIoClientStrings.pong
import typings.engineIoClient.engineIoClientStrings.upgrade
import typings.engineIoClient.engineIoClientStrings.upgradeError
import typings.node.httpMod.Agent
import typings.std.ArrayBuffer
import typings.std.ArrayBufferView
import typings.std.Blob
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("engine.io-client", JSImport.Namespace)
  @js.native
  def apply(): Socket = js.native
  @JSImport("engine.io-client", JSImport.Namespace)
  @js.native
  def apply(url: js.UndefOr[scala.Nothing], opts: SocketOptions): Socket = js.native
  @JSImport("engine.io-client", JSImport.Namespace)
  @js.native
  def apply(url: String): Socket = js.native
  @JSImport("engine.io-client", JSImport.Namespace)
  @js.native
  def apply(url: String, opts: SocketOptions): Socket = js.native
  
  @JSImport("engine.io-client", "Socket")
  @js.native
  class Socket () extends StObject {
    
    var binaryType: js.UndefOr[arraybuffer | blob] = js.native
    
    /**
      * Disconnects the client.
      */
    def close(): this.type = js.native
    
    /*
      * Fired upon disconnection. In compliance with the WebSocket API spec, this event may be fired even if the open event does not occur (i.e. due to connection error or close()).
      */
    @JSName("on")
    def on_close(ev: close, cb: js.Function2[/* mes */ String, /* detail */ js.UndefOr[Error], Unit]): this.type = js.native
    @JSName("on")
    def on_drain(ev: drain, cb: js.Function0[Unit]): this.type = js.native
    /*
      * Fired when an error occurs.
      */
    @JSName("on")
    def on_error(ev: error, cb: js.Function1[/* err */ Error, Unit]): this.type = js.native
    @JSName("on")
    def on_flush(ev: flush, cb: js.Function0[Unit]): this.type = js.native
    /*
      * Fired when data is received from the server.
      */
    @JSName("on")
    def on_message(ev: message, cb: js.Function1[/* data */ String | ArrayBuffer, Unit]): this.type = js.native
    /*
      * open: Fired upon successful connection.
      * flush: Fired upon completing a buffer flush
      * drain: Fired after drain event of transport if writeBuffer is empty
      * ping: Fired upon flushing a ping packet (ie: actual packet write out)
      * pong: Fired upon receiving a pong packet.
      */
    @JSName("on")
    def on_open(ev: open, cb: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_ping(ev: ping, cb: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_pong(ev: pong, cb: js.Function0[Unit]): this.type = js.native
    /*
      * Fired upon upgrade success, after the new transport is set
      */
    @JSName("on")
    def on_upgrade(ev: upgrade, cb: js.Function1[/* transport */ js.Any, Unit]): this.type = js.native
    /*
      * Fired if an error occurs with a transport we're trying to upgrade to.
      */
    @JSName("on")
    def on_upgradeError(ev: upgradeError, cb: js.Function1[/* err */ UpgradeError, Unit]): this.type = js.native
    
    var protocol: js.UndefOr[Double] = js.native
    
    /**
      * Sends a message to the server
      */
    def send(message: Message): this.type = js.native
    def send(message: Message, opts: js.UndefOr[scala.Nothing], cb: js.Function0[Unit]): this.type = js.native
    def send(message: Message, opts: MessageOptions): this.type = js.native
    def send(message: Message, opts: MessageOptions, cb: js.Function0[Unit]): this.type = js.native
  }
  
  type Message = String | ArrayBuffer | ArrayBufferView | Blob
  
  @js.native
  trait MessageOptions extends StObject {
    
    var compress: js.UndefOr[Boolean] = js.native
  }
  object MessageOptions {
    
    @scala.inline
    def apply(): MessageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MessageOptions]
    }
    
    @scala.inline
    implicit class MessageOptionsMutableBuilder[Self <: MessageOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCompress(value: Boolean): Self = StObject.set(x, "compress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompressUndefined: Self = StObject.set(x, "compress", js.undefined)
    }
  }
  
  @js.native
  trait SocketOptions extends StObject {
    
    /**
      * http.Agent to use, defaults to false (NodeJS only)
      */
    var agent: js.UndefOr[Agent | `false`] = js.native
    
    /**
      * An authority certificate or array of authority certificates to check the remote host against.
      * Can be used in Node.js client environment to manually specify certificate information.
      */
    var ca: js.UndefOr[String | js.Array[String]] = js.native
    
    /**
      * Public x509 certificate to use. Can be used in Node.js client environment to manually specify certificate information.
      */
    var cert: js.UndefOr[String] = js.native
    
    /**
      * A string describing the ciphers to use or exclude. Consult the cipher format list for details on the format.
      * Can be used in Node.js client environment to manually specify certificate information.
      */
    var ciphers: js.UndefOr[String] = js.native
    
    /**
      * enables XDomainRequest for IE8 to avoid loading bar flashing with click sound. default to false because XDomainRequest has a flaw of not sending cookie.
      */
    var enablesXDR: js.UndefOr[Boolean] = js.native
    
    /**
      * Headers that will be passed for each request to the server (via xhr-polling and via websockets).
      * These values then can be used during handshake or for special proxies. Can only be used in Node.js client environment.
      */
    var extraHeaders: js.UndefOr[StringDictionary[String]] = js.native
    
    /**
      * forces base 64 encoding for polling transport even when XHR2 responseType is available and WebSocket even if the used standard supports binary.
      */
    var forceBase64: js.UndefOr[Boolean] = js.native
    
    /**
      * forces JSONP for polling transport.
      */
    var forceJSONP: js.UndefOr[Boolean] = js.native
    
    /**
      * Uses NodeJS implementation for websockets - even if there is a native Browser-Websocket available,
      * which is preferred by default over the NodeJS implementation. (This is useful when using hybrid platforms
      * like nw.js or electron) (false, NodeJS only)
      */
    var forceNode: js.UndefOr[Boolean] = js.native
    
    /**
      * determines whether to use JSONP when necessary for polling.
      * If disabled (by settings to false) an error will be emitted (saying "No transports available")
      * if no other transports are available. If another transport is available
      * for opening a connection (e.g. WebSocket) that transport will be used instead.
      */
    var jsonp: js.UndefOr[Boolean] = js.native
    
    /**
      * Private key to use for SSL. Can be used in Node.js client environment to manually specify certificate information.
      */
    var key: js.UndefOr[String] = js.native
    
    /**
      * the local IP address to connect to
      */
    var localAddress: js.UndefOr[String] = js.native
    
    /**
      * whether transport upgrades should be restricted to transports supporting binary data (false)
      */
    var onlyBinaryUpgrades: js.UndefOr[Boolean] = js.native
    
    /**
      * A string of passphrase for the private key or pfx. Can be used in Node.js client environment to manually specify certificate information.
      */
    var passphrase: js.UndefOr[String] = js.native
    
    /**
      * path to connect to, default is /engine.io
      */
    var path: js.UndefOr[String] = js.native
    
    /**
      * parameters of the WebSocket permessage-deflate extension (see ws module api docs). Set to false to disable. (true)
      */
    var perMessageDeflate: js.UndefOr[js.Any] = js.native
    
    /**
      * Certificate, Private key and CA certificates to use for SSL. Can be used in Node.js client environment to manually specify certificate information.
      */
    var pfx: js.UndefOr[String] = js.native
    
    /**
      * port the policy server listens on (843)
      */
    var policyPort: js.UndefOr[Double] = js.native
    
    /**
      * If true, the server certificate is verified against the list of supplied CAs.
      * An 'error' event is emitted if verification fails. Verification happens at the connection level,
      * before the HTTP request is sent. Can be used in Node.js client environment to manually specify certificate information.
      */
    var rejectUnauthorized: js.UndefOr[Boolean] = js.native
    
    /**
      * defaults to false. If true and if the previous websocket connection to the server succeeded,
      * the connection attempt will bypass the normal upgrade process and will initially try websocket.
      * A connection attempt following a transport error will use the normal upgrade process.
      * It is recommended you turn this on only when using SSL/TLS connections,
      * or if you know that your network does not block websockets.
      */
    var rememberUpgrade: js.UndefOr[Boolean] = js.native
    
    /**
      * timestamp parameter (t)
      */
    var timestampParam: js.UndefOr[String] = js.native
    
    /**
      * whether to add the timestamp with each transport request. Note: polling requests are always stamped unless this option is explicitly set to false (false)
      */
    var timestampRequests: js.UndefOr[Boolean] = js.native
    
    /**
      * hash of options, indexed by transport name, overriding the common options for the given transport
      */
    var transportOptions: js.UndefOr[StringDictionary[SocketOptions]] = js.native
    
    /**
      * a list of transports to try (in order).
      * Defaults to ['polling', 'websocket'].
      * Engine always attempts to connect directly with the first one, provided the feature detection test for it passes.
      */
    var transports: js.UndefOr[js.Array[Transport]] = js.native
    
    /**
      * defaults to true, whether the client should try to upgrade the transport from long-polling to something better.
      */
    var upgrade: js.UndefOr[Boolean] = js.native
  }
  object SocketOptions {
    
    @scala.inline
    def apply(): SocketOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SocketOptions]
    }
    
    @scala.inline
    implicit class SocketOptionsMutableBuilder[Self <: SocketOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAgent(value: Agent | `false`): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAgentUndefined: Self = StObject.set(x, "agent", js.undefined)
      
      @scala.inline
      def setCa(value: String | js.Array[String]): Self = StObject.set(x, "ca", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaUndefined: Self = StObject.set(x, "ca", js.undefined)
      
      @scala.inline
      def setCaVarargs(value: String*): Self = StObject.set(x, "ca", js.Array(value :_*))
      
      @scala.inline
      def setCert(value: String): Self = StObject.set(x, "cert", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCertUndefined: Self = StObject.set(x, "cert", js.undefined)
      
      @scala.inline
      def setCiphers(value: String): Self = StObject.set(x, "ciphers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCiphersUndefined: Self = StObject.set(x, "ciphers", js.undefined)
      
      @scala.inline
      def setEnablesXDR(value: Boolean): Self = StObject.set(x, "enablesXDR", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnablesXDRUndefined: Self = StObject.set(x, "enablesXDR", js.undefined)
      
      @scala.inline
      def setExtraHeaders(value: StringDictionary[String]): Self = StObject.set(x, "extraHeaders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtraHeadersUndefined: Self = StObject.set(x, "extraHeaders", js.undefined)
      
      @scala.inline
      def setForceBase64(value: Boolean): Self = StObject.set(x, "forceBase64", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceBase64Undefined: Self = StObject.set(x, "forceBase64", js.undefined)
      
      @scala.inline
      def setForceJSONP(value: Boolean): Self = StObject.set(x, "forceJSONP", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceJSONPUndefined: Self = StObject.set(x, "forceJSONP", js.undefined)
      
      @scala.inline
      def setForceNode(value: Boolean): Self = StObject.set(x, "forceNode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceNodeUndefined: Self = StObject.set(x, "forceNode", js.undefined)
      
      @scala.inline
      def setJsonp(value: Boolean): Self = StObject.set(x, "jsonp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJsonpUndefined: Self = StObject.set(x, "jsonp", js.undefined)
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setLocalAddress(value: String): Self = StObject.set(x, "localAddress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocalAddressUndefined: Self = StObject.set(x, "localAddress", js.undefined)
      
      @scala.inline
      def setOnlyBinaryUpgrades(value: Boolean): Self = StObject.set(x, "onlyBinaryUpgrades", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnlyBinaryUpgradesUndefined: Self = StObject.set(x, "onlyBinaryUpgrades", js.undefined)
      
      @scala.inline
      def setPassphrase(value: String): Self = StObject.set(x, "passphrase", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPassphraseUndefined: Self = StObject.set(x, "passphrase", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setPerMessageDeflate(value: js.Any): Self = StObject.set(x, "perMessageDeflate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPerMessageDeflateUndefined: Self = StObject.set(x, "perMessageDeflate", js.undefined)
      
      @scala.inline
      def setPfx(value: String): Self = StObject.set(x, "pfx", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPfxUndefined: Self = StObject.set(x, "pfx", js.undefined)
      
      @scala.inline
      def setPolicyPort(value: Double): Self = StObject.set(x, "policyPort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPolicyPortUndefined: Self = StObject.set(x, "policyPort", js.undefined)
      
      @scala.inline
      def setRejectUnauthorized(value: Boolean): Self = StObject.set(x, "rejectUnauthorized", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRejectUnauthorizedUndefined: Self = StObject.set(x, "rejectUnauthorized", js.undefined)
      
      @scala.inline
      def setRememberUpgrade(value: Boolean): Self = StObject.set(x, "rememberUpgrade", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRememberUpgradeUndefined: Self = StObject.set(x, "rememberUpgrade", js.undefined)
      
      @scala.inline
      def setTimestampParam(value: String): Self = StObject.set(x, "timestampParam", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimestampParamUndefined: Self = StObject.set(x, "timestampParam", js.undefined)
      
      @scala.inline
      def setTimestampRequests(value: Boolean): Self = StObject.set(x, "timestampRequests", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimestampRequestsUndefined: Self = StObject.set(x, "timestampRequests", js.undefined)
      
      @scala.inline
      def setTransportOptions(value: StringDictionary[SocketOptions]): Self = StObject.set(x, "transportOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransportOptionsUndefined: Self = StObject.set(x, "transportOptions", js.undefined)
      
      @scala.inline
      def setTransports(value: js.Array[Transport]): Self = StObject.set(x, "transports", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransportsUndefined: Self = StObject.set(x, "transports", js.undefined)
      
      @scala.inline
      def setTransportsVarargs(value: Transport*): Self = StObject.set(x, "transports", js.Array(value :_*))
      
      @scala.inline
      def setUpgrade(value: Boolean): Self = StObject.set(x, "upgrade", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpgradeUndefined: Self = StObject.set(x, "upgrade", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.engineIoClient.engineIoClientStrings.polling
    - typings.engineIoClient.engineIoClientStrings.websocket
  */
  trait Transport extends StObject
  object Transport {
    
    @scala.inline
    def polling: typings.engineIoClient.engineIoClientStrings.polling = "polling".asInstanceOf[typings.engineIoClient.engineIoClientStrings.polling]
    
    @scala.inline
    def websocket: typings.engineIoClient.engineIoClientStrings.websocket = "websocket".asInstanceOf[typings.engineIoClient.engineIoClientStrings.websocket]
  }
  
  @js.native
  trait UpgradeError extends Error {
    
    var transport: String = js.native
  }
  object UpgradeError {
    
    @scala.inline
    def apply(message: String, name: String, transport: String): UpgradeError = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], transport = transport.asInstanceOf[js.Any])
      __obj.asInstanceOf[UpgradeError]
    }
    
    @scala.inline
    implicit class UpgradeErrorMutableBuilder[Self <: UpgradeError] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTransport(value: String): Self = StObject.set(x, "transport", value.asInstanceOf[js.Any])
    }
  }
}
