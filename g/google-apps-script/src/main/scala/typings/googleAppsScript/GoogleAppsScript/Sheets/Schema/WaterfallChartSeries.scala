package typings.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WaterfallChartSeries extends js.Object {
  var customSubtotals: js.UndefOr[js.Array[WaterfallChartCustomSubtotal]] = js.undefined
  var data: js.UndefOr[ChartData] = js.undefined
  var hideTrailingSubtotal: js.UndefOr[Boolean] = js.undefined
  var negativeColumnsStyle: js.UndefOr[WaterfallChartColumnStyle] = js.undefined
  var positiveColumnsStyle: js.UndefOr[WaterfallChartColumnStyle] = js.undefined
  var subtotalColumnsStyle: js.UndefOr[WaterfallChartColumnStyle] = js.undefined
}

object WaterfallChartSeries {
  @scala.inline
  def apply(
    customSubtotals: js.Array[WaterfallChartCustomSubtotal] = null,
    data: ChartData = null,
    hideTrailingSubtotal: js.UndefOr[Boolean] = js.undefined,
    negativeColumnsStyle: WaterfallChartColumnStyle = null,
    positiveColumnsStyle: WaterfallChartColumnStyle = null,
    subtotalColumnsStyle: WaterfallChartColumnStyle = null
  ): WaterfallChartSeries = {
    val __obj = js.Dynamic.literal()
    if (customSubtotals != null) __obj.updateDynamic("customSubtotals")(customSubtotals.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (!js.isUndefined(hideTrailingSubtotal)) __obj.updateDynamic("hideTrailingSubtotal")(hideTrailingSubtotal.get.asInstanceOf[js.Any])
    if (negativeColumnsStyle != null) __obj.updateDynamic("negativeColumnsStyle")(negativeColumnsStyle.asInstanceOf[js.Any])
    if (positiveColumnsStyle != null) __obj.updateDynamic("positiveColumnsStyle")(positiveColumnsStyle.asInstanceOf[js.Any])
    if (subtotalColumnsStyle != null) __obj.updateDynamic("subtotalColumnsStyle")(subtotalColumnsStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[WaterfallChartSeries]
  }
}

