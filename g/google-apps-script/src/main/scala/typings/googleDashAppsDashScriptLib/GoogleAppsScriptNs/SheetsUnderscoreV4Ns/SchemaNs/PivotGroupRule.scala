package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SheetsUnderscoreV4Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PivotGroupRule extends js.Object {
  var dateTimeRule: js.UndefOr[DateTimeRule] = js.undefined
  var histogramRule: js.UndefOr[HistogramRule] = js.undefined
  var manualRule: js.UndefOr[ManualRule] = js.undefined
}

object PivotGroupRule {
  @scala.inline
  def apply(
    dateTimeRule: DateTimeRule = null,
    histogramRule: HistogramRule = null,
    manualRule: ManualRule = null
  ): PivotGroupRule = {
    val __obj = js.Dynamic.literal()
    if (dateTimeRule != null) __obj.updateDynamic("dateTimeRule")(dateTimeRule)
    if (histogramRule != null) __obj.updateDynamic("histogramRule")(histogramRule)
    if (manualRule != null) __obj.updateDynamic("manualRule")(manualRule)
    __obj.asInstanceOf[PivotGroupRule]
  }
}

