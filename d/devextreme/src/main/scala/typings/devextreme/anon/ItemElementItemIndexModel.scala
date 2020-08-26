package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.ui.dxTreeView
import typings.devextreme.mod.DevExpress.ui.dxTreeViewNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ItemElementItemIndexModel extends js.Object {
  var component: js.UndefOr[dxTreeView] = js.native
  var element: js.UndefOr[dxElement] = js.native
  var itemData: js.UndefOr[js.Any] = js.native
  var itemElement: js.UndefOr[dxElement] = js.native
  var itemIndex: js.UndefOr[Double] = js.native
  var model: js.UndefOr[js.Any] = js.native
  var node: js.UndefOr[dxTreeViewNode] = js.native
}

object ItemElementItemIndexModel {
  @scala.inline
  def apply(): ItemElementItemIndexModel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ItemElementItemIndexModel]
  }
  @scala.inline
  implicit class ItemElementItemIndexModelOps[Self <: ItemElementItemIndexModel] (val x: Self) extends AnyVal {
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
    def setComponent(value: dxTreeView): Self = this.set("component", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComponent: Self = this.set("component", js.undefined)
    @scala.inline
    def setElement(value: dxElement): Self = this.set("element", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteElement: Self = this.set("element", js.undefined)
    @scala.inline
    def setItemData(value: js.Any): Self = this.set("itemData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemData: Self = this.set("itemData", js.undefined)
    @scala.inline
    def setItemElement(value: dxElement): Self = this.set("itemElement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemElement: Self = this.set("itemElement", js.undefined)
    @scala.inline
    def setItemIndex(value: Double): Self = this.set("itemIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemIndex: Self = this.set("itemIndex", js.undefined)
    @scala.inline
    def setModel(value: js.Any): Self = this.set("model", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModel: Self = this.set("model", js.undefined)
    @scala.inline
    def setNode(value: dxTreeViewNode): Self = this.set("node", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNode: Self = this.set("node", js.undefined)
  }
  
}

