package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecipientFormData extends StObject {
  
  /**
    * The date and time the recipient declined the envelope.
    */
  var DeclinedTime: js.UndefOr[String] = js.undefined
  
  /**
    * The date and time the recipient viewed the documents in the envelope in the DocuSign signing UI.
    */
  var DeliveredTime: js.UndefOr[String] = js.undefined
  
  /**
    * The date and time the envelope was sent to the recipient.
    */
  var SentTime: js.UndefOr[String] = js.undefined
  
  /**
    * The date and time the recipient signed the documents.
    */
  var SignedTime: js.UndefOr[String] = js.undefined
  
  /**
    * The recipient's email address.
    */
  var email: js.UndefOr[String] = js.undefined
  
  /**
    * An array of form data objects.
    */
  var formData: js.UndefOr[js.Array[FormDataItem]] = js.undefined
  
  /**
    * The name of the recipient.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * A local reference that senders use to map recipients to other objects, such as specific document tabs. Within an envelope, each `recipientId` must be unique,
    * but there is no uniqueness requirement across envelopes. For example, many envelopes assign the first recipient a `recipientId` of `1`.
    */
  var recipientId: js.UndefOr[String] = js.undefined
}
object RecipientFormData {
  
  inline def apply(): RecipientFormData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecipientFormData]
  }
  
  extension [Self <: RecipientFormData](x: Self) {
    
    inline def setDeclinedTime(value: String): Self = StObject.set(x, "DeclinedTime", value.asInstanceOf[js.Any])
    
    inline def setDeclinedTimeUndefined: Self = StObject.set(x, "DeclinedTime", js.undefined)
    
    inline def setDeliveredTime(value: String): Self = StObject.set(x, "DeliveredTime", value.asInstanceOf[js.Any])
    
    inline def setDeliveredTimeUndefined: Self = StObject.set(x, "DeliveredTime", js.undefined)
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setFormData(value: js.Array[FormDataItem]): Self = StObject.set(x, "formData", value.asInstanceOf[js.Any])
    
    inline def setFormDataUndefined: Self = StObject.set(x, "formData", js.undefined)
    
    inline def setFormDataVarargs(value: FormDataItem*): Self = StObject.set(x, "formData", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRecipientId(value: String): Self = StObject.set(x, "recipientId", value.asInstanceOf[js.Any])
    
    inline def setRecipientIdUndefined: Self = StObject.set(x, "recipientId", js.undefined)
    
    inline def setSentTime(value: String): Self = StObject.set(x, "SentTime", value.asInstanceOf[js.Any])
    
    inline def setSentTimeUndefined: Self = StObject.set(x, "SentTime", js.undefined)
    
    inline def setSignedTime(value: String): Self = StObject.set(x, "SignedTime", value.asInstanceOf[js.Any])
    
    inline def setSignedTimeUndefined: Self = StObject.set(x, "SignedTime", js.undefined)
  }
}
