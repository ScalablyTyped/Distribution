package typings.devtoolsProtocol.mod.Protocol.Network

import typings.devtoolsProtocol.mod.Protocol.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataReceivedEvent extends StObject {
  
  /**
    * Data chunk length.
    */
  var dataLength: integer
  
  /**
    * Actual bytes received (might be less than dataLength for compressed encodings).
    */
  var encodedDataLength: integer
  
  /**
    * Request identifier.
    */
  var requestId: RequestId
  
  /**
    * Timestamp.
    */
  var timestamp: MonotonicTime
}
object DataReceivedEvent {
  
  inline def apply(dataLength: integer, encodedDataLength: integer, requestId: RequestId, timestamp: MonotonicTime): DataReceivedEvent = {
    val __obj = js.Dynamic.literal(dataLength = dataLength.asInstanceOf[js.Any], encodedDataLength = encodedDataLength.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataReceivedEvent]
  }
  
  extension [Self <: DataReceivedEvent](x: Self) {
    
    inline def setDataLength(value: integer): Self = StObject.set(x, "dataLength", value.asInstanceOf[js.Any])
    
    inline def setEncodedDataLength(value: integer): Self = StObject.set(x, "encodedDataLength", value.asInstanceOf[js.Any])
    
    inline def setRequestId(value: RequestId): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: MonotonicTime): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
  }
}
