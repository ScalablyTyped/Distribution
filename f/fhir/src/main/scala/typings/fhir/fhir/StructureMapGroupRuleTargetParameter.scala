package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Parameters to the transform
  */
@js.native
trait StructureMapGroupRuleTargetParameter extends BackboneElement {
  
  /**
    * Contains extended information for property 'valueBoolean'.
    */
  var _valueBoolean: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'valueDecimal'.
    */
  var _valueDecimal: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'valueId'.
    */
  var _valueId: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'valueInteger'.
    */
  var _valueInteger: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'valueString'.
    */
  var _valueString: js.UndefOr[Element] = js.native
  
  /**
    * Parameter value - variable or literal
    */
  var valueBoolean: js.UndefOr[Boolean] = js.native
  
  /**
    * Parameter value - variable or literal
    */
  var valueDecimal: js.UndefOr[decimal] = js.native
  
  /**
    * Parameter value - variable or literal
    */
  var valueId: js.UndefOr[id] = js.native
  
  /**
    * Parameter value - variable or literal
    */
  var valueInteger: js.UndefOr[integer] = js.native
  
  /**
    * Parameter value - variable or literal
    */
  var valueString: js.UndefOr[String] = js.native
}
object StructureMapGroupRuleTargetParameter {
  
  @scala.inline
  def apply(): StructureMapGroupRuleTargetParameter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StructureMapGroupRuleTargetParameter]
  }
  
  @scala.inline
  implicit class StructureMapGroupRuleTargetParameterOps[Self <: StructureMapGroupRuleTargetParameter] (val x: Self) extends AnyVal {
    
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
    def set_valueBoolean(value: Element): Self = this.set("_valueBoolean", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_valueBoolean: Self = this.set("_valueBoolean", js.undefined)
    
    @scala.inline
    def set_valueDecimal(value: Element): Self = this.set("_valueDecimal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_valueDecimal: Self = this.set("_valueDecimal", js.undefined)
    
    @scala.inline
    def set_valueId(value: Element): Self = this.set("_valueId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_valueId: Self = this.set("_valueId", js.undefined)
    
    @scala.inline
    def set_valueInteger(value: Element): Self = this.set("_valueInteger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_valueInteger: Self = this.set("_valueInteger", js.undefined)
    
    @scala.inline
    def set_valueString(value: Element): Self = this.set("_valueString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_valueString: Self = this.set("_valueString", js.undefined)
    
    @scala.inline
    def setValueBoolean(value: Boolean): Self = this.set("valueBoolean", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValueBoolean: Self = this.set("valueBoolean", js.undefined)
    
    @scala.inline
    def setValueDecimal(value: decimal): Self = this.set("valueDecimal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValueDecimal: Self = this.set("valueDecimal", js.undefined)
    
    @scala.inline
    def setValueId(value: id): Self = this.set("valueId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValueId: Self = this.set("valueId", js.undefined)
    
    @scala.inline
    def setValueInteger(value: integer): Self = this.set("valueInteger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValueInteger: Self = this.set("valueInteger", js.undefined)
    
    @scala.inline
    def setValueString(value: String): Self = this.set("valueString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValueString: Self = this.set("valueString", js.undefined)
  }
}
