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
  
  @scala.inline
  def apply(): FilterOperation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilterOperation]
  }
  
  @scala.inline
  implicit class FilterOperationMutableBuilder[Self <: FilterOperation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setField(value: FilterOperation): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    @scala.inline
    def setFilterOperation(value: String): Self = StObject.set(x, "filterOperation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterOperationUndefined: Self = StObject.set(x, "filterOperation", js.undefined)
    
    @scala.inline
    def setSetValue(value: js.Function): Self = StObject.set(x, "setValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetValueUndefined: Self = StObject.set(x, "setValue", js.undefined)
    
    @scala.inline
    def setValue(value: String | Double | typings.std.Date): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
