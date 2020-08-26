package typings.ejWebAll.ej.Grid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContextMenuSettings extends js.Object {
  /** Gets or sets a value that indicates whether to add the default context menu actions as a context menu items If enableContextMenu is true it will show all the items related to the
    * target, if you want selected items from contextmenu you have to mention in the contextMenuItems
    * @Default {[]}
    */
  var contextMenuItems: js.UndefOr[js.Array[_]] = js.native
  /** Gets or sets a value that indicates whether to add custom contextMenu items within the toolbar to perform any action in the grid
    * @Default {[]}
    */
  var customContextMenuItems: js.UndefOr[js.Array[_]] = js.native
  /** Gets or sets a value that indicates whether to disable the default context menu items in the grid.
    * @Default {false}
    */
  var disableDefaultItems: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value that indicates whether to enable the context menu action in the grid.
    * @Default {false}
    */
  var enableContextMenu: js.UndefOr[Boolean] = js.native
  /** Used to get or set the subMenu to the corresponding custom context menu item.
    */
  var subContextMenu: js.UndefOr[js.Array[ContextMenuSettingsSubContextMenu]] = js.native
}

object ContextMenuSettings {
  @scala.inline
  def apply(): ContextMenuSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContextMenuSettings]
  }
  @scala.inline
  implicit class ContextMenuSettingsOps[Self <: ContextMenuSettings] (val x: Self) extends AnyVal {
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
    def setContextMenuItemsVarargs(value: js.Any*): Self = this.set("contextMenuItems", js.Array(value :_*))
    @scala.inline
    def setContextMenuItems(value: js.Array[_]): Self = this.set("contextMenuItems", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContextMenuItems: Self = this.set("contextMenuItems", js.undefined)
    @scala.inline
    def setCustomContextMenuItemsVarargs(value: js.Any*): Self = this.set("customContextMenuItems", js.Array(value :_*))
    @scala.inline
    def setCustomContextMenuItems(value: js.Array[_]): Self = this.set("customContextMenuItems", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomContextMenuItems: Self = this.set("customContextMenuItems", js.undefined)
    @scala.inline
    def setDisableDefaultItems(value: Boolean): Self = this.set("disableDefaultItems", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableDefaultItems: Self = this.set("disableDefaultItems", js.undefined)
    @scala.inline
    def setEnableContextMenu(value: Boolean): Self = this.set("enableContextMenu", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableContextMenu: Self = this.set("enableContextMenu", js.undefined)
    @scala.inline
    def setSubContextMenuVarargs(value: ContextMenuSettingsSubContextMenu*): Self = this.set("subContextMenu", js.Array(value :_*))
    @scala.inline
    def setSubContextMenu(value: js.Array[ContextMenuSettingsSubContextMenu]): Self = this.set("subContextMenu", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubContextMenu: Self = this.set("subContextMenu", js.undefined)
  }
  
}

