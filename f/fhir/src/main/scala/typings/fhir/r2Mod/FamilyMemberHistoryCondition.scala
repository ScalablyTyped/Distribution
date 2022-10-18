package typings.fhir.r2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FamilyMemberHistoryCondition
  extends StObject
     with BackboneElement {
  
  var _onsetString: js.UndefOr[Element] = js.undefined
  
  /**
    * The actual condition specified. Could be a coded condition (like MI or Diabetes) or a less specific string like 'cancer' depending on how much is known about the condition and the capabilities of the creating system.
    */
  var code: CodeableConcept
  
  /**
    * An area where general notes can be placed about this specific condition.
    */
  var note: js.UndefOr[Annotation] = js.undefined
  
  /**
    * Age of onset of a condition in relatives is predictive of risk for the patient.
    */
  var onsetPeriod: js.UndefOr[Period] = js.undefined
  
  /**
    * Age of onset of a condition in relatives is predictive of risk for the patient.
    */
  var onsetQuantity: js.UndefOr[Quantity] = js.undefined
  
  /**
    * Age of onset of a condition in relatives is predictive of risk for the patient.
    */
  var onsetRange: js.UndefOr[Range] = js.undefined
  
  /**
    * Age of onset of a condition in relatives is predictive of risk for the patient.
    */
  var onsetString: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates what happened as a result of this condition.  If the condition resulted in death, deceased date is captured on the relation.
    */
  var outcome: js.UndefOr[CodeableConcept] = js.undefined
}
object FamilyMemberHistoryCondition {
  
  inline def apply(code: CodeableConcept): FamilyMemberHistoryCondition = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    __obj.asInstanceOf[FamilyMemberHistoryCondition]
  }
  
  extension [Self <: FamilyMemberHistoryCondition](x: Self) {
    
    inline def setCode(value: CodeableConcept): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setNote(value: Annotation): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    inline def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
    
    inline def setOnsetPeriod(value: Period): Self = StObject.set(x, "onsetPeriod", value.asInstanceOf[js.Any])
    
    inline def setOnsetPeriodUndefined: Self = StObject.set(x, "onsetPeriod", js.undefined)
    
    inline def setOnsetQuantity(value: Quantity): Self = StObject.set(x, "onsetQuantity", value.asInstanceOf[js.Any])
    
    inline def setOnsetQuantityUndefined: Self = StObject.set(x, "onsetQuantity", js.undefined)
    
    inline def setOnsetRange(value: Range): Self = StObject.set(x, "onsetRange", value.asInstanceOf[js.Any])
    
    inline def setOnsetRangeUndefined: Self = StObject.set(x, "onsetRange", js.undefined)
    
    inline def setOnsetString(value: String): Self = StObject.set(x, "onsetString", value.asInstanceOf[js.Any])
    
    inline def setOnsetStringUndefined: Self = StObject.set(x, "onsetString", js.undefined)
    
    inline def setOutcome(value: CodeableConcept): Self = StObject.set(x, "outcome", value.asInstanceOf[js.Any])
    
    inline def setOutcomeUndefined: Self = StObject.set(x, "outcome", js.undefined)
    
    inline def set_onsetString(value: Element): Self = StObject.set(x, "_onsetString", value.asInstanceOf[js.Any])
    
    inline def set_onsetStringUndefined: Self = StObject.set(x, "_onsetString", js.undefined)
  }
}
