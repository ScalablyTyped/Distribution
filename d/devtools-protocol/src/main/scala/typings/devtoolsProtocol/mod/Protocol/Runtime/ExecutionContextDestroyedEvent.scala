package typings.devtoolsProtocol.mod.Protocol.Runtime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExecutionContextDestroyedEvent extends StObject {
  
  /**
    * Id of the destroyed context
    */
  var executionContextId: ExecutionContextId
}
object ExecutionContextDestroyedEvent {
  
  @scala.inline
  def apply(executionContextId: ExecutionContextId): ExecutionContextDestroyedEvent = {
    val __obj = js.Dynamic.literal(executionContextId = executionContextId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecutionContextDestroyedEvent]
  }
  
  @scala.inline
  implicit class ExecutionContextDestroyedEventMutableBuilder[Self <: ExecutionContextDestroyedEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExecutionContextId(value: ExecutionContextId): Self = StObject.set(x, "executionContextId", value.asInstanceOf[js.Any])
  }
}
