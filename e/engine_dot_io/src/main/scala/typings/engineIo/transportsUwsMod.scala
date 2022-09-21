package typings.engineIo

import org.scalablytyped.runtime.Instantiable1
import typings.engineIo.pollingMod.Polling
import typings.engineIo.websocketMod.WebSocket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object transportsUwsMod {
  
  object default {
    
    @JSImport("engine.io/build/transports-uws", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("engine.io/build/transports-uws", "default.polling")
    @js.native
    open class polling protected () extends Polling {
      /**
        * HTTP polling constructor.
        *
        * @api public.
        */
      def this(req: Any) = this()
    }
    @JSImport("engine.io/build/transports-uws", "default.polling")
    @js.native
    def polling: Instantiable1[/* req */ Any, Polling] = js.native
    inline def polling_=(x: Instantiable1[/* req */ Any, Polling]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("polling")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("engine.io/build/transports-uws", "default.websocket")
    @js.native
    open class websocket protected () extends WebSocket {
      /**
        * WebSocket transport
        *
        * @param req
        * @api public
        */
      def this(req: Any) = this()
    }
    @JSImport("engine.io/build/transports-uws", "default.websocket")
    @js.native
    def websocket: Instantiable1[/* req */ Any, WebSocket] = js.native
    inline def websocket_=(x: Instantiable1[/* req */ Any, WebSocket]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("websocket")(x.asInstanceOf[js.Any])
  }
}
