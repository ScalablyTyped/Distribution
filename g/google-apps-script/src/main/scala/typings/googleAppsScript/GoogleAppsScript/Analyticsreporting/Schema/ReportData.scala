package typings.googleAppsScript.GoogleAppsScript.Analyticsreporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReportData extends js.Object {
  var dataLastRefreshed: js.UndefOr[String] = js.undefined
  var isDataGolden: js.UndefOr[Boolean] = js.undefined
  var maximums: js.UndefOr[js.Array[DateRangeValues]] = js.undefined
  var minimums: js.UndefOr[js.Array[DateRangeValues]] = js.undefined
  var rowCount: js.UndefOr[Double] = js.undefined
  var rows: js.UndefOr[js.Array[ReportRow]] = js.undefined
  var samplesReadCounts: js.UndefOr[js.Array[String]] = js.undefined
  var samplingSpaceSizes: js.UndefOr[js.Array[String]] = js.undefined
  var totals: js.UndefOr[js.Array[DateRangeValues]] = js.undefined
}

object ReportData {
  @scala.inline
  def apply(
    dataLastRefreshed: String = null,
    isDataGolden: js.UndefOr[Boolean] = js.undefined,
    maximums: js.Array[DateRangeValues] = null,
    minimums: js.Array[DateRangeValues] = null,
    rowCount: js.UndefOr[Double] = js.undefined,
    rows: js.Array[ReportRow] = null,
    samplesReadCounts: js.Array[String] = null,
    samplingSpaceSizes: js.Array[String] = null,
    totals: js.Array[DateRangeValues] = null
  ): ReportData = {
    val __obj = js.Dynamic.literal()
    if (dataLastRefreshed != null) __obj.updateDynamic("dataLastRefreshed")(dataLastRefreshed.asInstanceOf[js.Any])
    if (!js.isUndefined(isDataGolden)) __obj.updateDynamic("isDataGolden")(isDataGolden.get.asInstanceOf[js.Any])
    if (maximums != null) __obj.updateDynamic("maximums")(maximums.asInstanceOf[js.Any])
    if (minimums != null) __obj.updateDynamic("minimums")(minimums.asInstanceOf[js.Any])
    if (!js.isUndefined(rowCount)) __obj.updateDynamic("rowCount")(rowCount.get.asInstanceOf[js.Any])
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    if (samplesReadCounts != null) __obj.updateDynamic("samplesReadCounts")(samplesReadCounts.asInstanceOf[js.Any])
    if (samplingSpaceSizes != null) __obj.updateDynamic("samplingSpaceSizes")(samplingSpaceSizes.asInstanceOf[js.Any])
    if (totals != null) __obj.updateDynamic("totals")(totals.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReportData]
  }
}

