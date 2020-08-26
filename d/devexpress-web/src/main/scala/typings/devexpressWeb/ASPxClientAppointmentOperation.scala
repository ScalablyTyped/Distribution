package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains methods allowing you to perform or cancel an operation.
  */
@js.native
trait ASPxClientAppointmentOperation extends js.Object {
  /**
    * Passes parameters to the corresponding callback function to accomplish the operation.
    */
  def Apply(): Unit = js.native
  /**
    * Cancels the operation.
    */
  def Cancel(): Unit = js.native
}

object ASPxClientAppointmentOperation {
  @scala.inline
  def apply(Apply: () => Unit, Cancel: () => Unit): ASPxClientAppointmentOperation = {
    val __obj = js.Dynamic.literal(Apply = js.Any.fromFunction0(Apply), Cancel = js.Any.fromFunction0(Cancel))
    __obj.asInstanceOf[ASPxClientAppointmentOperation]
  }
  @scala.inline
  implicit class ASPxClientAppointmentOperationOps[Self <: ASPxClientAppointmentOperation] (val x: Self) extends AnyVal {
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
    def setApply(value: () => Unit): Self = this.set("Apply", js.Any.fromFunction0(value))
    @scala.inline
    def setCancel(value: () => Unit): Self = this.set("Cancel", js.Any.fromFunction0(value))
  }
  
}

