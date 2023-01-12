package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClaimResponseItem
  extends StObject
     with BackboneElement {
  
  /**
    * If this item is a group then the values here are a summary of the adjudication of the detail items. If this item is a simple product or service then this is the result of the adjudication of this item.
    */
  var adjudication: js.Array[ClaimResponseItemAdjudication]
  
  /**
    * A claim detail. Either a simple (a product or service) or a 'group' of sub-details which are simple items.
    */
  var detail: js.UndefOr[js.Array[ClaimResponseItemDetail]] = js.undefined
  
  /**
    * A number to uniquely reference the claim item entries.
    */
  var itemSequence: Double
  
  /**
    * The numbers associated with notes below which apply to the adjudication of this item.
    */
  var noteNumber: js.UndefOr[js.Array[Double]] = js.undefined
}
object ClaimResponseItem {
  
  inline def apply(adjudication: js.Array[ClaimResponseItemAdjudication], itemSequence: Double): ClaimResponseItem = {
    val __obj = js.Dynamic.literal(adjudication = adjudication.asInstanceOf[js.Any], itemSequence = itemSequence.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClaimResponseItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClaimResponseItem] (val x: Self) extends AnyVal {
    
    inline def setAdjudication(value: js.Array[ClaimResponseItemAdjudication]): Self = StObject.set(x, "adjudication", value.asInstanceOf[js.Any])
    
    inline def setAdjudicationVarargs(value: ClaimResponseItemAdjudication*): Self = StObject.set(x, "adjudication", js.Array(value*))
    
    inline def setDetail(value: js.Array[ClaimResponseItemDetail]): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
    
    inline def setDetailUndefined: Self = StObject.set(x, "detail", js.undefined)
    
    inline def setDetailVarargs(value: ClaimResponseItemDetail*): Self = StObject.set(x, "detail", js.Array(value*))
    
    inline def setItemSequence(value: Double): Self = StObject.set(x, "itemSequence", value.asInstanceOf[js.Any])
    
    inline def setNoteNumber(value: js.Array[Double]): Self = StObject.set(x, "noteNumber", value.asInstanceOf[js.Any])
    
    inline def setNoteNumberUndefined: Self = StObject.set(x, "noteNumber", js.undefined)
    
    inline def setNoteNumberVarargs(value: Double*): Self = StObject.set(x, "noteNumber", js.Array(value*))
  }
}
