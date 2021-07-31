package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Detail line items
  */
trait ClaimResponseItemDetail
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
    * Detail level adjudication details
    */
  var adjudication: js.UndefOr[js.Array[ClaimResponseItemAdjudication]] = js.undefined
  
  /**
    * List of note numbers which apply
    */
  var noteNumber: js.UndefOr[js.Array[positiveInt]] = js.undefined
  
  /**
    * Service instance
    */
  var sequenceLinkId: positiveInt
  
  /**
    * Subdetail line items
    */
  var subDetail: js.UndefOr[js.Array[ClaimResponseItemDetailSubDetail]] = js.undefined
}
object ClaimResponseItemDetail {
  
  @scala.inline
  def apply(sequenceLinkId: positiveInt): ClaimResponseItemDetail = {
    val __obj = js.Dynamic.literal(sequenceLinkId = sequenceLinkId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClaimResponseItemDetail]
  }
  
  @scala.inline
  implicit class ClaimResponseItemDetailMutableBuilder[Self <: ClaimResponseItemDetail] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdjudication(value: js.Array[ClaimResponseItemAdjudication]): Self = StObject.set(x, "adjudication", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdjudicationUndefined: Self = StObject.set(x, "adjudication", js.undefined)
    
    @scala.inline
    def setAdjudicationVarargs(value: ClaimResponseItemAdjudication*): Self = StObject.set(x, "adjudication", js.Array(value :_*))
    
    @scala.inline
    def setNoteNumber(value: js.Array[positiveInt]): Self = StObject.set(x, "noteNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoteNumberUndefined: Self = StObject.set(x, "noteNumber", js.undefined)
    
    @scala.inline
    def setNoteNumberVarargs(value: positiveInt*): Self = StObject.set(x, "noteNumber", js.Array(value :_*))
    
    @scala.inline
    def setSequenceLinkId(value: positiveInt): Self = StObject.set(x, "sequenceLinkId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubDetail(value: js.Array[ClaimResponseItemDetailSubDetail]): Self = StObject.set(x, "subDetail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubDetailUndefined: Self = StObject.set(x, "subDetail", js.undefined)
    
    @scala.inline
    def setSubDetailVarargs(value: ClaimResponseItemDetailSubDetail*): Self = StObject.set(x, "subDetail", js.Array(value :_*))
    
    @scala.inline
    def set_noteNumber(value: js.Array[Element]): Self = StObject.set(x, "_noteNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_noteNumberUndefined: Self = StObject.set(x, "_noteNumber", js.undefined)
    
    @scala.inline
    def set_noteNumberVarargs(value: Element*): Self = StObject.set(x, "_noteNumber", js.Array(value :_*))
    
    @scala.inline
    def set_sequenceLinkId(value: Element): Self = StObject.set(x, "_sequenceLinkId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_sequenceLinkIdUndefined: Self = StObject.set(x, "_sequenceLinkId", js.undefined)
  }
}
