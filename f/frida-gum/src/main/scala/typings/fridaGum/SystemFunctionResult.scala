package typings.fridaGum

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.fridaGum.WindowsSystemFunctionResult
  - typings.fridaGum.UnixSystemFunctionResult
*/
trait SystemFunctionResult extends StObject
object SystemFunctionResult {
  
  @scala.inline
  def UnixSystemFunctionResult(errno: Double, value: NativeReturnValue): typings.fridaGum.UnixSystemFunctionResult = {
    val __obj = js.Dynamic.literal(errno = errno.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fridaGum.UnixSystemFunctionResult]
  }
  
  @scala.inline
  def WindowsSystemFunctionResult(lastError: Double, value: NativeReturnValue): typings.fridaGum.WindowsSystemFunctionResult = {
    val __obj = js.Dynamic.literal(lastError = lastError.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fridaGum.WindowsSystemFunctionResult]
  }
}
