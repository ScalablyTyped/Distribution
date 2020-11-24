package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnvelopeFormData extends js.Object {
  
  /**
    * The subject line of the email message that is sent to all recipients.
    *
    * For information about adding merge field information to the email subject, see [Template Email Subject
    * Merge Fields](https://developers.docusign.com/esign-rest-api/reference/Templates/Templates/create#template-email-subject-merge-fields).
    *
    */
  var emailSubject: js.UndefOr[String] = js.native
  
  /**
    * The id of the envelope.
    */
  var envelopeId: js.UndefOr[String] = js.native
  
  /**
    * An array of form data objects.
    */
  var formData: js.UndefOr[js.Array[FormDataItem]] = js.native
  
  /**
    * An array of form data objects that are associated with specific recipients.
    */
  var recipientFormData: js.UndefOr[js.Array[RecipientFormData]] = js.native
  
  /**
    * The UTC DateTime when the envelope was sent. Read only.
    */
  var sentDateTime: js.UndefOr[String] = js.native
  
  /**
    * The status of the envelope. Valid values are:
    *
    * * `sent`: The envelope is sent to the recipients.
    * * `created`: The envelope is saved as a draft and can be modified and sent later.
    */
  var status: js.UndefOr[String] = js.native
}
object EnvelopeFormData {
  
  @scala.inline
  def apply(): EnvelopeFormData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnvelopeFormData]
  }
  
  @scala.inline
  implicit class EnvelopeFormDataOps[Self <: EnvelopeFormData] (val x: Self) extends AnyVal {
    
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
    def setEmailSubject(value: String): Self = this.set("emailSubject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmailSubject: Self = this.set("emailSubject", js.undefined)
    
    @scala.inline
    def setEnvelopeId(value: String): Self = this.set("envelopeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnvelopeId: Self = this.set("envelopeId", js.undefined)
    
    @scala.inline
    def setFormDataVarargs(value: FormDataItem*): Self = this.set("formData", js.Array(value :_*))
    
    @scala.inline
    def setFormData(value: js.Array[FormDataItem]): Self = this.set("formData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormData: Self = this.set("formData", js.undefined)
    
    @scala.inline
    def setRecipientFormDataVarargs(value: RecipientFormData*): Self = this.set("recipientFormData", js.Array(value :_*))
    
    @scala.inline
    def setRecipientFormData(value: js.Array[RecipientFormData]): Self = this.set("recipientFormData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecipientFormData: Self = this.set("recipientFormData", js.undefined)
    
    @scala.inline
    def setSentDateTime(value: String): Self = this.set("sentDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSentDateTime: Self = this.set("sentDateTime", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
}
