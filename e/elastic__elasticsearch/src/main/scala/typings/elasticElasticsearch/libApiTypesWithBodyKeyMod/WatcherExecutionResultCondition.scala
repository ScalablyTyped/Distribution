package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WatcherExecutionResultCondition extends StObject {
  
  var met: Boolean
  
  var status: WatcherActionStatusOptions
  
  var `type`: WatcherConditionType
}
object WatcherExecutionResultCondition {
  
  inline def apply(met: Boolean, status: WatcherActionStatusOptions, `type`: WatcherConditionType): WatcherExecutionResultCondition = {
    val __obj = js.Dynamic.literal(met = met.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WatcherExecutionResultCondition]
  }
  
  extension [Self <: WatcherExecutionResultCondition](x: Self) {
    
    inline def setMet(value: Boolean): Self = StObject.set(x, "met", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: WatcherActionStatusOptions): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setType(value: WatcherConditionType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
