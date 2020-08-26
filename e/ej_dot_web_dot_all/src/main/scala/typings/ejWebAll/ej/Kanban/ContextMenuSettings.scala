package typings.ejWebAll.ej.Kanban

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContextMenuSettings extends js.Object {
  /** Gets or sets a value that indicates whether to add custom contextMenu items.
    * @Default {Array}
    */
  var customMenuItems: js.UndefOr[js.Array[ContextMenuSettingsCustomMenuItem]] = js.native
  /** Gets or sets a value that indicates the list of items needs to be disable from default context menu items.
    * @Default {Array}
    */
  var disableDefaultItems: js.UndefOr[js.Array[_]] = js.native
  /** To enable context menu.All default context menu will show.
    * @Default {false}
    */
  var enable: js.UndefOr[Boolean] = js.native
  /** Its used to add specific default context menu items.
    * @Default {Array}
    */
  var menuItems: js.UndefOr[js.Array[_]] = js.native
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
    def setCustomMenuItemsVarargs(value: ContextMenuSettingsCustomMenuItem*): Self = this.set("customMenuItems", js.Array(value :_*))
    @scala.inline
    def setCustomMenuItems(value: js.Array[ContextMenuSettingsCustomMenuItem]): Self = this.set("customMenuItems", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomMenuItems: Self = this.set("customMenuItems", js.undefined)
    @scala.inline
    def setDisableDefaultItemsVarargs(value: js.Any*): Self = this.set("disableDefaultItems", js.Array(value :_*))
    @scala.inline
    def setDisableDefaultItems(value: js.Array[_]): Self = this.set("disableDefaultItems", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableDefaultItems: Self = this.set("disableDefaultItems", js.undefined)
    @scala.inline
    def setEnable(value: Boolean): Self = this.set("enable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnable: Self = this.set("enable", js.undefined)
    @scala.inline
    def setMenuItemsVarargs(value: js.Any*): Self = this.set("menuItems", js.Array(value :_*))
    @scala.inline
    def setMenuItems(value: js.Array[_]): Self = this.set("menuItems", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMenuItems: Self = this.set("menuItems", js.undefined)
  }
  
}

