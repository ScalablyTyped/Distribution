package typings.devextreme

import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.ui.dxFilterBuilder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonModelPreviousValue extends js.Object {
  var component: js.UndefOr[dxFilterBuilder] = js.undefined
  var element: js.UndefOr[dxElement] = js.undefined
  var model: js.UndefOr[js.Any] = js.undefined
  var previousValue: js.UndefOr[js.Any] = js.undefined
  var value: js.UndefOr[js.Any] = js.undefined
}

object AnonModelPreviousValue {
  @scala.inline
  def apply(
    component: dxFilterBuilder = null,
    element: dxElement = null,
    model: js.Any = null,
    previousValue: js.Any = null,
    value: js.Any = null
  ): AnonModelPreviousValue = {
    val __obj = js.Dynamic.literal()
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (previousValue != null) __obj.updateDynamic("previousValue")(previousValue.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonModelPreviousValue]
  }
}

