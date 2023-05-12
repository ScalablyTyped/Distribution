package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClaimResponseItemDetail
  extends StObject
     with BackboneElement {
  
  /**
    * The adjudication results.
    */
  var adjudication: js.UndefOr[js.Array[ClaimResponseItemAdjudication]] = js.undefined
  
  /**
    * A number to uniquely reference the claim detail entry.
    */
  var detailSequence: Double
  
  /**
    * The numbers associated with notes below which apply to the adjudication of this item.
    */
  var noteNumber: js.UndefOr[js.Array[Double]] = js.undefined
  
  /**
    * The high-level results of the adjudication if adjudication has been performed.
    */
  var reviewOutcome: js.UndefOr[ClaimResponseItemReviewOutcome] = js.undefined
  
  /**
    * A sub-detail adjudication of a simple product or service.
    */
  var subDetail: js.UndefOr[js.Array[ClaimResponseItemDetailSubDetail]] = js.undefined
  
  /**
    * Trace number for tracking purposes. May be defined at the jurisdiction level or between trading partners.
    */
  var traceNumber: js.UndefOr[js.Array[Identifier]] = js.undefined
}
object ClaimResponseItemDetail {
  
  inline def apply(detailSequence: Double): ClaimResponseItemDetail = {
    val __obj = js.Dynamic.literal(detailSequence = detailSequence.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClaimResponseItemDetail]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClaimResponseItemDetail] (val x: Self) extends AnyVal {
    
    inline def setAdjudication(value: js.Array[ClaimResponseItemAdjudication]): Self = StObject.set(x, "adjudication", value.asInstanceOf[js.Any])
    
    inline def setAdjudicationUndefined: Self = StObject.set(x, "adjudication", js.undefined)
    
    inline def setAdjudicationVarargs(value: ClaimResponseItemAdjudication*): Self = StObject.set(x, "adjudication", js.Array(value*))
    
    inline def setDetailSequence(value: Double): Self = StObject.set(x, "detailSequence", value.asInstanceOf[js.Any])
    
    inline def setNoteNumber(value: js.Array[Double]): Self = StObject.set(x, "noteNumber", value.asInstanceOf[js.Any])
    
    inline def setNoteNumberUndefined: Self = StObject.set(x, "noteNumber", js.undefined)
    
    inline def setNoteNumberVarargs(value: Double*): Self = StObject.set(x, "noteNumber", js.Array(value*))
    
    inline def setReviewOutcome(value: ClaimResponseItemReviewOutcome): Self = StObject.set(x, "reviewOutcome", value.asInstanceOf[js.Any])
    
    inline def setReviewOutcomeUndefined: Self = StObject.set(x, "reviewOutcome", js.undefined)
    
    inline def setSubDetail(value: js.Array[ClaimResponseItemDetailSubDetail]): Self = StObject.set(x, "subDetail", value.asInstanceOf[js.Any])
    
    inline def setSubDetailUndefined: Self = StObject.set(x, "subDetail", js.undefined)
    
    inline def setSubDetailVarargs(value: ClaimResponseItemDetailSubDetail*): Self = StObject.set(x, "subDetail", js.Array(value*))
    
    inline def setTraceNumber(value: js.Array[Identifier]): Self = StObject.set(x, "traceNumber", value.asInstanceOf[js.Any])
    
    inline def setTraceNumberUndefined: Self = StObject.set(x, "traceNumber", js.undefined)
    
    inline def setTraceNumberVarargs(value: Identifier*): Self = StObject.set(x, "traceNumber", js.Array(value*))
  }
}
