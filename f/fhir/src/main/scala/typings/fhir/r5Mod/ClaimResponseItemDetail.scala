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
  var adjudication: js.Array[ClaimResponseItemAdjudication]
  
  /**
    * A number to uniquely reference the claim detail entry.
    */
  var detailSequence: Double
  
  /**
    * The numbers associated with notes below which apply to the adjudication of this item.
    */
  var noteNumber: js.UndefOr[js.Array[Double]] = js.undefined
  
  /**
    * A sub-detail adjudication of a simple product or service.
    */
  var subDetail: js.UndefOr[js.Array[ClaimResponseItemDetailSubDetail]] = js.undefined
}
object ClaimResponseItemDetail {
  
  inline def apply(adjudication: js.Array[ClaimResponseItemAdjudication], detailSequence: Double): ClaimResponseItemDetail = {
    val __obj = js.Dynamic.literal(adjudication = adjudication.asInstanceOf[js.Any], detailSequence = detailSequence.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClaimResponseItemDetail]
  }
  
  extension [Self <: ClaimResponseItemDetail](x: Self) {
    
    inline def setAdjudication(value: js.Array[ClaimResponseItemAdjudication]): Self = StObject.set(x, "adjudication", value.asInstanceOf[js.Any])
    
    inline def setAdjudicationVarargs(value: ClaimResponseItemAdjudication*): Self = StObject.set(x, "adjudication", js.Array(value*))
    
    inline def setDetailSequence(value: Double): Self = StObject.set(x, "detailSequence", value.asInstanceOf[js.Any])
    
    inline def setNoteNumber(value: js.Array[Double]): Self = StObject.set(x, "noteNumber", value.asInstanceOf[js.Any])
    
    inline def setNoteNumberUndefined: Self = StObject.set(x, "noteNumber", js.undefined)
    
    inline def setNoteNumberVarargs(value: Double*): Self = StObject.set(x, "noteNumber", js.Array(value*))
    
    inline def setSubDetail(value: js.Array[ClaimResponseItemDetailSubDetail]): Self = StObject.set(x, "subDetail", value.asInstanceOf[js.Any])
    
    inline def setSubDetailUndefined: Self = StObject.set(x, "subDetail", js.undefined)
    
    inline def setSubDetailVarargs(value: ClaimResponseItemDetailSubDetail*): Self = StObject.set(x, "subDetail", js.Array(value*))
  }
}
