package typings.gapiDotClientDotPlusdomains

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Formatted extends js.Object {
  /** The formatted address for display. */
  var formatted: js.UndefOr[String] = js.undefined
}

object Anon_Formatted {
  @scala.inline
  def apply(formatted: String = null): Anon_Formatted = {
    val __obj = js.Dynamic.literal()
    if (formatted != null) __obj.updateDynamic("formatted")(formatted)
    __obj.asInstanceOf[Anon_Formatted]
  }
}

