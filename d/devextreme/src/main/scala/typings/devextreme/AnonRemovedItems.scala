package typings.devextreme

import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.ui.dxButtonGroup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRemovedItems extends js.Object {
  var addedItems: js.UndefOr[js.Array[_]] = js.undefined
  var component: js.UndefOr[dxButtonGroup] = js.undefined
  var element: js.UndefOr[dxElement] = js.undefined
  var model: js.UndefOr[js.Any] = js.undefined
  var removedItems: js.UndefOr[js.Array[_]] = js.undefined
}

object AnonRemovedItems {
  @scala.inline
  def apply(
    addedItems: js.Array[_] = null,
    component: dxButtonGroup = null,
    element: dxElement = null,
    model: js.Any = null,
    removedItems: js.Array[_] = null
  ): AnonRemovedItems = {
    val __obj = js.Dynamic.literal()
    if (addedItems != null) __obj.updateDynamic("addedItems")(addedItems.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (removedItems != null) __obj.updateDynamic("removedItems")(removedItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRemovedItems]
  }
}

