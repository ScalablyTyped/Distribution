package typings
package googleDotFeedsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait feedError extends js.Object {
  var code: java.lang.String
  var message: java.lang.String
}

object feedError {
  @scala.inline
  def apply(code: java.lang.String, message: java.lang.String): feedError = {
    val __obj = js.Dynamic.literal(code = code, message = message)
  
    __obj.asInstanceOf[feedError]
  }
}

