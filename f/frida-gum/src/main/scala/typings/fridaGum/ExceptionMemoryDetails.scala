package typings.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExceptionMemoryDetails extends js.Object {
  /**
    * Address that was accessed when the exception occurred.
    */
  var address: NativePointer = js.native
  /**
    * The kind of operation that triggered the exception.
    */
  var operation: MemoryOperation = js.native
}

object ExceptionMemoryDetails {
  @scala.inline
  def apply(address: NativePointer, operation: MemoryOperation): ExceptionMemoryDetails = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExceptionMemoryDetails]
  }
  @scala.inline
  implicit class ExceptionMemoryDetailsOps[Self <: ExceptionMemoryDetails] (val x: Self) extends AnyVal {
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
    def setAddress(value: NativePointer): Self = this.set("address", value.asInstanceOf[js.Any])
    @scala.inline
    def setOperation(value: MemoryOperation): Self = this.set("operation", value.asInstanceOf[js.Any])
  }
  
}

