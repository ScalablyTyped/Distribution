package typings.ejDotWebDotAll.ej.Schedule

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppointmentChangedEventArgs extends js.Object {
  /** Returns the edited appointment object.
    */
  var appointment: js.UndefOr[js.Any] = js.undefined
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** Returns the name of the CRUD action performed.
    */
  var currentAction: js.UndefOr[String] = js.undefined
  /** Returns the Schedule model.
    */
  var model: js.UndefOr[typings.ejDotWebDotAll.ej.Schedule.Model] = js.undefined
  /** Returns the name of the Scheduler event.
    */
  var requestType: js.UndefOr[String] = js.undefined
  /** Returns the name of the Scheduler event.
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object AppointmentChangedEventArgs {
  @scala.inline
  def apply(
    appointment: js.Any = null,
    cancel: js.UndefOr[Boolean] = js.undefined,
    currentAction: String = null,
    model: typings.ejDotWebDotAll.ej.Schedule.Model = null,
    requestType: String = null,
    `type`: String = null
  ): AppointmentChangedEventArgs = {
    val __obj = js.Dynamic.literal()
    if (appointment != null) __obj.updateDynamic("appointment")(appointment)
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (currentAction != null) __obj.updateDynamic("currentAction")(currentAction)
    if (model != null) __obj.updateDynamic("model")(model)
    if (requestType != null) __obj.updateDynamic("requestType")(requestType)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[AppointmentChangedEventArgs]
  }
}

