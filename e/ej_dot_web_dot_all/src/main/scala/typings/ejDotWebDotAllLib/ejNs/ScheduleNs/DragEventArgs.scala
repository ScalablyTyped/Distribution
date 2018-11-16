package typings
package ejDotWebDotAllLib.ejNs.ScheduleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait DragEventArgs extends js.Object {
  /** Returns the cancel option value.
               */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** Returns the default dragging interval range in minutes
               */
  var interval: js.UndefOr[scala.Double] = js.undefined
  /** Returns the Schedule model.
               */
  var model: js.UndefOr[Model] = js.undefined
  /** Returns the target of the drag over appointment.
               */
  var target: js.UndefOr[js.Any] = js.undefined
  /** Returns the name of the event.
               */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

