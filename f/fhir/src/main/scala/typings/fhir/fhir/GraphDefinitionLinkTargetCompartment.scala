package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class GraphDefinitionLinkTargetCompartmentMutableBuilder[Self <: GraphDefinitionLinkTargetCompartment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: code): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setExpression(value: String): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpressionUndefined: Self = StObject.set(x, "expression", js.undefined)
    
    @scala.inline
    def setRule(value: code): Self = StObject.set(x, "rule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_code(value: Element): Self = StObject.set(x, "_code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_codeUndefined: Self = StObject.set(x, "_code", js.undefined)
    
    @scala.inline
    def set_description(value: Element): Self = StObject.set(x, "_description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_descriptionUndefined: Self = StObject.set(x, "_description", js.undefined)
    
    @scala.inline
    def set_expression(value: Element): Self = StObject.set(x, "_expression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_expressionUndefined: Self = StObject.set(x, "_expression", js.undefined)
    
    @scala.inline
    def set_rule(value: Element): Self = StObject.set(x, "_rule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_ruleUndefined: Self = StObject.set(x, "_rule", js.undefined)
  }
}
