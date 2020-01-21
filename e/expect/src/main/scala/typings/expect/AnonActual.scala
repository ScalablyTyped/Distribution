package typings.expect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonActual extends js.Object {
  var actual: js.Any
  var error: js.Any
  var expected: Double
}

object AnonActual {
  @scala.inline
  def apply(actual: js.Any, error: js.Any, expected: Double): AnonActual = {
    val __obj = js.Dynamic.literal(actual = actual.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], expected = expected.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonActual]
  }
}

