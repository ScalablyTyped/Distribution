package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.ui.dxList
import typings.devextreme.mod.global.JQueryPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComponentElementItemData extends js.Object {
  var cancel: js.UndefOr[Boolean | typings.devextreme.mod.global.Promise[Unit] | JQueryPromise[Unit]] = js.native
  var component: js.UndefOr[dxList] = js.native
  var element: js.UndefOr[dxElement] = js.native
  var itemData: js.UndefOr[js.Any] = js.native
  var itemElement: js.UndefOr[dxElement] = js.native
  var itemIndex: js.UndefOr[Double | js.Any] = js.native
  var model: js.UndefOr[js.Any] = js.native
}

object ComponentElementItemData {
  @scala.inline
  def apply(): ComponentElementItemData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComponentElementItemData]
  }
  @scala.inline
  implicit class ComponentElementItemDataOps[Self <: ComponentElementItemData] (val x: Self) extends AnyVal {
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
    def setCancel(value: Boolean | typings.devextreme.mod.global.Promise[Unit] | JQueryPromise[Unit]): Self = this.set("cancel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCancel: Self = this.set("cancel", js.undefined)
    @scala.inline
    def setComponent(value: dxList): Self = this.set("component", value.asInstanceOf[js.Any])
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
    def setItemIndex(value: Double | js.Any): Self = this.set("itemIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemIndex: Self = this.set("itemIndex", js.undefined)
    @scala.inline
    def setModel(value: js.Any): Self = this.set("model", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModel: Self = this.set("model", js.undefined)
  }
  
}

