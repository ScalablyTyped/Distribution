package typings.fridaGum

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PortableInvocationContext
  extends /**
  * User-defined invocation data. Useful if you want to read an argument in `onEnter` and act on it in `onLeave`.
  */
/* x */ StringDictionary[js.Any]
     with InvocationContext {
  
  /**
    * CPU registers. You may also update register values by assigning to these keys.
    */
  var context: CpuContext = js.native
  
  /**
    * Call depth of relative to other invocations.
    */
  var depth: Double = js.native
  
  /**
    * Return address.
    */
  var returnAddress: NativePointer = js.native
  
  /**
    * OS thread ID.
    */
  var threadId: ThreadId = js.native
}
object PortableInvocationContext {
  
  @scala.inline
  def apply(context: CpuContext, depth: Double, returnAddress: NativePointer, threadId: ThreadId): PortableInvocationContext = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], depth = depth.asInstanceOf[js.Any], returnAddress = returnAddress.asInstanceOf[js.Any], threadId = threadId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PortableInvocationContext]
  }
  
  @scala.inline
  implicit class PortableInvocationContextOps[Self <: PortableInvocationContext] (val x: Self) extends AnyVal {
    
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
    def setContext(value: CpuContext): Self = this.set("context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDepth(value: Double): Self = this.set("depth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnAddress(value: NativePointer): Self = this.set("returnAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThreadId(value: ThreadId): Self = this.set("threadId", value.asInstanceOf[js.Any])
  }
}
