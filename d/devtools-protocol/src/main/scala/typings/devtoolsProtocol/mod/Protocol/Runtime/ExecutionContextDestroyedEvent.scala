package typings.devtoolsProtocol.mod.Protocol.Runtime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExecutionContextDestroyedEvent extends StObject {
  
  /**
    * Id of the destroyed context
    */
  var executionContextId: ExecutionContextId
  
  /**
    * Unique Id of the destroyed context
    */
  var executionContextUniqueId: String
}
object ExecutionContextDestroyedEvent {
  
  inline def apply(executionContextId: ExecutionContextId, executionContextUniqueId: String): ExecutionContextDestroyedEvent = {
    val __obj = js.Dynamic.literal(executionContextId = executionContextId.asInstanceOf[js.Any], executionContextUniqueId = executionContextUniqueId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecutionContextDestroyedEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExecutionContextDestroyedEvent] (val x: Self) extends AnyVal {
    
    inline def setExecutionContextId(value: ExecutionContextId): Self = StObject.set(x, "executionContextId", value.asInstanceOf[js.Any])
    
    inline def setExecutionContextUniqueId(value: String): Self = StObject.set(x, "executionContextUniqueId", value.asInstanceOf[js.Any])
  }
}
