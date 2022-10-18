package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchCollector extends StObject {
  
  var children: js.UndefOr[js.Array[SearchCollector]] = js.undefined
  
  var name: String
  
  var reason: String
  
  var time_in_nanos: DurationValue[UnitNanos]
}
object SearchCollector {
  
  inline def apply(name: String, reason: String, time_in_nanos: DurationValue[UnitNanos]): SearchCollector = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], time_in_nanos = time_in_nanos.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchCollector]
  }
  
  extension [Self <: SearchCollector](x: Self) {
    
    inline def setChildren(value: js.Array[SearchCollector]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: SearchCollector*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setTime_in_nanos(value: DurationValue[UnitNanos]): Self = StObject.set(x, "time_in_nanos", value.asInstanceOf[js.Any])
  }
}
