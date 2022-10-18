package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WatcherSlackAttachmentField extends StObject {
  
  var short: Boolean
  
  var title: String
  
  var value: String
}
object WatcherSlackAttachmentField {
  
  inline def apply(short: Boolean, title: String, value: String): WatcherSlackAttachmentField = {
    val __obj = js.Dynamic.literal(short = short.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[WatcherSlackAttachmentField]
  }
  
  extension [Self <: WatcherSlackAttachmentField](x: Self) {
    
    inline def setShort(value: Boolean): Self = StObject.set(x, "short", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
