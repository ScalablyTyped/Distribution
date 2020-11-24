package typings.firefoxWebextBrowser.browser.search

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* search types */
/** An object encapsulating a search engine */
@js.native
trait SearchEngine extends js.Object {
  
  var alias: js.UndefOr[String] = js.native
  
  var favIconUrl: js.UndefOr[String] = js.native
  
  var isDefault: Boolean = js.native
  
  var name: String = js.native
}
object SearchEngine {
  
  @scala.inline
  def apply(isDefault: Boolean, name: String): SearchEngine = {
    val __obj = js.Dynamic.literal(isDefault = isDefault.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchEngine]
  }
  
  @scala.inline
  implicit class SearchEngineOps[Self <: SearchEngine] (val x: Self) extends AnyVal {
    
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
    def setIsDefault(value: Boolean): Self = this.set("isDefault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlias(value: String): Self = this.set("alias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlias: Self = this.set("alias", js.undefined)
    
    @scala.inline
    def setFavIconUrl(value: String): Self = this.set("favIconUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFavIconUrl: Self = this.set("favIconUrl", js.undefined)
  }
}
