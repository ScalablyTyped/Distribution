package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.core.dxElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FromIndexItemData extends js.Object {
  var fromIndex: js.UndefOr[Double] = js.native
  var itemData: js.UndefOr[js.Any] = js.native
  var itemElement: js.UndefOr[dxElement] = js.native
}

object FromIndexItemData {
  @scala.inline
  def apply(): FromIndexItemData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FromIndexItemData]
  }
  @scala.inline
  implicit class FromIndexItemDataOps[Self <: FromIndexItemData] (val x: Self) extends AnyVal {
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
    def setFromIndex(value: Double): Self = this.set("fromIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFromIndex: Self = this.set("fromIndex", js.undefined)
    @scala.inline
    def setItemData(value: js.Any): Self = this.set("itemData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemData: Self = this.set("itemData", js.undefined)
    @scala.inline
    def setItemElement(value: dxElement): Self = this.set("itemElement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemElement: Self = this.set("itemElement", js.undefined)
  }
  
}

