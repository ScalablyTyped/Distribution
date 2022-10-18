package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WatcherConditionContainer extends StObject {
  
  var always: js.UndefOr[WatcherAlwaysCondition] = js.undefined
  
  var array_compare: js.UndefOr[WatcherArrayCompareCondition] = js.undefined
  
  var compare: js.UndefOr[WatcherCompareCondition] = js.undefined
  
  var never: js.UndefOr[WatcherNeverCondition] = js.undefined
  
  var script: js.UndefOr[WatcherScriptCondition] = js.undefined
}
object WatcherConditionContainer {
  
  inline def apply(): WatcherConditionContainer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WatcherConditionContainer]
  }
  
  extension [Self <: WatcherConditionContainer](x: Self) {
    
    inline def setAlways(value: WatcherAlwaysCondition): Self = StObject.set(x, "always", value.asInstanceOf[js.Any])
    
    inline def setAlwaysUndefined: Self = StObject.set(x, "always", js.undefined)
    
    inline def setArray_compare(value: WatcherArrayCompareCondition): Self = StObject.set(x, "array_compare", value.asInstanceOf[js.Any])
    
    inline def setArray_compareUndefined: Self = StObject.set(x, "array_compare", js.undefined)
    
    inline def setCompare(value: WatcherCompareCondition): Self = StObject.set(x, "compare", value.asInstanceOf[js.Any])
    
    inline def setCompareUndefined: Self = StObject.set(x, "compare", js.undefined)
    
    inline def setNever(value: WatcherNeverCondition): Self = StObject.set(x, "never", value.asInstanceOf[js.Any])
    
    inline def setNeverUndefined: Self = StObject.set(x, "never", js.undefined)
    
    inline def setScript(value: WatcherScriptCondition): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
    
    inline def setScriptUndefined: Self = StObject.set(x, "script", js.undefined)
  }
}
