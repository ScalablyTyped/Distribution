package typings.gapiCalendar.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Busy extends js.Object {
  var busy: js.Array[End]
  var errors: js.UndefOr[js.Array[Domain]] = js.undefined
}

object Busy {
  @scala.inline
  def apply(busy: js.Array[End], errors: js.Array[Domain] = null): Busy = {
    val __obj = js.Dynamic.literal(busy = busy.asInstanceOf[js.Any])
    if (errors != null) __obj.updateDynamic("errors")(errors.asInstanceOf[js.Any])
    __obj.asInstanceOf[Busy]
  }
}

