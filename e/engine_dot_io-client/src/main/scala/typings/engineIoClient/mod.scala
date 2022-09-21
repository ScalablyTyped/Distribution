package typings.engineIoClient

import org.scalablytyped.runtime.Instantiable1
import typings.engineIoClient.anon.PartialSocketOptions
import typings.engineIoClient.pollingMod.Polling
import typings.engineIoClient.websocketMod.WS
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("engine.io-client", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("engine.io-client", "Socket")
  @js.native
  open class Socket protected ()
    extends typings.engineIoClient.socketMod.Socket {
    /**
      * Socket constructor.
      *
      * @param {String|Object} uri or options
      * @param {Object} opts - options
      * @api public
      */
    def this(uri: Any) = this()
    def this(uri: Any, opts: PartialSocketOptions) = this()
  }
  /* static members */
  object Socket {
    
    @JSImport("engine.io-client", "Socket")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("engine.io-client", "Socket.priorWebsocketSuccess")
    @js.native
    def priorWebsocketSuccess: Boolean = js.native
    inline def priorWebsocketSuccess_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("priorWebsocketSuccess")(x.asInstanceOf[js.Any])
    
    @JSImport("engine.io-client", "Socket.protocol")
    @js.native
    def protocol: Double = js.native
    inline def protocol_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("protocol")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("engine.io-client", "Transport")
  @js.native
  abstract class Transport protected ()
    extends typings.engineIoClient.transportMod.Transport {
    /**
      * Transport abstract constructor.
      *
      * @param {Object} options.
      * @api private
      */
    def this(opts: Any) = this()
  }
  
  inline def installTimerFunctions(obj: Any, opts: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("installTimerFunctions")(obj.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def parse(str: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(str.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  @JSImport("engine.io-client", "protocol")
  @js.native
  val protocol: Double = js.native
  
  object transports {
    
    @JSImport("engine.io-client", "transports")
    @js.native
    val ^ : js.Any = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("engine.io-client", "transports.polling")
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
    @JSImport("engine.io-client", "transports.polling")
    @js.native
    def polling: Instantiable1[/* opts */ Any, Polling] = js.native
    inline def polling_=(x: Instantiable1[/* opts */ Any, Polling]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("polling")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("engine.io-client", "transports.websocket")
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
    @JSImport("engine.io-client", "transports.websocket")
    @js.native
    def websocket: Instantiable1[/* opts */ Any, WS] = js.native
    inline def websocket_=(x: Instantiable1[/* opts */ Any, WS]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("websocket")(x.asInstanceOf[js.Any])
  }
}
