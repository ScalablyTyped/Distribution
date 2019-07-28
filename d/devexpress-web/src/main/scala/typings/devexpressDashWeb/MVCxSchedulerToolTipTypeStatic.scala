package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MVCxSchedulerToolTipTypeStatic extends js.Object {
  /**
    * The tooltip is displayed for a selected appointment.
    */
  var Appointment: Double
  /**
    * The tooltip is displayed for a dragged appointment.
    */
  var AppointmentDrag: Double
  /**
    * The tooltip is displayed for a selected time interval.
    */
  var Selection: Double
}

object MVCxSchedulerToolTipTypeStatic {
  @scala.inline
  def apply(Appointment: Double, AppointmentDrag: Double, Selection: Double): MVCxSchedulerToolTipTypeStatic = {
    val __obj = js.Dynamic.literal(Appointment = Appointment, AppointmentDrag = AppointmentDrag, Selection = Selection)
  
    __obj.asInstanceOf[MVCxSchedulerToolTipTypeStatic]
  }
}

