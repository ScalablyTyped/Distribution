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
  
  @scala.inline
  def apply(): Column = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Column]
  }
  
  @scala.inline
  implicit class ColumnMutableBuilder[Self <: Column] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumn(value: js.Any): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
    
    @scala.inline
    def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setFormItem(value: js.Any): Self = StObject.set(x, "formItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormItemUndefined: Self = StObject.set(x, "formItem", js.undefined)
    
    @scala.inline
    def setRule(value: js.Any): Self = StObject.set(x, "rule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuleUndefined: Self = StObject.set(x, "rule", js.undefined)
    
    @scala.inline
    def setValidator(value: js.Any): Self = StObject.set(x, "validator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidatorUndefined: Self = StObject.set(x, "validator", js.undefined)
    
    @scala.inline
    def setValue(value: String | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
