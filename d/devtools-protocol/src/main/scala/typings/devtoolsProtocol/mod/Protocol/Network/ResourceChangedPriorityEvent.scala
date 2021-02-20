package typings.devtoolsProtocol.mod.Protocol.Network

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResourceChangedPriorityEvent extends StObject {
  
  /**
    * New priority
    */
  var newPriority: ResourcePriority = js.native
  
  /**
    * Request identifier.
    */
  var requestId: RequestId = js.native
  
  /**
    * Timestamp.
    */
  var timestamp: MonotonicTime = js.native
}
object ResourceChangedPriorityEvent {
  
  @scala.inline
  def apply(newPriority: ResourcePriority, requestId: RequestId, timestamp: MonotonicTime): ResourceChangedPriorityEvent = {
    val __obj = js.Dynamic.literal(newPriority = newPriority.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceChangedPriorityEvent]
  }
  
  @scala.inline
  implicit class ResourceChangedPriorityEventMutableBuilder[Self <: ResourceChangedPriorityEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNewPriority(value: ResourcePriority): Self = StObject.set(x, "newPriority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestId(value: RequestId): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: MonotonicTime): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
  }
}
