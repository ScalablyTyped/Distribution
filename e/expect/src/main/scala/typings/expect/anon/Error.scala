package typings.expect.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Error extends js.Object {
  var actual: String
  var error: js.Any
  var expected: String
}

object Error {
  @scala.inline
  def apply(actual: String, error: js.Any, expected: String): Error = {
    val __obj = js.Dynamic.literal(actual = actual.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], expected = expected.asInstanceOf[js.Any])
    __obj.asInstanceOf[Error]
  }
}

