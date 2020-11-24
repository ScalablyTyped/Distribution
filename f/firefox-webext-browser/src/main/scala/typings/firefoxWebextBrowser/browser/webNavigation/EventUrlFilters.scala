package typings.firefoxWebextBrowser.browser.webNavigation

import typings.firefoxWebextBrowser.browser.events.UrlFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventUrlFilters extends js.Object {
  
  var url: js.Array[UrlFilter] = js.native
}
object EventUrlFilters {
  
  @scala.inline
  def apply(url: js.Array[UrlFilter]): EventUrlFilters = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventUrlFilters]
  }
  
  @scala.inline
  implicit class EventUrlFiltersOps[Self <: EventUrlFilters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setUrlVarargs(value: UrlFilter*): Self = this.set("url", js.Array(value :_*))
    
    @scala.inline
    def setUrl(value: js.Array[UrlFilter]): Self = this.set("url", value.asInstanceOf[js.Any])
  }
}
