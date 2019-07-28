package typings.fridaDashGum

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PortableInvocationContext
  extends /**
  * User-defined invocation data. Useful if you want to read an argument in `onEnter` and act on it in `onLeave`.
  */
/* x */ StringDictionary[js.Any]
     with InvocationContext {
  /**
    * CPU registers. You may also update register values by assigning to these keys.
    */
  var context: CpuContext
  /**
    * Call depth of relative to other invocations.
    */
  var depth: Double
  /**
    * Return address.
    */
  var returnAddress: NativePointer
  /**
    * OS thread ID.
    */
  var threadId: ThreadId
}

object PortableInvocationContext {
  @scala.inline
  def apply(
    context: CpuContext,
    depth: Double,
    returnAddress: NativePointer,
    threadId: ThreadId,
    StringDictionary: /**
    * User-defined invocation data. Useful if you want to read an argument in `onEnter` and act on it in `onLeave`.
    */
  /* x */ StringDictionary[js.Any] = null
  ): PortableInvocationContext = {
    val __obj = js.Dynamic.literal(context = context, depth = depth, returnAddress = returnAddress, threadId = threadId)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[PortableInvocationContext]
  }
}

