package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClaimResponseItemDetailSubDetail
  extends StObject
     with BackboneElement {
  
  /**
    * The adjudication results.
    */
  var adjudication: js.UndefOr[js.Array[ClaimResponseItemAdjudication]] = js.undefined
  
  /**
    * The numbers associated with notes below which apply to the adjudication of this item.
    */
  var noteNumber: js.UndefOr[js.Array[Double]] = js.undefined
  
  /**
    * The high-level results of the adjudication if adjudication has been performed.
    */
  var reviewOutcome: js.UndefOr[ClaimResponseItemReviewOutcome] = js.undefined
  
  /**
    * A number to uniquely reference the claim sub-detail entry.
    */
  var subDetailSequence: Double
  
  /**
    * Trace number for tracking purposes. May be defined at the jurisdiction level or between trading partners.
    */
  var traceNumber: js.UndefOr[js.Array[Identifier]] = js.undefined
}
object ClaimResponseItemDetailSubDetail {
  
  inline def apply(subDetailSequence: Double): ClaimResponseItemDetailSubDetail = {
    val __obj = js.Dynamic.literal(subDetailSequence = subDetailSequence.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClaimResponseItemDetailSubDetail]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClaimResponseItemDetailSubDetail] (val x: Self) extends AnyVal {
    
    inline def setAdjudication(value: js.Array[ClaimResponseItemAdjudication]): Self = StObject.set(x, "adjudication", value.asInstanceOf[js.Any])
    
    inline def setAdjudicationUndefined: Self = StObject.set(x, "adjudication", js.undefined)
    
    inline def setAdjudicationVarargs(value: ClaimResponseItemAdjudication*): Self = StObject.set(x, "adjudication", js.Array(value*))
    
    inline def setNoteNumber(value: js.Array[Double]): Self = StObject.set(x, "noteNumber", value.asInstanceOf[js.Any])
    
    inline def setNoteNumberUndefined: Self = StObject.set(x, "noteNumber", js.undefined)
    
    inline def setNoteNumberVarargs(value: Double*): Self = StObject.set(x, "noteNumber", js.Array(value*))
    
    inline def setReviewOutcome(value: ClaimResponseItemReviewOutcome): Self = StObject.set(x, "reviewOutcome", value.asInstanceOf[js.Any])
    
    inline def setReviewOutcomeUndefined: Self = StObject.set(x, "reviewOutcome", js.undefined)
    
    inline def setSubDetailSequence(value: Double): Self = StObject.set(x, "subDetailSequence", value.asInstanceOf[js.Any])
    
    inline def setTraceNumber(value: js.Array[Identifier]): Self = StObject.set(x, "traceNumber", value.asInstanceOf[js.Any])
    
    inline def setTraceNumberUndefined: Self = StObject.set(x, "traceNumber", js.undefined)
    
    inline def setTraceNumberVarargs(value: Identifier*): Self = StObject.set(x, "traceNumber", js.Array(value*))
  }
}
