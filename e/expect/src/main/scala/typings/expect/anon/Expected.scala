package typings.expect.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Expected extends js.Object {
  var actual: String | Double
  var error: typings.std.Error
  var expected: String
}

object Expected {
  @scala.inline
  def apply(actual: String | Double, error: typings.std.Error, expected: String): Expected = {
    val __obj = js.Dynamic.literal(actual = actual.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], expected = expected.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expected]
  }
}

