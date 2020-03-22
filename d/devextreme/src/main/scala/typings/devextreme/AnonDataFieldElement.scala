package typings.devextreme

import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.ui.dxForm
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDataFieldElement extends js.Object {
  var component: js.UndefOr[dxForm] = js.undefined
  var dataField: js.UndefOr[String] = js.undefined
  var element: js.UndefOr[dxElement] = js.undefined
  var model: js.UndefOr[js.Any] = js.undefined
  var value: js.UndefOr[js.Any] = js.undefined
}

object AnonDataFieldElement {
  @scala.inline
  def apply(
    component: dxForm = null,
    dataField: String = null,
    element: dxElement = null,
    model: js.Any = null,
    value: js.Any = null
  ): AnonDataFieldElement = {
    val __obj = js.Dynamic.literal()
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (dataField != null) __obj.updateDynamic("dataField")(dataField.asInstanceOf[js.Any])
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDataFieldElement]
  }
}

