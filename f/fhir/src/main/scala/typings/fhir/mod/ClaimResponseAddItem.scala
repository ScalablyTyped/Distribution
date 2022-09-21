package typings.fhir.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClaimResponseAddItem
  extends StObject
     with BackboneElement {
  
  /**
    * The adjudications results.
    */
  var adjudication: js.UndefOr[js.Array[ClaimResponseAddItemAdjudication]] = js.undefined
  
  /**
    * The second tier service adjudications for payor added services.
    */
  var detail: js.UndefOr[js.Array[ClaimResponseAddItemDetail]] = js.undefined
  
  /**
    * The fee charged for the professional service or product..
    */
  var fee: js.UndefOr[Quantity] = js.undefined
  
  /**
    * A list of note references to the notes provided below.
    */
  var noteNumberLinkId: js.UndefOr[js.Array[Double]] = js.undefined
  
  /**
    * List of input service items which this service line is intended to replace.
    */
  var sequenceLinkId: js.UndefOr[js.Array[Double]] = js.undefined
  
  /**
    * A code to indicate the Professional Service or Product supplied.
    */
  var service: Coding
}
object ClaimResponseAddItem {
  
  inline def apply(service: Coding): ClaimResponseAddItem = {
    val __obj = js.Dynamic.literal(service = service.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClaimResponseAddItem]
  }
  
  extension [Self <: ClaimResponseAddItem](x: Self) {
    
    inline def setAdjudication(value: js.Array[ClaimResponseAddItemAdjudication]): Self = StObject.set(x, "adjudication", value.asInstanceOf[js.Any])
    
    inline def setAdjudicationUndefined: Self = StObject.set(x, "adjudication", js.undefined)
    
    inline def setAdjudicationVarargs(value: ClaimResponseAddItemAdjudication*): Self = StObject.set(x, "adjudication", js.Array(value*))
    
    inline def setDetail(value: js.Array[ClaimResponseAddItemDetail]): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
    
    inline def setDetailUndefined: Self = StObject.set(x, "detail", js.undefined)
    
    inline def setDetailVarargs(value: ClaimResponseAddItemDetail*): Self = StObject.set(x, "detail", js.Array(value*))
    
    inline def setFee(value: Quantity): Self = StObject.set(x, "fee", value.asInstanceOf[js.Any])
    
    inline def setFeeUndefined: Self = StObject.set(x, "fee", js.undefined)
    
    inline def setNoteNumberLinkId(value: js.Array[Double]): Self = StObject.set(x, "noteNumberLinkId", value.asInstanceOf[js.Any])
    
    inline def setNoteNumberLinkIdUndefined: Self = StObject.set(x, "noteNumberLinkId", js.undefined)
    
    inline def setNoteNumberLinkIdVarargs(value: Double*): Self = StObject.set(x, "noteNumberLinkId", js.Array(value*))
    
    inline def setSequenceLinkId(value: js.Array[Double]): Self = StObject.set(x, "sequenceLinkId", value.asInstanceOf[js.Any])
    
    inline def setSequenceLinkIdUndefined: Self = StObject.set(x, "sequenceLinkId", js.undefined)
    
    inline def setSequenceLinkIdVarargs(value: Double*): Self = StObject.set(x, "sequenceLinkId", js.Array(value*))
    
    inline def setService(value: Coding): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
  }
}
