package typings.googleAppsScript.GoogleAppsScript.Content.Schema

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
  def apply(
    hour: js.UndefOr[Double] = js.undefined,
    minute: js.UndefOr[Double] = js.undefined,
    timezone: String = null
  ): CutoffTime = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(hour)) __obj.updateDynamic("hour")(hour.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minute)) __obj.updateDynamic("minute")(minute.get.asInstanceOf[js.Any])
    if (timezone != null) __obj.updateDynamic("timezone")(timezone.asInstanceOf[js.Any])
    __obj.asInstanceOf[CutoffTime]
  }
}

