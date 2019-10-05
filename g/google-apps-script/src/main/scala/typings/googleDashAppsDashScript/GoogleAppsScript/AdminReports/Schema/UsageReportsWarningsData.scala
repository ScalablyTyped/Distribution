package typings.googleDashAppsDashScript.GoogleAppsScript.AdminReports.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UsageReportsWarningsData extends js.Object {
  var key: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[String] = js.undefined
}

object UsageReportsWarningsData {
  @scala.inline
  def apply(key: String = null, value: String = null): UsageReportsWarningsData = {
    val __obj = js.Dynamic.literal()
    if (key != null) __obj.updateDynamic("key")(key)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[UsageReportsWarningsData]
  }
}

