package typings.engineIo

import org.scalablytyped.runtime.Instantiable1
import typings.engineIo.anon.Typeofpolling
import typings.engineIo.transportsWebsocketMod.WebSocket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object transportsMod {
  
  object default {
    
    @JSImport("engine.io/build/transports", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("engine.io/build/transports", "default.polling")
    @js.native
    def polling: Typeofpolling = js.native
    inline def polling_=(x: Typeofpolling): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("polling")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("engine.io/build/transports", "default.websocket")
    @js.native
    open class websocket protected () extends WebSocket {
      /**
        * WebSocket transport
        *
        * @param {http.IncomingMessage}
        * @api public
        */
      def this(req: Any) = this()
    }
    @JSImport("engine.io/build/transports", "default.websocket")
    @js.native
    def websocket: Instantiable1[/* req */ Any, WebSocket] = js.native
    inline def websocket_=(x: Instantiable1[/* req */ Any, WebSocket]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("websocket")(x.asInstanceOf[js.Any])
  }
}
