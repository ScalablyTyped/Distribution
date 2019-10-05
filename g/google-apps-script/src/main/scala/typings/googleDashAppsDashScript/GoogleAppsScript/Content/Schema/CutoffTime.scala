package typings.googleDashAppsDashScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CutoffTime extends js.Object {
  var hour: js.UndefOr[Double] = js.undefined
  var minute: js.UndefOr[Double] = js.undefined
  var timezone: js.UndefOr[String] = js.undefined
}

object CutoffTime {
  @scala.inline
  def apply(hour: Int | Double = null, minute: Int | Double = null, timezone: String = null): CutoffTime = {
    val __obj = js.Dynamic.literal()
    if (hour != null) __obj.updateDynamic("hour")(hour.asInstanceOf[js.Any])
    if (minute != null) __obj.updateDynamic("minute")(minute.asInstanceOf[js.Any])
    if (timezone != null) __obj.updateDynamic("timezone")(timezone)
    __obj.asInstanceOf[CutoffTime]
  }
}

