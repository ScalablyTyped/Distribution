package typings.ejWebAll.ej.Grid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ToolbarSettingsCustomToolbarItem extends js.Object {
  
  /** Gets or sets a value that indicates whether to add custom toolbar item as a template element.
    */
  var templateID: js.UndefOr[String] = js.native
  
  /** Gets or sets a value that indicates whether to add custom toolbar item with a custom tooltip.
    */
  var tooltip: js.UndefOr[String] = js.native
}
object ToolbarSettingsCustomToolbarItem {
  
  @scala.inline
  def apply(): ToolbarSettingsCustomToolbarItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ToolbarSettingsCustomToolbarItem]
  }
  
  @scala.inline
  implicit class ToolbarSettingsCustomToolbarItemOps[Self <: ToolbarSettingsCustomToolbarItem] (val x: Self) extends AnyVal {
    
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
    def setTemplateID(value: String): Self = this.set("templateID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplateID: Self = this.set("templateID", js.undefined)
    
    @scala.inline
    def setTooltip(value: String): Self = this.set("tooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTooltip: Self = this.set("tooltip", js.undefined)
  }
}
