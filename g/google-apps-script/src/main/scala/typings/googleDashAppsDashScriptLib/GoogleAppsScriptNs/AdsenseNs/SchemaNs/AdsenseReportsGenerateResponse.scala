package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdsenseNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdsenseReportsGenerateResponse extends js.Object {
  var averages: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var endDate: js.UndefOr[java.lang.String] = js.undefined
  var headers: js.UndefOr[js.Array[AdsenseReportsGenerateResponseHeaders]] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var rows: js.UndefOr[js.Array[js.Array[java.lang.String]]] = js.undefined
  var startDate: js.UndefOr[java.lang.String] = js.undefined
  var totalMatchedRows: js.UndefOr[java.lang.String] = js.undefined
  var totals: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var warnings: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object AdsenseReportsGenerateResponse {
  @scala.inline
  def apply(
    averages: js.Array[java.lang.String] = null,
    endDate: java.lang.String = null,
    headers: js.Array[AdsenseReportsGenerateResponseHeaders] = null,
    kind: java.lang.String = null,
    rows: js.Array[js.Array[java.lang.String]] = null,
    startDate: java.lang.String = null,
    totalMatchedRows: java.lang.String = null,
    totals: js.Array[java.lang.String] = null,
    warnings: js.Array[java.lang.String] = null
  ): AdsenseReportsGenerateResponse = {
    val __obj = js.Dynamic.literal()
    if (averages != null) __obj.updateDynamic("averages")(averages)
    if (endDate != null) __obj.updateDynamic("endDate")(endDate)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (rows != null) __obj.updateDynamic("rows")(rows)
    if (startDate != null) __obj.updateDynamic("startDate")(startDate)
    if (totalMatchedRows != null) __obj.updateDynamic("totalMatchedRows")(totalMatchedRows)
    if (totals != null) __obj.updateDynamic("totals")(totals)
    if (warnings != null) __obj.updateDynamic("warnings")(warnings)
    __obj.asInstanceOf[AdsenseReportsGenerateResponse]
  }
}

