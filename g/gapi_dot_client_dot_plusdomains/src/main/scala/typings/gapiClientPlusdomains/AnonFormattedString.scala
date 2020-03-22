package typings.gapiClientPlusdomains

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFormattedString extends js.Object {
  /** The formatted address for display. */
  var formatted: js.UndefOr[String] = js.undefined
}

object AnonFormattedString {
  @scala.inline
  def apply(formatted: String = null): AnonFormattedString = {
    val __obj = js.Dynamic.literal()
    if (formatted != null) __obj.updateDynamic("formatted")(formatted.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFormattedString]
  }
}

