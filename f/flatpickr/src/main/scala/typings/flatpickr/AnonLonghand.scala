package typings.flatpickr

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLonghand extends js.Object {
  var longhand: js.Tuple7[String, String, String, String, String, String, String]
  var shorthand: js.Tuple7[String, String, String, String, String, String, String]
}

object AnonLonghand {
  @scala.inline
  def apply(
    longhand: js.Tuple7[String, String, String, String, String, String, String],
    shorthand: js.Tuple7[String, String, String, String, String, String, String]
  ): AnonLonghand = {
    val __obj = js.Dynamic.literal(longhand = longhand.asInstanceOf[js.Any], shorthand = shorthand.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLonghand]
  }
}

