package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WatcherExecutionState extends StObject {
  
  var reason: js.UndefOr[String] = js.undefined
  
  var successful: Boolean
  
  var timestamp: DateTime
}
object WatcherExecutionState {
  
  inline def apply(successful: Boolean, timestamp: DateTime): WatcherExecutionState = {
    val __obj = js.Dynamic.literal(successful = successful.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[WatcherExecutionState]
  }
  
  extension [Self <: WatcherExecutionState](x: Self) {
    
    inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
    
    inline def setSuccessful(value: Boolean): Self = StObject.set(x, "successful", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: DateTime): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
  }
}
