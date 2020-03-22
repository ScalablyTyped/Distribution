package typings.devextreme

import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.event
import typings.devextreme.mod.DevExpress.ui.dxDropDownMenu
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonItemIndexModel extends js.Object {
  var component: js.UndefOr[dxDropDownMenu] = js.undefined
  var element: js.UndefOr[dxElement] = js.undefined
  var event: js.UndefOr[typings.devextreme.mod.DevExpress.event] = js.undefined
  var itemData: js.UndefOr[js.Any] = js.undefined
  var itemElement: js.UndefOr[dxElement] = js.undefined
  var itemIndex: js.UndefOr[Double] = js.undefined
  var model: js.UndefOr[js.Any] = js.undefined
}

object AnonItemIndexModel {
  @scala.inline
  def apply(
    component: dxDropDownMenu = null,
    element: dxElement = null,
    event: event = null,
    itemData: js.Any = null,
    itemElement: dxElement = null,
    itemIndex: Int | Double = null,
    model: js.Any = null
  ): AnonItemIndexModel = {
    val __obj = js.Dynamic.literal()
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (event != null) __obj.updateDynamic("event")(event.asInstanceOf[js.Any])
    if (itemData != null) __obj.updateDynamic("itemData")(itemData.asInstanceOf[js.Any])
    if (itemElement != null) __obj.updateDynamic("itemElement")(itemElement.asInstanceOf[js.Any])
    if (itemIndex != null) __obj.updateDynamic("itemIndex")(itemIndex.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonItemIndexModel]
  }
}

