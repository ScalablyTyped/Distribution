package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminReportsNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UsageReportParameters extends js.Object {
  var boolValue: js.UndefOr[scala.Boolean] = js.undefined
  var datetimeValue: js.UndefOr[java.lang.String] = js.undefined
  var intValue: js.UndefOr[java.lang.String] = js.undefined
  var msgValue: js.UndefOr[js.Array[js.Object]] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var stringValue: js.UndefOr[java.lang.String] = js.undefined
}

object UsageReportParameters {
  @scala.inline
  def apply(
    boolValue: js.UndefOr[scala.Boolean] = js.undefined,
    datetimeValue: java.lang.String = null,
    intValue: java.lang.String = null,
    msgValue: js.Array[js.Object] = null,
    name: java.lang.String = null,
    stringValue: java.lang.String = null
  ): UsageReportParameters = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(boolValue)) __obj.updateDynamic("boolValue")(boolValue)
    if (datetimeValue != null) __obj.updateDynamic("datetimeValue")(datetimeValue)
    if (intValue != null) __obj.updateDynamic("intValue")(intValue)
    if (msgValue != null) __obj.updateDynamic("msgValue")(msgValue)
    if (name != null) __obj.updateDynamic("name")(name)
    if (stringValue != null) __obj.updateDynamic("stringValue")(stringValue)
    __obj.asInstanceOf[UsageReportParameters]
  }
}

