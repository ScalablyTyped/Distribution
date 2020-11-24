package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Which other rules to apply in the context of this rule
  */
@js.native
trait StructureMapGroupRuleDependent extends BackboneElement {
  
  /**
    * Contains extended information for property 'name'.
    */
  var _name: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'variable'.
    */
  var _variable: js.UndefOr[js.Array[Element]] = js.native
  
  /**
    * Name of a rule or group to apply
    */
  var name: id = js.native
  
  /**
    * Variable to pass to the rule or group
    */
  var variable: js.Array[String] = js.native
}
object StructureMapGroupRuleDependent {
  
  @scala.inline
  def apply(name: id, variable: js.Array[String]): StructureMapGroupRuleDependent = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], variable = variable.asInstanceOf[js.Any])
    __obj.asInstanceOf[StructureMapGroupRuleDependent]
  }
  
  @scala.inline
  implicit class StructureMapGroupRuleDependentOps[Self <: StructureMapGroupRuleDependent] (val x: Self) extends AnyVal {
    
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
    def setName(value: id): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariableVarargs(value: String*): Self = this.set("variable", js.Array(value :_*))
    
    @scala.inline
    def setVariable(value: js.Array[String]): Self = this.set("variable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_name(value: Element): Self = this.set("_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_name: Self = this.set("_name", js.undefined)
    
    @scala.inline
    def set_variableVarargs(value: Element*): Self = this.set("_variable", js.Array(value :_*))
    
    @scala.inline
    def set_variable(value: js.Array[Element]): Self = this.set("_variable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_variable: Self = this.set("_variable", js.undefined)
  }
}
