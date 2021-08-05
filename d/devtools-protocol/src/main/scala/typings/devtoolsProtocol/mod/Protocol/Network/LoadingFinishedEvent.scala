package typings.devtoolsProtocol.mod.Protocol.Network

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoadingFinishedEvent extends StObject {
  
  /**
    * Total number of bytes received for this request.
    */
  var encodedDataLength: Double
  
  /**
    * Request identifier.
    */
  var requestId: RequestId
  
  /**
    * Set when 1) response was blocked by Cross-Origin Read Blocking and also
    * 2) this needs to be reported to the DevTools console.
    */
  var shouldReportCorbBlocking: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Timestamp.
    */
  var timestamp: MonotonicTime
}
object LoadingFinishedEvent {
  
  inline def apply(encodedDataLength: Double, requestId: RequestId, timestamp: MonotonicTime): LoadingFinishedEvent = {
    val __obj = js.Dynamic.literal(encodedDataLength = encodedDataLength.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadingFinishedEvent]
  }
  
  extension [Self <: LoadingFinishedEvent](x: Self) {
    
    inline def setEncodedDataLength(value: Double): Self = StObject.set(x, "encodedDataLength", value.asInstanceOf[js.Any])
    
    inline def setRequestId(value: RequestId): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    inline def setShouldReportCorbBlocking(value: Boolean): Self = StObject.set(x, "shouldReportCorbBlocking", value.asInstanceOf[js.Any])
    
    inline def setShouldReportCorbBlockingUndefined: Self = StObject.set(x, "shouldReportCorbBlocking", js.undefined)
    
    inline def setTimestamp(value: MonotonicTime): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
  }
}
