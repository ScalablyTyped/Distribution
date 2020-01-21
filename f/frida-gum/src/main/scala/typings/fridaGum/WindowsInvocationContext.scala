package typings.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.fridaGum.InvocationContext because Already inherited */ trait WindowsInvocationContext extends PortableInvocationContext {
  /**
    * Current OS error value (you may replace it).
    */
  var lastError: Double
}

object WindowsInvocationContext {
  @scala.inline
  def apply(
    context: CpuContext,
    depth: Double,
    lastError: Double,
    returnAddress: NativePointer,
    threadId: ThreadId
  ): WindowsInvocationContext = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], depth = depth.asInstanceOf[js.Any], lastError = lastError.asInstanceOf[js.Any], returnAddress = returnAddress.asInstanceOf[js.Any], threadId = threadId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WindowsInvocationContext]
  }
}

