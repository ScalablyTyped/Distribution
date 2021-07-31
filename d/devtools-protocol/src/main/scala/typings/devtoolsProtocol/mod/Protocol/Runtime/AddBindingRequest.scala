package typings.devtoolsProtocol.mod.Protocol.Runtime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddBindingRequest extends StObject {
  
  var executionContextId: js.UndefOr[ExecutionContextId] = js.undefined
  
  var name: String
}
object AddBindingRequest {
  
  @scala.inline
  def apply(name: String): AddBindingRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddBindingRequest]
  }
  
  @scala.inline
  implicit class AddBindingRequestMutableBuilder[Self <: AddBindingRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExecutionContextId(value: ExecutionContextId): Self = StObject.set(x, "executionContextId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecutionContextIdUndefined: Self = StObject.set(x, "executionContextId", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
