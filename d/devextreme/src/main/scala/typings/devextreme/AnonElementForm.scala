package typings.devextreme

import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.ui.dxForm
import typings.devextreme.mod.DevExpress.ui.dxScheduler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonElementForm extends js.Object {
  var appointmentData: js.UndefOr[js.Any] = js.undefined
  var cancel: js.UndefOr[Boolean] = js.undefined
  var component: js.UndefOr[dxScheduler] = js.undefined
  var element: js.UndefOr[dxElement] = js.undefined
  var form: js.UndefOr[dxForm] = js.undefined
  var model: js.UndefOr[js.Any] = js.undefined
}

object AnonElementForm {
  @scala.inline
  def apply(
    appointmentData: js.Any = null,
    cancel: js.UndefOr[Boolean] = js.undefined,
    component: dxScheduler = null,
    element: dxElement = null,
    form: dxForm = null,
    model: js.Any = null
  ): AnonElementForm = {
    val __obj = js.Dynamic.literal()
    if (appointmentData != null) __obj.updateDynamic("appointmentData")(appointmentData.asInstanceOf[js.Any])
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (form != null) __obj.updateDynamic("form")(form.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonElementForm]
  }
}

