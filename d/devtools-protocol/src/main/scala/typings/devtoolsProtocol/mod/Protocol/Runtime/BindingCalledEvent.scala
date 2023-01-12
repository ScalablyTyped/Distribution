package typings.devtoolsProtocol.mod.Protocol.Runtime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BindingCalledEvent extends StObject {
  
  /**
    * Identifier of the context where the call was made.
    */
  var executionContextId: ExecutionContextId
  
  var name: String
  
  var payload: String
}
object BindingCalledEvent {
  
  inline def apply(executionContextId: ExecutionContextId, name: String, payload: String): BindingCalledEvent = {
    val __obj = js.Dynamic.literal(executionContextId = executionContextId.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
    __obj.asInstanceOf[BindingCalledEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BindingCalledEvent] (val x: Self) extends AnyVal {
    
    inline def setExecutionContextId(value: ExecutionContextId): Self = StObject.set(x, "executionContextId", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPayload(value: String): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
  }
}
