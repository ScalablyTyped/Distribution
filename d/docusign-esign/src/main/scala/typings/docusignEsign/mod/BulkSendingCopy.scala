package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BulkSendingCopy extends js.Object {
  
  /**
    * The custom fields for this copy of the envelope.
    *
    * **Note**: These custom fields must also be included in the original envelope or template that you want to send.
    */
  var customFields: js.UndefOr[
    js.Array[
      /* This object contains details about a custom field for a bulk send copy. In a bulk send request, each custom field in the bulk send list
    must match a custom field in the envelope or template that you want to send. */ BulkSendingCopyCustomField
    ]
  ] = js.native
  
  /**
    * The email body for this copy of the envelope.
    */
  var emailBlurb: js.UndefOr[String] = js.native
  
  /**
    * The email subject line for this copy of the envelope. For information about adding merge field information to the email subject, see
    * [Template Email Subject Merge Fields](https://developers.docusign.com/esign-rest-api/reference/Templates/Templates/create#template-email-subject-merge-fields).
    */
  var emailSubject: js.UndefOr[String] = js.native
  
  /**
    * Information about the recipients associated with this copy of the envelope.
    */
  var recipients: js.UndefOr[
    js.Array[
      /* This object contains details about a bulk send recipient. */ BulkSendingCopyRecipient
    ]
  ] = js.native
}
object BulkSendingCopy {
  
  @scala.inline
  def apply(): BulkSendingCopy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BulkSendingCopy]
  }
  
  @scala.inline
  implicit class BulkSendingCopyOps[Self <: BulkSendingCopy] (val x: Self) extends AnyVal {
    
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
    def setCustomFieldsVarargs(
      value: (/* This object contains details about a custom field for a bulk send copy. In a bulk send request, each custom field in the bulk send list
      must match a custom field in the envelope or template that you want to send. */ BulkSendingCopyCustomField)*
    ): Self = this.set("customFields", js.Array(value :_*))
    
    @scala.inline
    def setCustomFields(
      value: js.Array[
          /* This object contains details about a custom field for a bulk send copy. In a bulk send request, each custom field in the bulk send list
      must match a custom field in the envelope or template that you want to send. */ BulkSendingCopyCustomField
        ]
    ): Self = this.set("customFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomFields: Self = this.set("customFields", js.undefined)
    
    @scala.inline
    def setEmailBlurb(value: String): Self = this.set("emailBlurb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmailBlurb: Self = this.set("emailBlurb", js.undefined)
    
    @scala.inline
    def setEmailSubject(value: String): Self = this.set("emailSubject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmailSubject: Self = this.set("emailSubject", js.undefined)
    
    @scala.inline
    def setRecipientsVarargs(value: (/* This object contains details about a bulk send recipient. */ BulkSendingCopyRecipient)*): Self = this.set("recipients", js.Array(value :_*))
    
    @scala.inline
    def setRecipients(
      value: js.Array[
          /* This object contains details about a bulk send recipient. */ BulkSendingCopyRecipient
        ]
    ): Self = this.set("recipients", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecipients: Self = this.set("recipients", js.undefined)
  }
}
