package typings.devextreme

import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.ui.dxDropDownButton
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPreviousItem extends js.Object {
  var component: js.UndefOr[dxDropDownButton] = js.undefined
  var element: js.UndefOr[dxElement] = js.undefined
  var item: js.UndefOr[js.Any] = js.undefined
  var model: js.UndefOr[js.Any] = js.undefined
  var previousItem: js.UndefOr[js.Any] = js.undefined
}

object AnonPreviousItem {
  @scala.inline
  def apply(
    component: dxDropDownButton = null,
    element: dxElement = null,
    item: js.Any = null,
    model: js.Any = null,
    previousItem: js.Any = null
  ): AnonPreviousItem = {
    val __obj = js.Dynamic.literal()
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (item != null) __obj.updateDynamic("item")(item.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (previousItem != null) __obj.updateDynamic("previousItem")(previousItem.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPreviousItem]
  }
}

