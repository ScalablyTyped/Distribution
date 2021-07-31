package typings.fridaGum

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PortableInvocationContext
  extends StObject
     with /**
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
  def apply(context: CpuContext, depth: Double, returnAddress: NativePointer, threadId: ThreadId): PortableInvocationContext = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], depth = depth.asInstanceOf[js.Any], returnAddress = returnAddress.asInstanceOf[js.Any], threadId = threadId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PortableInvocationContext]
  }
  
  @scala.inline
  implicit class PortableInvocationContextMutableBuilder[Self <: PortableInvocationContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContext(value: CpuContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnAddress(value: NativePointer): Self = StObject.set(x, "returnAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThreadId(value: ThreadId): Self = StObject.set(x, "threadId", value.asInstanceOf[js.Any])
  }
}
