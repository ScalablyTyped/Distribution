package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RecipientFormData extends js.Object {
  
  /**
    * The date and time the recipient declined the envelope.
    */
  var DeclinedTime: js.UndefOr[String] = js.native
  
  /**
    * The date and time the recipient viewed the documents in the envelope in the DocuSign signing UI.
    */
  var DeliveredTime: js.UndefOr[String] = js.native
  
  /**
    * The date and time the envelope was sent to the recipient.
    */
  var SentTime: js.UndefOr[String] = js.native
  
  /**
    * The date and time the recipient signed the documents.
    */
  var SignedTime: js.UndefOr[String] = js.native
  
  /**
    * The recipient's email address.
    */
  var email: js.UndefOr[String] = js.native
  
  /**
    * An array of form data objects.
    */
  var formData: js.UndefOr[js.Array[FormDataItem]] = js.native
  
  /**
    * The name of the recipient.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * A local reference that senders use to map recipients to other objects, such as specific document tabs. Within an envelope, each `recipientId` must be unique,
    * but there is no uniqueness requirement across envelopes. For example, many envelopes assign the first recipient a `recipientId` of `1`.
    */
  var recipientId: js.UndefOr[String] = js.native
}
object RecipientFormData {
  
  @scala.inline
  def apply(): RecipientFormData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecipientFormData]
  }
  
  @scala.inline
  implicit class RecipientFormDataOps[Self <: RecipientFormData] (val x: Self) extends AnyVal {
    
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
    def setDeclinedTime(value: String): Self = this.set("DeclinedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeclinedTime: Self = this.set("DeclinedTime", js.undefined)
    
    @scala.inline
    def setDeliveredTime(value: String): Self = this.set("DeliveredTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeliveredTime: Self = this.set("DeliveredTime", js.undefined)
    
    @scala.inline
    def setSentTime(value: String): Self = this.set("SentTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSentTime: Self = this.set("SentTime", js.undefined)
    
    @scala.inline
    def setSignedTime(value: String): Self = this.set("SignedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignedTime: Self = this.set("SignedTime", js.undefined)
    
    @scala.inline
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmail: Self = this.set("email", js.undefined)
    
    @scala.inline
    def setFormDataVarargs(value: FormDataItem*): Self = this.set("formData", js.Array(value :_*))
    
    @scala.inline
    def setFormData(value: js.Array[FormDataItem]): Self = this.set("formData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormData: Self = this.set("formData", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setRecipientId(value: String): Self = this.set("recipientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecipientId: Self = this.set("recipientId", js.undefined)
  }
}
