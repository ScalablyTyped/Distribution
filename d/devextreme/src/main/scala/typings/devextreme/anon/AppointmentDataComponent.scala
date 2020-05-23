package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.ui.dxScheduler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppointmentDataComponent extends js.Object {
  var appointmentData: js.UndefOr[js.Any] = js.undefined
  var component: js.UndefOr[dxScheduler] = js.undefined
  var element: js.UndefOr[dxElement] = js.undefined
  var error: js.UndefOr[typings.std.Error] = js.undefined
  var model: js.UndefOr[js.Any] = js.undefined
}

object AppointmentDataComponent {
  @scala.inline
  def apply(
    appointmentData: js.Any = null,
    component: dxScheduler = null,
    element: dxElement = null,
    error: typings.std.Error = null,
    model: js.Any = null
  ): AppointmentDataComponent = {
    val __obj = js.Dynamic.literal()
    if (appointmentData != null) __obj.updateDynamic("appointmentData")(appointmentData.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppointmentDataComponent]
  }
}

