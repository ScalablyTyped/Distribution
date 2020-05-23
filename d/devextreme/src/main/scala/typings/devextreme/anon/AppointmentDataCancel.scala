package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.ui.dxScheduler
import typings.devextreme.mod.global.JQueryPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppointmentDataCancel extends js.Object {
  var appointmentData: js.UndefOr[js.Any] = js.undefined
  var cancel: js.UndefOr[
    Boolean | typings.devextreme.mod.global.Promise[Boolean] | JQueryPromise[Boolean]
  ] = js.undefined
  var component: js.UndefOr[dxScheduler] = js.undefined
  var element: js.UndefOr[dxElement] = js.undefined
  var model: js.UndefOr[js.Any] = js.undefined
}

object AppointmentDataCancel {
  @scala.inline
  def apply(
    appointmentData: js.Any = null,
    cancel: Boolean | typings.devextreme.mod.global.Promise[Boolean] | JQueryPromise[Boolean] = null,
    component: dxScheduler = null,
    element: dxElement = null,
    model: js.Any = null
  ): AppointmentDataCancel = {
    val __obj = js.Dynamic.literal()
    if (appointmentData != null) __obj.updateDynamic("appointmentData")(appointmentData.asInstanceOf[js.Any])
    if (cancel != null) __obj.updateDynamic("cancel")(cancel.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppointmentDataCancel]
  }
}

