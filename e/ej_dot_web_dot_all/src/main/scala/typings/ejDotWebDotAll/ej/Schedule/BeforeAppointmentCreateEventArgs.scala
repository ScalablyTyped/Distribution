package typings.ejDotWebDotAll.ej.Schedule

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BeforeAppointmentCreateEventArgs extends js.Object {
  /** Returns the appointment object.
    */
  var appointment: js.UndefOr[js.Any] = js.undefined
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** Returns the Schedule model.
    */
  var model: js.UndefOr[typings.ejDotWebDotAll.ej.Schedule.Model] = js.undefined
  /** Returns the name of the Scheduler event.
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object BeforeAppointmentCreateEventArgs {
  @scala.inline
  def apply(
    appointment: js.Any = null,
    cancel: js.UndefOr[Boolean] = js.undefined,
    model: typings.ejDotWebDotAll.ej.Schedule.Model = null,
    `type`: String = null
  ): BeforeAppointmentCreateEventArgs = {
    val __obj = js.Dynamic.literal()
    if (appointment != null) __obj.updateDynamic("appointment")(appointment)
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (model != null) __obj.updateDynamic("model")(model)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[BeforeAppointmentCreateEventArgs]
  }
}

