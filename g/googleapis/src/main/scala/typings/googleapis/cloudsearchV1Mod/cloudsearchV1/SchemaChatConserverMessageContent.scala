package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaChatConserverMessageContent extends StObject {
  
  /**
    * Items attached to this message, such as photos. This should *NOT* be set by clients. It will be automatically set from media uploaded along with this request and using the information provided in existing_media.
    */
  var attachment: js.UndefOr[js.Array[SchemaSocialCommonAttachmentAttachment]] = js.undefined
  
  /**
    * The text part of the message content. Segments are concatenated together to yield the full message. A message can have zero or more segments.
    */
  var segment: js.UndefOr[js.Array[SchemaSegment]] = js.undefined
}
object SchemaChatConserverMessageContent {
  
  inline def apply(): SchemaChatConserverMessageContent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaChatConserverMessageContent]
  }
  
  extension [Self <: SchemaChatConserverMessageContent](x: Self) {
    
    inline def setAttachment(value: js.Array[SchemaSocialCommonAttachmentAttachment]): Self = StObject.set(x, "attachment", value.asInstanceOf[js.Any])
    
    inline def setAttachmentUndefined: Self = StObject.set(x, "attachment", js.undefined)
    
    inline def setAttachmentVarargs(value: SchemaSocialCommonAttachmentAttachment*): Self = StObject.set(x, "attachment", js.Array(value*))
    
    inline def setSegment(value: js.Array[SchemaSegment]): Self = StObject.set(x, "segment", value.asInstanceOf[js.Any])
    
    inline def setSegmentUndefined: Self = StObject.set(x, "segment", js.undefined)
    
    inline def setSegmentVarargs(value: SchemaSegment*): Self = StObject.set(x, "segment", js.Array(value*))
  }
}
