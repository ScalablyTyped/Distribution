package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WatcherHttpEmailAttachment extends StObject {
  
  var content_type: js.UndefOr[String] = js.undefined
  
  var `inline`: js.UndefOr[Boolean] = js.undefined
  
  var request: js.UndefOr[WatcherHttpInputRequestDefinition] = js.undefined
}
object WatcherHttpEmailAttachment {
  
  inline def apply(): WatcherHttpEmailAttachment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WatcherHttpEmailAttachment]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WatcherHttpEmailAttachment] (val x: Self) extends AnyVal {
    
    inline def setContent_type(value: String): Self = StObject.set(x, "content_type", value.asInstanceOf[js.Any])
    
    inline def setContent_typeUndefined: Self = StObject.set(x, "content_type", js.undefined)
    
    inline def setInline(value: Boolean): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
    
    inline def setInlineUndefined: Self = StObject.set(x, "inline", js.undefined)
    
    inline def setRequest(value: WatcherHttpInputRequestDefinition): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
  }
}
