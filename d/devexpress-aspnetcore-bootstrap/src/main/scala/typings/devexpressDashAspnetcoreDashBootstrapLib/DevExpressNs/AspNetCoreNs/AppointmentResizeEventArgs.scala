package typings
package devexpressDashAspnetcoreDashBootstrapLib.DevExpressNs.AspNetCoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait AppointmentResizeEventArgs extends EventArgs {
  val appointmentId: java.lang.String
  var handled: scala.Boolean
  val newInterval: BootstrapTimeInterval
  val oldInterval: BootstrapTimeInterval
  val operation: BootstrapSchedulerAppointmentOperation
}

