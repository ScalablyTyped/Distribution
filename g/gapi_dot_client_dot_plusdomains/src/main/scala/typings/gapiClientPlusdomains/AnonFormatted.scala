package typings.gapiClientPlusdomains

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFormatted extends js.Object {
  /** The formatted address for display. */
  var formatted: js.UndefOr[String] = js.undefined
}

object AnonFormatted {
  @scala.inline
  def apply(formatted: String = null): AnonFormatted = {
    val __obj = js.Dynamic.literal()
    if (formatted != null) __obj.updateDynamic("formatted")(formatted.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFormatted]
  }
}

