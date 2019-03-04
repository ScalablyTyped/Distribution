package typings
package devexpressDashAspnetcoreDashBootstrapLib.DevExpressNs.AspNetCoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppointmentsSelectionEventArgs extends EventArgs {
  val appointmentIds: js.Array[java.lang.String]
}

object AppointmentsSelectionEventArgs {
  @scala.inline
  def apply(appointmentIds: js.Array[java.lang.String], sender: Control): AppointmentsSelectionEventArgs = {
    val __obj = js.Dynamic.literal(appointmentIds = appointmentIds, sender = sender)
  
    __obj.asInstanceOf[AppointmentsSelectionEventArgs]
  }
}

