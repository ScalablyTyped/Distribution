package typings.devextreme.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Column extends StObject {
  
  var column: js.UndefOr[js.Any] = js.undefined
  
  var data: js.UndefOr[js.Any] = js.undefined
  
  var formItem: js.UndefOr[js.Any] = js.undefined
  
  var rule: js.UndefOr[js.Any] = js.undefined
  
  var validator: js.UndefOr[js.Any] = js.undefined
  
  var value: js.UndefOr[String | Double] = js.undefined
}
object Column {
  
  inline def apply(): Column = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Column]
  }
  
  extension [Self <: Column](x: Self) {
    
    inline def setColumn(value: js.Any): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    inline def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
    
    inline def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setFormItem(value: js.Any): Self = StObject.set(x, "formItem", value.asInstanceOf[js.Any])
    
    inline def setFormItemUndefined: Self = StObject.set(x, "formItem", js.undefined)
    
    inline def setRule(value: js.Any): Self = StObject.set(x, "rule", value.asInstanceOf[js.Any])
    
    inline def setRuleUndefined: Self = StObject.set(x, "rule", js.undefined)
    
    inline def setValidator(value: js.Any): Self = StObject.set(x, "validator", value.asInstanceOf[js.Any])
    
    inline def setValidatorUndefined: Self = StObject.set(x, "validator", js.undefined)
    
    inline def setValue(value: String | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
