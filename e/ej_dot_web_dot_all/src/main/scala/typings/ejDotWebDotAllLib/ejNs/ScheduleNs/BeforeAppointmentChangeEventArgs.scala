package typings
package ejDotWebDotAllLib.ejNs.ScheduleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait BeforeAppointmentChangeEventArgs extends js.Object {
  /** Returns the edited appointment object.
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
  var requestType: js.UndefOr[java.lang.String] = js.undefined
  /** Returns the name of the Scheduler event.
               */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

