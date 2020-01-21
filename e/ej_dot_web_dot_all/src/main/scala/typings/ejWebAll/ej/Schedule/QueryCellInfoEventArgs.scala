package typings.ejWebAll.ej.Schedule

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryCellInfoEventArgs extends js.Object {
  /** Returns the current appointment data.
    */
  var appointment: js.UndefOr[js.Any] = js.undefined
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** Returns the currently rendering cell information.
    */
  var cell: js.UndefOr[js.Any] = js.undefined
  /** Returns the cell type which is currently rendering on the Scheduler.
    */
  var cellType: js.UndefOr[String] = js.undefined
  /** Returns the start date of the currently rendering appointment.
    */
  var currentAppointmentDate: js.UndefOr[js.Any] = js.undefined
  /** Returns the currently rendering date information.
    */
  var currentDay: js.UndefOr[js.Any] = js.undefined
  /** Returns the currently rendering DOM element.
    */
  var element: js.UndefOr[js.Any] = js.undefined
  /** Returns the Schedule model.
    */
  var model: js.UndefOr[Model] = js.undefined
  /** Returns the name of the currently rendering element on the scheduler.
    */
  var requestType: js.UndefOr[String] = js.undefined
  /** Returns the currently rendering resource details.
    */
  var resource: js.UndefOr[js.Any] = js.undefined
}

object QueryCellInfoEventArgs {
  @scala.inline
  def apply(
    appointment: js.Any = null,
    cancel: js.UndefOr[Boolean] = js.undefined,
    cell: js.Any = null,
    cellType: String = null,
    currentAppointmentDate: js.Any = null,
    currentDay: js.Any = null,
    element: js.Any = null,
    model: Model = null,
    requestType: String = null,
    resource: js.Any = null
  ): QueryCellInfoEventArgs = {
    val __obj = js.Dynamic.literal()
    if (appointment != null) __obj.updateDynamic("appointment")(appointment.asInstanceOf[js.Any])
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel.asInstanceOf[js.Any])
    if (cell != null) __obj.updateDynamic("cell")(cell.asInstanceOf[js.Any])
    if (cellType != null) __obj.updateDynamic("cellType")(cellType.asInstanceOf[js.Any])
    if (currentAppointmentDate != null) __obj.updateDynamic("currentAppointmentDate")(currentAppointmentDate.asInstanceOf[js.Any])
    if (currentDay != null) __obj.updateDynamic("currentDay")(currentDay.asInstanceOf[js.Any])
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (requestType != null) __obj.updateDynamic("requestType")(requestType.asInstanceOf[js.Any])
    if (resource != null) __obj.updateDynamic("resource")(resource.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryCellInfoEventArgs]
  }
}

