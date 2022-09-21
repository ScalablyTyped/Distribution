package typings.fhir.r3Mod

import typings.fhir.fhirStrings.error
import typings.fhir.fhirStrings.warning
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ElementDefinitionConstraint
  extends StObject
     with Element {
  
  var _expression: js.UndefOr[Element] = js.undefined
  
  var _human: js.UndefOr[Element] = js.undefined
  
  var _key: js.UndefOr[Element] = js.undefined
  
  var _requirements: js.UndefOr[Element] = js.undefined
  
  var _severity: js.UndefOr[Element] = js.undefined
  
  var _source: js.UndefOr[Element] = js.undefined
  
  var _xpath: js.UndefOr[Element] = js.undefined
  
  /**
    * A [FHIRPath](http://hl7.org/fluentpath) expression of constraint that can be executed to see if this constraint is met.
    */
  var expression: String
  
  /**
    * Should be expressed in business terms as much as possible.
    */
  var human: String
  
  /**
    * Allows identification of which elements have their cardinalities impacted by the constraint.  Will not be referenced for constraints that do not affect cardinality.
    */
  var key: String
  
  /**
    * To be used if the reason for the constraint may not be intuitive to all implementers.
    */
  var requirements: js.UndefOr[String] = js.undefined
  
  /**
    * This allows constraints to be asserted as "shall" (error) and "should" (warning).
    */
  var severity: error | warning
  
  /**
    * This is used when, e.g. rendering, where it is not useful to present inherited constraints when rendering the snapshot.
    */
  var source: js.UndefOr[String] = js.undefined
  
  /**
    * Elements SHALL use "f" as the namespace prefix for the FHIR namespace, and "x" for the xhtml namespace, and SHALL NOT use any other prefixes.
    * Note: we are considering deprecating the xpath element. Implementer feedback is welcome.
    */
  var xpath: js.UndefOr[String] = js.undefined
}
object ElementDefinitionConstraint {
  
  inline def apply(expression: String, human: String, key: String, severity: error | warning): ElementDefinitionConstraint = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], human = human.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], severity = severity.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementDefinitionConstraint]
  }
  
  extension [Self <: ElementDefinitionConstraint](x: Self) {
    
    inline def setExpression(value: String): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    inline def setHuman(value: String): Self = StObject.set(x, "human", value.asInstanceOf[js.Any])
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setRequirements(value: String): Self = StObject.set(x, "requirements", value.asInstanceOf[js.Any])
    
    inline def setRequirementsUndefined: Self = StObject.set(x, "requirements", js.undefined)
    
    inline def setSeverity(value: error | warning): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setXpath(value: String): Self = StObject.set(x, "xpath", value.asInstanceOf[js.Any])
    
    inline def setXpathUndefined: Self = StObject.set(x, "xpath", js.undefined)
    
    inline def set_expression(value: Element): Self = StObject.set(x, "_expression", value.asInstanceOf[js.Any])
    
    inline def set_expressionUndefined: Self = StObject.set(x, "_expression", js.undefined)
    
    inline def set_human(value: Element): Self = StObject.set(x, "_human", value.asInstanceOf[js.Any])
    
    inline def set_humanUndefined: Self = StObject.set(x, "_human", js.undefined)
    
    inline def set_key(value: Element): Self = StObject.set(x, "_key", value.asInstanceOf[js.Any])
    
    inline def set_keyUndefined: Self = StObject.set(x, "_key", js.undefined)
    
    inline def set_requirements(value: Element): Self = StObject.set(x, "_requirements", value.asInstanceOf[js.Any])
    
    inline def set_requirementsUndefined: Self = StObject.set(x, "_requirements", js.undefined)
    
    inline def set_severity(value: Element): Self = StObject.set(x, "_severity", value.asInstanceOf[js.Any])
    
    inline def set_severityUndefined: Self = StObject.set(x, "_severity", js.undefined)
    
    inline def set_source(value: Element): Self = StObject.set(x, "_source", value.asInstanceOf[js.Any])
    
    inline def set_sourceUndefined: Self = StObject.set(x, "_source", js.undefined)
    
    inline def set_xpath(value: Element): Self = StObject.set(x, "_xpath", value.asInstanceOf[js.Any])
    
    inline def set_xpathUndefined: Self = StObject.set(x, "_xpath", js.undefined)
  }
}
