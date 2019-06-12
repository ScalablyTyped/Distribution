package typings
package fridaDashGumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- fridaDashGumLib.InvocationContext because Already inherited */ trait WindowsInvocationContext extends PortableInvocationContext {
  /**
    * Current OS error value (you may replace it).
    */
  var lastError: scala.Double
}

object WindowsInvocationContext {
  @scala.inline
  def apply(
    context: CpuContext,
    depth: scala.Double,
    lastError: scala.Double,
    returnAddress: NativePointer,
    threadId: ThreadId
  ): WindowsInvocationContext = {
    val __obj = js.Dynamic.literal(context = context, depth = depth, lastError = lastError, returnAddress = returnAddress, threadId = threadId)
  
    __obj.asInstanceOf[WindowsInvocationContext]
  }
}

