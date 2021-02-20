package typings.fridaGum

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExceptionMemoryDetails extends StObject {
  
  /**
    * Address that was accessed when the exception occurred.
    */
  var address: NativePointer = js.native
  
  /**
    * The kind of operation that triggered the exception.
    */
  var operation: MemoryOperation = js.native
}
object ExceptionMemoryDetails {
  
  @scala.inline
  def apply(address: NativePointer, operation: MemoryOperation): ExceptionMemoryDetails = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExceptionMemoryDetails]
  }
  
  @scala.inline
  implicit class ExceptionMemoryDetailsMutableBuilder[Self <: ExceptionMemoryDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddress(value: NativePointer): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperation(value: MemoryOperation): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
  }
}
