package typings.fhir.r5Mod

import typings.fhir.fhirStrings.`diff-diagnosis`
import typings.fhir.fhirStrings.outcome
import typings.fhir.fhirStrings.preadmit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConditionDefinitionQuestionnaire
  extends StObject
     with BackboneElement {
  
  var _purpose: js.UndefOr[Element] = js.undefined
  
  /**
    * Use of the questionnaire.
    */
  var purpose: preadmit | `diff-diagnosis` | outcome
  
  /**
    * Specific Questionnaire.
    */
  var reference: Reference
}
object ConditionDefinitionQuestionnaire {
  
  inline def apply(purpose: preadmit | `diff-diagnosis` | outcome, reference: Reference): ConditionDefinitionQuestionnaire = {
    val __obj = js.Dynamic.literal(purpose = purpose.asInstanceOf[js.Any], reference = reference.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConditionDefinitionQuestionnaire]
  }
  
  extension [Self <: ConditionDefinitionQuestionnaire](x: Self) {
    
    inline def setPurpose(value: preadmit | `diff-diagnosis` | outcome): Self = StObject.set(x, "purpose", value.asInstanceOf[js.Any])
    
    inline def setReference(value: Reference): Self = StObject.set(x, "reference", value.asInstanceOf[js.Any])
    
    inline def set_purpose(value: Element): Self = StObject.set(x, "_purpose", value.asInstanceOf[js.Any])
    
    inline def set_purposeUndefined: Self = StObject.set(x, "_purpose", js.undefined)
  }
}
