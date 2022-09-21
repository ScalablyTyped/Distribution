package typings.fridaGum

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CallbackContext extends StObject {
  
  /**
    * CPU registers, but unlike `InvocationContext` this is read-only and only
    * contains the bare minimum needed for `Thread.backtrace()` - all others
    * are zeroed out.
    */
  var context: CpuContext
  
  /**
    * Return address.
    */
  var returnAddress: NativePointer
}
object CallbackContext {
  
  inline def apply(context: CpuContext, returnAddress: NativePointer): CallbackContext = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], returnAddress = returnAddress.asInstanceOf[js.Any])
    __obj.asInstanceOf[CallbackContext]
  }
  
  extension [Self <: CallbackContext](x: Self) {
    
    inline def setContext(value: CpuContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setReturnAddress(value: NativePointer): Self = StObject.set(x, "returnAddress", value.asInstanceOf[js.Any])
  }
}
