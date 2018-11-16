package typings
package ejDotWebDotAllLib.ejNs.ScheduleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait AppointmentWindowOpenEventArgs extends js.Object {
  /** Returns the edit appointment object.
               */
  var appointment: js.UndefOr[js.Any] = js.undefined
  /** Returns the cancel option value.
               */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** Returns the edit occurrence option value.
               */
  var edit: js.UndefOr[scala.Boolean] = js.undefined
  /** Returns the end time of the double clicked cell.
               */
  var endTime: js.UndefOr[js.Any] = js.undefined
  /** Returns the Schedule model.
               */
  var model: js.UndefOr[Model] = js.undefined
  /** returns the object of appointmentWindowOpen event while selecting the detail option from quick window or edit appointment or edit series option.
               */
  var `object`: js.UndefOr[js.Any] = js.undefined
  /** Returns the action name that triggers window open.
               */
  var originalEventType: js.UndefOr[java.lang.String] = js.undefined
  /** Returns the start time of the double clicked cell.
               */
  var startTime: js.UndefOr[js.Any] = js.undefined
  /** Returns the target of the double clicked cell.
               */
  var target: js.UndefOr[js.Any] = js.undefined
  /** Returns the name of the event.
               */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

