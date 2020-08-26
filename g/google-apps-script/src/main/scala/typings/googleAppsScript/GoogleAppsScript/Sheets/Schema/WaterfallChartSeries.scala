package typings.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WaterfallChartSeries extends js.Object {
  var customSubtotals: js.UndefOr[js.Array[WaterfallChartCustomSubtotal]] = js.native
  var data: js.UndefOr[ChartData] = js.native
  var hideTrailingSubtotal: js.UndefOr[Boolean] = js.native
  var negativeColumnsStyle: js.UndefOr[WaterfallChartColumnStyle] = js.native
  var positiveColumnsStyle: js.UndefOr[WaterfallChartColumnStyle] = js.native
  var subtotalColumnsStyle: js.UndefOr[WaterfallChartColumnStyle] = js.native
}

object WaterfallChartSeries {
  @scala.inline
  def apply(): WaterfallChartSeries = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WaterfallChartSeries]
  }
  @scala.inline
  implicit class WaterfallChartSeriesOps[Self <: WaterfallChartSeries] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCustomSubtotalsVarargs(value: WaterfallChartCustomSubtotal*): Self = this.set("customSubtotals", js.Array(value :_*))
    @scala.inline
    def setCustomSubtotals(value: js.Array[WaterfallChartCustomSubtotal]): Self = this.set("customSubtotals", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomSubtotals: Self = this.set("customSubtotals", js.undefined)
    @scala.inline
    def setData(value: ChartData): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setHideTrailingSubtotal(value: Boolean): Self = this.set("hideTrailingSubtotal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHideTrailingSubtotal: Self = this.set("hideTrailingSubtotal", js.undefined)
    @scala.inline
    def setNegativeColumnsStyle(value: WaterfallChartColumnStyle): Self = this.set("negativeColumnsStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNegativeColumnsStyle: Self = this.set("negativeColumnsStyle", js.undefined)
    @scala.inline
    def setPositiveColumnsStyle(value: WaterfallChartColumnStyle): Self = this.set("positiveColumnsStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePositiveColumnsStyle: Self = this.set("positiveColumnsStyle", js.undefined)
    @scala.inline
    def setSubtotalColumnsStyle(value: WaterfallChartColumnStyle): Self = this.set("subtotalColumnsStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubtotalColumnsStyle: Self = this.set("subtotalColumnsStyle", js.undefined)
  }
  
}

