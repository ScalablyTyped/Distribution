package typings
package ejDotWebDotAllLib.ejNs.ScheduleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BeforeContextMenuOpenEventArgs extends js.Object {
  /** Returns the current appointment details while opening the menu from appointment.
    */
  var appointment: js.UndefOr[js.Any] = js.undefined
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** Returns the current cell index value.
    */
  var cellIndex: js.UndefOr[scala.Double] = js.undefined
  /** Returns the current date value.
    */
  var currentDate: js.UndefOr[js.Any] = js.undefined
  /** Returns the object of before opening menu target.
    */
  var events: js.UndefOr[js.Any] = js.undefined
  /** Returns the Schedule model.
    */
  var model: js.UndefOr[Model] = js.undefined
  /** Returns the object of beforeContextMenuOpen event.
    */
  var `object`: js.UndefOr[js.Any] = js.undefined
  /** Returns the current resource details, when multiple resources are present, otherwise returns null.
    */
  var resources: js.UndefOr[js.Any] = js.undefined
  /** Returns the name of the event.
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

