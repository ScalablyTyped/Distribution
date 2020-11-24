package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Line items
  */
@js.native
trait ClaimResponseItem extends BackboneElement {
  
  /**
    * Contains extended information for property 'noteNumber'.
    */
  var _noteNumber: js.UndefOr[js.Array[Element]] = js.native
  
  /**
    * Contains extended information for property 'sequenceLinkId'.
    */
  var _sequenceLinkId: js.UndefOr[Element] = js.native
  
  /**
    * Adjudication details
    */
  var adjudication: js.UndefOr[js.Array[ClaimResponseItemAdjudication]] = js.native
  
  /**
    * Detail line items
    */
  var detail: js.UndefOr[js.Array[ClaimResponseItemDetail]] = js.native
  
  /**
    * List of note numbers which apply
    */
  var noteNumber: js.UndefOr[js.Array[positiveInt]] = js.native
  
  /**
    * Service instance
    */
  var sequenceLinkId: positiveInt = js.native
}
object ClaimResponseItem {
  
  @scala.inline
  def apply(sequenceLinkId: positiveInt): ClaimResponseItem = {
    val __obj = js.Dynamic.literal(sequenceLinkId = sequenceLinkId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClaimResponseItem]
  }
  
  @scala.inline
  implicit class ClaimResponseItemOps[Self <: ClaimResponseItem] (val x: Self) extends AnyVal {
    
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
    def setSequenceLinkId(value: positiveInt): Self = this.set("sequenceLinkId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_noteNumberVarargs(value: Element*): Self = this.set("_noteNumber", js.Array(value :_*))
    
    @scala.inline
    def set_noteNumber(value: js.Array[Element]): Self = this.set("_noteNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_noteNumber: Self = this.set("_noteNumber", js.undefined)
    
    @scala.inline
    def set_sequenceLinkId(value: Element): Self = this.set("_sequenceLinkId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_sequenceLinkId: Self = this.set("_sequenceLinkId", js.undefined)
    
    @scala.inline
    def setAdjudicationVarargs(value: ClaimResponseItemAdjudication*): Self = this.set("adjudication", js.Array(value :_*))
    
    @scala.inline
    def setAdjudication(value: js.Array[ClaimResponseItemAdjudication]): Self = this.set("adjudication", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdjudication: Self = this.set("adjudication", js.undefined)
    
    @scala.inline
    def setDetailVarargs(value: ClaimResponseItemDetail*): Self = this.set("detail", js.Array(value :_*))
    
    @scala.inline
    def setDetail(value: js.Array[ClaimResponseItemDetail]): Self = this.set("detail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDetail: Self = this.set("detail", js.undefined)
    
    @scala.inline
    def setNoteNumberVarargs(value: positiveInt*): Self = this.set("noteNumber", js.Array(value :_*))
    
    @scala.inline
    def setNoteNumber(value: js.Array[positiveInt]): Self = this.set("noteNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoteNumber: Self = this.set("noteNumber", js.undefined)
  }
}
