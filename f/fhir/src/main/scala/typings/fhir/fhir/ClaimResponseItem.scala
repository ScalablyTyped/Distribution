package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Line items
  */
trait ClaimResponseItem
  extends StObject
     with BackboneElement {
  
  /**
    * Contains extended information for property 'noteNumber'.
    */
  var _noteNumber: js.UndefOr[js.Array[Element]] = js.undefined
  
  /**
    * Contains extended information for property 'sequenceLinkId'.
    */
  var _sequenceLinkId: js.UndefOr[Element] = js.undefined
  
  /**
    * Adjudication details
    */
  var adjudication: js.UndefOr[js.Array[ClaimResponseItemAdjudication]] = js.undefined
  
  /**
    * Detail line items
    */
  var detail: js.UndefOr[js.Array[ClaimResponseItemDetail]] = js.undefined
  
  /**
    * List of note numbers which apply
    */
  var noteNumber: js.UndefOr[js.Array[positiveInt]] = js.undefined
  
  /**
    * Service instance
    */
  var sequenceLinkId: positiveInt
}
object ClaimResponseItem {
  
  inline def apply(sequenceLinkId: positiveInt): ClaimResponseItem = {
    val __obj = js.Dynamic.literal(sequenceLinkId = sequenceLinkId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClaimResponseItem]
  }
  
  extension [Self <: ClaimResponseItem](x: Self) {
    
    inline def setAdjudication(value: js.Array[ClaimResponseItemAdjudication]): Self = StObject.set(x, "adjudication", value.asInstanceOf[js.Any])
    
    inline def setAdjudicationUndefined: Self = StObject.set(x, "adjudication", js.undefined)
    
    inline def setAdjudicationVarargs(value: ClaimResponseItemAdjudication*): Self = StObject.set(x, "adjudication", js.Array(value :_*))
    
    inline def setDetail(value: js.Array[ClaimResponseItemDetail]): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
    
    inline def setDetailUndefined: Self = StObject.set(x, "detail", js.undefined)
    
    inline def setDetailVarargs(value: ClaimResponseItemDetail*): Self = StObject.set(x, "detail", js.Array(value :_*))
    
    inline def setNoteNumber(value: js.Array[positiveInt]): Self = StObject.set(x, "noteNumber", value.asInstanceOf[js.Any])
    
    inline def setNoteNumberUndefined: Self = StObject.set(x, "noteNumber", js.undefined)
    
    inline def setNoteNumberVarargs(value: positiveInt*): Self = StObject.set(x, "noteNumber", js.Array(value :_*))
    
    inline def setSequenceLinkId(value: positiveInt): Self = StObject.set(x, "sequenceLinkId", value.asInstanceOf[js.Any])
    
    inline def set_noteNumber(value: js.Array[Element]): Self = StObject.set(x, "_noteNumber", value.asInstanceOf[js.Any])
    
    inline def set_noteNumberUndefined: Self = StObject.set(x, "_noteNumber", js.undefined)
    
    inline def set_noteNumberVarargs(value: Element*): Self = StObject.set(x, "_noteNumber", js.Array(value :_*))
    
    inline def set_sequenceLinkId(value: Element): Self = StObject.set(x, "_sequenceLinkId", value.asInstanceOf[js.Any])
    
    inline def set_sequenceLinkIdUndefined: Self = StObject.set(x, "_sequenceLinkId", js.undefined)
  }
}
