package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.anon.ElementEvent
import typings.devextreme.devextremeStrings.back
import typings.devextreme.devextremeStrings.danger
import typings.devextreme.devextremeStrings.default_
import typings.devextreme.devextremeStrings.normal
import typings.devextreme.devextremeStrings.success
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxActionSheetItem extends CollectionWidgetItem {
  /** @name dxActionSheetItem.icon */
  var icon: js.UndefOr[String] = js.native
  /** @name dxActionSheetItem.onClick */
  var onClick: js.UndefOr[(js.Function1[/* e */ ElementEvent, _]) | String] = js.native
  /** @name dxActionSheetItem.type */
  var `type`: js.UndefOr[back | danger | default_ | normal | success] = js.native
}

object dxActionSheetItem {
  @scala.inline
  def apply(): dxActionSheetItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxActionSheetItem]
  }
  @scala.inline
  implicit class dxActionSheetItemOps[Self <: dxActionSheetItem] (val x: Self) extends AnyVal {
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
    def setIcon(value: String): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    @scala.inline
    def setOnClickFunction1(value: /* e */ ElementEvent => _): Self = this.set("onClick", js.Any.fromFunction1(value))
    @scala.inline
    def setOnClick(value: (js.Function1[/* e */ ElementEvent, _]) | String): Self = this.set("onClick", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    @scala.inline
    def setType(value: back | danger | default_ | normal | success): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

