package typings.engineIo

import typings.engineIo.buildTransportMod.Transport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildTransportsUwsWebsocketMod {
  
  @JSImport("engine.io/build/transports-uws/websocket", "WebSocket")
  @js.native
  open class WebSocket protected () extends Transport {
    /**
      * WebSocket transport
      *
      * @param req
      * @api public
      */
    def this(req: Any) = this()
    
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
