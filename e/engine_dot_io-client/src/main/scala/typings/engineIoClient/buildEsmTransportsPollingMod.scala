package typings.engineIoClient

import typings.engineIoClient.buildEsmTransportMod.Transport
import typings.engineIoParser.buildEsmCommonsMod.RawData
import typings.socketIoComponentEmitter.mod.Emitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildEsmTransportsPollingMod {
  
  @JSImport("engine.io-client/build/esm/transports/polling", "Polling")
  @js.native
  open class Polling protected () extends Transport {
    /**
      * XHR Polling constructor.
      *
      * @param {Object} opts
      * @package
      */
    def this(opts: Any) = this()
    
    /**
      * Starts a poll cycle.
      *
      * @private
      */
    /* private */ var doPoll: Any = js.native
    
    /**
      * Sends data.
      *
      * @param {String} data to send.
      * @param {Function} called upon flush.
      * @private
      */
    /* private */ var doWrite: Any = js.native
    
    /**
      * Pauses polling.
      *
      * @param {Function} onPause - callback upon buffers are flushed and transport is paused
      * @package
      */
    def pause(onPause: Any): Unit = js.native
    
    /**
      * Starts polling cycle.
      *
      * @private
      */
    def poll(): Unit = js.native
    
    /* private */ var pollXhr: Any = js.native
    
    /* private */ var polling: Any = js.native
    
    /**
      * Creates a request.
      *
      * @param {String} method
      * @private
      */
    def request(): Request = js.native
    def request(opts: js.Object): Request = js.native
    
    /**
      * Generates uri for connection.
      *
      * @private
      */
    def uri(): String = js.native
    
    /**
      * Writes a packets payload.
      *
      * @param {Array} packets - data packets
      * @protected
      */
    def write(packets: Any): Unit = js.native
    
    /* private */ val xd: Any = js.native
    
    /* private */ val xs: Any = js.native
  }
  
  @JSImport("engine.io-client/build/esm/transports/polling", "Request")
  @js.native
  open class Request protected ()
    extends Emitter[js.Object, js.Object, RequestReservedEvents] {
    /**
      * Request constructor
      *
      * @param {Object} options
      * @package
      */
    def this(uri: Any, opts: Any) = this()
    
    /**
      * Aborts the request.
      *
      * @package
      */
    def abort(): Unit = js.native
    
    /* private */ val async: Any = js.native
    
    /**
      * Cleans up house.
      *
      * @private
      */
    /* private */ var cleanup: Any = js.native
    
    /**
      * Creates the XHR object and sends the request.
      *
      * @private
      */
    /* private */ var create: Any = js.native
    
    /* private */ val data: Any = js.native
    
    /* private */ var index: Any = js.native
    
    /* private */ val method: Any = js.native
    
    /**
      * Called upon error.
      *
      * @private
      */
    /* private */ var onError: Any = js.native
    
    /**
      * Called upon load.
      *
      * @private
      */
    /* private */ var onLoad: Any = js.native
    
    /* private */ val opts: Any = js.native
    
    /* private */ var setTimeoutFn: Any = js.native
    
    /* private */ val uri: Any = js.native
    
    /* private */ var xhr: Any = js.native
  }
  /* static members */
  object Request {
    
    @JSImport("engine.io-client/build/esm/transports/polling", "Request")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("engine.io-client/build/esm/transports/polling", "Request.requests")
    @js.native
    def requests: js.Object = js.native
    
    @JSImport("engine.io-client/build/esm/transports/polling", "Request.requestsCount")
    @js.native
    def requestsCount: Double = js.native
    inline def requestsCount_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("requestsCount")(x.asInstanceOf[js.Any])
    
    inline def requests_=(x: js.Object): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("requests")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait RequestReservedEvents extends StObject {
    
    def data(data: RawData): Unit = js.native
    
    def error(err: js.Error, context: Any): Unit = js.native
    def error(err: Double, context: Any): Unit = js.native
    
    def success(): Unit = js.native
  }
}
