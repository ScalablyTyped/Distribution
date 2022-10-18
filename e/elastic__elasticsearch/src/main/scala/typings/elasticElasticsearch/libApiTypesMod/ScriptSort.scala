package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScriptSort extends StObject {
  
  var mode: js.UndefOr[SortMode] = js.undefined
  
  var nested: js.UndefOr[NestedSortValue] = js.undefined
  
  var order: js.UndefOr[SortOrder] = js.undefined
  
  var script: Script
  
  var `type`: js.UndefOr[ScriptSortType] = js.undefined
}
object ScriptSort {
  
  inline def apply(script: Script): ScriptSort = {
    val __obj = js.Dynamic.literal(script = script.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScriptSort]
  }
  
  extension [Self <: ScriptSort](x: Self) {
    
    inline def setMode(value: SortMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setNested(value: NestedSortValue): Self = StObject.set(x, "nested", value.asInstanceOf[js.Any])
    
    inline def setNestedUndefined: Self = StObject.set(x, "nested", js.undefined)
    
    inline def setOrder(value: SortOrder): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    
    inline def setScript(value: Script): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
    
    inline def setType(value: ScriptSortType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
