package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Formatted extends js.Object {
  var formatted: js.UndefOr[String] = js.native
}

object Anon_Formatted {
  @scala.inline
  def apply(formatted: String = null): Anon_Formatted = {
    val __obj = js.Dynamic.literal()
    if (formatted != null) __obj.updateDynamic("formatted")(formatted.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Formatted]
  }
}

