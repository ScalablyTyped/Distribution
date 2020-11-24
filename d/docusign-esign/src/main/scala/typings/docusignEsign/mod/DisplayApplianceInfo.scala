package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DisplayApplianceInfo extends js.Object {
  
  var documentData: js.UndefOr[js.Array[DisplayApplianceDocument]] = js.native
  
  var documentPages: js.UndefOr[js.Array[DisplayApplianceDocumentPage]] = js.native
  
  var envelopeData: js.UndefOr[DisplayApplianceEnvelope] = js.native
  
  var pageData: js.UndefOr[js.Array[DisplayAppliancePage]] = js.native
  
  var recipientData: js.UndefOr[js.Array[DisplayApplianceRecipient]] = js.native
}
object DisplayApplianceInfo {
  
  @scala.inline
  def apply(): DisplayApplianceInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisplayApplianceInfo]
  }
  
  @scala.inline
  implicit class DisplayApplianceInfoOps[Self <: DisplayApplianceInfo] (val x: Self) extends AnyVal {
    
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
    def setDocumentDataVarargs(value: DisplayApplianceDocument*): Self = this.set("documentData", js.Array(value :_*))
    
    @scala.inline
    def setDocumentData(value: js.Array[DisplayApplianceDocument]): Self = this.set("documentData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocumentData: Self = this.set("documentData", js.undefined)
    
    @scala.inline
    def setDocumentPagesVarargs(value: DisplayApplianceDocumentPage*): Self = this.set("documentPages", js.Array(value :_*))
    
    @scala.inline
    def setDocumentPages(value: js.Array[DisplayApplianceDocumentPage]): Self = this.set("documentPages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocumentPages: Self = this.set("documentPages", js.undefined)
    
    @scala.inline
    def setEnvelopeData(value: DisplayApplianceEnvelope): Self = this.set("envelopeData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnvelopeData: Self = this.set("envelopeData", js.undefined)
    
    @scala.inline
    def setPageDataVarargs(value: DisplayAppliancePage*): Self = this.set("pageData", js.Array(value :_*))
    
    @scala.inline
    def setPageData(value: js.Array[DisplayAppliancePage]): Self = this.set("pageData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageData: Self = this.set("pageData", js.undefined)
    
    @scala.inline
    def setRecipientDataVarargs(value: DisplayApplianceRecipient*): Self = this.set("recipientData", js.Array(value :_*))
    
    @scala.inline
    def setRecipientData(value: js.Array[DisplayApplianceRecipient]): Self = this.set("recipientData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecipientData: Self = this.set("recipientData", js.undefined)
  }
}
