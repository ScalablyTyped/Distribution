package typings.devextreme.mod.DevExpress.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValidationCallbackData extends StObject {
  
  var column: js.UndefOr[Any] = js.undefined
  
  var data: js.UndefOr[Any] = js.undefined
  
  var formItem: js.UndefOr[Any] = js.undefined
  
  var rule: Any
  
  var validator: Any
  
  var value: js.UndefOr[Any] = js.undefined
}
object ValidationCallbackData {
  
  inline def apply(rule: Any, validator: Any): ValidationCallbackData = {
    val __obj = js.Dynamic.literal(rule = rule.asInstanceOf[js.Any], validator = validator.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidationCallbackData]
  }
  
  extension [Self <: ValidationCallbackData](x: Self) {
    
    inline def setColumn(value: Any): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    inline def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
    
    inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setFormItem(value: Any): Self = StObject.set(x, "formItem", value.asInstanceOf[js.Any])
    
    inline def setFormItemUndefined: Self = StObject.set(x, "formItem", js.undefined)
    
    inline def setRule(value: Any): Self = StObject.set(x, "rule", value.asInstanceOf[js.Any])
    
    inline def setValidator(value: Any): Self = StObject.set(x, "validator", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
