package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonEndTime extends js.Object {
  var endTime: js.UndefOr[String] = js.native
  var startTime: js.UndefOr[String] = js.native
}

object AnonEndTime {
  @scala.inline
  def apply(endTime: String = null, startTime: String = null): AnonEndTime = {
    val __obj = js.Dynamic.literal()
    if (endTime != null) __obj.updateDynamic("endTime")(endTime.asInstanceOf[js.Any])
    if (startTime != null) __obj.updateDynamic("startTime")(startTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEndTime]
  }
}

