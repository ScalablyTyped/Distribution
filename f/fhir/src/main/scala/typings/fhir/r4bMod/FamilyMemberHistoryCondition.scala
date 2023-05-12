package typings.fhir.r4bMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FamilyMemberHistoryCondition
  extends StObject
     with BackboneElement {
  
  var _contributedToDeath: js.UndefOr[Element] = js.undefined
  
  var _onsetString: js.UndefOr[Element] = js.undefined
  
  /**
    * The actual condition specified. Could be a coded condition (like MI or Diabetes) or a less specific string like 'cancer' depending on how much is known about the condition and the capabilities of the creating system.
    */
  var code: CodeableConcept
  
  /**
    * This condition contributed to the cause of death of the related person. If contributedToDeath is not populated, then it is unknown.
    */
  var contributedToDeath: js.UndefOr[Boolean] = js.undefined
  
  /**
    * An area where general notes can be placed about this specific condition.
    */
  var note: js.UndefOr[js.Array[Annotation]] = js.undefined
  
  /**
    * Either the age of onset, range of approximate age or descriptive string can be recorded.  For conditions with multiple occurrences, this describes the first known occurrence.
    */
  var onsetAge: js.UndefOr[Age] = js.undefined
  
  /**
    * Either the age of onset, range of approximate age or descriptive string can be recorded.  For conditions with multiple occurrences, this describes the first known occurrence.
    */
  var onsetPeriod: js.UndefOr[Period] = js.undefined
  
  /**
    * Either the age of onset, range of approximate age or descriptive string can be recorded.  For conditions with multiple occurrences, this describes the first known occurrence.
    */
  var onsetRange: js.UndefOr[Range] = js.undefined
  
  /**
    * Either the age of onset, range of approximate age or descriptive string can be recorded.  For conditions with multiple occurrences, this describes the first known occurrence.
    */
  var onsetString: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates what happened following the condition.  If the condition resulted in death, deceased date is captured on the relation.
    */
  var outcome: js.UndefOr[CodeableConcept] = js.undefined
}
object FamilyMemberHistoryCondition {
  
  inline def apply(code: CodeableConcept): FamilyMemberHistoryCondition = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    __obj.asInstanceOf[FamilyMemberHistoryCondition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FamilyMemberHistoryCondition] (val x: Self) extends AnyVal {
    
    inline def setCode(value: CodeableConcept): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setContributedToDeath(value: Boolean): Self = StObject.set(x, "contributedToDeath", value.asInstanceOf[js.Any])
    
    inline def setContributedToDeathUndefined: Self = StObject.set(x, "contributedToDeath", js.undefined)
    
    inline def setNote(value: js.Array[Annotation]): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    inline def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
    
    inline def setNoteVarargs(value: Annotation*): Self = StObject.set(x, "note", js.Array(value*))
    
    inline def setOnsetAge(value: Age): Self = StObject.set(x, "onsetAge", value.asInstanceOf[js.Any])
    
    inline def setOnsetAgeUndefined: Self = StObject.set(x, "onsetAge", js.undefined)
    
    inline def setOnsetPeriod(value: Period): Self = StObject.set(x, "onsetPeriod", value.asInstanceOf[js.Any])
    
    inline def setOnsetPeriodUndefined: Self = StObject.set(x, "onsetPeriod", js.undefined)
    
    inline def setOnsetRange(value: Range): Self = StObject.set(x, "onsetRange", value.asInstanceOf[js.Any])
    
    inline def setOnsetRangeUndefined: Self = StObject.set(x, "onsetRange", js.undefined)
    
    inline def setOnsetString(value: String): Self = StObject.set(x, "onsetString", value.asInstanceOf[js.Any])
    
    inline def setOnsetStringUndefined: Self = StObject.set(x, "onsetString", js.undefined)
    
    inline def setOutcome(value: CodeableConcept): Self = StObject.set(x, "outcome", value.asInstanceOf[js.Any])
    
    inline def setOutcomeUndefined: Self = StObject.set(x, "outcome", js.undefined)
    
    inline def set_contributedToDeath(value: Element): Self = StObject.set(x, "_contributedToDeath", value.asInstanceOf[js.Any])
    
    inline def set_contributedToDeathUndefined: Self = StObject.set(x, "_contributedToDeath", js.undefined)
    
    inline def set_onsetString(value: Element): Self = StObject.set(x, "_onsetString", value.asInstanceOf[js.Any])
    
    inline def set_onsetStringUndefined: Self = StObject.set(x, "_onsetString", js.undefined)
  }
}
