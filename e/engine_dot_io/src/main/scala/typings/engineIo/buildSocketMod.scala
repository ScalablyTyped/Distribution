package typings.engineIo

import typings.engineIo.buildTransportMod.Transport
import typings.engineIoParser.buildEsmCommonsMod.RawData
import typings.node.eventsMod.EventEmitter
import typings.node.httpMod.IncomingMessage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSocketMod {
  
  @JSImport("engine.io/build/socket", "Socket")
  @js.native
  open class Socket protected () extends EventEmitter {
    /**
      * Client class (abstract).
      *
      * @api private
      */
    def this(id: Any, server: Any, transport: Any, req: Any, protocol: Any) = this()
    
    var _readyState: String = js.native
    
    /* private */ var checkIntervalTimer: Any = js.native
    
    /* private */ var cleanupFn: Any = js.native
    
    /**
      * Clears listeners and timers associated with current transport.
      *
      * @api private
      */
    /* private */ var clearTransport: Any = js.native
    
    /**
      * Closes the socket and underlying transport.
      *
      * @param {Boolean} discard - optional, discard the transport
      * @return {Socket} for chaining
      * @api public
      */
    def close(): Unit = js.native
    def close(discard: Boolean): Unit = js.native
    
    /**
      * Closes the underlying transport.
      *
      * @param {Boolean} discard
      * @api private
      */
    /* private */ var closeTransport: Any = js.native
    
    /**
      * Attempts to flush the packets buffer.
      *
      * @api private
      */
    /* private */ var flush: Any = js.native
    
    /**
      * Get available upgrades for this socket.
      *
      * @api private
      */
    /* private */ var getAvailableUpgrades: Any = js.native
    
    /**
      * This is the session identifier that the client will use in the subsequent HTTP requests. It must not be shared with
      * others parties, as it might lead to session hijacking.
      *
      * @private
      */
    /* private */ val id: Any = js.native
    
    /**
      * Upgrades socket to the given transport
      *
      * @param {Transport} transport
      * @api private
      */
    /* private */ var maybeUpgrade: Any = js.native
    
    /**
      * Called upon transport considered closed.
      * Possible reasons: `ping timeout`, `client error`, `parse error`,
      * `transport error`, `server close`, `transport close`
      */
    /* private */ var onClose: Any = js.native
    
    /**
      * Called upon transport error.
      *
      * @param {Error} error object
      * @api private
      */
    /* private */ var onError: Any = js.native
    
    /**
      * Called upon transport considered open.
      *
      * @api private
      */
    /* private */ var onOpen: Any = js.native
    
    /**
      * Called upon transport packet.
      *
      * @param {Object} packet
      * @api private
      */
    /* private */ var onPacket: Any = js.native
    
    /* private */ var packetsFn: Any = js.native
    
    /* private */ var pingIntervalTimer: Any = js.native
    
    /* private */ var pingTimeoutTimer: Any = js.native
    
    val protocol: Double = js.native
    
    def readyState: String = js.native
    def readyState_=(state: String): Unit = js.native
    
    val remoteAddress: String = js.native
    
    val request: IncomingMessage = js.native
    
    /**
      * Resets ping timeout.
      *
      * @api private
      */
    /* private */ var resetPingTimeout: Any = js.native
    
    /**
      * Pings client every `this.pingInterval` and expects response
      * within `this.pingTimeout` or closes connection.
      *
      * @api private
      */
    /* private */ var schedulePing: Any = js.native
    
    /**
      * Sends a message packet.
      *
      * @param {Object} data
      * @param {Object} options
      * @param {Function} callback
      * @return {Socket} for chaining
      * @api public
      */
    def send(data: RawData): this.type = js.native
    def send(data: RawData, options: Unit, callback: js.Function0[Unit]): this.type = js.native
    def send(data: RawData, options: SendOptions): this.type = js.native
    def send(data: RawData, options: SendOptions, callback: js.Function0[Unit]): this.type = js.native
    
    /**
      * Sends a packet.
      *
      * @param {String} type - packet type
      * @param {String} data
      * @param {Object} options
      * @param {Function} callback
      *
      * @api private
      */
    /* private */ var sendPacket: Any = js.native
    
    /* private */ var sentCallbackFn: Any = js.native
    
    /* private */ var server: Any = js.native
    
    /**
      * Attaches handlers for the given transport.
      *
      * @param {Transport} transport
      * @api private
      */
    /* private */ var setTransport: Any = js.native
    
    /**
      * Setup and manage send callback
      *
      * @api private
      */
    /* private */ var setupSendCallback: Any = js.native
    
    var transport: Transport = js.native
    
    /* private */ var upgradeTimeoutTimer: Any = js.native
    
    /* private */ var upgraded: Any = js.native
    
    /* private */ var upgrading: Any = js.native
    
    /**
      * Alias of {@link send}.
      *
      * @param data
      * @param options
      * @param callback
      */
    def write(data: RawData): this.type = js.native
    def write(data: RawData, options: Unit, callback: js.Function0[Unit]): this.type = js.native
    def write(data: RawData, options: SendOptions): this.type = js.native
    def write(data: RawData, options: SendOptions, callback: js.Function0[Unit]): this.type = js.native
    
    /* private */ var writeBuffer: Any = js.native
  }
  
  trait SendOptions extends StObject {
    
    var compress: js.UndefOr[Boolean] = js.undefined
  }
  object SendOptions {
    
    inline def apply(): SendOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SendOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SendOptions] (val x: Self) extends AnyVal {
      
      inline def setCompress(value: Boolean): Self = StObject.set(x, "compress", value.asInstanceOf[js.Any])
      
      inline def setCompressUndefined: Self = StObject.set(x, "compress", js.undefined)
    }
  }
}
