package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonFormatted extends js.Object {
  var formatted: js.UndefOr[String] = js.native
}

object AnonFormatted {
  @scala.inline
  def apply(formatted: String = null): AnonFormatted = {
    val __obj = js.Dynamic.literal()
    if (formatted != null) __obj.updateDynamic("formatted")(formatted.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFormatted]
  }
}

