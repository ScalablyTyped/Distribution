package typings.devextreme.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FilterOperation extends StObject {
  
  var field: js.UndefOr[this.type] = js.undefined
  
  var filterOperation: js.UndefOr[String] = js.undefined
  
  var setValue: js.UndefOr[js.Function] = js.undefined
  
  var value: js.UndefOr[String | Double | typings.std.Date] = js.undefined
}
object FilterOperation {
  
  inline def apply(): FilterOperation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilterOperation]
  }
  
  extension [Self <: FilterOperation](x: Self) {
    
    inline def setField(value: FilterOperation): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    inline def setFilterOperation(value: String): Self = StObject.set(x, "filterOperation", value.asInstanceOf[js.Any])
    
    inline def setFilterOperationUndefined: Self = StObject.set(x, "filterOperation", js.undefined)
    
    inline def setSetValue(value: js.Function): Self = StObject.set(x, "setValue", value.asInstanceOf[js.Any])
    
    inline def setSetValueUndefined: Self = StObject.set(x, "setValue", js.undefined)
    
    inline def setValue(value: String | Double | typings.std.Date): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
