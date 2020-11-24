package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Processing errors
  */
@js.native
trait ClaimResponseError extends BackboneElement {
  
  /**
    * Contains extended information for property 'detailSequenceLinkId'.
    */
  var _detailSequenceLinkId: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'sequenceLinkId'.
    */
  var _sequenceLinkId: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'subdetailSequenceLinkId'.
    */
  var _subdetailSequenceLinkId: js.UndefOr[Element] = js.native
  
  /**
    * Error code detailing processing issues
    */
  var code: CodeableConcept = js.native
  
  /**
    * Detail sequence number
    */
  var detailSequenceLinkId: js.UndefOr[positiveInt] = js.native
  
  /**
    * Item sequence number
    */
  var sequenceLinkId: js.UndefOr[positiveInt] = js.native
  
  /**
    * Subdetail sequence number
    */
  var subdetailSequenceLinkId: js.UndefOr[positiveInt] = js.native
}
object ClaimResponseError {
  
  @scala.inline
  def apply(code: CodeableConcept): ClaimResponseError = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClaimResponseError]
  }
  
  @scala.inline
  implicit class ClaimResponseErrorOps[Self <: ClaimResponseError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCode(value: CodeableConcept): Self = this.set("code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_detailSequenceLinkId(value: Element): Self = this.set("_detailSequenceLinkId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_detailSequenceLinkId: Self = this.set("_detailSequenceLinkId", js.undefined)
    
    @scala.inline
    def set_sequenceLinkId(value: Element): Self = this.set("_sequenceLinkId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_sequenceLinkId: Self = this.set("_sequenceLinkId", js.undefined)
    
    @scala.inline
    def set_subdetailSequenceLinkId(value: Element): Self = this.set("_subdetailSequenceLinkId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_subdetailSequenceLinkId: Self = this.set("_subdetailSequenceLinkId", js.undefined)
    
    @scala.inline
    def setDetailSequenceLinkId(value: positiveInt): Self = this.set("detailSequenceLinkId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDetailSequenceLinkId: Self = this.set("detailSequenceLinkId", js.undefined)
    
    @scala.inline
    def setSequenceLinkId(value: positiveInt): Self = this.set("sequenceLinkId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSequenceLinkId: Self = this.set("sequenceLinkId", js.undefined)
    
    @scala.inline
    def setSubdetailSequenceLinkId(value: positiveInt): Self = this.set("subdetailSequenceLinkId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubdetailSequenceLinkId: Self = this.set("subdetailSequenceLinkId", js.undefined)
  }
}
