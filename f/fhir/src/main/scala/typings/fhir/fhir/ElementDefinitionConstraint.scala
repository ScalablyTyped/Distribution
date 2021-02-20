package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Condition that must evaluate to true
  */
@js.native
trait ElementDefinitionConstraint extends Element {
  
  /**
    * Contains extended information for property 'expression'.
    */
  var _expression: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'human'.
    */
  var _human: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'key'.
    */
  var _key: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'requirements'.
    */
  var _requirements: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'severity'.
    */
  var _severity: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'source'.
    */
  var _source: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'xpath'.
    */
  var _xpath: js.UndefOr[Element] = js.native
  
  /**
    * FHIRPath expression of constraint
    */
  var expression: String = js.native
  
  /**
    * Human description of constraint
    */
  var human: String = js.native
  
  /**
    * Target of 'condition' reference above
    */
  var key: id = js.native
  
  /**
    * Why this constraint is necessary or appropriate
    */
  var requirements: js.UndefOr[String] = js.native
  
  /**
    * error | warning
    */
  var severity: code = js.native
  
  /**
    * Reference to original source of constraint
    */
  var source: js.UndefOr[uri] = js.native
  
  /**
    * XPath expression of constraint
    */
  var xpath: js.UndefOr[String] = js.native
}
object ElementDefinitionConstraint {
  
  @scala.inline
  def apply(expression: String, human: String, key: id, severity: code): ElementDefinitionConstraint = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], human = human.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], severity = severity.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementDefinitionConstraint]
  }
  
  @scala.inline
  implicit class ElementDefinitionConstraintMutableBuilder[Self <: ElementDefinitionConstraint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpression(value: String): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHuman(value: String): Self = StObject.set(x, "human", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: id): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequirements(value: String): Self = StObject.set(x, "requirements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequirementsUndefined: Self = StObject.set(x, "requirements", js.undefined)
    
    @scala.inline
    def setSeverity(value: code): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: uri): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    @scala.inline
    def setXpath(value: String): Self = StObject.set(x, "xpath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXpathUndefined: Self = StObject.set(x, "xpath", js.undefined)
    
    @scala.inline
    def set_expression(value: Element): Self = StObject.set(x, "_expression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_expressionUndefined: Self = StObject.set(x, "_expression", js.undefined)
    
    @scala.inline
    def set_human(value: Element): Self = StObject.set(x, "_human", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_humanUndefined: Self = StObject.set(x, "_human", js.undefined)
    
    @scala.inline
    def set_key(value: Element): Self = StObject.set(x, "_key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_keyUndefined: Self = StObject.set(x, "_key", js.undefined)
    
    @scala.inline
    def set_requirements(value: Element): Self = StObject.set(x, "_requirements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_requirementsUndefined: Self = StObject.set(x, "_requirements", js.undefined)
    
    @scala.inline
    def set_severity(value: Element): Self = StObject.set(x, "_severity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_severityUndefined: Self = StObject.set(x, "_severity", js.undefined)
    
    @scala.inline
    def set_source(value: Element): Self = StObject.set(x, "_source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_sourceUndefined: Self = StObject.set(x, "_source", js.undefined)
    
    @scala.inline
    def set_xpath(value: Element): Self = StObject.set(x, "_xpath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_xpathUndefined: Self = StObject.set(x, "_xpath", js.undefined)
  }
}
