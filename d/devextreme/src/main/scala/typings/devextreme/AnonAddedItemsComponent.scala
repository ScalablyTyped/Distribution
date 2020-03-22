package typings.devextreme

import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.ui.dxTagBox
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAddedItemsComponent extends js.Object {
  var addedItems: js.UndefOr[js.Array[String | Double | _]] = js.undefined
  var component: js.UndefOr[dxTagBox] = js.undefined
  var element: js.UndefOr[dxElement] = js.undefined
  var model: js.UndefOr[js.Any] = js.undefined
  var removedItems: js.UndefOr[js.Array[String | Double | _]] = js.undefined
}

object AnonAddedItemsComponent {
  @scala.inline
  def apply(
    addedItems: js.Array[String | Double | _] = null,
    component: dxTagBox = null,
    element: dxElement = null,
    model: js.Any = null,
    removedItems: js.Array[String | Double | _] = null
  ): AnonAddedItemsComponent = {
    val __obj = js.Dynamic.literal()
    if (addedItems != null) __obj.updateDynamic("addedItems")(addedItems.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (removedItems != null) __obj.updateDynamic("removedItems")(removedItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAddedItemsComponent]
  }
}

