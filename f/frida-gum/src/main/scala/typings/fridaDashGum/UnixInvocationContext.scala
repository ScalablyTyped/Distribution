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
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], depth = depth.asInstanceOf[js.Any], errno = errno.asInstanceOf[js.Any], returnAddress = returnAddress.asInstanceOf[js.Any], threadId = threadId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UnixInvocationContext]
  }
}

