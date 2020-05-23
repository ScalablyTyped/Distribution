package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BootstrapSchedulerAppointmentOperation extends js.Object {
  val instance: js.Any
  @JSName("apply")
  def apply(): Unit
  def cancel(): Unit
}

object BootstrapSchedulerAppointmentOperation {
  @scala.inline
  def apply(apply: () => Unit, cancel: () => Unit, instance: js.Any): BootstrapSchedulerAppointmentOperation = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction0(apply), cancel = js.Any.fromFunction0(cancel), instance = instance.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootstrapSchedulerAppointmentOperation]
  }
}

