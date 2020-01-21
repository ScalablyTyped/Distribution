package typings.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnixSystemFunctionResult extends SystemFunctionResult {
  var errno: Double
  var value: NativeReturnValue
}

object UnixSystemFunctionResult {
  @scala.inline
  def apply(errno: Double, value: NativeReturnValue): UnixSystemFunctionResult = {
    val __obj = js.Dynamic.literal(errno = errno.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UnixSystemFunctionResult]
  }
}

