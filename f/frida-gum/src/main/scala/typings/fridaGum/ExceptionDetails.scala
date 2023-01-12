package typings.fridaGum

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExceptionDetails extends StObject {
  
  /**
    * Address where the exception occurred.
    */
  var address: NativePointer
  
  /**
    * CPU registers. You may also update register values by assigning to these keys.
    */
  var context: CpuContext
  
  /**
    * Memory operation details, if relevant.
    */
  var memory: js.UndefOr[ExceptionMemoryDetails] = js.undefined
  
  /**
    * Address of the OS and architecture-specific CPU context struct.
    *
    * This is only exposed as a last resort for edge-cases where `context` isn’t providing enough details.
    * We would however discourage using this and rather submit a pull-request to add the missing bits needed
    * for your use-case.
    */
  var nativeContext: NativePointer
  
  /**
    * The kind of exception that occurred.
    */
  var `type`: ExceptionType
}
object ExceptionDetails {
  
  inline def apply(address: NativePointer, context: CpuContext, nativeContext: NativePointer, `type`: ExceptionType): ExceptionDetails = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], nativeContext = nativeContext.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExceptionDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExceptionDetails] (val x: Self) extends AnyVal {
    
    inline def setAddress(value: NativePointer): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setContext(value: CpuContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setMemory(value: ExceptionMemoryDetails): Self = StObject.set(x, "memory", value.asInstanceOf[js.Any])
    
    inline def setMemoryUndefined: Self = StObject.set(x, "memory", js.undefined)
    
    inline def setNativeContext(value: NativePointer): Self = StObject.set(x, "nativeContext", value.asInstanceOf[js.Any])
    
    inline def setType(value: ExceptionType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
