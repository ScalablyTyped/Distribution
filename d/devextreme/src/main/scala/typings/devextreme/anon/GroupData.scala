package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.ui.dxList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupData extends js.Object {
  var component: js.UndefOr[dxList] = js.undefined
  var element: js.UndefOr[dxElement] = js.undefined
  var groupData: js.UndefOr[js.Any] = js.undefined
  var groupElement: js.UndefOr[dxElement] = js.undefined
  var groupIndex: js.UndefOr[Double] = js.undefined
  var model: js.UndefOr[js.Any] = js.undefined
}

object GroupData {
  @scala.inline
  def apply(
    component: dxList = null,
    element: dxElement = null,
    groupData: js.Any = null,
    groupElement: dxElement = null,
    groupIndex: js.UndefOr[Double] = js.undefined,
    model: js.Any = null
  ): GroupData = {
    val __obj = js.Dynamic.literal()
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (groupData != null) __obj.updateDynamic("groupData")(groupData.asInstanceOf[js.Any])
    if (groupElement != null) __obj.updateDynamic("groupElement")(groupElement.asInstanceOf[js.Any])
    if (!js.isUndefined(groupIndex)) __obj.updateDynamic("groupIndex")(groupIndex.get.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupData]
  }
}

