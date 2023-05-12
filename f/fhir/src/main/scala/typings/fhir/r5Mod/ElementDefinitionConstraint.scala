package typings.fhir.r5Mod

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
  
  var _suppress: js.UndefOr[Element] = js.undefined
  
  /**
    * In the absense of an expression, the expression is likely not enforceable by validators, and might be missed by many systems.
    */
  var expression: js.UndefOr[String] = js.undefined
  
  /**
    * Should be expressed in business terms as much as possible.
    */
  var human: String
  
  /**
    * Allows identification of which elements have their cardinalities impacted by the constraint.  Will not be referenced for constraints that do not affect cardinality.
    */
  var key: String
  
  /**
    * To be used if the reason for the constraint might not be intuitive to all implementers.
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
    * This element should only be present in a derived profile where a warning or hint has been determined to be spurious/incorrect. E.g. a warning encouraging the inclusion of an element that the profile explicitly prohibits.
    */
  var suppress: js.UndefOr[Boolean] = js.undefined
}
object ElementDefinitionConstraint {
  
  inline def apply(human: String, key: String, severity: error | warning): ElementDefinitionConstraint = {
    val __obj = js.Dynamic.literal(human = human.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], severity = severity.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementDefinitionConstraint]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ElementDefinitionConstraint] (val x: Self) extends AnyVal {
    
    inline def setExpression(value: String): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    inline def setExpressionUndefined: Self = StObject.set(x, "expression", js.undefined)
    
    inline def setHuman(value: String): Self = StObject.set(x, "human", value.asInstanceOf[js.Any])
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setRequirements(value: String): Self = StObject.set(x, "requirements", value.asInstanceOf[js.Any])
    
    inline def setRequirementsUndefined: Self = StObject.set(x, "requirements", js.undefined)
    
    inline def setSeverity(value: error | warning): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setSuppress(value: Boolean): Self = StObject.set(x, "suppress", value.asInstanceOf[js.Any])
    
    inline def setSuppressUndefined: Self = StObject.set(x, "suppress", js.undefined)
    
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
    
    inline def set_suppress(value: Element): Self = StObject.set(x, "_suppress", value.asInstanceOf[js.Any])
    
    inline def set_suppressUndefined: Self = StObject.set(x, "_suppress", js.undefined)
  }
}
