package typings
package ejDotWebDotAllLib.ejNs.ScheduleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryCellInfoEventArgs extends js.Object {
  /** Returns the current appointment data.
    */
  var appointment: js.UndefOr[js.Any] = js.undefined
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** Returns the currently rendering cell information.
    */
  var cell: js.UndefOr[js.Any] = js.undefined
  /** Returns the cell type which is currently rendering on the Scheduler.
    */
  var cellType: js.UndefOr[java.lang.String] = js.undefined
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
  var requestType: js.UndefOr[java.lang.String] = js.undefined
  /** Returns the currently rendering resource details.
    */
  var resource: js.UndefOr[js.Any] = js.undefined
}

object QueryCellInfoEventArgs {
  @scala.inline
  def apply(
    appointment: js.Any = null,
    cancel: js.UndefOr[scala.Boolean] = js.undefined,
    cell: js.Any = null,
    cellType: java.lang.String = null,
    currentAppointmentDate: js.Any = null,
    currentDay: js.Any = null,
    element: js.Any = null,
    model: Model = null,
    requestType: java.lang.String = null,
    resource: js.Any = null
  ): QueryCellInfoEventArgs = {
    val __obj = js.Dynamic.literal()
    if (appointment != null) __obj.updateDynamic("appointment")(appointment)
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (cell != null) __obj.updateDynamic("cell")(cell)
    if (cellType != null) __obj.updateDynamic("cellType")(cellType)
    if (currentAppointmentDate != null) __obj.updateDynamic("currentAppointmentDate")(currentAppointmentDate)
    if (currentDay != null) __obj.updateDynamic("currentDay")(currentDay)
    if (element != null) __obj.updateDynamic("element")(element)
    if (model != null) __obj.updateDynamic("model")(model)
    if (requestType != null) __obj.updateDynamic("requestType")(requestType)
    if (resource != null) __obj.updateDynamic("resource")(resource)
    __obj.asInstanceOf[QueryCellInfoEventArgs]
  }
}

