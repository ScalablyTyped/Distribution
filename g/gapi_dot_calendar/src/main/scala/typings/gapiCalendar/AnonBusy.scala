package typings.gapiCalendar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBusy extends js.Object {
  var busy: js.Array[AnonEnd]
  var errors: js.UndefOr[js.Array[AnonDomain]] = js.undefined
}

object AnonBusy {
  @scala.inline
  def apply(busy: js.Array[AnonEnd], errors: js.Array[AnonDomain] = null): AnonBusy = {
    val __obj = js.Dynamic.literal(busy = busy.asInstanceOf[js.Any])
    if (errors != null) __obj.updateDynamic("errors")(errors.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBusy]
  }
}

