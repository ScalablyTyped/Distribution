package typings.devextreme

import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.ui.dxScheduler
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAppointmentDataComponent extends js.Object {
  var appointmentData: js.UndefOr[js.Any] = js.undefined
  var component: js.UndefOr[dxScheduler] = js.undefined
  var element: js.UndefOr[dxElement] = js.undefined
  var error: js.UndefOr[Error] = js.undefined
  var model: js.UndefOr[js.Any] = js.undefined
}

object AnonAppointmentDataComponent {
  @scala.inline
  def apply(
    appointmentData: js.Any = null,
    component: dxScheduler = null,
    element: dxElement = null,
    error: Error = null,
    model: js.Any = null
  ): AnonAppointmentDataComponent = {
    val __obj = js.Dynamic.literal()
    if (appointmentData != null) __obj.updateDynamic("appointmentData")(appointmentData.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAppointmentDataComponent]
  }
}

