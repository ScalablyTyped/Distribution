package typings.ejDotWebDotAll.ej.TreeGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContextMenuSettings extends js.Object {
  /** Option for adding items to context menu.
    * @Default {[]}
    */
  var contextMenuItems: js.UndefOr[js.Array[ContextMenuItems | String]] = js.undefined
  /** Shows/hides the context menu.
    * @Default {false}
    */
  var showContextMenu: js.UndefOr[Boolean] = js.undefined
}

object ContextMenuSettings {
  @scala.inline
  def apply(
    contextMenuItems: js.Array[ContextMenuItems | String] = null,
    showContextMenu: js.UndefOr[Boolean] = js.undefined
  ): ContextMenuSettings = {
    val __obj = js.Dynamic.literal()
    if (contextMenuItems != null) __obj.updateDynamic("contextMenuItems")(contextMenuItems.asInstanceOf[js.Any])
    if (!js.isUndefined(showContextMenu)) __obj.updateDynamic("showContextMenu")(showContextMenu.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContextMenuSettings]
  }
}

