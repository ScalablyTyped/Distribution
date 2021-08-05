package typings.devtoolsProtocol.mod.Protocol.Page

import typings.devtoolsProtocol.mod.Protocol.Runtime.ExecutionContextId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateIsolatedWorldResponse extends StObject {
  
  /**
    * Execution context of the isolated world.
    */
  var executionContextId: ExecutionContextId
}
object CreateIsolatedWorldResponse {
  
  inline def apply(executionContextId: ExecutionContextId): CreateIsolatedWorldResponse = {
    val __obj = js.Dynamic.literal(executionContextId = executionContextId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateIsolatedWorldResponse]
  }
  
  extension [Self <: CreateIsolatedWorldResponse](x: Self) {
    
    inline def setExecutionContextId(value: ExecutionContextId): Self = StObject.set(x, "executionContextId", value.asInstanceOf[js.Any])
  }
}
