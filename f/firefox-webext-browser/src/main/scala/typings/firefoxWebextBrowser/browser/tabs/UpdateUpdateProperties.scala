package typings.firefoxWebextBrowser.browser.tabs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateUpdateProperties extends js.Object {
  
  /**
    * Whether the tab should be active. Does not affect whether the window is focused (see `windows.update`).
    */
  var active: js.UndefOr[Boolean] = js.native
  
  /** Adds or removes the tab from the current selection. */
  var highlighted: js.UndefOr[Boolean] = js.native
  
  /** Whether the load should replace the current history entry for the tab. */
  var loadReplace: js.UndefOr[Boolean] = js.native
  
  /** Whether the tab should be muted. */
  var muted: js.UndefOr[Boolean] = js.native
  
  /**
    * The ID of the tab that opened this tab. If specified, the opener tab must be in the same window as this tab.
    */
  var openerTabId: js.UndefOr[Double] = js.native
  
  /** Whether the tab should be pinned. */
  var pinned: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether the tab should be selected.
    * @deprecated Please use _highlighted_.
    */
  var selected: js.UndefOr[Boolean] = js.native
  
  /**
    * The ID of this tab's successor. If specified, the successor tab must be in the same window as this tab.
    */
  var successorTabId: js.UndefOr[Double] = js.native
  
  /** A URL to navigate the tab to. */
  var url: js.UndefOr[String] = js.native
}
object UpdateUpdateProperties {
  
  @scala.inline
  def apply(): UpdateUpdateProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateUpdateProperties]
  }
  
  @scala.inline
  implicit class UpdateUpdatePropertiesOps[Self <: UpdateUpdateProperties] (val x: Self) extends AnyVal {
    
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
    def setActive(value: Boolean): Self = this.set("active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActive: Self = this.set("active", js.undefined)
    
    @scala.inline
    def setHighlighted(value: Boolean): Self = this.set("highlighted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHighlighted: Self = this.set("highlighted", js.undefined)
    
    @scala.inline
    def setLoadReplace(value: Boolean): Self = this.set("loadReplace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoadReplace: Self = this.set("loadReplace", js.undefined)
    
    @scala.inline
    def setMuted(value: Boolean): Self = this.set("muted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMuted: Self = this.set("muted", js.undefined)
    
    @scala.inline
    def setOpenerTabId(value: Double): Self = this.set("openerTabId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpenerTabId: Self = this.set("openerTabId", js.undefined)
    
    @scala.inline
    def setPinned(value: Boolean): Self = this.set("pinned", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePinned: Self = this.set("pinned", js.undefined)
    
    @scala.inline
    def setSelected(value: Boolean): Self = this.set("selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelected: Self = this.set("selected", js.undefined)
    
    @scala.inline
    def setSuccessorTabId(value: Double): Self = this.set("successorTabId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuccessorTabId: Self = this.set("successorTabId", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
}
