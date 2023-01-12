package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnvelopeAttachmentsResult extends StObject {
  
  /**
    * An array of attachment objects that contain information about the attachments.
    */
  var attachments: js.UndefOr[js.Array[EnvelopeAttachment]] = js.undefined
}
object EnvelopeAttachmentsResult {
  
  inline def apply(): EnvelopeAttachmentsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnvelopeAttachmentsResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnvelopeAttachmentsResult] (val x: Self) extends AnyVal {
    
    inline def setAttachments(value: js.Array[EnvelopeAttachment]): Self = StObject.set(x, "attachments", value.asInstanceOf[js.Any])
    
    inline def setAttachmentsUndefined: Self = StObject.set(x, "attachments", js.undefined)
    
    inline def setAttachmentsVarargs(value: EnvelopeAttachment*): Self = StObject.set(x, "attachments", js.Array(value*))
  }
}
