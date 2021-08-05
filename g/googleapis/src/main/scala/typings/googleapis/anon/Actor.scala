package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Actor extends StObject {
  
  var actor: js.UndefOr[Verification] = js.undefined
  
  var attachments: js.UndefOr[js.Array[Content]] = js.undefined
  
  var content: js.UndefOr[String] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  var objectType: js.UndefOr[String] = js.undefined
  
  var originalContent: js.UndefOr[String] = js.undefined
  
  var plusoners: js.UndefOr[SelfLink] = js.undefined
  
  var replies: js.UndefOr[SelfLink] = js.undefined
  
  var resharers: js.UndefOr[SelfLink] = js.undefined
  
  var url: js.UndefOr[String] = js.undefined
}
object Actor {
  
  inline def apply(): Actor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Actor]
  }
  
  extension [Self <: Actor](x: Self) {
    
    inline def setActor(value: Verification): Self = StObject.set(x, "actor", value.asInstanceOf[js.Any])
    
    inline def setActorUndefined: Self = StObject.set(x, "actor", js.undefined)
    
    inline def setAttachments(value: js.Array[Content]): Self = StObject.set(x, "attachments", value.asInstanceOf[js.Any])
    
    inline def setAttachmentsUndefined: Self = StObject.set(x, "attachments", js.undefined)
    
    inline def setAttachmentsVarargs(value: Content*): Self = StObject.set(x, "attachments", js.Array(value :_*))
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setObjectType(value: String): Self = StObject.set(x, "objectType", value.asInstanceOf[js.Any])
    
    inline def setObjectTypeUndefined: Self = StObject.set(x, "objectType", js.undefined)
    
    inline def setOriginalContent(value: String): Self = StObject.set(x, "originalContent", value.asInstanceOf[js.Any])
    
    inline def setOriginalContentUndefined: Self = StObject.set(x, "originalContent", js.undefined)
    
    inline def setPlusoners(value: SelfLink): Self = StObject.set(x, "plusoners", value.asInstanceOf[js.Any])
    
    inline def setPlusonersUndefined: Self = StObject.set(x, "plusoners", js.undefined)
    
    inline def setReplies(value: SelfLink): Self = StObject.set(x, "replies", value.asInstanceOf[js.Any])
    
    inline def setRepliesUndefined: Self = StObject.set(x, "replies", js.undefined)
    
    inline def setResharers(value: SelfLink): Self = StObject.set(x, "resharers", value.asInstanceOf[js.Any])
    
    inline def setResharersUndefined: Self = StObject.set(x, "resharers", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
