package typings.engineIoClient

import typings.engineIoClient.transportMod.Transport
import typings.engineIoParser.commonsMod.RawData
import typings.socketIoComponentEmitter.mod.Emitter
import typings.std.XMLHttpRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pollingMod {
  
  @JSImport("engine.io-client/build/esm/transports/polling", "Polling")
  @js.native
  open class Polling protected () extends Transport {
    /**
      * XHR Polling constructor.
      *
      * @param {Object} opts
      * @api public
      */
    def this(opts: Any) = this()
    
    /**
      * Starts a poll cycle.
      *
      * @api private
      */
    def doPoll(): Unit = js.native
    
    /**
      * Sends data.
      *
      * @param {String} data to send.
      * @param {Function} called upon flush.
      * @api private
      */
    def doWrite(data: Any, fn: Any): Unit = js.native
    
    /**
      * Transport name.
      */
    def name: String = js.native
    
    /**
      * Pauses polling.
      *
      * @param {Function} callback upon buffers are flushed and transport is paused
      * @api private
      */
    def pause(onPause: Any): Unit = js.native
    
    /**
      * Starts polling cycle.
      *
      * @api public
      */
    def poll(): Unit = js.native
    
    /* private */ var pollXhr: Any = js.native
    
    /* private */ var polling: Any = js.native
    
    /**
      * Creates a request.
      *
      * @param {String} method
      * @api private
      */
    def request(): Request = js.native
    def request(opts: js.Object): Request = js.native
    
    /**
      * Generates uri for connection.
      *
      * @api private
      */
    def uri(): String = js.native
    
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
      * @api public
      */
    def this(uri: Any, opts: Any) = this()
    
    /**
      * Aborts the request.
      *
      * @api public
      */
    def abort(): Unit = js.native
    
    /* private */ val async: Any = js.native
    
    /**
      * Cleans up house.
      *
      * @api private
      */
    /* private */ var cleanup: Any = js.native
    
    /**
      * Creates the XHR object and sends the request.
      *
      * @api private
      */
    /* private */ var create: Any = js.native
    
    /* private */ val data: Any = js.native
    
    /* private */ var index: Any = js.native
    
    /* private */ val method: Any = js.native
    
    /**
      * Called upon error.
      *
      * @api private
      */
    /* private */ var onError: Any = js.native
    
    /**
      * Called upon load.
      *
      * @api private
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
    
    def error(err: js.Error, context: XMLHttpRequest): Unit = js.native
    def error(err: Double, context: XMLHttpRequest): Unit = js.native
    
    def success(): Unit = js.native
  }
}
