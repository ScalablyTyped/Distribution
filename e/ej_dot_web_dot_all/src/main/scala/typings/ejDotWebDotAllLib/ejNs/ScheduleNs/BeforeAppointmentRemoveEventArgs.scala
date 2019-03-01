package typings
package ejDotWebDotAllLib.ejNs.ScheduleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BeforeAppointmentRemoveEventArgs extends js.Object {
  /** Returns the deleted appointment object.
    */
  var appointment: js.UndefOr[js.Any] = js.undefined
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** Returns the name of the CRUD action performed.
    */
  var currentAction: js.UndefOr[java.lang.String] = js.undefined
  /** Returns the Schedule model.
    */
  var model: js.UndefOr[Model] = js.undefined
  /** Returns the name of the Scheduler event.
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object BeforeAppointmentRemoveEventArgs {
  @scala.inline
  def apply(
    appointment: js.Any = null,
    cancel: js.UndefOr[scala.Boolean] = js.undefined,
    currentAction: java.lang.String = null,
    model: Model = null,
    `type`: java.lang.String = null
  ): BeforeAppointmentRemoveEventArgs = {
    val __obj = js.Dynamic.literal()
    if (appointment != null) __obj.updateDynamic("appointment")(appointment)
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (currentAction != null) __obj.updateDynamic("currentAction")(currentAction)
    if (model != null) __obj.updateDynamic("model")(model)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[BeforeAppointmentRemoveEventArgs]
  }
}

