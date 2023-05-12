package typings.engineIoClient

import typings.engineIoClient.anon.TypeofsetTimeout
import typings.engineIoClient.buildEsmSocketMod.SocketOptions
import typings.engineIoParser.buildEsmCommonsMod.Packet
import typings.engineIoParser.buildEsmCommonsMod.RawData
import typings.socketIoComponentEmitter.mod.Emitter
import typings.std.Error
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildEsmTransportMod {
  
  /* note: abstract class */ @JSImport("engine.io-client/build/esm/transport", "Transport")
  @js.native
  open class Transport protected ()
    extends Emitter[
          Record[scala.Nothing, scala.Nothing], 
          Record[scala.Nothing, scala.Nothing], 
          TransportReservedEvents
        ] {
    /**
      * Transport abstract constructor.
      *
      * @param {Object} opts - options
      * @protected
      */
    def this(opts: Any) = this()
    
    /**
      * Closes the transport.
      */
    def close(): this.type = js.native
    
    /* protected */ def doClose(): Any = js.native
    
    /* protected */ def doOpen(): Any = js.native
    
    /**
      * The name of the transport
      */
    def name: String = js.native
    
    /**
      * Called upon close.
      *
      * @protected
      */
    /* protected */ def onClose(): Unit = js.native
    /* protected */ def onClose(details: CloseDetails): Unit = js.native
    
    /**
      * Called with data.
      *
      * @param {String} data
      * @protected
      */
    /* protected */ def onData(data: RawData): Unit = js.native
    
    /**
      * Emits an error.
      *
      * @param {String} reason
      * @param description
      * @param context - the error context
      * @return {Transport} for chaining
      * @protected
      */
    /* protected */ def onError(reason: String, description: Any): this.type = js.native
    /* protected */ def onError(reason: String, description: Any, context: Any): this.type = js.native
    
    /**
      * Called upon open
      *
      * @protected
      */
    /* protected */ def onOpen(): Unit = js.native
    
    /**
      * Called with a decoded packet.
      *
      * @protected
      */
    /* protected */ def onPacket(packet: Packet): Unit = js.native
    
    /**
      * Opens the transport.
      */
    def open(): this.type = js.native
    
    /* protected */ var opts: SocketOptions = js.native
    
    /**
      * Pauses the transport, in order not to lose packets during an upgrade.
      *
      * @param onPause
      */
    def pause(onPause: js.Function0[Unit]): Unit = js.native
    
    var query: Record[String, String] = js.native
    
    /* protected */ var readyState: TransportState = js.native
    
    /**
      * Sends multiple packets.
      *
      * @param {Array} packets
      */
    def send(packets: Any): Unit = js.native
    
    /* protected */ var setTimeoutFn: TypeofsetTimeout = js.native
    
    /* protected */ var socket: Any = js.native
    
    /* protected */ var supportsBinary: Boolean = js.native
    
    var writable: Boolean = js.native
    
    /* protected */ def write(packets: js.Array[Packet]): Any = js.native
  }
  
  trait CloseDetails extends StObject {
    
    var context: js.UndefOr[Any] = js.undefined
    
    var description: String
  }
  object CloseDetails {
    
    inline def apply(description: String): CloseDetails = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any])
      __obj.asInstanceOf[CloseDetails]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CloseDetails] (val x: Self) extends AnyVal {
      
      inline def setContext(value: Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
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
  
  /* Rewritten from type alias, can be one of: 
    - typings.engineIoClient.engineIoClientStrings.opening
    - typings.engineIoClient.engineIoClientStrings.open
    - typings.engineIoClient.engineIoClientStrings.closed
    - typings.engineIoClient.engineIoClientStrings.pausing
    - typings.engineIoClient.engineIoClientStrings.paused
  */
  trait TransportState extends StObject
  object TransportState {
    
    inline def closed: typings.engineIoClient.engineIoClientStrings.closed = "closed".asInstanceOf[typings.engineIoClient.engineIoClientStrings.closed]
    
    inline def open: typings.engineIoClient.engineIoClientStrings.open = "open".asInstanceOf[typings.engineIoClient.engineIoClientStrings.open]
    
    inline def opening: typings.engineIoClient.engineIoClientStrings.opening = "opening".asInstanceOf[typings.engineIoClient.engineIoClientStrings.opening]
    
    inline def paused: typings.engineIoClient.engineIoClientStrings.paused = "paused".asInstanceOf[typings.engineIoClient.engineIoClientStrings.paused]
    
    inline def pausing: typings.engineIoClient.engineIoClientStrings.pausing = "pausing".asInstanceOf[typings.engineIoClient.engineIoClientStrings.pausing]
  }
}
