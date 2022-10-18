package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WatcherArrayCompareCondition extends StObject {
  
  var array_path: String
  
  var comparison: String
  
  var path: String
  
  var quantifier: WatcherQuantifier
  
  var value: Any
}
object WatcherArrayCompareCondition {
  
  inline def apply(array_path: String, comparison: String, path: String, quantifier: WatcherQuantifier, value: Any): WatcherArrayCompareCondition = {
    val __obj = js.Dynamic.literal(array_path = array_path.asInstanceOf[js.Any], comparison = comparison.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], quantifier = quantifier.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[WatcherArrayCompareCondition]
  }
  
  extension [Self <: WatcherArrayCompareCondition](x: Self) {
    
    inline def setArray_path(value: String): Self = StObject.set(x, "array_path", value.asInstanceOf[js.Any])
    
    inline def setComparison(value: String): Self = StObject.set(x, "comparison", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuantifier(value: WatcherQuantifier): Self = StObject.set(x, "quantifier", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
