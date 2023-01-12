package typings.engineIoClient

import typings.engineIoClient.anon.TypeofsetTimeout
import typings.engineIoClient.buildEsmSocketMod.SocketOptions
import typings.engineIoParser.buildEsmCommonsMod.Packet
import typings.engineIoParser.buildEsmCommonsMod.RawData
import typings.socketIoComponentEmitter.mod.Emitter
import typings.std.CloseEvent
import typings.std.Error
import typings.std.XMLHttpRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildEsmTransportMod {
  
  /* note: abstract class */ @JSImport("engine.io-client/build/esm/transport", "Transport")
  @js.native
  open class Transport protected ()
    extends Emitter[js.Object, js.Object, TransportReservedEvents] {
    /**
      * Transport abstract constructor.
      *
      * @param {Object} options.
      * @api private
      */
    def this(opts: Any) = this()
    
    /**
      * Closes the transport.
      *
      * @api public
      */
    def close(): this.type = js.native
    
    /* protected */ def doClose(): Any = js.native
    
    /* protected */ def doOpen(): Any = js.native
    
    /**
      * Called upon close.
      *
      * @api protected
      */
    /* protected */ def onClose(): Unit = js.native
    /* protected */ def onClose(details: CloseDetails): Unit = js.native
    
    /**
      * Called with data.
      *
      * @param {String} data
      * @api protected
      */
    /* protected */ def onData(data: RawData): Unit = js.native
    
    /**
      * Emits an error.
      *
      * @param {String} reason
      * @param description
      * @param context - the error context
      * @return {Transport} for chaining
      * @api protected
      */
    /* protected */ def onError(reason: String, description: Any): this.type = js.native
    /* protected */ def onError(reason: String, description: Any, context: Any): this.type = js.native
    
    /**
      * Called upon open
      *
      * @api protected
      */
    /* protected */ def onOpen(): Unit = js.native
    
    /**
      * Called with a decoded packet.
      *
      * @api protected
      */
    /* protected */ def onPacket(packet: Packet): Unit = js.native
    
    /**
      * Opens the transport.
      *
      * @api public
      */
    /* private */ var open: Any = js.native
    
    /* protected */ var opts: SocketOptions = js.native
    
    /* protected */ var query: js.Object = js.native
    
    /* protected */ var readyState: String = js.native
    
    /**
      * Sends multiple packets.
      *
      * @param {Array} packets
      * @api public
      */
    def send(packets: Any): Unit = js.native
    
    /* protected */ var setTimeoutFn: TypeofsetTimeout = js.native
    
    /* protected */ var socket: Any = js.native
    
    /* protected */ var supportsBinary: Boolean = js.native
    
    /* protected */ var writable: Boolean = js.native
    
    /* protected */ def write(packets: Any): Any = js.native
  }
  
  trait CloseDetails extends StObject {
    
    var context: js.UndefOr[CloseEvent | XMLHttpRequest] = js.undefined
    
    var description: String
  }
  object CloseDetails {
    
    inline def apply(description: String): CloseDetails = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any])
      __obj.asInstanceOf[CloseDetails]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CloseDetails] (val x: Self) extends AnyVal {
      
      inline def setContext(value: CloseEvent | XMLHttpRequest): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    }
  }
  
  trait TransportError
    extends StObject
       with Error {
    
    val context: Any
    
    val description: Any
    
    val `type`: /* "TransportError" */ String
  }
  object TransportError {
    
    inline def apply(
      context: Any,
      description: Any,
      message: String,
      name: String,
      `type`: /* "TransportError" */ String
    ): TransportError = {
      val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[TransportError]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TransportError] (val x: Self) extends AnyVal {
      
      inline def setContext(value: Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setDescription(value: Any): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setType(value: /* "TransportError" */ String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TransportReservedEvents extends StObject {
    
    def close(): Unit = js.native
    def close(details: CloseDetails): Unit = js.native
    
    def drain(): Unit = js.native
    
    def error(err: TransportError): Unit = js.native
    
    def open(): Unit = js.native
    
    def packet(packet: Packet): Unit = js.native
    
    def poll(): Unit = js.native
    
    def pollComplete(): Unit = js.native
  }
}
