package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonFormattedString extends js.Object {
  var formatted: js.UndefOr[String] = js.native
}

object AnonFormattedString {
  @scala.inline
  def apply(formatted: String = null): AnonFormattedString = {
    val __obj = js.Dynamic.literal()
    if (formatted != null) __obj.updateDynamic("formatted")(formatted.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFormattedString]
  }
}

