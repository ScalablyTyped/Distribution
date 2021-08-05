package typings.devextreme.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClearFilter extends StObject {
  
  var clearFilter: js.UndefOr[String] = js.undefined
  
  var createFilter: js.UndefOr[String] = js.undefined
  
  var filterEnabledHint: js.UndefOr[String] = js.undefined
}
object ClearFilter {
  
  inline def apply(): ClearFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClearFilter]
  }
  
  extension [Self <: ClearFilter](x: Self) {
    
    inline def setClearFilter(value: String): Self = StObject.set(x, "clearFilter", value.asInstanceOf[js.Any])
    
    inline def setClearFilterUndefined: Self = StObject.set(x, "clearFilter", js.undefined)
    
    inline def setCreateFilter(value: String): Self = StObject.set(x, "createFilter", value.asInstanceOf[js.Any])
    
    inline def setCreateFilterUndefined: Self = StObject.set(x, "createFilter", js.undefined)
    
    inline def setFilterEnabledHint(value: String): Self = StObject.set(x, "filterEnabledHint", value.asInstanceOf[js.Any])
    
    inline def setFilterEnabledHintUndefined: Self = StObject.set(x, "filterEnabledHint", js.undefined)
  }
}
