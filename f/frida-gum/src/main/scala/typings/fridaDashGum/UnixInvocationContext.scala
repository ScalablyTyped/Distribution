package typings.fridaDashGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.fridaDashGum.InvocationContext because Already inherited */ trait UnixInvocationContext extends PortableInvocationContext {
  /**
    * Current errno value (you may replace it).
    */
  var errno: Double
}

object UnixInvocationContext {
  @scala.inline
  def apply(
    context: CpuContext,
    depth: Double,
    errno: Double,
    returnAddress: NativePointer,
    threadId: ThreadId
  ): UnixInvocationContext = {
    val __obj = js.Dynamic.literal(context = context, depth = depth, errno = errno, returnAddress = returnAddress, threadId = threadId)
  
    __obj.asInstanceOf[UnixInvocationContext]
  }
}

