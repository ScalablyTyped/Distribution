package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MVCxSchedulerToolTipTypeStatic extends js.Object {
  /**
    * The tooltip is displayed for a selected appointment.
    */
  var Appointment: scala.Double
  /**
    * The tooltip is displayed for a dragged appointment.
    */
  var AppointmentDrag: scala.Double
  /**
    * The tooltip is displayed for a selected time interval.
    */
  var Selection: scala.Double
}

object MVCxSchedulerToolTipTypeStatic {
  @scala.inline
  def apply(Appointment: scala.Double, AppointmentDrag: scala.Double, Selection: scala.Double): MVCxSchedulerToolTipTypeStatic = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Appointment")(Appointment)
    __obj.updateDynamic("AppointmentDrag")(AppointmentDrag)
    __obj.updateDynamic("Selection")(Selection)
    __obj.asInstanceOf[MVCxSchedulerToolTipTypeStatic]
  }
}

