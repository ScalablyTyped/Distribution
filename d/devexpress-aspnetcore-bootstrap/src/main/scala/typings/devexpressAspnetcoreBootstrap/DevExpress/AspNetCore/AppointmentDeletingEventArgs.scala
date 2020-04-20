package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppointmentDeletingEventArgs extends CancelEventArgs {
  val appointmentIds: js.Array[js.Object]
}

object AppointmentDeletingEventArgs {
  @scala.inline
  def apply(appointmentIds: js.Array[js.Object], cancel: Boolean, sender: Control): AppointmentDeletingEventArgs = {
    val __obj = js.Dynamic.literal(appointmentIds = appointmentIds.asInstanceOf[js.Any], cancel = cancel.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppointmentDeletingEventArgs]
  }
}

