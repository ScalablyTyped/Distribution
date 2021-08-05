package typings.fridaGum

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WindowsSystemFunctionResult
  extends StObject
     with SystemFunctionResult {
  
  var lastError: Double
  
  var value: NativeReturnValue
}
object WindowsSystemFunctionResult {
  
  inline def apply(lastError: Double, value: NativeReturnValue): WindowsSystemFunctionResult = {
    val __obj = js.Dynamic.literal(lastError = lastError.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowsSystemFunctionResult]
  }
  
  extension [Self <: WindowsSystemFunctionResult](x: Self) {
    
    inline def setLastError(value: Double): Self = StObject.set(x, "lastError", value.asInstanceOf[js.Any])
    
    inline def setValue(value: NativeReturnValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueVarargs(value: js.Any*): Self = StObject.set(x, "value", js.Array(value :_*))
  }
}
