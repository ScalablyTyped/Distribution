package typings.devextreme

import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.event
import typings.devextreme.mod.DevExpress.ui.dxDraggable
import typings.devextreme.mod.DevExpress.ui.dxSortable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonToComponent extends js.Object {
  var cancel: js.UndefOr[Boolean] = js.undefined
  var component: js.UndefOr[dxDraggable] = js.undefined
  var element: js.UndefOr[dxElement] = js.undefined
  var event: js.UndefOr[typings.devextreme.mod.DevExpress.event] = js.undefined
  var fromComponent: js.UndefOr[dxSortable | dxDraggable] = js.undefined
  var fromData: js.UndefOr[js.Any] = js.undefined
  var itemData: js.UndefOr[js.Any] = js.undefined
  var itemElement: js.UndefOr[dxElement] = js.undefined
  var model: js.UndefOr[js.Any] = js.undefined
  var toComponent: js.UndefOr[dxSortable | dxDraggable] = js.undefined
  var toData: js.UndefOr[js.Any] = js.undefined
}

object AnonToComponent {
  @scala.inline
  def apply(
    cancel: js.UndefOr[Boolean] = js.undefined,
    component: dxDraggable = null,
    element: dxElement = null,
    event: event = null,
    fromComponent: dxSortable | dxDraggable = null,
    fromData: js.Any = null,
    itemData: js.Any = null,
    itemElement: dxElement = null,
    model: js.Any = null,
    toComponent: dxSortable | dxDraggable = null,
    toData: js.Any = null
  ): AnonToComponent = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (event != null) __obj.updateDynamic("event")(event.asInstanceOf[js.Any])
    if (fromComponent != null) __obj.updateDynamic("fromComponent")(fromComponent.asInstanceOf[js.Any])
    if (fromData != null) __obj.updateDynamic("fromData")(fromData.asInstanceOf[js.Any])
    if (itemData != null) __obj.updateDynamic("itemData")(itemData.asInstanceOf[js.Any])
    if (itemElement != null) __obj.updateDynamic("itemElement")(itemElement.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (toComponent != null) __obj.updateDynamic("toComponent")(toComponent.asInstanceOf[js.Any])
    if (toData != null) __obj.updateDynamic("toData")(toData.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonToComponent]
  }
}

