package typings.googleGax

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDeadline extends js.Object {
  var deadline: js.UndefOr[Date] = js.undefined
}

object AnonDeadline {
  @scala.inline
  def apply(deadline: Date = null): AnonDeadline = {
    val __obj = js.Dynamic.literal()
    if (deadline != null) __obj.updateDynamic("deadline")(deadline.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDeadline]
  }
}

