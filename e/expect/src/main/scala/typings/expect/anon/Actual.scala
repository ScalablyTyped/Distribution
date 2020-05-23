package typings.expect.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Actual extends js.Object {
  var actual: js.Any
  var error: js.Any
  var expected: Double
}

object Actual {
  @scala.inline
  def apply(actual: js.Any, error: js.Any, expected: Double): Actual = {
    val __obj = js.Dynamic.literal(actual = actual.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], expected = expected.asInstanceOf[js.Any])
    __obj.asInstanceOf[Actual]
  }
}

