package typings.devtoolsProtocol.mod.Protocol.DOM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PushNodesByBackendIdsToFrontendRequest extends StObject {
  
  /**
    * The array of backend node ids.
    */
  var backendNodeIds: js.Array[BackendNodeId]
}
object PushNodesByBackendIdsToFrontendRequest {
  
  inline def apply(backendNodeIds: js.Array[BackendNodeId]): PushNodesByBackendIdsToFrontendRequest = {
    val __obj = js.Dynamic.literal(backendNodeIds = backendNodeIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[PushNodesByBackendIdsToFrontendRequest]
  }
  
  extension [Self <: PushNodesByBackendIdsToFrontendRequest](x: Self) {
    
    inline def setBackendNodeIds(value: js.Array[BackendNodeId]): Self = StObject.set(x, "backendNodeIds", value.asInstanceOf[js.Any])
    
    inline def setBackendNodeIdsVarargs(value: BackendNodeId*): Self = StObject.set(x, "backendNodeIds", js.Array(value*))
  }
}
