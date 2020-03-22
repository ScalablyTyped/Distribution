package typings.devextreme

import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.ui.dxList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGroupData extends js.Object {
  var component: js.UndefOr[dxList] = js.undefined
  var element: js.UndefOr[dxElement] = js.undefined
  var groupData: js.UndefOr[js.Any] = js.undefined
  var groupElement: js.UndefOr[dxElement] = js.undefined
  var groupIndex: js.UndefOr[Double] = js.undefined
  var model: js.UndefOr[js.Any] = js.undefined
}

object AnonGroupData {
  @scala.inline
  def apply(
    component: dxList = null,
    element: dxElement = null,
    groupData: js.Any = null,
    groupElement: dxElement = null,
    groupIndex: Int | Double = null,
    model: js.Any = null
  ): AnonGroupData = {
    val __obj = js.Dynamic.literal()
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (groupData != null) __obj.updateDynamic("groupData")(groupData.asInstanceOf[js.Any])
    if (groupElement != null) __obj.updateDynamic("groupElement")(groupElement.asInstanceOf[js.Any])
    if (groupIndex != null) __obj.updateDynamic("groupIndex")(groupIndex.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonGroupData]
  }
}

