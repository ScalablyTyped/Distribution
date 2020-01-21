package typings.googleAppsScript.GoogleAppsScript.Adsense.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdsenseReportsGenerateResponse extends js.Object {
  var averages: js.UndefOr[js.Array[String]] = js.undefined
  var endDate: js.UndefOr[String] = js.undefined
  var headers: js.UndefOr[js.Array[AdsenseReportsGenerateResponseHeaders]] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var rows: js.UndefOr[js.Array[js.Array[String]]] = js.undefined
  var startDate: js.UndefOr[String] = js.undefined
  var totalMatchedRows: js.UndefOr[String] = js.undefined
  var totals: js.UndefOr[js.Array[String]] = js.undefined
  var warnings: js.UndefOr[js.Array[String]] = js.undefined
}

object AdsenseReportsGenerateResponse {
  @scala.inline
  def apply(
    averages: js.Array[String] = null,
    endDate: String = null,
    headers: js.Array[AdsenseReportsGenerateResponseHeaders] = null,
    kind: String = null,
    rows: js.Array[js.Array[String]] = null,
    startDate: String = null,
    totalMatchedRows: String = null,
    totals: js.Array[String] = null,
    warnings: js.Array[String] = null
  ): AdsenseReportsGenerateResponse = {
    val __obj = js.Dynamic.literal()
    if (averages != null) __obj.updateDynamic("averages")(averages.asInstanceOf[js.Any])
    if (endDate != null) __obj.updateDynamic("endDate")(endDate.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    if (startDate != null) __obj.updateDynamic("startDate")(startDate.asInstanceOf[js.Any])
    if (totalMatchedRows != null) __obj.updateDynamic("totalMatchedRows")(totalMatchedRows.asInstanceOf[js.Any])
    if (totals != null) __obj.updateDynamic("totals")(totals.asInstanceOf[js.Any])
    if (warnings != null) __obj.updateDynamic("warnings")(warnings.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdsenseReportsGenerateResponse]
  }
}

