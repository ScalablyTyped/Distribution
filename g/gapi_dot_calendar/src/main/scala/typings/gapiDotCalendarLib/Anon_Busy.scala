package typings
package gapiDotCalendarLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Busy extends js.Object {
  var busy: js.Array[Anon_End]
  var errors: js.UndefOr[js.Array[Anon_Domain]] = js.undefined
}

object Anon_Busy {
  @scala.inline
  def apply(busy: js.Array[Anon_End], errors: js.Array[Anon_Domain] = null): Anon_Busy = {
    val __obj = js.Dynamic.literal(busy = busy)
    if (errors != null) __obj.updateDynamic("errors")(errors)
    __obj.asInstanceOf[Anon_Busy]
  }
}

