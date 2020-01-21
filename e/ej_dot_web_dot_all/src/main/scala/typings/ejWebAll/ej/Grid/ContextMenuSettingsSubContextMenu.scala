package typings.ejWebAll.ej.Grid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContextMenuSettingsSubContextMenu extends js.Object {
  /** Used to get or set the corresponding custom context menu item to which the submenu to be appended.
    * @Default {null}
    */
  var contextMenuItem: js.UndefOr[String] = js.undefined
  /** Used to get or set the sub menu items to the custom context menu item.
    * @Default {[]}
    */
  var subMenu: js.UndefOr[js.Array[_]] = js.undefined
  /** Used to get or set the sub menu items to the custom context menu item using JsRender template.
    * @Default {null}
    */
  var template: js.UndefOr[String] = js.undefined
}

object ContextMenuSettingsSubContextMenu {
  @scala.inline
  def apply(contextMenuItem: String = null, subMenu: js.Array[_] = null, template: String = null): ContextMenuSettingsSubContextMenu = {
    val __obj = js.Dynamic.literal()
    if (contextMenuItem != null) __obj.updateDynamic("contextMenuItem")(contextMenuItem.asInstanceOf[js.Any])
    if (subMenu != null) __obj.updateDynamic("subMenu")(subMenu.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContextMenuSettingsSubContextMenu]
  }
}

