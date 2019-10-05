package typings.devexpressDashAspnetcoreDashBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppointmentsSelectionEventArgs extends EventArgs {
  val appointmentIds: js.Array[String]
}

object AppointmentsSelectionEventArgs {
  @scala.inline
  def apply(appointmentIds: js.Array[String], sender: Control): AppointmentsSelectionEventArgs = {
    val __obj = js.Dynamic.literal(appointmentIds = appointmentIds, sender = sender)
  
    __obj.asInstanceOf[AppointmentsSelectionEventArgs]
  }
}

