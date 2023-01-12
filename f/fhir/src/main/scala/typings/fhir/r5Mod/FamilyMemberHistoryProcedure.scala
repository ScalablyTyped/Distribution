package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FamilyMemberHistoryProcedure
  extends StObject
     with BackboneElement {
  
  var _contributedToDeath: js.UndefOr[Element] = js.undefined
  
  var _performedDateTime: js.UndefOr[Element] = js.undefined
  
  var _performedString: js.UndefOr[Element] = js.undefined
  
  /**
    * The actual procedure specified. Could be a coded procedure or a less specific string depending on how much is known about the procedure and the capabilities of the creating system.
    */
  var code: CodeableConcept
  
  /**
    * This procedure contributed to the cause of death of the related person. If contributedToDeath is not populated, then it is unknown.
    */
  var contributedToDeath: js.UndefOr[Boolean] = js.undefined
  
  /**
    * An area where general notes can be placed about this specific procedure.
    */
  var note: js.UndefOr[js.Array[Annotation]] = js.undefined
  
  /**
    * Indicates what happened following the procedure. If the procedure resulted in death, deceased date is captured on the relation.
    */
  var outcome: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Estimated or actual date, date-time, period, or age when the procedure was performed. Allows a period to support complex procedures that span more than one date, and also allows for the length of the procedure to be captured.
    */
  var performedAge: js.UndefOr[Age] = js.undefined
  
  /**
    * Estimated or actual date, date-time, period, or age when the procedure was performed. Allows a period to support complex procedures that span more than one date, and also allows for the length of the procedure to be captured.
    */
  var performedDateTime: js.UndefOr[String] = js.undefined
  
  /**
    * Estimated or actual date, date-time, period, or age when the procedure was performed. Allows a period to support complex procedures that span more than one date, and also allows for the length of the procedure to be captured.
    */
  var performedPeriod: js.UndefOr[Period] = js.undefined
  
  /**
    * Estimated or actual date, date-time, period, or age when the procedure was performed. Allows a period to support complex procedures that span more than one date, and also allows for the length of the procedure to be captured.
    */
  var performedRange: js.UndefOr[Range] = js.undefined
  
  /**
    * Estimated or actual date, date-time, period, or age when the procedure was performed. Allows a period to support complex procedures that span more than one date, and also allows for the length of the procedure to be captured.
    */
  var performedString: js.UndefOr[String] = js.undefined
}
object FamilyMemberHistoryProcedure {
  
  inline def apply(code: CodeableConcept): FamilyMemberHistoryProcedure = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    __obj.asInstanceOf[FamilyMemberHistoryProcedure]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FamilyMemberHistoryProcedure] (val x: Self) extends AnyVal {
    
    inline def setCode(value: CodeableConcept): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setContributedToDeath(value: Boolean): Self = StObject.set(x, "contributedToDeath", value.asInstanceOf[js.Any])
    
    inline def setContributedToDeathUndefined: Self = StObject.set(x, "contributedToDeath", js.undefined)
    
    inline def setNote(value: js.Array[Annotation]): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    inline def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
    
    inline def setNoteVarargs(value: Annotation*): Self = StObject.set(x, "note", js.Array(value*))
    
    inline def setOutcome(value: CodeableConcept): Self = StObject.set(x, "outcome", value.asInstanceOf[js.Any])
    
    inline def setOutcomeUndefined: Self = StObject.set(x, "outcome", js.undefined)
    
    inline def setPerformedAge(value: Age): Self = StObject.set(x, "performedAge", value.asInstanceOf[js.Any])
    
    inline def setPerformedAgeUndefined: Self = StObject.set(x, "performedAge", js.undefined)
    
    inline def setPerformedDateTime(value: String): Self = StObject.set(x, "performedDateTime", value.asInstanceOf[js.Any])
    
    inline def setPerformedDateTimeUndefined: Self = StObject.set(x, "performedDateTime", js.undefined)
    
    inline def setPerformedPeriod(value: Period): Self = StObject.set(x, "performedPeriod", value.asInstanceOf[js.Any])
    
    inline def setPerformedPeriodUndefined: Self = StObject.set(x, "performedPeriod", js.undefined)
    
    inline def setPerformedRange(value: Range): Self = StObject.set(x, "performedRange", value.asInstanceOf[js.Any])
    
    inline def setPerformedRangeUndefined: Self = StObject.set(x, "performedRange", js.undefined)
    
    inline def setPerformedString(value: String): Self = StObject.set(x, "performedString", value.asInstanceOf[js.Any])
    
    inline def setPerformedStringUndefined: Self = StObject.set(x, "performedString", js.undefined)
    
    inline def set_contributedToDeath(value: Element): Self = StObject.set(x, "_contributedToDeath", value.asInstanceOf[js.Any])
    
    inline def set_contributedToDeathUndefined: Self = StObject.set(x, "_contributedToDeath", js.undefined)
    
    inline def set_performedDateTime(value: Element): Self = StObject.set(x, "_performedDateTime", value.asInstanceOf[js.Any])
    
    inline def set_performedDateTimeUndefined: Self = StObject.set(x, "_performedDateTime", js.undefined)
    
    inline def set_performedString(value: Element): Self = StObject.set(x, "_performedString", value.asInstanceOf[js.Any])
    
    inline def set_performedStringUndefined: Self = StObject.set(x, "_performedString", js.undefined)
  }
}
