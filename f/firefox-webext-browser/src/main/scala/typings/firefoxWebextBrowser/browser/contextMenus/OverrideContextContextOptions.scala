package typings.firefoxWebextBrowser.browser.contextMenus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OverrideContextContextOptions extends js.Object {
  
  /** Required when context is 'bookmark'. Requires 'bookmark' permission. */
  var bookmarkId: js.UndefOr[String] = js.native
  
  /**
    * ContextType to override, to allow menu items from other extensions in the menu. Currently only 'bookmark' and 'tab' are supported. showDefaults cannot be used with this option.
    */
  var context: js.UndefOr[OverrideContextContextOptionsContext] = js.native
  
  /** Whether to also include default menu items in the menu. */
  var showDefaults: js.UndefOr[Boolean] = js.native
  
  /** Required when context is 'tab'. Requires 'tabs' permission. */
  var tabId: js.UndefOr[Double] = js.native
}
object OverrideContextContextOptions {
  
  @scala.inline
  def apply(): OverrideContextContextOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OverrideContextContextOptions]
  }
  
  @scala.inline
  implicit class OverrideContextContextOptionsOps[Self <: OverrideContextContextOptions] (val x: Self) extends AnyVal {
    
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
    def setBookmarkId(value: String): Self = this.set("bookmarkId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBookmarkId: Self = this.set("bookmarkId", js.undefined)
    
    @scala.inline
    def setContext(value: OverrideContextContextOptionsContext): Self = this.set("context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    
    @scala.inline
    def setShowDefaults(value: Boolean): Self = this.set("showDefaults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowDefaults: Self = this.set("showDefaults", js.undefined)
    
    @scala.inline
    def setTabId(value: Double): Self = this.set("tabId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabId: Self = this.set("tabId", js.undefined)
  }
}
