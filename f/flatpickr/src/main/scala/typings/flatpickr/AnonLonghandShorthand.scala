package typings.flatpickr

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLonghandShorthand extends js.Object {
  var longhand: js.Tuple12[String, String, String, String, String, String, String, String, String, String, String, String]
  var shorthand: js.Tuple12[String, String, String, String, String, String, String, String, String, String, String, String]
}

object AnonLonghandShorthand {
  @scala.inline
  def apply(
    longhand: js.Tuple12[String, String, String, String, String, String, String, String, String, String, String, String],
    shorthand: js.Tuple12[String, String, String, String, String, String, String, String, String, String, String, String]
  ): AnonLonghandShorthand = {
    val __obj = js.Dynamic.literal(longhand = longhand.asInstanceOf[js.Any], shorthand = shorthand.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonLonghandShorthand]
  }
}

