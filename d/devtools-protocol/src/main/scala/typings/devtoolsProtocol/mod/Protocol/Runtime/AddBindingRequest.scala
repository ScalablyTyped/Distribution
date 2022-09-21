package typings.devtoolsProtocol.mod.Protocol.Runtime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddBindingRequest extends StObject {
  
  /**
    * If specified, the binding would only be exposed to the specified
    * execution context. If omitted and `executionContextName` is not set,
    * the binding is exposed to all execution contexts of the target.
    * This parameter is mutually exclusive with `executionContextName`.
    * Deprecated in favor of `executionContextName` due to an unclear use case
    * and bugs in implementation (crbug.com/1169639). `executionContextId` will be
    * removed in the future.
    */
  var executionContextId: js.UndefOr[ExecutionContextId] = js.undefined
  
  /**
    * If specified, the binding is exposed to the executionContext with
    * matching name, even for contexts created after the binding is added.
    * See also `ExecutionContext.name` and `worldName` parameter to
    * `Page.addScriptToEvaluateOnNewDocument`.
    * This parameter is mutually exclusive with `executionContextId`.
    */
  var executionContextName: js.UndefOr[String] = js.undefined
  
  var name: String
}
object AddBindingRequest {
  
  inline def apply(name: String): AddBindingRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddBindingRequest]
  }
  
  extension [Self <: AddBindingRequest](x: Self) {
    
    inline def setExecutionContextId(value: ExecutionContextId): Self = StObject.set(x, "executionContextId", value.asInstanceOf[js.Any])
    
    inline def setExecutionContextIdUndefined: Self = StObject.set(x, "executionContextId", js.undefined)
    
    inline def setExecutionContextName(value: String): Self = StObject.set(x, "executionContextName", value.asInstanceOf[js.Any])
    
    inline def setExecutionContextNameUndefined: Self = StObject.set(x, "executionContextName", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
