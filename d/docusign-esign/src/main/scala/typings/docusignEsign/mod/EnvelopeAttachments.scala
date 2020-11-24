package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnvelopeAttachments extends js.Object {
  
  /**
    * Valid values are `sender` and `senderAndAllRecipients`.
    */
  var accessControl: js.UndefOr[String] = js.native
  
  /**
    * The unique identifier for the attachment.
    */
  var attachmentId: js.UndefOr[String] = js.native
  
  /**
    * Specifies the type of the attachment for the recipient. Possible values are:
    *
    * - `.htm`
    * - `.xml`
    */
  var attachmentType: js.UndefOr[String] = js.native
  
  /**
    * This object describes errors that occur. It is only valid for responses and ignored in requests.
    */
  var errorDetails: js.UndefOr[
    /* This object describes errors that occur. It is only valid for responses and ignored in requests. */ ErrorDetails
  ] = js.native
  
  /**
    * A label for the attachment. Potential values include:
    *
    * - `guidedForm`: [Guided forms](https://www.docusign.com/products/guided-forms) provide a step-by-step, mobile-ready experience to help signers easily complete long or complex forms.
    * - `eventNotifications`: A list of envelope-level event statuses that trigger Connect to send updates to the endpoint specified in the `url` property.
    */
  var label: js.UndefOr[String] = js.native
  
  /**
    * The name of the attachment.
    */
  var name: js.UndefOr[String] = js.native
}
object EnvelopeAttachments {
  
  @scala.inline
  def apply(): EnvelopeAttachments = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnvelopeAttachments]
  }
  
  @scala.inline
  implicit class EnvelopeAttachmentsOps[Self <: EnvelopeAttachments] (val x: Self) extends AnyVal {
    
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
    def setAccessControl(value: String): Self = this.set("accessControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessControl: Self = this.set("accessControl", js.undefined)
    
    @scala.inline
    def setAttachmentId(value: String): Self = this.set("attachmentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttachmentId: Self = this.set("attachmentId", js.undefined)
    
    @scala.inline
    def setAttachmentType(value: String): Self = this.set("attachmentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttachmentType: Self = this.set("attachmentType", js.undefined)
    
    @scala.inline
    def setErrorDetails(
      value: /* This object describes errors that occur. It is only valid for responses and ignored in requests. */ ErrorDetails
    ): Self = this.set("errorDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorDetails: Self = this.set("errorDetails", js.undefined)
    
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
}
