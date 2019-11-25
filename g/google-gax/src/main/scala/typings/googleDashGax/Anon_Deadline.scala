package typings.googleDashGax

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Deadline extends js.Object {
  var deadline: js.UndefOr[Date] = js.undefined
}

object Anon_Deadline {
  @scala.inline
  def apply(deadline: Date = null): Anon_Deadline = {
    val __obj = js.Dynamic.literal()
    if (deadline != null) __obj.updateDynamic("deadline")(deadline.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Deadline]
  }
}

