package typings.fridaGum

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WindowsSystemFunctionResult extends SystemFunctionResult {
  
  var lastError: Double = js.native
  
  var value: NativeReturnValue = js.native
}
object WindowsSystemFunctionResult {
  
  @scala.inline
  def apply(lastError: Double, value: NativeReturnValue): WindowsSystemFunctionResult = {
    val __obj = js.Dynamic.literal(lastError = lastError.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowsSystemFunctionResult]
  }
  
  @scala.inline
  implicit class WindowsSystemFunctionResultMutableBuilder[Self <: WindowsSystemFunctionResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLastError(value: Double): Self = StObject.set(x, "lastError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: NativeReturnValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueVarargs(value: js.Any*): Self = StObject.set(x, "value", js.Array(value :_*))
  }
}
