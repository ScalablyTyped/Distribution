package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Attachments extends StObject {
  
  var actor: js.UndefOr[Verification] = js.undefined
  
  var attachments: js.UndefOr[js.Array[Embed]] = js.undefined
  
  var content: js.UndefOr[String] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  var objectType: js.UndefOr[String] = js.undefined
  
  var originalContent: js.UndefOr[String] = js.undefined
  
  var plusoners: js.UndefOr[SelfLink] = js.undefined
  
  var replies: js.UndefOr[SelfLink] = js.undefined
  
  var resharers: js.UndefOr[SelfLink] = js.undefined
  
  var statusForViewer: js.UndefOr[CanComment] = js.undefined
  
  var url: js.UndefOr[String] = js.undefined
}
object Attachments {
  
  @scala.inline
  def apply(): Attachments = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Attachments]
  }
  
  @scala.inline
  implicit class AttachmentsMutableBuilder[Self <: Attachments] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActor(value: Verification): Self = StObject.set(x, "actor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActorUndefined: Self = StObject.set(x, "actor", js.undefined)
    
    @scala.inline
    def setAttachments(value: js.Array[Embed]): Self = StObject.set(x, "attachments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttachmentsUndefined: Self = StObject.set(x, "attachments", js.undefined)
    
    @scala.inline
    def setAttachmentsVarargs(value: Embed*): Self = StObject.set(x, "attachments", js.Array(value :_*))
    
    @scala.inline
    def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setObjectType(value: String): Self = StObject.set(x, "objectType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectTypeUndefined: Self = StObject.set(x, "objectType", js.undefined)
    
    @scala.inline
    def setOriginalContent(value: String): Self = StObject.set(x, "originalContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalContentUndefined: Self = StObject.set(x, "originalContent", js.undefined)
    
    @scala.inline
    def setPlusoners(value: SelfLink): Self = StObject.set(x, "plusoners", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlusonersUndefined: Self = StObject.set(x, "plusoners", js.undefined)
    
    @scala.inline
    def setReplies(value: SelfLink): Self = StObject.set(x, "replies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepliesUndefined: Self = StObject.set(x, "replies", js.undefined)
    
    @scala.inline
    def setResharers(value: SelfLink): Self = StObject.set(x, "resharers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResharersUndefined: Self = StObject.set(x, "resharers", js.undefined)
    
    @scala.inline
    def setStatusForViewer(value: CanComment): Self = StObject.set(x, "statusForViewer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusForViewerUndefined: Self = StObject.set(x, "statusForViewer", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
