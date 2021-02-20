package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BulkSendingCopy extends StObject {
  
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
  implicit class BulkSendingCopyMutableBuilder[Self <: BulkSendingCopy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustomFields(
      value: js.Array[
          /* This object contains details about a custom field for a bulk send copy. In a bulk send request, each custom field in the bulk send list
      must match a custom field in the envelope or template that you want to send. */ BulkSendingCopyCustomField
        ]
    ): Self = StObject.set(x, "customFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomFieldsUndefined: Self = StObject.set(x, "customFields", js.undefined)
    
    @scala.inline
    def setCustomFieldsVarargs(
      value: (/* This object contains details about a custom field for a bulk send copy. In a bulk send request, each custom field in the bulk send list
      must match a custom field in the envelope or template that you want to send. */ BulkSendingCopyCustomField)*
    ): Self = StObject.set(x, "customFields", js.Array(value :_*))
    
    @scala.inline
    def setEmailBlurb(value: String): Self = StObject.set(x, "emailBlurb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailBlurbUndefined: Self = StObject.set(x, "emailBlurb", js.undefined)
    
    @scala.inline
    def setEmailSubject(value: String): Self = StObject.set(x, "emailSubject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailSubjectUndefined: Self = StObject.set(x, "emailSubject", js.undefined)
    
    @scala.inline
    def setRecipients(
      value: js.Array[
          /* This object contains details about a bulk send recipient. */ BulkSendingCopyRecipient
        ]
    ): Self = StObject.set(x, "recipients", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecipientsUndefined: Self = StObject.set(x, "recipients", js.undefined)
    
    @scala.inline
    def setRecipientsVarargs(value: (/* This object contains details about a bulk send recipient. */ BulkSendingCopyRecipient)*): Self = StObject.set(x, "recipients", js.Array(value :_*))
  }
}
