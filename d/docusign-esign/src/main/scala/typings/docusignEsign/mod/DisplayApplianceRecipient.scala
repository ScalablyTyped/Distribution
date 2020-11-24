package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DisplayApplianceRecipient extends js.Object {
  
  var cfrPart11: js.UndefOr[Boolean] = js.native
  
  var company: js.UndefOr[String] = js.native
  
  var digitalSignatureBase64: js.UndefOr[String] = js.native
  
  var email: js.UndefOr[String] = js.native
  
  var inPersonEmail: js.UndefOr[String] = js.native
  
  var initialsBase64: js.UndefOr[String] = js.native
  
  var isNotary: js.UndefOr[Boolean] = js.native
  
  var notarySealBase64: js.UndefOr[String] = js.native
  
  var phoneNumber: js.UndefOr[String] = js.native
  
  var recipientCompleteCount: js.UndefOr[Double] = js.native
  
  var recipientGuidId: js.UndefOr[String] = js.native
  
  var recipientId: js.UndefOr[String] = js.native
  
  var recipientStatus: js.UndefOr[String] = js.native
  
  var recipientType: js.UndefOr[String] = js.native
  
  var rowState: js.UndefOr[String] = js.native
  
  var signatureBase64: js.UndefOr[String] = js.native
  
  var signed: js.UndefOr[Boolean] = js.native
  
  var signerApplyTabs: js.UndefOr[Boolean] = js.native
  
  var signerAttachmentBase64: js.UndefOr[String] = js.native
  
  var userName: js.UndefOr[String] = js.native
}
object DisplayApplianceRecipient {
  
  @scala.inline
  def apply(): DisplayApplianceRecipient = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisplayApplianceRecipient]
  }
  
  @scala.inline
  implicit class DisplayApplianceRecipientOps[Self <: DisplayApplianceRecipient] (val x: Self) extends AnyVal {
    
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
    def setCfrPart11(value: Boolean): Self = this.set("cfrPart11", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCfrPart11: Self = this.set("cfrPart11", js.undefined)
    
    @scala.inline
    def setCompany(value: String): Self = this.set("company", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompany: Self = this.set("company", js.undefined)
    
    @scala.inline
    def setDigitalSignatureBase64(value: String): Self = this.set("digitalSignatureBase64", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDigitalSignatureBase64: Self = this.set("digitalSignatureBase64", js.undefined)
    
    @scala.inline
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmail: Self = this.set("email", js.undefined)
    
    @scala.inline
    def setInPersonEmail(value: String): Self = this.set("inPersonEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInPersonEmail: Self = this.set("inPersonEmail", js.undefined)
    
    @scala.inline
    def setInitialsBase64(value: String): Self = this.set("initialsBase64", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialsBase64: Self = this.set("initialsBase64", js.undefined)
    
    @scala.inline
    def setIsNotary(value: Boolean): Self = this.set("isNotary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsNotary: Self = this.set("isNotary", js.undefined)
    
    @scala.inline
    def setNotarySealBase64(value: String): Self = this.set("notarySealBase64", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotarySealBase64: Self = this.set("notarySealBase64", js.undefined)
    
    @scala.inline
    def setPhoneNumber(value: String): Self = this.set("phoneNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePhoneNumber: Self = this.set("phoneNumber", js.undefined)
    
    @scala.inline
    def setRecipientCompleteCount(value: Double): Self = this.set("recipientCompleteCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecipientCompleteCount: Self = this.set("recipientCompleteCount", js.undefined)
    
    @scala.inline
    def setRecipientGuidId(value: String): Self = this.set("recipientGuidId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecipientGuidId: Self = this.set("recipientGuidId", js.undefined)
    
    @scala.inline
    def setRecipientId(value: String): Self = this.set("recipientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecipientId: Self = this.set("recipientId", js.undefined)
    
    @scala.inline
    def setRecipientStatus(value: String): Self = this.set("recipientStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecipientStatus: Self = this.set("recipientStatus", js.undefined)
    
    @scala.inline
    def setRecipientType(value: String): Self = this.set("recipientType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecipientType: Self = this.set("recipientType", js.undefined)
    
    @scala.inline
    def setRowState(value: String): Self = this.set("rowState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowState: Self = this.set("rowState", js.undefined)
    
    @scala.inline
    def setSignatureBase64(value: String): Self = this.set("signatureBase64", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignatureBase64: Self = this.set("signatureBase64", js.undefined)
    
    @scala.inline
    def setSigned(value: Boolean): Self = this.set("signed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSigned: Self = this.set("signed", js.undefined)
    
    @scala.inline
    def setSignerApplyTabs(value: Boolean): Self = this.set("signerApplyTabs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignerApplyTabs: Self = this.set("signerApplyTabs", js.undefined)
    
    @scala.inline
    def setSignerAttachmentBase64(value: String): Self = this.set("signerAttachmentBase64", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignerAttachmentBase64: Self = this.set("signerAttachmentBase64", js.undefined)
    
    @scala.inline
    def setUserName(value: String): Self = this.set("userName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserName: Self = this.set("userName", js.undefined)
  }
}
