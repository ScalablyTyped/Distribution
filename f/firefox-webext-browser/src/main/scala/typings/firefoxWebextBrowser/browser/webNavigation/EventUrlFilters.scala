package typings.firefoxWebextBrowser.browser.webNavigation

import typings.firefoxWebextBrowser.browser.events.UrlFilter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventUrlFilters extends StObject {
  
  var url: js.Array[UrlFilter] = js.native
}
object EventUrlFilters {
  
  @scala.inline
  def apply(url: js.Array[UrlFilter]): EventUrlFilters = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventUrlFilters]
  }
  
  @scala.inline
  implicit class EventUrlFiltersMutableBuilder[Self <: EventUrlFilters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUrl(value: js.Array[UrlFilter]): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlVarargs(value: UrlFilter*): Self = StObject.set(x, "url", js.Array(value :_*))
  }
}
