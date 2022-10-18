package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WatcherSlackMessage extends StObject {
  
  var attachments: js.Array[WatcherSlackAttachment]
  
  var dynamic_attachments: js.UndefOr[WatcherSlackDynamicAttachment] = js.undefined
  
  var from: String
  
  var icon: js.UndefOr[String] = js.undefined
  
  var text: String
  
  var to: js.Array[String]
}
object WatcherSlackMessage {
  
  inline def apply(attachments: js.Array[WatcherSlackAttachment], from: String, text: String, to: js.Array[String]): WatcherSlackMessage = {
    val __obj = js.Dynamic.literal(attachments = attachments.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[WatcherSlackMessage]
  }
  
  extension [Self <: WatcherSlackMessage](x: Self) {
    
    inline def setAttachments(value: js.Array[WatcherSlackAttachment]): Self = StObject.set(x, "attachments", value.asInstanceOf[js.Any])
    
    inline def setAttachmentsVarargs(value: WatcherSlackAttachment*): Self = StObject.set(x, "attachments", js.Array(value*))
    
    inline def setDynamic_attachments(value: WatcherSlackDynamicAttachment): Self = StObject.set(x, "dynamic_attachments", value.asInstanceOf[js.Any])
    
    inline def setDynamic_attachmentsUndefined: Self = StObject.set(x, "dynamic_attachments", js.undefined)
    
    inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTo(value: js.Array[String]): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    inline def setToVarargs(value: String*): Self = StObject.set(x, "to", js.Array(value*))
  }
}
