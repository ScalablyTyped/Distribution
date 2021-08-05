package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Attachment extends StObject {
  
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
    * A Base64-encoded representation of the attachment that is used to upload and download the file. File attachments may be up to 50 MB in size.
    */
  var data: js.UndefOr[String] = js.undefined
  
  /**
    * A label for the attachment. Potential values include:
    *
    * - `guidedForm`: [Guided forms](https://www.docusign.com/products/guided-forms) provide a step-by-step, mobile-ready experience to help
    * signers easily complete long or complex forms.
    * - `eventNotifications`: A list of envelope-level event statuses that trigger Connect to send updates to the endpoint specified in the `url` property.
    *
    */
  var label: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the attachment.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The URL of a previously staged chunked upload. Using a chunked upload enables you to stage a large, chunkable temp file. You then use the `remoteUrl`
    * property to reference the chunked upload as the content in attachment and document-related requests. The `remoteUrl` property cannot be used for downloads.
    */
  var remoteUrl: js.UndefOr[String] = js.undefined
}
object Attachment {
  
  inline def apply(): Attachment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Attachment]
  }
  
  extension [Self <: Attachment](x: Self) {
    
    inline def setAccessControl(value: String): Self = StObject.set(x, "accessControl", value.asInstanceOf[js.Any])
    
    inline def setAccessControlUndefined: Self = StObject.set(x, "accessControl", js.undefined)
    
    inline def setAttachmentId(value: String): Self = StObject.set(x, "attachmentId", value.asInstanceOf[js.Any])
    
    inline def setAttachmentIdUndefined: Self = StObject.set(x, "attachmentId", js.undefined)
    
    inline def setAttachmentType(value: String): Self = StObject.set(x, "attachmentType", value.asInstanceOf[js.Any])
    
    inline def setAttachmentTypeUndefined: Self = StObject.set(x, "attachmentType", js.undefined)
    
    inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRemoteUrl(value: String): Self = StObject.set(x, "remoteUrl", value.asInstanceOf[js.Any])
    
    inline def setRemoteUrlUndefined: Self = StObject.set(x, "remoteUrl", js.undefined)
  }
}
