package typings.googleDashAppsDashScript.GoogleAppsScript.AdminReports.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UsageReportParameters extends js.Object {
  var boolValue: js.UndefOr[Boolean] = js.undefined
  var datetimeValue: js.UndefOr[String] = js.undefined
  var intValue: js.UndefOr[String] = js.undefined
  var msgValue: js.UndefOr[js.Array[js.Object]] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var stringValue: js.UndefOr[String] = js.undefined
}

object UsageReportParameters {
  @scala.inline
  def apply(
    boolValue: js.UndefOr[Boolean] = js.undefined,
    datetimeValue: String = null,
    intValue: String = null,
    msgValue: js.Array[js.Object] = null,
    name: String = null,
    stringValue: String = null
  ): UsageReportParameters = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(boolValue)) __obj.updateDynamic("boolValue")(boolValue.asInstanceOf[js.Any])
    if (datetimeValue != null) __obj.updateDynamic("datetimeValue")(datetimeValue.asInstanceOf[js.Any])
    if (intValue != null) __obj.updateDynamic("intValue")(intValue.asInstanceOf[js.Any])
    if (msgValue != null) __obj.updateDynamic("msgValue")(msgValue.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (stringValue != null) __obj.updateDynamic("stringValue")(stringValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsageReportParameters]
  }
}

