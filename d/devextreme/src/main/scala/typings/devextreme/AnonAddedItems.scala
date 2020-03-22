package typings.devextreme

import typings.devextreme.mod.DevExpress.core.dxElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAddedItems[T] extends js.Object {
  var addedItems: js.UndefOr[js.Array[_]] = js.undefined
  var component: js.UndefOr[T] = js.undefined
  var element: js.UndefOr[dxElement] = js.undefined
  var model: js.UndefOr[js.Any] = js.undefined
  var removedItems: js.UndefOr[js.Array[_]] = js.undefined
}

object AnonAddedItems {
  @scala.inline
  def apply[T](
    addedItems: js.Array[_] = null,
    component: T = null,
    element: dxElement = null,
    model: js.Any = null,
    removedItems: js.Array[_] = null
  ): AnonAddedItems[T] = {
    val __obj = js.Dynamic.literal()
    if (addedItems != null) __obj.updateDynamic("addedItems")(addedItems.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (removedItems != null) __obj.updateDynamic("removedItems")(removedItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAddedItems[T]]
  }
}

