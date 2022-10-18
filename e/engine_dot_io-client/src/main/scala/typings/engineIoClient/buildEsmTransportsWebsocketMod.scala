package typings.engineIoClient

import typings.engineIoClient.buildEsmTransportMod.Transport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildEsmTransportsWebsocketMod {
  
  @JSImport("engine.io-client/build/esm/transports/websocket", "WS")
  @js.native
  open class WS protected () extends Transport {
    /**
      * WebSocket transport constructor.
      *
      * @api {Object} connection options
      * @api public
      */
    def this(opts: Any) = this()
    
    /**
      * Adds event listeners to the socket
      *
      * @api private
      */
    def addEventListeners(): Unit = js.native
    
    /**
      * Feature detection for WebSocket.
      *
      * @return {Boolean} whether this transport is available.
      * @api public
      */
    def check(): Boolean = js.native
    
    /**
      * Transport name.
      *
      * @api public
      */
    def name: String = js.native
    
    /**
      * Generates uri for connection.
      *
      * @api private
      */
    def uri(): String = js.native
    
    /* private */ var ws: Any = js.native
  }
}
