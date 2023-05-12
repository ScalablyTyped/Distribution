package typings.engineIo

import typings.engineIo.buildTransportMod.Transport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildTransportsWebsocketMod {
  
  @JSImport("engine.io/build/transports/websocket", "WebSocket")
  @js.native
  open class WebSocket protected () extends Transport {
    /**
      * WebSocket transport
      *
      * @param {http.IncomingMessage}
      * @api public
      */
    def this(req: Any) = this()
    
    /**
      * Whether the encoding of the WebSocket frame can be skipped.
      * @param packet
      * @private
      */
    /* private */ var _canSendPreEncodedFrame: Any = js.native
    
    /**
      * Advertise upgrade support.
      *
      * @api public
      */
    def handlesUpgrades: Boolean = js.native
    
    /* protected */ var perMessageDeflate: Any = js.native
    
    /* private */ var socket: Any = js.native
  }
}
