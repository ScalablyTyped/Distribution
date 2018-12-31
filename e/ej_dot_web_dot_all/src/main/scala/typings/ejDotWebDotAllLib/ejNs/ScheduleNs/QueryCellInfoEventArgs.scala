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

