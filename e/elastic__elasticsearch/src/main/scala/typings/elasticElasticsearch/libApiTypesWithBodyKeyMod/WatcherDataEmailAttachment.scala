package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WatcherDataEmailAttachment extends StObject {
  
  var format: js.UndefOr[WatcherDataAttachmentFormat] = js.undefined
}
object WatcherDataEmailAttachment {
  
  inline def apply(): WatcherDataEmailAttachment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WatcherDataEmailAttachment]
  }
  
  extension [Self <: WatcherDataEmailAttachment](x: Self) {
    
    inline def setFormat(value: WatcherDataAttachmentFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
  }
}
