package typings.engineIo

import typings.engineIo.anon.Cleanup
import typings.engineIoParser.commonsMod.Packet
import typings.node.eventsMod.EventEmitter
import typings.node.httpMod.IncomingMessage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object transportMod {
  
  @JSImport("engine.io/build/transport", "Transport")
  @js.native
  abstract class Transport protected () extends EventEmitter {
    /**
      * Transport constructor.
      *
      * @param {http.IncomingMessage} request
      * @api public
      */
    def this(req: Any) = this()
    
    /* protected */ var _readyState: String = js.native
    
    /**
      * Closes the transport.
      *
      * @api private
      */
    def close(): Unit = js.native
    def close(fn: Any): Unit = js.native
    
    /**
      * Flags the transport as discarded.
      *
      * @api private
      */
    def discard(): Unit = js.native
    
    /* protected */ var discarded: Boolean = js.native
    
    def doClose(): Any = js.native
    def doClose(fn: Any): Any = js.native
    
    def name: Any = js.native
    
    /**
      * Called upon transport close.
      *
      * @api protected
      */
    /* protected */ def onClose(): Unit = js.native
    
    /**
      * Called with the encoded packet data.
      *
      * @param {String} data
      * @api protected
      */
    /* protected */ def onData(data: Any): Unit = js.native
    
    /**
      * Called with a transport error.
      *
      * @param {String} message error
      * @param {Object} error description
      * @api protected
      */
    /* protected */ def onError(msg: String): Unit = js.native
    /* protected */ def onError(msg: String, desc: Any): Unit = js.native
    
    /**
      * Called with parsed out a packets from the data stream.
      *
      * @param {Object} packet
      * @api protected
      */
    /* protected */ def onPacket(packet: Packet): Unit = js.native
    
    /**
      * Called with an incoming HTTP request.
      *
      * @param {http.IncomingMessage} request
      * @api protected
      */
    /* protected */ def onRequest(req: Any): Unit = js.native
    
    /* protected */ var parser: Any = js.native
    
    var protocol: Double = js.native
    
    def readyState: String = js.native
    def readyState_=(state: String): Unit = js.native
    
    /* protected */ var req: IncomingMessage & Cleanup = js.native
    
    def send(packets: Any): Any = js.native
    
    var sid: String = js.native
    
    /* protected */ var supportsBinary: Boolean = js.native
    
    def supportsFraming: Any = js.native
    
    var writable: Boolean = js.native
  }
}
