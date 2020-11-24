package typings.ejWebAll.ej.Kanban

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContextMenuSettingsCustomMenuItem extends js.Object {
  
  /** Its sets target element to custom context menu item.
    * @Default {ej.Kanban.Target.All}
    */
  var target: js.UndefOr[Target | String] = js.native
  
  /** Gets the template to render custom context menu item.
    * @Default {null}
    */
  var template: js.UndefOr[String] = js.native
  
  /** Gets the display name to custom menu item.
    * @Default {null}
    */
  var text: js.UndefOr[String] = js.native
}
object ContextMenuSettingsCustomMenuItem {
  
  @scala.inline
  def apply(): ContextMenuSettingsCustomMenuItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContextMenuSettingsCustomMenuItem]
  }
  
  @scala.inline
  implicit class ContextMenuSettingsCustomMenuItemOps[Self <: ContextMenuSettingsCustomMenuItem] (val x: Self) extends AnyVal {
    
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
    def setTarget(value: Target | String): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
    
    @scala.inline
    def setTemplate(value: String): Self = this.set("template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplate: Self = this.set("template", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
  }
}
