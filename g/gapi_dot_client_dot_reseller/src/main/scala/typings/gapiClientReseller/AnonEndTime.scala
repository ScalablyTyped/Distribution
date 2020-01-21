package typings.gapiClientReseller

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEndTime extends js.Object {
  /** An annual commitment plan's interval's endTime in milliseconds using the UNIX Epoch format. See an example Epoch converter. */
  var endTime: js.UndefOr[String] = js.undefined
  /** An annual commitment plan's interval's startTime in milliseconds using UNIX Epoch format. See an example Epoch converter. */
  var startTime: js.UndefOr[String] = js.undefined
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

