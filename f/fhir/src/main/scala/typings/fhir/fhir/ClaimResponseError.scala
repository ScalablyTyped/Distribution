package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Processing errors
  */
trait ClaimResponseError
  extends StObject
     with BackboneElement {
  
  /**
    * Contains extended information for property 'detailSequenceLinkId'.
    */
  var _detailSequenceLinkId: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'sequenceLinkId'.
    */
  var _sequenceLinkId: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'subdetailSequenceLinkId'.
    */
  var _subdetailSequenceLinkId: js.UndefOr[Element] = js.undefined
  
  /**
    * Error code detailing processing issues
    */
  var code: CodeableConcept
  
  /**
    * Detail sequence number
    */
  var detailSequenceLinkId: js.UndefOr[positiveInt] = js.undefined
  
  /**
    * Item sequence number
    */
  var sequenceLinkId: js.UndefOr[positiveInt] = js.undefined
  
  /**
    * Subdetail sequence number
    */
  var subdetailSequenceLinkId: js.UndefOr[positiveInt] = js.undefined
}
object ClaimResponseError {
  
  @scala.inline
  def apply(code: CodeableConcept): ClaimResponseError = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClaimResponseError]
  }
  
  @scala.inline
  implicit class ClaimResponseErrorMutableBuilder[Self <: ClaimResponseError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: CodeableConcept): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetailSequenceLinkId(value: positiveInt): Self = StObject.set(x, "detailSequenceLinkId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetailSequenceLinkIdUndefined: Self = StObject.set(x, "detailSequenceLinkId", js.undefined)
    
    @scala.inline
    def setSequenceLinkId(value: positiveInt): Self = StObject.set(x, "sequenceLinkId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSequenceLinkIdUndefined: Self = StObject.set(x, "sequenceLinkId", js.undefined)
    
    @scala.inline
    def setSubdetailSequenceLinkId(value: positiveInt): Self = StObject.set(x, "subdetailSequenceLinkId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubdetailSequenceLinkIdUndefined: Self = StObject.set(x, "subdetailSequenceLinkId", js.undefined)
    
    @scala.inline
    def set_detailSequenceLinkId(value: Element): Self = StObject.set(x, "_detailSequenceLinkId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_detailSequenceLinkIdUndefined: Self = StObject.set(x, "_detailSequenceLinkId", js.undefined)
    
    @scala.inline
    def set_sequenceLinkId(value: Element): Self = StObject.set(x, "_sequenceLinkId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_sequenceLinkIdUndefined: Self = StObject.set(x, "_sequenceLinkId", js.undefined)
    
    @scala.inline
    def set_subdetailSequenceLinkId(value: Element): Self = StObject.set(x, "_subdetailSequenceLinkId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_subdetailSequenceLinkIdUndefined: Self = StObject.set(x, "_subdetailSequenceLinkId", js.undefined)
  }
}
