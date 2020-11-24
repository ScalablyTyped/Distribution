package typings.ejWebAll.ej.PdfViewer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ToolbarSettings extends js.Object {
  
  /** Shows or hides the tooltip of the toolbar items.
    */
  var showToolTip: js.UndefOr[Boolean] = js.native
  
  /** Shows or hides the grouped items in the toolbar with the help of enum ej.PdfViewer.ToolbarItems
    */
  var toolbarItem: js.UndefOr[ToolbarItems | String] = js.native
}
object ToolbarSettings {
  
  @scala.inline
  def apply(): ToolbarSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ToolbarSettings]
  }
  
  @scala.inline
  implicit class ToolbarSettingsOps[Self <: ToolbarSettings] (val x: Self) extends AnyVal {
    
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
    def setShowToolTip(value: Boolean): Self = this.set("showToolTip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowToolTip: Self = this.set("showToolTip", js.undefined)
    
    @scala.inline
    def setToolbarItem(value: ToolbarItems | String): Self = this.set("toolbarItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToolbarItem: Self = this.set("toolbarItem", js.undefined)
  }
}
