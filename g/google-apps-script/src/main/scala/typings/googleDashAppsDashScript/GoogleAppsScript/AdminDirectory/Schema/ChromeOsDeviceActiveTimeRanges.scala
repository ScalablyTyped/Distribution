package typings.googleDashAppsDashScript.GoogleAppsScript.AdminDirectory.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChromeOsDeviceActiveTimeRanges extends js.Object {
  var activeTime: js.UndefOr[Double] = js.undefined
  var date: js.UndefOr[String] = js.undefined
}

object ChromeOsDeviceActiveTimeRanges {
  @scala.inline
  def apply(activeTime: Int | Double = null, date: String = null): ChromeOsDeviceActiveTimeRanges = {
    val __obj = js.Dynamic.literal()
    if (activeTime != null) __obj.updateDynamic("activeTime")(activeTime.asInstanceOf[js.Any])
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChromeOsDeviceActiveTimeRanges]
  }
}

