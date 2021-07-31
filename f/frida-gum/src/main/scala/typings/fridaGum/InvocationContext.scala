package typings.fridaGum

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.fridaGum.PortableInvocationContext
  - typings.fridaGum.WindowsInvocationContext
  - typings.fridaGum.UnixInvocationContext
*/
trait InvocationContext extends StObject
object InvocationContext {
  
  @scala.inline
  def PortableInvocationContext(context: CpuContext, depth: Double, returnAddress: NativePointer, threadId: ThreadId): typings.fridaGum.PortableInvocationContext = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], depth = depth.asInstanceOf[js.Any], returnAddress = returnAddress.asInstanceOf[js.Any], threadId = threadId.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fridaGum.PortableInvocationContext]
  }
  
  @scala.inline
  def UnixInvocationContext(
    context: CpuContext,
    depth: Double,
    errno: Double,
    returnAddress: NativePointer,
    threadId: ThreadId
  ): typings.fridaGum.UnixInvocationContext = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], depth = depth.asInstanceOf[js.Any], errno = errno.asInstanceOf[js.Any], returnAddress = returnAddress.asInstanceOf[js.Any], threadId = threadId.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fridaGum.UnixInvocationContext]
  }
  
  @scala.inline
  def WindowsInvocationContext(
    context: CpuContext,
    depth: Double,
    lastError: Double,
    returnAddress: NativePointer,
    threadId: ThreadId
  ): typings.fridaGum.WindowsInvocationContext = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], depth = depth.asInstanceOf[js.Any], lastError = lastError.asInstanceOf[js.Any], returnAddress = returnAddress.asInstanceOf[js.Any], threadId = threadId.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fridaGum.WindowsInvocationContext]
  }
}
