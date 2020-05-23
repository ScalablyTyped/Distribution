package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BootstrapSchedulerAppointmentDragInfo extends js.Object {
  val appointmentId: String
  val instance: js.Any
  val newInterval: BootstrapTimeInterval | Null
  val oldInterval: BootstrapTimeInterval | Null
}

object BootstrapSchedulerAppointmentDragInfo {
  @scala.inline
  def apply(
    appointmentId: String,
    instance: js.Any,
    newInterval: BootstrapTimeInterval = null,
    oldInterval: BootstrapTimeInterval = null
  ): BootstrapSchedulerAppointmentDragInfo = {
    val __obj = js.Dynamic.literal(appointmentId = appointmentId.asInstanceOf[js.Any], instance = instance.asInstanceOf[js.Any], newInterval = newInterval.asInstanceOf[js.Any], oldInterval = oldInterval.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootstrapSchedulerAppointmentDragInfo]
  }
}

