package typings.fridaDashGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.fridaDashGum.WindowsSystemFunctionResult
  - typings.fridaDashGum.UnixSystemFunctionResult
*/
trait SystemFunctionResult extends js.Object

object SystemFunctionResult {
  @scala.inline
  def WindowsSystemFunctionResult(lastError: Double, value: NativeReturnValue): SystemFunctionResult = {
    val __obj = js.Dynamic.literal(lastError = lastError.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SystemFunctionResult]
  }
  @scala.inline
  def UnixSystemFunctionResult(errno: Double, value: NativeReturnValue): SystemFunctionResult = {
    val __obj = js.Dynamic.literal(errno = errno.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SystemFunctionResult]
  }
}

