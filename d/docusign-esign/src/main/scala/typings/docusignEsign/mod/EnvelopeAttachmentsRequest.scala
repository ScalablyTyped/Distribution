package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnvelopeAttachmentsRequest extends StObject {
  
  /**
    * An object that contains information about the attachment.
    */
  var attachments: js.UndefOr[js.Array[/* Contains information about an attachment. */ Attachment]] = js.undefined
}
object EnvelopeAttachmentsRequest {
  
  inline def apply(): EnvelopeAttachmentsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnvelopeAttachmentsRequest]
  }
  
  extension [Self <: EnvelopeAttachmentsRequest](x: Self) {
    
    inline def setAttachments(value: js.Array[/* Contains information about an attachment. */ Attachment]): Self = StObject.set(x, "attachments", value.asInstanceOf[js.Any])
    
    inline def setAttachmentsUndefined: Self = StObject.set(x, "attachments", js.undefined)
    
    inline def setAttachmentsVarargs(value: (/* Contains information about an attachment. */ Attachment)*): Self = StObject.set(x, "attachments", js.Array(value :_*))
  }
}
