package typings.devextreme

import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.event
import typings.devextreme.mod.DevExpress.ui.dxScheduler
import typings.devextreme.mod._Global_.JQueryEventObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTargetedAppointmentData extends js.Object {
  var appointmentData: js.UndefOr[js.Any] = js.undefined
  var appointmentElement: js.UndefOr[dxElement] = js.undefined
  var component: js.UndefOr[dxScheduler] = js.undefined
  var element: js.UndefOr[dxElement] = js.undefined
  var event: js.UndefOr[typings.devextreme.mod.DevExpress.event] = js.undefined
  var jQueryEvent: js.UndefOr[JQueryEventObject] = js.undefined
  var model: js.UndefOr[js.Any] = js.undefined
  var targetedAppointmentData: js.UndefOr[js.Any] = js.undefined
}

object AnonTargetedAppointmentData {
  @scala.inline
  def apply(
    appointmentData: js.Any = null,
    appointmentElement: dxElement = null,
    component: dxScheduler = null,
    element: dxElement = null,
    event: event = null,
    jQueryEvent: JQueryEventObject = null,
    model: js.Any = null,
    targetedAppointmentData: js.Any = null
  ): AnonTargetedAppointmentData = {
    val __obj = js.Dynamic.literal()
    if (appointmentData != null) __obj.updateDynamic("appointmentData")(appointmentData.asInstanceOf[js.Any])
    if (appointmentElement != null) __obj.updateDynamic("appointmentElement")(appointmentElement.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (event != null) __obj.updateDynamic("event")(event.asInstanceOf[js.Any])
    if (jQueryEvent != null) __obj.updateDynamic("jQueryEvent")(jQueryEvent.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (targetedAppointmentData != null) __obj.updateDynamic("targetedAppointmentData")(targetedAppointmentData.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTargetedAppointmentData]
  }
}

