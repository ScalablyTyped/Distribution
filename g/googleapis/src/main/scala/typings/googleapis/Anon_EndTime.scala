package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_EndTime extends js.Object {
  var endTime: js.UndefOr[String] = js.native
  var startTime: js.UndefOr[String] = js.native
}

object Anon_EndTime {
  @scala.inline
  def apply(endTime: String = null, startTime: String = null): Anon_EndTime = {
    val __obj = js.Dynamic.literal()
    if (endTime != null) __obj.updateDynamic("endTime")(endTime.asInstanceOf[js.Any])
    if (startTime != null) __obj.updateDynamic("startTime")(startTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_EndTime]
  }
}

