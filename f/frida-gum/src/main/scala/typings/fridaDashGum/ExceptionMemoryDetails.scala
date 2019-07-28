package typings.fridaDashGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExceptionMemoryDetails extends js.Object {
  /**
    * Address that was accessed when the exception occurred.
    */
  var address: NativePointer
  /**
    * The kind of operation that triggered the exception.
    */
  var operation: MemoryOperation
}

object ExceptionMemoryDetails {
  @scala.inline
  def apply(address: NativePointer, operation: MemoryOperation): ExceptionMemoryDetails = {
    val __obj = js.Dynamic.literal(address = address, operation = operation)
  
    __obj.asInstanceOf[ExceptionMemoryDetails]
  }
}

