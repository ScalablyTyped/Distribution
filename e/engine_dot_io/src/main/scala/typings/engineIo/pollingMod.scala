package typings.engineIo

import typings.engineIo.transportMod.Transport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pollingMod {
  
  @JSImport("engine.io/build/transports-uws/polling", "Polling")
  @js.native
  open class Polling protected () extends Transport {
    /**
      * HTTP polling constructor.
      *
      * @api public.
      */
    def this(req: Any) = this()
    
    /* private */ val closeTimeout: Any = js.native
    
    /**
      * Compresses data.
      *
      * @api private
      */
    def compress(data: Any, encoding: Any, callback: Any): Unit = js.native
    
    /* private */ var dataReq: Any = js.native
    
    /* private */ var dataRes: Any = js.native
    
    /**
      * Performs the write.
      *
      * @api private
      */
    def doWrite(data: Any, options: Any, callback: Any): Unit = js.native
    
    /**
      * Returns headers for a response.
      *
      * @param req - request
      * @param {Object} extra headers
      * @api private
      */
    def headers(req: Any, headers: Any): Any = js.native
    
    var httpCompression: Any = js.native
    
    var maxHttpBufferSize: Double = js.native
    
    /**
      * The client sends a request with data.
      *
      * @api private
      */
    def onDataRequest(req: Any, res: Any): Unit = js.native
    
    /**
      * Cleanup request.
      *
      * @api private
      */
    /* private */ var onDataRequestCleanup: Any = js.native
    
    /**
      * The client sends a request awaiting for us to send data.
      *
      * @api private
      */
    def onPollRequest(req: Any, res: Any): Unit = js.native
    
    /* private */ var res: Any = js.native
    
    /* private */ var shouldClose: Any = js.native
    
    /**
      * Writes data as response to poll request.
      *
      * @param {String} data
      * @param {Object} options
      * @api private
      */
    def write(data: Any, options: Any): Unit = js.native
  }
}
