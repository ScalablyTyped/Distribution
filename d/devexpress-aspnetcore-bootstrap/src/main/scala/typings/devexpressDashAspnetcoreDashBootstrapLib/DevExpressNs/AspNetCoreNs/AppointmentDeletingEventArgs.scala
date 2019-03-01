package typings
package devexpressDashAspnetcoreDashBootstrapLib.DevExpressNs.AspNetCoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppointmentDeletingEventArgs extends CancelEventArgs {
  val appointmentIds: js.Array[js.Object]
}

object AppointmentDeletingEventArgs {
  @scala.inline
  def apply(appointmentIds: js.Array[js.Object], cancel: scala.Boolean, sender: Control): AppointmentDeletingEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("appointmentIds")(appointmentIds)
    __obj.updateDynamic("cancel")(cancel)
    __obj.updateDynamic("sender")(sender)
    __obj.asInstanceOf[AppointmentDeletingEventArgs]
  }
}

