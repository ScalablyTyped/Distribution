package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsreportingUnderscoreV4Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReportData extends js.Object {
  var dataLastRefreshed: js.UndefOr[java.lang.String] = js.undefined
  var isDataGolden: js.UndefOr[scala.Boolean] = js.undefined
  var maximums: js.UndefOr[js.Array[DateRangeValues]] = js.undefined
  var minimums: js.UndefOr[js.Array[DateRangeValues]] = js.undefined
  var rowCount: js.UndefOr[scala.Double] = js.undefined
  var rows: js.UndefOr[js.Array[ReportRow]] = js.undefined
  var samplesReadCounts: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var samplingSpaceSizes: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var totals: js.UndefOr[js.Array[DateRangeValues]] = js.undefined
}

object ReportData {
  @scala.inline
  def apply(
    dataLastRefreshed: java.lang.String = null,
    isDataGolden: js.UndefOr[scala.Boolean] = js.undefined,
    maximums: js.Array[DateRangeValues] = null,
    minimums: js.Array[DateRangeValues] = null,
    rowCount: scala.Int | scala.Double = null,
    rows: js.Array[ReportRow] = null,
    samplesReadCounts: js.Array[java.lang.String] = null,
    samplingSpaceSizes: js.Array[java.lang.String] = null,
    totals: js.Array[DateRangeValues] = null
  ): ReportData = {
    val __obj = js.Dynamic.literal()
    if (dataLastRefreshed != null) __obj.updateDynamic("dataLastRefreshed")(dataLastRefreshed)
    if (!js.isUndefined(isDataGolden)) __obj.updateDynamic("isDataGolden")(isDataGolden)
    if (maximums != null) __obj.updateDynamic("maximums")(maximums)
    if (minimums != null) __obj.updateDynamic("minimums")(minimums)
    if (rowCount != null) __obj.updateDynamic("rowCount")(rowCount.asInstanceOf[js.Any])
    if (rows != null) __obj.updateDynamic("rows")(rows)
    if (samplesReadCounts != null) __obj.updateDynamic("samplesReadCounts")(samplesReadCounts)
    if (samplingSpaceSizes != null) __obj.updateDynamic("samplingSpaceSizes")(samplingSpaceSizes)
    if (totals != null) __obj.updateDynamic("totals")(totals)
    __obj.asInstanceOf[ReportData]
  }
}

