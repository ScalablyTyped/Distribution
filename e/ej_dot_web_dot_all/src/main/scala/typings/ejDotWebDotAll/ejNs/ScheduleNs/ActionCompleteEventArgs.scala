package typings.ejDotWebDotAll.ejNs.ScheduleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionCompleteEventArgs extends js.Object {
  /** Returns the appointment data dropped.
    */
  var appointment: js.UndefOr[js.Any] = js.undefined
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** Returns the name of the CRUD action performed.
    */
  var currentAction: js.UndefOr[String] = js.undefined
  /** Returns the data about view change action.
    */
  var data: js.UndefOr[js.Any] = js.undefined
  /** Returns the Schedule model.
    */
  var model: js.UndefOr[typings.ejDotWebDotAll.ejNs.ScheduleNs.Model] = js.undefined
  /** Returns the action complete request type.
    */
  var requestType: js.UndefOr[String] = js.undefined
  /** Returns the name of the event.
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object ActionCompleteEventArgs {
  @scala.inline
  def apply(
    appointment: js.Any = null,
    cancel: js.UndefOr[Boolean] = js.undefined,
    currentAction: String = null,
    data: js.Any = null,
    model: typings.ejDotWebDotAll.ejNs.ScheduleNs.Model = null,
    requestType: String = null,
    `type`: String = null
  ): ActionCompleteEventArgs = {
    val __obj = js.Dynamic.literal()
    if (appointment != null) __obj.updateDynamic("appointment")(appointment)
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (currentAction != null) __obj.updateDynamic("currentAction")(currentAction)
    if (data != null) __obj.updateDynamic("data")(data)
    if (model != null) __obj.updateDynamic("model")(model)
    if (requestType != null) __obj.updateDynamic("requestType")(requestType)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ActionCompleteEventArgs]
  }
}

