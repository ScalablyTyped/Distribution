package typings.expect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Actual extends js.Object {
  var actual: js.Any
  var error: js.Any
  var expected: Double
}

object Anon_Actual {
  @scala.inline
  def apply(actual: js.Any, error: js.Any, expected: Double): Anon_Actual = {
    val __obj = js.Dynamic.literal(actual = actual.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], expected = expected.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Actual]
  }
}

