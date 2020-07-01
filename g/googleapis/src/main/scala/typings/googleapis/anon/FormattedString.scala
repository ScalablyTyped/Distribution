package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FormattedString extends js.Object {
  var formatted: js.UndefOr[String] = js.native
}

object FormattedString {
  @scala.inline
  def apply(formatted: String = null): FormattedString = {
    val __obj = js.Dynamic.literal()
    if (formatted != null) __obj.updateDynamic("formatted")(formatted.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormattedString]
  }
}

