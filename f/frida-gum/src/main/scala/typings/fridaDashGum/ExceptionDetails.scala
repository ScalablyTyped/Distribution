package typings.fridaDashGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExceptionDetails extends js.Object {
  /**
    * Address where the exception occurred.
    */
  var address: NativePointer
  /**
    * CPU registers. You may also update register values by assigning to these keys.
    */
  var context: CpuContext
  /**
    * Memory operation details, if relevant.
    */
  var memory: js.UndefOr[ExceptionMemoryDetails] = js.undefined
  /**
    * Address of the OS and architecture-specific CPU context struct.
    *
    * This is only exposed as a last resort for edge-cases where `context` isn’t providing enough details.
    * We would however discourage using this and rather submit a pull-request to add the missing bits needed
    * for your use-case.
    */
  var nativeContext: NativePointer
  /**
    * The kind of exception that occurred.
    */
  var `type`: ExceptionType
}

object ExceptionDetails {
  @scala.inline
  def apply(
    address: NativePointer,
    context: CpuContext,
    nativeContext: NativePointer,
    `type`: ExceptionType,
    memory: ExceptionMemoryDetails = null
  ): ExceptionDetails = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], nativeContext = nativeContext.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (memory != null) __obj.updateDynamic("memory")(memory.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExceptionDetails]
  }
}

