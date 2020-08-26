package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BootstrapSchedulerAppointmentOperation extends js.Object {
  val instance: js.Any = js.native
  @JSName("apply")
  def apply(): Unit = js.native
  def cancel(): Unit = js.native
}

object BootstrapSchedulerAppointmentOperation {
  @scala.inline
  def apply(apply: () => Unit, cancel: () => Unit, instance: js.Any): BootstrapSchedulerAppointmentOperation = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction0(apply), cancel = js.Any.fromFunction0(cancel), instance = instance.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootstrapSchedulerAppointmentOperation]
  }
  @scala.inline
  implicit class BootstrapSchedulerAppointmentOperationOps[Self <: BootstrapSchedulerAppointmentOperation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setApply(value: () => Unit): Self = this.set("apply", js.Any.fromFunction0(value))
    @scala.inline
    def setCancel(value: () => Unit): Self = this.set("cancel", js.Any.fromFunction0(value))
    @scala.inline
    def setInstance(value: js.Any): Self = this.set("instance", value.asInstanceOf[js.Any])
  }
  
}

