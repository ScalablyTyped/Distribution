package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.devextremeStrings.connector
import typings.devextreme.devextremeStrings.shape
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxDiagramItem extends js.Object {
  /** @name dxDiagramItem.dataItem */
  var dataItem: js.UndefOr[js.Any] = js.native
  /** @name dxDiagramItem.id */
  var id: js.UndefOr[String] = js.native
  /** @name dxDiagramItem.itemType */
  var itemType: js.UndefOr[shape | connector] = js.native
}

object dxDiagramItem {
  @scala.inline
  def apply(): dxDiagramItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxDiagramItem]
  }
  @scala.inline
  implicit class dxDiagramItemOps[Self <: dxDiagramItem] (val x: Self) extends AnyVal {
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
    def setDataItem(value: js.Any): Self = this.set("dataItem", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataItem: Self = this.set("dataItem", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setItemType(value: shape | connector): Self = this.set("itemType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemType: Self = this.set("itemType", js.undefined)
  }
  
}

