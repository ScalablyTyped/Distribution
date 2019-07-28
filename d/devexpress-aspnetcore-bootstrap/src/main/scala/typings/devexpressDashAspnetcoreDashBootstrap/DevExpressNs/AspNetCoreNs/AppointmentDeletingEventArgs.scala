package typings.devexpressDashAspnetcoreDashBootstrap.DevExpressNs.AspNetCoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppointmentDeletingEventArgs extends CancelEventArgs {
  val appointmentIds: js.Array[js.Object]
}

object AppointmentDeletingEventArgs {
  @scala.inline
  def apply(appointmentIds: js.Array[js.Object], cancel: Boolean, sender: Control): AppointmentDeletingEventArgs = {
    val __obj = js.Dynamic.literal(appointmentIds = appointmentIds, cancel = cancel, sender = sender)
  
    __obj.asInstanceOf[AppointmentDeletingEventArgs]
  }
}

