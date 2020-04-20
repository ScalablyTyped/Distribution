package typings.expect

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonExpected extends js.Object {
  var actual: String | Double
  var error: Error
  var expected: String
}

object AnonExpected {
  @scala.inline
  def apply(actual: String | Double, error: Error, expected: String): AnonExpected = {
    val __obj = js.Dynamic.literal(actual = actual.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], expected = expected.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonExpected]
  }
}

