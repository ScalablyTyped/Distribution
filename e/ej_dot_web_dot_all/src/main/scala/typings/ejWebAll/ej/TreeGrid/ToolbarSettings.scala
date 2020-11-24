package typings.ejWebAll.ej.TreeGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ToolbarSettings extends js.Object {
  
  /** Allows the user to insert custom toolbar items.
    */
  var customToolbarItems: js.UndefOr[js.Array[ToolbarSettingsCustomToolbarItem]] = js.native
  
  /** Shows/hides the toolbar.
    * @Default {false}
    */
  var showToolbar: js.UndefOr[Boolean] = js.native
  
  /** Specifies the list of toolbar items to be rendered in TreeGrid toolbar
    * @Default {[]}
    */
  var toolbarItems: js.UndefOr[js.Array[ToolbarItems | String]] = js.native
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
    def setCustomToolbarItemsVarargs(value: ToolbarSettingsCustomToolbarItem*): Self = this.set("customToolbarItems", js.Array(value :_*))
    
    @scala.inline
    def setCustomToolbarItems(value: js.Array[ToolbarSettingsCustomToolbarItem]): Self = this.set("customToolbarItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomToolbarItems: Self = this.set("customToolbarItems", js.undefined)
    
    @scala.inline
    def setShowToolbar(value: Boolean): Self = this.set("showToolbar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowToolbar: Self = this.set("showToolbar", js.undefined)
    
    @scala.inline
    def setToolbarItemsVarargs(value: (ToolbarItems | String)*): Self = this.set("toolbarItems", js.Array(value :_*))
    
    @scala.inline
    def setToolbarItems(value: js.Array[ToolbarItems | String]): Self = this.set("toolbarItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToolbarItems: Self = this.set("toolbarItems", js.undefined)
  }
}
