package typings
package googleDashGaxLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Deadline extends js.Object {
  var deadline: js.UndefOr[stdLib.Date] = js.undefined
}

object Anon_Deadline {
  @scala.inline
  def apply(deadline: stdLib.Date = null): Anon_Deadline = {
    val __obj = js.Dynamic.literal()
    if (deadline != null) __obj.updateDynamic("deadline")(deadline)
    __obj.asInstanceOf[Anon_Deadline]
  }
}

