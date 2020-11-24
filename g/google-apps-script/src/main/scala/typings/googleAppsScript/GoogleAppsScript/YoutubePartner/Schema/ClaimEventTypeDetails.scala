package typings.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClaimEventTypeDetails extends js.Object {
  
  var appealExplanation: js.UndefOr[String] = js.native
  
  var disputeNotes: js.UndefOr[String] = js.native
  
  var disputeReason: js.UndefOr[String] = js.native
  
  var updateStatus: js.UndefOr[String] = js.native
}
object ClaimEventTypeDetails {
  
  @scala.inline
  def apply(): ClaimEventTypeDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClaimEventTypeDetails]
  }
  
  @scala.inline
  implicit class ClaimEventTypeDetailsOps[Self <: ClaimEventTypeDetails] (val x: Self) extends AnyVal {
    
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
    def setAppealExplanation(value: String): Self = this.set("appealExplanation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppealExplanation: Self = this.set("appealExplanation", js.undefined)
    
    @scala.inline
    def setDisputeNotes(value: String): Self = this.set("disputeNotes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisputeNotes: Self = this.set("disputeNotes", js.undefined)
    
    @scala.inline
    def setDisputeReason(value: String): Self = this.set("disputeReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisputeReason: Self = this.set("disputeReason", js.undefined)
    
    @scala.inline
    def setUpdateStatus(value: String): Self = this.set("updateStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateStatus: Self = this.set("updateStatus", js.undefined)
  }
}
