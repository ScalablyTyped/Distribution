package typings
package fridaDashGumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WindowsSystemFunctionResult extends SystemFunctionResult {
  var lastError: scala.Double
  var value: NativeReturnValue
}

object WindowsSystemFunctionResult {
  @scala.inline
  def apply(lastError: scala.Double, value: NativeReturnValue): WindowsSystemFunctionResult = {
    val __obj = js.Dynamic.literal(lastError = lastError, value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WindowsSystemFunctionResult]
  }
}

