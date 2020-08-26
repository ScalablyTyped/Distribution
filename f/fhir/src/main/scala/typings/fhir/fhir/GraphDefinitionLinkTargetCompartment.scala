package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Compartment Consistency Rules
  */
@js.native
trait GraphDefinitionLinkTargetCompartment extends BackboneElement {
  /**
    * Contains extended information for property 'code'.
    */
  var _code: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'description'.
    */
  var _description: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'expression'.
    */
  var _expression: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'rule'.
    */
  var _rule: js.UndefOr[Element] = js.native
  /**
    * Identifies the compartment
    */
  var code: typings.fhir.fhir.code = js.native
  /**
    * Documentation for FHIRPath expression
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Custom rule, as a FHIRPath expression
    */
  var expression: js.UndefOr[String] = js.native
  /**
    * identical | matching | different | custom
    */
  var rule: code = js.native
}

object GraphDefinitionLinkTargetCompartment {
  @scala.inline
  def apply(code: code, rule: code): GraphDefinitionLinkTargetCompartment = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], rule = rule.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphDefinitionLinkTargetCompartment]
  }
  @scala.inline
  implicit class GraphDefinitionLinkTargetCompartmentOps[Self <: GraphDefinitionLinkTargetCompartment] (val x: Self) extends AnyVal {
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
    def setCode(value: code): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def setRule(value: code): Self = this.set("rule", value.asInstanceOf[js.Any])
    @scala.inline
    def set_code(value: Element): Self = this.set("_code", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_code: Self = this.set("_code", js.undefined)
    @scala.inline
    def set_description(value: Element): Self = this.set("_description", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_description: Self = this.set("_description", js.undefined)
    @scala.inline
    def set_expression(value: Element): Self = this.set("_expression", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_expression: Self = this.set("_expression", js.undefined)
    @scala.inline
    def set_rule(value: Element): Self = this.set("_rule", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_rule: Self = this.set("_rule", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setExpression(value: String): Self = this.set("expression", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpression: Self = this.set("expression", js.undefined)
  }
  
}

