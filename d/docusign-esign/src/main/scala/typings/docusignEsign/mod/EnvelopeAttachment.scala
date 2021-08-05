package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnvelopeAttachment extends StObject {
  
  /**
    * Valid values are `sender` and `senderAndAllRecipients`.
    */
  var accessControl: js.UndefOr[String] = js.undefined
  
  /**
    * The unique identifier for the attachment.
    */
  var attachmentId: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the type of the attachment for the recipient. Possible values are:
    *
    * - `.htm`
    * - `.xml`
    */
  var attachmentType: js.UndefOr[String] = js.undefined
  
  /**
    * This object describes errors that occur. It is only valid for responses and ignored in requests.
    */
  var errorDetails: js.UndefOr[
    /* This object describes errors that occur. It is only valid for responses and ignored in requests. */ ErrorDetails
  ] = js.undefined
  
  var label: js.UndefOr[String] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
}
object EnvelopeAttachment {
  
  inline def apply(): EnvelopeAttachment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnvelopeAttachment]
  }
  
  extension [Self <: EnvelopeAttachment](x: Self) {
    
    inline def setAccessControl(value: String): Self = StObject.set(x, "accessControl", value.asInstanceOf[js.Any])
    
    inline def setAccessControlUndefined: Self = StObject.set(x, "accessControl", js.undefined)
    
    inline def setAttachmentId(value: String): Self = StObject.set(x, "attachmentId", value.asInstanceOf[js.Any])
    
    inline def setAttachmentIdUndefined: Self = StObject.set(x, "attachmentId", js.undefined)
    
    inline def setAttachmentType(value: String): Self = StObject.set(x, "attachmentType", value.asInstanceOf[js.Any])
    
    inline def setAttachmentTypeUndefined: Self = StObject.set(x, "attachmentType", js.undefined)
    
    inline def setErrorDetails(
      value: /* This object describes errors that occur. It is only valid for responses and ignored in requests. */ ErrorDetails
    ): Self = StObject.set(x, "errorDetails", value.asInstanceOf[js.Any])
    
    inline def setErrorDetailsUndefined: Self = StObject.set(x, "errorDetails", js.undefined)
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
