package typings.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fridaGum.InvocationContext because Already inherited */ @js.native
trait WindowsInvocationContext extends PortableInvocationContext {
  /**
    * Current OS error value (you may replace it).
    */
  var lastError: Double = js.native
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
  @scala.inline
  implicit class WindowsInvocationContextOps[Self <: WindowsInvocationContext] (val x: Self) extends AnyVal {
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
    def setLastError(value: Double): Self = this.set("lastError", value.asInstanceOf[js.Any])
  }
  
}

