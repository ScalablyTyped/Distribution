package typings.extjs.Ext.layout.container.boxoverflow

import typings.extjs.Ext.Array
import typings.extjs.Ext.IBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMenu extends IBase {
  /** [Property] (Array) */
  var menuItems: js.UndefOr[Array] = js.native
  /** [Property] (String) */
  var noItemsMenuText: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var triggerButtonCls: js.UndefOr[String] = js.native
}

object IMenu {
  @scala.inline
  def apply(): IMenu = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IMenu]
  }
  @scala.inline
  implicit class IMenuOps[Self <: IMenu] (val x: Self) extends AnyVal {
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
    def setMenuItems(value: Array): Self = this.set("menuItems", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMenuItems: Self = this.set("menuItems", js.undefined)
    @scala.inline
    def setNoItemsMenuText(value: String): Self = this.set("noItemsMenuText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoItemsMenuText: Self = this.set("noItemsMenuText", js.undefined)
    @scala.inline
    def setTriggerButtonCls(value: String): Self = this.set("triggerButtonCls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTriggerButtonCls: Self = this.set("triggerButtonCls", js.undefined)
  }
  
}

