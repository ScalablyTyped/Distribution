package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.mod.global.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxTabPanelItem extends CollectionWidgetItem {
  /** @name dxTabPanelItem.badge */
  var badge: js.UndefOr[String] = js.native
  /** @name dxTabPanelItem.icon */
  var icon: js.UndefOr[String] = js.native
  /** @name dxTabPanelItem.tabTemplate */
  var tabTemplate: js.UndefOr[
    typings.devextreme.mod.DevExpress.core.template | (js.Function0[String | Element | JQuery])
  ] = js.native
  /** @name dxTabPanelItem.title */
  var title: js.UndefOr[String] = js.native
}

object dxTabPanelItem {
  @scala.inline
  def apply(): dxTabPanelItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxTabPanelItem]
  }
  @scala.inline
  implicit class dxTabPanelItemOps[Self <: dxTabPanelItem] (val x: Self) extends AnyVal {
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
    def setBadge(value: String): Self = this.set("badge", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBadge: Self = this.set("badge", js.undefined)
    @scala.inline
    def setIcon(value: String): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    @scala.inline
    def setTabTemplateFunction0(value: () => String | Element | JQuery): Self = this.set("tabTemplate", js.Any.fromFunction0(value))
    @scala.inline
    def setTabTemplate(value: typings.devextreme.mod.DevExpress.core.template | (js.Function0[String | Element | JQuery])): Self = this.set("tabTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTabTemplate: Self = this.set("tabTemplate", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

