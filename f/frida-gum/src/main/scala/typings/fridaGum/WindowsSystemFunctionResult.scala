package typings.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WindowsSystemFunctionResult extends SystemFunctionResult {
  var lastError: Double
  var value: NativeReturnValue
}

object WindowsSystemFunctionResult {
  @scala.inline
  def apply(lastError: Double, value: NativeReturnValue): WindowsSystemFunctionResult = {
    val __obj = js.Dynamic.literal(lastError = lastError.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WindowsSystemFunctionResult]
  }
}

