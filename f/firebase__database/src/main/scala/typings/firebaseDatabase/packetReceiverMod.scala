package typings.firebaseDatabase

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object packetReceiverMod {
  
  @JSImport("@firebase/database/dist/node-esm/src/realtime/polling/PacketReceiver", "PacketReceiver")
  @js.native
  open class PacketReceiver protected () extends StObject {
    /**
      * @param onMessage_
      */
    def this(onMessage_ : js.Function1[/* a */ js.Object, Unit]) = this()
    
    def closeAfter(responseNum: Double, callback: js.Function0[Unit]): Unit = js.native
    
    var closeAfterResponse: Double = js.native
    
    var currentResponseNum: Double = js.native
    
    /**
      * Each message from the server comes with a response number, and an array of data. The responseNumber
      * allows us to ensure that we process them in the right order, since we can't be guaranteed that all
      * browsers will respond in the same order as the requests we sent
      */
    def handleResponse(requestNum: Double, data: js.Array[Any]): Unit = js.native
    
    var onClose: js.Function0[Unit] | Null = js.native
    
    /* private */ var onMessage_ : Any = js.native
    
    var pendingResponses: js.Array[Any] = js.native
  }
}
