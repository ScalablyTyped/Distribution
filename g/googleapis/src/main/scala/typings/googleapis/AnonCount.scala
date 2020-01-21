package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCount extends js.Object {
  var count: js.UndefOr[String] = js.native
  var timeRange: js.UndefOr[String] = js.native
}

object AnonCount {
  @scala.inline
  def apply(count: String = null, timeRange: String = null): AnonCount = {
    val __obj = js.Dynamic.literal()
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (timeRange != null) __obj.updateDynamic("timeRange")(timeRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCount]
  }
}

