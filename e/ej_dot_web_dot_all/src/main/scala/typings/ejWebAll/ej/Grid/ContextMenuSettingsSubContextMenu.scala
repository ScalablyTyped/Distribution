package typings.ejWebAll.ej.Grid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContextMenuSettingsSubContextMenu extends js.Object {
  /** Used to get or set the corresponding custom context menu item to which the submenu to be appended.
    * @Default {null}
    */
  var contextMenuItem: js.UndefOr[String] = js.native
  /** Used to get or set the sub menu items to the custom context menu item.
    * @Default {[]}
    */
  var subMenu: js.UndefOr[js.Array[_]] = js.native
  /** Used to get or set the sub menu items to the custom context menu item using JsRender template.
    * @Default {null}
    */
  var template: js.UndefOr[String] = js.native
}

object ContextMenuSettingsSubContextMenu {
  @scala.inline
  def apply(): ContextMenuSettingsSubContextMenu = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContextMenuSettingsSubContextMenu]
  }
  @scala.inline
  implicit class ContextMenuSettingsSubContextMenuOps[Self <: ContextMenuSettingsSubContextMenu] (val x: Self) extends AnyVal {
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
    def setContextMenuItem(value: String): Self = this.set("contextMenuItem", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContextMenuItem: Self = this.set("contextMenuItem", js.undefined)
    @scala.inline
    def setSubMenuVarargs(value: js.Any*): Self = this.set("subMenu", js.Array(value :_*))
    @scala.inline
    def setSubMenu(value: js.Array[_]): Self = this.set("subMenu", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubMenu: Self = this.set("subMenu", js.undefined)
    @scala.inline
    def setTemplate(value: String): Self = this.set("template", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplate: Self = this.set("template", js.undefined)
  }
  
}

