package typings.engineIoClient

import org.scalablytyped.runtime.Instantiable1
import typings.engineIoClient.pollingMod.Polling
import typings.engineIoClient.websocketMod.WS
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object transportsMod {
  
  object transports {
    
    @JSImport("engine.io-client/build/esm/transports", "transports")
    @js.native
    val ^ : js.Any = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("engine.io-client/build/esm/transports", "transports.polling")
    @js.native
    open class polling protected () extends Polling {
      /**
        * XHR Polling constructor.
        *
        * @param {Object} opts
        * @api public
        */
      def this(opts: Any) = this()
    }
    @JSImport("engine.io-client/build/esm/transports", "transports.polling")
    @js.native
    def polling: Instantiable1[/* opts */ Any, Polling] = js.native
    inline def polling_=(x: Instantiable1[/* opts */ Any, Polling]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("polling")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("engine.io-client/build/esm/transports", "transports.websocket")
    @js.native
    open class websocket protected () extends WS {
      /**
        * WebSocket transport constructor.
        *
        * @api {Object} connection options
        * @api public
        */
      def this(opts: Any) = this()
    }
    @JSImport("engine.io-client/build/esm/transports", "transports.websocket")
    @js.native
    def websocket: Instantiable1[/* opts */ Any, WS] = js.native
    inline def websocket_=(x: Instantiable1[/* opts */ Any, WS]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("websocket")(x.asInstanceOf[js.Any])
  }
}
