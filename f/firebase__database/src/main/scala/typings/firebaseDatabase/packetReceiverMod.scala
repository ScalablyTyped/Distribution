package typings.firebaseDatabase

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/database/dist/src/realtime/polling/PacketReceiver", JSImport.Namespace)
@js.native
object packetReceiverMod extends js.Object {
  
  @js.native
  class PacketReceiver protected () extends js.Object {
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
      * @param {number} requestNum
      * @param {Array} data
      */
    def handleResponse(requestNum: Double, data: js.Array[_]): Unit = js.native
    
    var onClose: js.Function0[Unit] | Null = js.native
    
    var onMessage_ : js.Any = js.native
    
    var pendingResponses: js.Array[_] = js.native
  }
}
