package typings.ejWebAll.ej.TreeGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContextMenuSettings extends js.Object {
  /** Option for adding items to context menu.
    * @Default {[]}
    */
  var contextMenuItems: js.UndefOr[js.Array[ContextMenuItems | String]] = js.native
  /** Shows/hides the context menu.
    * @Default {false}
    */
  var showContextMenu: js.UndefOr[Boolean] = js.native
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
    def setContextMenuItemsVarargs(value: (ContextMenuItems | String)*): Self = this.set("contextMenuItems", js.Array(value :_*))
    @scala.inline
    def setContextMenuItems(value: js.Array[ContextMenuItems | String]): Self = this.set("contextMenuItems", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContextMenuItems: Self = this.set("contextMenuItems", js.undefined)
    @scala.inline
    def setShowContextMenu(value: Boolean): Self = this.set("showContextMenu", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowContextMenu: Self = this.set("showContextMenu", js.undefined)
  }
  
}

