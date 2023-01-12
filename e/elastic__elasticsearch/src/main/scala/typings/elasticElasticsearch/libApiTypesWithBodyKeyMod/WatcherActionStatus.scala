package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WatcherActionStatus extends StObject {
  
  var ack: WatcherAcknowledgeState
  
  var last_execution: js.UndefOr[WatcherExecutionState] = js.undefined
  
  var last_successful_execution: js.UndefOr[WatcherExecutionState] = js.undefined
  
  var last_throttle: js.UndefOr[WatcherThrottleState] = js.undefined
}
object WatcherActionStatus {
  
  inline def apply(ack: WatcherAcknowledgeState): WatcherActionStatus = {
    val __obj = js.Dynamic.literal(ack = ack.asInstanceOf[js.Any])
    __obj.asInstanceOf[WatcherActionStatus]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WatcherActionStatus] (val x: Self) extends AnyVal {
    
    inline def setAck(value: WatcherAcknowledgeState): Self = StObject.set(x, "ack", value.asInstanceOf[js.Any])
    
    inline def setLast_execution(value: WatcherExecutionState): Self = StObject.set(x, "last_execution", value.asInstanceOf[js.Any])
    
    inline def setLast_executionUndefined: Self = StObject.set(x, "last_execution", js.undefined)
    
    inline def setLast_successful_execution(value: WatcherExecutionState): Self = StObject.set(x, "last_successful_execution", value.asInstanceOf[js.Any])
    
    inline def setLast_successful_executionUndefined: Self = StObject.set(x, "last_successful_execution", js.undefined)
    
    inline def setLast_throttle(value: WatcherThrottleState): Self = StObject.set(x, "last_throttle", value.asInstanceOf[js.Any])
    
    inline def setLast_throttleUndefined: Self = StObject.set(x, "last_throttle", js.undefined)
  }
}
