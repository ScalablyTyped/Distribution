package typings.googleGax.anon

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Deadline extends js.Object {
  var deadline: js.UndefOr[Date] = js.undefined
}

object Deadline {
  @scala.inline
  def apply(deadline: Date = null): Deadline = {
    val __obj = js.Dynamic.literal()
    if (deadline != null) __obj.updateDynamic("deadline")(deadline.asInstanceOf[js.Any])
    __obj.asInstanceOf[Deadline]
  }
}

