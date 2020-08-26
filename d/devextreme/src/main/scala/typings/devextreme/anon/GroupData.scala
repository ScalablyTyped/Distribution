package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.ui.dxList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GroupData extends js.Object {
  var component: js.UndefOr[dxList] = js.native
  var element: js.UndefOr[dxElement] = js.native
  var groupData: js.UndefOr[js.Any] = js.native
  var groupElement: js.UndefOr[dxElement] = js.native
  var groupIndex: js.UndefOr[Double] = js.native
  var model: js.UndefOr[js.Any] = js.native
}

object GroupData {
  @scala.inline
  def apply(): GroupData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroupData]
  }
  @scala.inline
  implicit class GroupDataOps[Self <: GroupData] (val x: Self) extends AnyVal {
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
    def setComponent(value: dxList): Self = this.set("component", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComponent: Self = this.set("component", js.undefined)
    @scala.inline
    def setElement(value: dxElement): Self = this.set("element", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteElement: Self = this.set("element", js.undefined)
    @scala.inline
    def setGroupData(value: js.Any): Self = this.set("groupData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupData: Self = this.set("groupData", js.undefined)
    @scala.inline
    def setGroupElement(value: dxElement): Self = this.set("groupElement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupElement: Self = this.set("groupElement", js.undefined)
    @scala.inline
    def setGroupIndex(value: Double): Self = this.set("groupIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupIndex: Self = this.set("groupIndex", js.undefined)
    @scala.inline
    def setModel(value: js.Any): Self = this.set("model", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModel: Self = this.set("model", js.undefined)
  }
  
}

