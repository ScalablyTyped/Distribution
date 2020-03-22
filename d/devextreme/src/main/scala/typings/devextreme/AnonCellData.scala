package typings.devextreme

import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.event
import typings.devextreme.mod.DevExpress.ui.dxScheduler
import typings.devextreme.mod._Global_.JQueryEventObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCellData extends js.Object {
  var cancel: js.UndefOr[Boolean] = js.undefined
  var cellData: js.UndefOr[js.Any] = js.undefined
  var cellElement: js.UndefOr[dxElement] = js.undefined
  var component: js.UndefOr[dxScheduler] = js.undefined
  var element: js.UndefOr[dxElement] = js.undefined
  var event: js.UndefOr[typings.devextreme.mod.DevExpress.event] = js.undefined
  var jQueryEvent: js.UndefOr[JQueryEventObject] = js.undefined
  var model: js.UndefOr[js.Any] = js.undefined
}

object AnonCellData {
  @scala.inline
  def apply(
    cancel: js.UndefOr[Boolean] = js.undefined,
    cellData: js.Any = null,
    cellElement: dxElement = null,
    component: dxScheduler = null,
    element: dxElement = null,
    event: event = null,
    jQueryEvent: JQueryEventObject = null,
    model: js.Any = null
  ): AnonCellData = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel.asInstanceOf[js.Any])
    if (cellData != null) __obj.updateDynamic("cellData")(cellData.asInstanceOf[js.Any])
    if (cellElement != null) __obj.updateDynamic("cellElement")(cellElement.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (event != null) __obj.updateDynamic("event")(event.asInstanceOf[js.Any])
    if (jQueryEvent != null) __obj.updateDynamic("jQueryEvent")(jQueryEvent.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCellData]
  }
}

