package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonActiveTime extends js.Object {
  var activeTime: js.UndefOr[Double] = js.native
  var date: js.UndefOr[String] = js.native
}

object AnonActiveTime {
  @scala.inline
  def apply(activeTime: Int | Double = null, date: String = null): AnonActiveTime = {
    val __obj = js.Dynamic.literal()
    if (activeTime != null) __obj.updateDynamic("activeTime")(activeTime.asInstanceOf[js.Any])
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonActiveTime]
  }
}

