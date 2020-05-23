package typings.gapiClientPlusdomains.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormattedString extends js.Object {
  /** The formatted address for display. */
  var formatted: js.UndefOr[String] = js.undefined
}

object FormattedString {
  @scala.inline
  def apply(formatted: String = null): FormattedString = {
    val __obj = js.Dynamic.literal()
    if (formatted != null) __obj.updateDynamic("formatted")(formatted.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormattedString]
  }
}

