package typings.ejDotWebDotAll.ejNs.ScheduleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppointmentWindowOpenEventArgs extends js.Object {
  /** Returns the edit appointment object.
    */
  var appointment: js.UndefOr[js.Any] = js.undefined
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** Returns the edit occurrence option value.
    */
  var edit: js.UndefOr[Boolean] = js.undefined
  /** Returns the end time of the double clicked cell.
    */
  var endTime: js.UndefOr[js.Any] = js.undefined
  /** Returns the Schedule model.
    */
  var model: js.UndefOr[typings.ejDotWebDotAll.ejNs.ScheduleNs.Model] = js.undefined
  /** returns the object of appointmentWindowOpen event while selecting the detail option from quick window or edit appointment or edit series option.
    */
  var `object`: js.UndefOr[js.Any] = js.undefined
  /** Returns the action name that triggers window open.
    */
  var originalEventType: js.UndefOr[String] = js.undefined
  /** Returns the start time of the double clicked cell.
    */
  var startTime: js.UndefOr[js.Any] = js.undefined
  /** Returns the target of the double clicked cell.
    */
  var target: js.UndefOr[js.Any] = js.undefined
  /** Returns the name of the event.
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object AppointmentWindowOpenEventArgs {
  @scala.inline
  def apply(
    appointment: js.Any = null,
    cancel: js.UndefOr[Boolean] = js.undefined,
    edit: js.UndefOr[Boolean] = js.undefined,
    endTime: js.Any = null,
    model: typings.ejDotWebDotAll.ejNs.ScheduleNs.Model = null,
    `object`: js.Any = null,
    originalEventType: String = null,
    startTime: js.Any = null,
    target: js.Any = null,
    `type`: String = null
  ): AppointmentWindowOpenEventArgs = {
    val __obj = js.Dynamic.literal()
    if (appointment != null) __obj.updateDynamic("appointment")(appointment)
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (!js.isUndefined(edit)) __obj.updateDynamic("edit")(edit)
    if (endTime != null) __obj.updateDynamic("endTime")(endTime)
    if (model != null) __obj.updateDynamic("model")(model)
    if (`object` != null) __obj.updateDynamic("object")(`object`)
    if (originalEventType != null) __obj.updateDynamic("originalEventType")(originalEventType)
    if (startTime != null) __obj.updateDynamic("startTime")(startTime)
    if (target != null) __obj.updateDynamic("target")(target)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[AppointmentWindowOpenEventArgs]
  }
}

