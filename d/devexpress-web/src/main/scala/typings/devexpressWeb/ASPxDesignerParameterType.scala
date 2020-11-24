package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ASPxDesignerParameterType extends js.Object {
  
  var defaultVal: js.Any = js.native
  
  var displayValue: String = js.native
  
  var specifics: String = js.native
  
  var value: String = js.native
  
  def valueConverter(`val`: js.Any): js.Any = js.native
}
object ASPxDesignerParameterType {
  
  @scala.inline
  def apply(
    defaultVal: js.Any,
    displayValue: String,
    specifics: String,
    value: String,
    valueConverter: js.Any => js.Any
  ): ASPxDesignerParameterType = {
    val __obj = js.Dynamic.literal(defaultVal = defaultVal.asInstanceOf[js.Any], displayValue = displayValue.asInstanceOf[js.Any], specifics = specifics.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], valueConverter = js.Any.fromFunction1(valueConverter))
    __obj.asInstanceOf[ASPxDesignerParameterType]
  }
  
  @scala.inline
  implicit class ASPxDesignerParameterTypeOps[Self <: ASPxDesignerParameterType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDefaultVal(value: js.Any): Self = this.set("defaultVal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayValue(value: String): Self = this.set("displayValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpecifics(value: String): Self = this.set("specifics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueConverter(value: js.Any => js.Any): Self = this.set("valueConverter", js.Any.fromFunction1(value))
  }
}
