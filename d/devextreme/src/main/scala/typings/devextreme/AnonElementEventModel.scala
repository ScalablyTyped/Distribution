package typings.devextreme

import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.event
import typings.devextreme.mod.DevExpress.viz.dxRangeSelector
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonElementEventModel extends js.Object {
  var component: js.UndefOr[dxRangeSelector] = js.undefined
  var element: js.UndefOr[dxElement] = js.undefined
  var event: js.UndefOr[typings.devextreme.mod.DevExpress.event] = js.undefined
  var model: js.UndefOr[js.Any] = js.undefined
  var previousValue: js.UndefOr[js.Array[Double | String | Date]] = js.undefined
  var value: js.UndefOr[js.Array[Double | String | Date]] = js.undefined
}

object AnonElementEventModel {
  @scala.inline
  def apply(
    component: dxRangeSelector = null,
    element: dxElement = null,
    event: event = null,
    model: js.Any = null,
    previousValue: js.Array[Double | String | Date] = null,
    value: js.Array[Double | String | Date] = null
  ): AnonElementEventModel = {
    val __obj = js.Dynamic.literal()
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (event != null) __obj.updateDynamic("event")(event.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (previousValue != null) __obj.updateDynamic("previousValue")(previousValue.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonElementEventModel]
  }
}

