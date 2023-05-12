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
      * @param {Object} opts - connection options
      * @protected
      */
    def this(opts: Any) = this()
    
    /**
      * Adds event listeners to the socket
      *
      * @private
      */
    /* private */ var addEventListeners: Any = js.native
    
    /**
      * Feature detection for WebSocket.
      *
      * @return {Boolean} whether this transport is available.
      * @private
      */
    /* private */ var check: Any = js.native
    
    /**
      * Generates uri for connection.
      *
      * @private
      */
    def uri(): String = js.native
    
    def write(packets: Any): Unit = js.native
    
    /* private */ var ws: Any = js.native
  }
}
