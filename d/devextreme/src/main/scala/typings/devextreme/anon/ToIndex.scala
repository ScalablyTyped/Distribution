package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.ui.dxList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToIndex extends js.Object {
  var component: js.UndefOr[dxList] = js.undefined
  var element: js.UndefOr[dxElement] = js.undefined
  var fromIndex: js.UndefOr[Double] = js.undefined
  var itemData: js.UndefOr[js.Any] = js.undefined
  var itemElement: js.UndefOr[dxElement] = js.undefined
  var itemIndex: js.UndefOr[Double | js.Any] = js.undefined
  var model: js.UndefOr[js.Any] = js.undefined
  var toIndex: js.UndefOr[Double] = js.undefined
}

object ToIndex {
  @scala.inline
  def apply(
    component: dxList = null,
    element: dxElement = null,
    fromIndex: js.UndefOr[Double] = js.undefined,
    itemData: js.Any = null,
    itemElement: dxElement = null,
    itemIndex: Double | js.Any = null,
    model: js.Any = null,
    toIndex: js.UndefOr[Double] = js.undefined
  ): ToIndex = {
    val __obj = js.Dynamic.literal()
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (!js.isUndefined(fromIndex)) __obj.updateDynamic("fromIndex")(fromIndex.get.asInstanceOf[js.Any])
    if (itemData != null) __obj.updateDynamic("itemData")(itemData.asInstanceOf[js.Any])
    if (itemElement != null) __obj.updateDynamic("itemElement")(itemElement.asInstanceOf[js.Any])
    if (itemIndex != null) __obj.updateDynamic("itemIndex")(itemIndex.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (!js.isUndefined(toIndex)) __obj.updateDynamic("toIndex")(toIndex.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToIndex]
  }
}

