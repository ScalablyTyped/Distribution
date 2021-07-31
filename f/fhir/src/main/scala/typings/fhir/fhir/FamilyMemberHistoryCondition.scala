package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Condition that the related person had
  */
trait FamilyMemberHistoryCondition
  extends StObject
     with BackboneElement {
  
  /**
    * Contains extended information for property 'onsetString'.
    */
  var _onsetString: js.UndefOr[Element] = js.undefined
  
  /**
    * Condition suffered by relation
    */
  var code: CodeableConcept
  
  /**
    * Extra information about condition
    */
  var note: js.UndefOr[js.Array[Annotation]] = js.undefined
  
  /**
    * When condition first manifested
    */
  var onsetAge: js.UndefOr[Age] = js.undefined
  
  /**
    * When condition first manifested
    */
  var onsetPeriod: js.UndefOr[Period] = js.undefined
  
  /**
    * When condition first manifested
    */
  var onsetRange: js.UndefOr[Range] = js.undefined
  
  /**
    * When condition first manifested
    */
  var onsetString: js.UndefOr[String] = js.undefined
  
  /**
    * deceased | permanent disability | etc.
    */
  var outcome: js.UndefOr[CodeableConcept] = js.undefined
}
object FamilyMemberHistoryCondition {
  
  @scala.inline
  def apply(code: CodeableConcept): FamilyMemberHistoryCondition = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    __obj.asInstanceOf[FamilyMemberHistoryCondition]
  }
  
  @scala.inline
  implicit class FamilyMemberHistoryConditionMutableBuilder[Self <: FamilyMemberHistoryCondition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: CodeableConcept): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNote(value: js.Array[Annotation]): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
    
    @scala.inline
    def setNoteVarargs(value: Annotation*): Self = StObject.set(x, "note", js.Array(value :_*))
    
    @scala.inline
    def setOnsetAge(value: Age): Self = StObject.set(x, "onsetAge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnsetAgeUndefined: Self = StObject.set(x, "onsetAge", js.undefined)
    
    @scala.inline
    def setOnsetPeriod(value: Period): Self = StObject.set(x, "onsetPeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnsetPeriodUndefined: Self = StObject.set(x, "onsetPeriod", js.undefined)
    
    @scala.inline
    def setOnsetRange(value: Range): Self = StObject.set(x, "onsetRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnsetRangeUndefined: Self = StObject.set(x, "onsetRange", js.undefined)
    
    @scala.inline
    def setOnsetString(value: String): Self = StObject.set(x, "onsetString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnsetStringUndefined: Self = StObject.set(x, "onsetString", js.undefined)
    
    @scala.inline
    def setOutcome(value: CodeableConcept): Self = StObject.set(x, "outcome", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutcomeUndefined: Self = StObject.set(x, "outcome", js.undefined)
    
    @scala.inline
    def set_onsetString(value: Element): Self = StObject.set(x, "_onsetString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_onsetStringUndefined: Self = StObject.set(x, "_onsetString", js.undefined)
  }
}
