package typings.firefoxWebextBrowser.browser.tabs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HighlightHighlightInfo extends js.Object {
  
  /**
    * If true, the `windows.Window` returned will have a `tabs` property that contains a list of the `tabs.Tab` objects. The `Tab` objects only contain the `url`, `title` and `favIconUrl` properties if the extension's manifest file includes the `"tabs"` permission. If false, the `windows.Window` won't have the `tabs` property.
    */
  var populate: js.UndefOr[Boolean] = js.native
  
  /** One or more tab indices to highlight. */
  var tabs: js.Array[Double] | Double = js.native
  
  /** The window that contains the tabs. */
  var windowId: js.UndefOr[Double] = js.native
}
object HighlightHighlightInfo {
  
  @scala.inline
  def apply(tabs: js.Array[Double] | Double): HighlightHighlightInfo = {
    val __obj = js.Dynamic.literal(tabs = tabs.asInstanceOf[js.Any])
    __obj.asInstanceOf[HighlightHighlightInfo]
  }
  
  @scala.inline
  implicit class HighlightHighlightInfoOps[Self <: HighlightHighlightInfo] (val x: Self) extends AnyVal {
    
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
    def setTabsVarargs(value: Double*): Self = this.set("tabs", js.Array(value :_*))
    
    @scala.inline
    def setTabs(value: js.Array[Double] | Double): Self = this.set("tabs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPopulate(value: Boolean): Self = this.set("populate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePopulate: Self = this.set("populate", js.undefined)
    
    @scala.inline
    def setWindowId(value: Double): Self = this.set("windowId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWindowId: Self = this.set("windowId", js.undefined)
  }
}
