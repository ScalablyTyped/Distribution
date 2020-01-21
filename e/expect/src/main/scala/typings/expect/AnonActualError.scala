package typings.expect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonActualError extends js.Object {
  var actual: String
  var error: js.Any
  var expected: String
}

object AnonActualError {
  @scala.inline
  def apply(actual: String, error: js.Any, expected: String): AnonActualError = {
    val __obj = js.Dynamic.literal(actual = actual.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], expected = expected.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonActualError]
  }
}

