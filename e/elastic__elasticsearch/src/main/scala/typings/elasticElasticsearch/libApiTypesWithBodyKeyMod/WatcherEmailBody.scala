package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WatcherEmailBody extends StObject {
  
  var html: js.UndefOr[String] = js.undefined
  
  var text: js.UndefOr[String] = js.undefined
}
object WatcherEmailBody {
  
  inline def apply(): WatcherEmailBody = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WatcherEmailBody]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WatcherEmailBody] (val x: Self) extends AnyVal {
    
    inline def setHtml(value: String): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
    
    inline def setHtmlUndefined: Self = StObject.set(x, "html", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
