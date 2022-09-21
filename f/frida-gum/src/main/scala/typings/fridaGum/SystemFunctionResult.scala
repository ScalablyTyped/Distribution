package typings.fridaGum

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.fridaGum.WindowsSystemFunctionResult[Value]
  - typings.fridaGum.UnixSystemFunctionResult[Value]
*/
trait SystemFunctionResult[Value /* <: NativeFunctionReturnValue */] extends StObject
object SystemFunctionResult {
  
  inline def UnixSystemFunctionResult[Value /* <: NativeFunctionReturnValue */](errno: Double, value: Value): typings.fridaGum.UnixSystemFunctionResult[Value] = {
    val __obj = js.Dynamic.literal(errno = errno.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fridaGum.UnixSystemFunctionResult[Value]]
  }
  
  inline def WindowsSystemFunctionResult[Value /* <: NativeFunctionReturnValue */](lastError: Double, value: Value): typings.fridaGum.WindowsSystemFunctionResult[Value] = {
    val __obj = js.Dynamic.literal(lastError = lastError.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fridaGum.WindowsSystemFunctionResult[Value]]
  }
}
