package typings
package ejDotWebDotAllLib.ejNs.GridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContextMenuSettingsSubContextMenu extends js.Object {
  /** Used to get or set the corresponding custom context menu item to which the submenu to be appended.
    * @Default {null}
    */
  var contextMenuItem: js.UndefOr[java.lang.String] = js.undefined
  /** Used to get or set the sub menu items to the custom context menu item.
    * @Default {[]}
    */
  var subMenu: js.UndefOr[js.Array[_]] = js.undefined
  /** Used to get or set the sub menu items to the custom context menu item using JsRender template.
    * @Default {null}
    */
  var template: js.UndefOr[java.lang.String] = js.undefined
}

object ContextMenuSettingsSubContextMenu {
  @scala.inline
  def apply(
    contextMenuItem: java.lang.String = null,
    subMenu: js.Array[_] = null,
    template: java.lang.String = null
  ): ContextMenuSettingsSubContextMenu = {
    val __obj = js.Dynamic.literal()
    if (contextMenuItem != null) __obj.updateDynamic("contextMenuItem")(contextMenuItem)
    if (subMenu != null) __obj.updateDynamic("subMenu")(subMenu)
    if (template != null) __obj.updateDynamic("template")(template)
    __obj.asInstanceOf[ContextMenuSettingsSubContextMenu]
  }
}

