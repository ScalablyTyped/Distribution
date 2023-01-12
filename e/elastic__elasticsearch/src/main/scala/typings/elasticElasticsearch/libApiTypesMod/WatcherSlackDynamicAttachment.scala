package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WatcherSlackDynamicAttachment extends StObject {
  
  var attachment_template: WatcherSlackAttachment
  
  var list_path: String
}
object WatcherSlackDynamicAttachment {
  
  inline def apply(attachment_template: WatcherSlackAttachment, list_path: String): WatcherSlackDynamicAttachment = {
    val __obj = js.Dynamic.literal(attachment_template = attachment_template.asInstanceOf[js.Any], list_path = list_path.asInstanceOf[js.Any])
    __obj.asInstanceOf[WatcherSlackDynamicAttachment]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WatcherSlackDynamicAttachment] (val x: Self) extends AnyVal {
    
    inline def setAttachment_template(value: WatcherSlackAttachment): Self = StObject.set(x, "attachment_template", value.asInstanceOf[js.Any])
    
    inline def setList_path(value: String): Self = StObject.set(x, "list_path", value.asInstanceOf[js.Any])
  }
}
