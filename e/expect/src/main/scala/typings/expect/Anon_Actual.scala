package typings.expect

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Actual extends js.Object {
  var actual: String | Double
  var error: Error
  var expected: String
}

object Anon_Actual {
  @scala.inline
  def apply(actual: String | Double, error: Error, expected: String): Anon_Actual = {
    val __obj = js.Dynamic.literal(actual = actual.asInstanceOf[js.Any], error = error, expected = expected)
  
    __obj.asInstanceOf[Anon_Actual]
  }
}

