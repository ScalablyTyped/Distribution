package typings.devtoolsProtocol.mod.Protocol.Runtime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InspectRequestedEvent extends StObject {
  
  /**
    * Identifier of the context where the call was made.
    */
  var executionContextId: js.UndefOr[ExecutionContextId] = js.undefined
  
  var hints: Any
  
  var `object`: RemoteObject
}
object InspectRequestedEvent {
  
  inline def apply(hints: Any, `object`: RemoteObject): InspectRequestedEvent = {
    val __obj = js.Dynamic.literal(hints = hints.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[InspectRequestedEvent]
  }
  
  extension [Self <: InspectRequestedEvent](x: Self) {
    
    inline def setExecutionContextId(value: ExecutionContextId): Self = StObject.set(x, "executionContextId", value.asInstanceOf[js.Any])
    
    inline def setExecutionContextIdUndefined: Self = StObject.set(x, "executionContextId", js.undefined)
    
    inline def setHints(value: Any): Self = StObject.set(x, "hints", value.asInstanceOf[js.Any])
    
    inline def setObject(value: RemoteObject): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
  }
}
