package typings.googleDashAppsDashScript.GoogleAppsScript.AdminReports.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UsageReportsWarnings extends js.Object {
  var code: js.UndefOr[String] = js.undefined
  var data: js.UndefOr[js.Array[UsageReportsWarningsData]] = js.undefined
  var message: js.UndefOr[String] = js.undefined
}

object UsageReportsWarnings {
  @scala.inline
  def apply(code: String = null, data: js.Array[UsageReportsWarningsData] = null, message: String = null): UsageReportsWarnings = {
    val __obj = js.Dynamic.literal()
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsageReportsWarnings]
  }
}

