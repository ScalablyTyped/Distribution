package typings.devextreme

import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.event
import typings.devextreme.mod.DevExpress.ui.dxDraggable
import typings.devextreme.mod.DevExpress.ui.dxSortable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFromComponentFromData extends js.Object {
  var component: js.UndefOr[dxSortable] = js.undefined
  var element: js.UndefOr[dxElement] = js.undefined
  var event: js.UndefOr[typings.devextreme.mod.DevExpress.event] = js.undefined
  var fromComponent: js.UndefOr[dxSortable | dxDraggable] = js.undefined
  var fromData: js.UndefOr[js.Any] = js.undefined
  var fromIndex: js.UndefOr[Double] = js.undefined
  var itemData: js.UndefOr[js.Any] = js.undefined
  var itemElement: js.UndefOr[dxElement] = js.undefined
  var model: js.UndefOr[js.Any] = js.undefined
  var toComponent: js.UndefOr[dxSortable | dxDraggable] = js.undefined
  var toData: js.UndefOr[js.Any] = js.undefined
  var toIndex: js.UndefOr[Double] = js.undefined
}

object AnonFromComponentFromData {
  @scala.inline
  def apply(
    component: dxSortable = null,
    element: dxElement = null,
    event: event = null,
    fromComponent: dxSortable | dxDraggable = null,
    fromData: js.Any = null,
    fromIndex: Int | Double = null,
    itemData: js.Any = null,
    itemElement: dxElement = null,
    model: js.Any = null,
    toComponent: dxSortable | dxDraggable = null,
    toData: js.Any = null,
    toIndex: Int | Double = null
  ): AnonFromComponentFromData = {
    val __obj = js.Dynamic.literal()
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (event != null) __obj.updateDynamic("event")(event.asInstanceOf[js.Any])
    if (fromComponent != null) __obj.updateDynamic("fromComponent")(fromComponent.asInstanceOf[js.Any])
    if (fromData != null) __obj.updateDynamic("fromData")(fromData.asInstanceOf[js.Any])
    if (fromIndex != null) __obj.updateDynamic("fromIndex")(fromIndex.asInstanceOf[js.Any])
    if (itemData != null) __obj.updateDynamic("itemData")(itemData.asInstanceOf[js.Any])
    if (itemElement != null) __obj.updateDynamic("itemElement")(itemElement.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (toComponent != null) __obj.updateDynamic("toComponent")(toComponent.asInstanceOf[js.Any])
    if (toData != null) __obj.updateDynamic("toData")(toData.asInstanceOf[js.Any])
    if (toIndex != null) __obj.updateDynamic("toIndex")(toIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFromComponentFromData]
  }
}

