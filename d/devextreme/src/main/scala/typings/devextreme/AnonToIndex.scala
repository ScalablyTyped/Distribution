package typings.devextreme

import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.ui.dxList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonToIndex extends js.Object {
  var component: js.UndefOr[dxList] = js.undefined
  var element: js.UndefOr[dxElement] = js.undefined
  var fromIndex: js.UndefOr[Double] = js.undefined
  var itemData: js.UndefOr[js.Any] = js.undefined
  var itemElement: js.UndefOr[dxElement] = js.undefined
  var itemIndex: js.UndefOr[Double | js.Any] = js.undefined
  var model: js.UndefOr[js.Any] = js.undefined
  var toIndex: js.UndefOr[Double] = js.undefined
}

object AnonToIndex {
  @scala.inline
  def apply(
    component: dxList = null,
    element: dxElement = null,
    fromIndex: Int | Double = null,
    itemData: js.Any = null,
    itemElement: dxElement = null,
    itemIndex: Double | js.Any = null,
    model: js.Any = null,
    toIndex: Int | Double = null
  ): AnonToIndex = {
    val __obj = js.Dynamic.literal()
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (fromIndex != null) __obj.updateDynamic("fromIndex")(fromIndex.asInstanceOf[js.Any])
    if (itemData != null) __obj.updateDynamic("itemData")(itemData.asInstanceOf[js.Any])
    if (itemElement != null) __obj.updateDynamic("itemElement")(itemElement.asInstanceOf[js.Any])
    if (itemIndex != null) __obj.updateDynamic("itemIndex")(itemIndex.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (toIndex != null) __obj.updateDynamic("toIndex")(toIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonToIndex]
  }
}

