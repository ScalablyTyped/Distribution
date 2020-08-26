package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.devextremeStrings.button
import typings.devextreme.devextremeStrings.empty
import typings.devextreme.devextremeStrings.group
import typings.devextreme.devextremeStrings.simple
import typings.devextreme.devextremeStrings.tabbed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxFormEmptyItem extends js.Object {
  /** @name dxFormEmptyItem.colSpan */
  var colSpan: js.UndefOr[Double] = js.native
  /** @name dxFormEmptyItem.cssClass */
  var cssClass: js.UndefOr[String] = js.native
  /** @name dxFormEmptyItem.itemType */
  var itemType: js.UndefOr[empty | group | simple | tabbed | button] = js.native
  /** @name dxFormEmptyItem.name */
  var name: js.UndefOr[String] = js.native
  /** @name dxFormEmptyItem.visible */
  var visible: js.UndefOr[Boolean] = js.native
  /** @name dxFormEmptyItem.visibleIndex */
  var visibleIndex: js.UndefOr[Double] = js.native
}

object dxFormEmptyItem {
  @scala.inline
  def apply(): dxFormEmptyItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxFormEmptyItem]
  }
  @scala.inline
  implicit class dxFormEmptyItemOps[Self <: dxFormEmptyItem] (val x: Self) extends AnyVal {
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
    def setColSpan(value: Double): Self = this.set("colSpan", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColSpan: Self = this.set("colSpan", js.undefined)
    @scala.inline
    def setCssClass(value: String): Self = this.set("cssClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCssClass: Self = this.set("cssClass", js.undefined)
    @scala.inline
    def setItemType(value: empty | group | simple | tabbed | button): Self = this.set("itemType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemType: Self = this.set("itemType", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
    @scala.inline
    def setVisibleIndex(value: Double): Self = this.set("visibleIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisibleIndex: Self = this.set("visibleIndex", js.undefined)
  }
  
}

