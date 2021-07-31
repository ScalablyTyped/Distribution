package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnvelopeFormData extends StObject {
  
  /**
    * The subject line of the email message that is sent to all recipients.
    *
    * For information about adding merge field information to the email subject, see [Template Email Subject
    * Merge Fields](https://developers.docusign.com/esign-rest-api/reference/Templates/Templates/create#template-email-subject-merge-fields).
    *
    */
  var emailSubject: js.UndefOr[String] = js.undefined
  
  /**
    * The id of the envelope.
    */
  var envelopeId: js.UndefOr[String] = js.undefined
  
  /**
    * An array of form data objects.
    */
  var formData: js.UndefOr[js.Array[FormDataItem]] = js.undefined
  
  /**
    * An array of form data objects that are associated with specific recipients.
    */
  var recipientFormData: js.UndefOr[js.Array[RecipientFormData]] = js.undefined
  
  /**
    * The UTC DateTime when the envelope was sent. Read only.
    */
  var sentDateTime: js.UndefOr[String] = js.undefined
  
  /**
    * The status of the envelope. Valid values are:
    *
    * * `sent`: The envelope is sent to the recipients.
    * * `created`: The envelope is saved as a draft and can be modified and sent later.
    */
  var status: js.UndefOr[String] = js.undefined
}
object EnvelopeFormData {
  
  @scala.inline
  def apply(): EnvelopeFormData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnvelopeFormData]
  }
  
  @scala.inline
  implicit class EnvelopeFormDataMutableBuilder[Self <: EnvelopeFormData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEmailSubject(value: String): Self = StObject.set(x, "emailSubject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailSubjectUndefined: Self = StObject.set(x, "emailSubject", js.undefined)
    
    @scala.inline
    def setEnvelopeId(value: String): Self = StObject.set(x, "envelopeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvelopeIdUndefined: Self = StObject.set(x, "envelopeId", js.undefined)
    
    @scala.inline
    def setFormData(value: js.Array[FormDataItem]): Self = StObject.set(x, "formData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormDataUndefined: Self = StObject.set(x, "formData", js.undefined)
    
    @scala.inline
    def setFormDataVarargs(value: FormDataItem*): Self = StObject.set(x, "formData", js.Array(value :_*))
    
    @scala.inline
    def setRecipientFormData(value: js.Array[RecipientFormData]): Self = StObject.set(x, "recipientFormData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecipientFormDataUndefined: Self = StObject.set(x, "recipientFormData", js.undefined)
    
    @scala.inline
    def setRecipientFormDataVarargs(value: RecipientFormData*): Self = StObject.set(x, "recipientFormData", js.Array(value :_*))
    
    @scala.inline
    def setSentDateTime(value: String): Self = StObject.set(x, "sentDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSentDateTimeUndefined: Self = StObject.set(x, "sentDateTime", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
