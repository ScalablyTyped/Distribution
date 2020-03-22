package typings.devextreme

import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.ui.dxScheduler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAppointmentDataAppointmentElement extends js.Object {
  var appointmentData: js.UndefOr[js.Any] = js.undefined
  var appointmentElement: js.UndefOr[dxElement] = js.undefined
  var component: js.UndefOr[dxScheduler] = js.undefined
  var element: js.UndefOr[dxElement] = js.undefined
  var model: js.UndefOr[js.Any] = js.undefined
  var targetedAppointmentData: js.UndefOr[js.Any] = js.undefined
}

object AnonAppointmentDataAppointmentElement {
  @scala.inline
  def apply(
    appointmentData: js.Any = null,
    appointmentElement: dxElement = null,
    component: dxScheduler = null,
    element: dxElement = null,
    model: js.Any = null,
    targetedAppointmentData: js.Any = null
  ): AnonAppointmentDataAppointmentElement = {
    val __obj = js.Dynamic.literal()
    if (appointmentData != null) __obj.updateDynamic("appointmentData")(appointmentData.asInstanceOf[js.Any])
    if (appointmentElement != null) __obj.updateDynamic("appointmentElement")(appointmentElement.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (targetedAppointmentData != null) __obj.updateDynamic("targetedAppointmentData")(targetedAppointmentData.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAppointmentDataAppointmentElement]
  }
}

