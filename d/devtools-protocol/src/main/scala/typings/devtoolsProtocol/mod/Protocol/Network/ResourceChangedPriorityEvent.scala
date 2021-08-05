package typings.devtoolsProtocol.mod.Protocol.Network

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceChangedPriorityEvent extends StObject {
  
  /**
    * New priority
    */
  var newPriority: ResourcePriority
  
  /**
    * Request identifier.
    */
  var requestId: RequestId
  
  /**
    * Timestamp.
    */
  var timestamp: MonotonicTime
}
object ResourceChangedPriorityEvent {
  
  inline def apply(newPriority: ResourcePriority, requestId: RequestId, timestamp: MonotonicTime): ResourceChangedPriorityEvent = {
    val __obj = js.Dynamic.literal(newPriority = newPriority.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceChangedPriorityEvent]
  }
  
  extension [Self <: ResourceChangedPriorityEvent](x: Self) {
    
    inline def setNewPriority(value: ResourcePriority): Self = StObject.set(x, "newPriority", value.asInstanceOf[js.Any])
    
    inline def setRequestId(value: RequestId): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: MonotonicTime): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
  }
}
