package typings.fhir.r2Mod

import typings.fhir.fhirStrings.error
import typings.fhir.fhirStrings.warning
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ElementDefinitionConstraint
  extends StObject
     with Element {
  
  var _human: js.UndefOr[Element] = js.undefined
  
  var _key: js.UndefOr[Element] = js.undefined
  
  var _requirements: js.UndefOr[Element] = js.undefined
  
  var _severity: js.UndefOr[Element] = js.undefined
  
  var _xpath: js.UndefOr[Element] = js.undefined
  
  /**
    * Text that can be used to describe the constraint in messages identifying that the constraint has been violated.
    */
  var human: String
  
  /**
    * Allows identification of which elements have their cardinalities impacted by the constraint.  Will not be referenced for constraints that do not affect cardinality.
    */
  var key: String
  
  /**
    * Description of why this constraint is necessary or appropriate.
    */
  var requirements: js.UndefOr[String] = js.undefined
  
  /**
    * Identifies the impact constraint violation has on the conformance of the instance.
    */
  var severity: error | warning
  
  /**
    * Used in Schematron tests of the validity of the resource.
    */
  var xpath: String
}
object ElementDefinitionConstraint {
  
  inline def apply(human: String, key: String, severity: error | warning, xpath: String): ElementDefinitionConstraint = {
    val __obj = js.Dynamic.literal(human = human.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], severity = severity.asInstanceOf[js.Any], xpath = xpath.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementDefinitionConstraint]
  }
  
  extension [Self <: ElementDefinitionConstraint](x: Self) {
    
    inline def setHuman(value: String): Self = StObject.set(x, "human", value.asInstanceOf[js.Any])
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setRequirements(value: String): Self = StObject.set(x, "requirements", value.asInstanceOf[js.Any])
    
    inline def setRequirementsUndefined: Self = StObject.set(x, "requirements", js.undefined)
    
    inline def setSeverity(value: error | warning): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
    
    inline def setXpath(value: String): Self = StObject.set(x, "xpath", value.asInstanceOf[js.Any])
    
    inline def set_human(value: Element): Self = StObject.set(x, "_human", value.asInstanceOf[js.Any])
    
    inline def set_humanUndefined: Self = StObject.set(x, "_human", js.undefined)
    
    inline def set_key(value: Element): Self = StObject.set(x, "_key", value.asInstanceOf[js.Any])
    
    inline def set_keyUndefined: Self = StObject.set(x, "_key", js.undefined)
    
    inline def set_requirements(value: Element): Self = StObject.set(x, "_requirements", value.asInstanceOf[js.Any])
    
    inline def set_requirementsUndefined: Self = StObject.set(x, "_requirements", js.undefined)
    
    inline def set_severity(value: Element): Self = StObject.set(x, "_severity", value.asInstanceOf[js.Any])
    
    inline def set_severityUndefined: Self = StObject.set(x, "_severity", js.undefined)
    
    inline def set_xpath(value: Element): Self = StObject.set(x, "_xpath", value.asInstanceOf[js.Any])
    
    inline def set_xpathUndefined: Self = StObject.set(x, "_xpath", js.undefined)
  }
}
