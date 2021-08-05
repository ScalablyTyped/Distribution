package typings.devtoolsProtocol.mod.Protocol.Runtime

import typings.devtoolsProtocol.mod.Protocol.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetAsyncCallStackDepthRequest extends StObject {
  
  /**
    * Maximum depth of async call stacks. Setting to `0` will effectively disable collecting async
    * call stacks (default).
    */
  var maxDepth: integer
}
object SetAsyncCallStackDepthRequest {
  
  inline def apply(maxDepth: integer): SetAsyncCallStackDepthRequest = {
    val __obj = js.Dynamic.literal(maxDepth = maxDepth.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetAsyncCallStackDepthRequest]
  }
  
  extension [Self <: SetAsyncCallStackDepthRequest](x: Self) {
    
    inline def setMaxDepth(value: integer): Self = StObject.set(x, "maxDepth", value.asInstanceOf[js.Any])
  }
}
