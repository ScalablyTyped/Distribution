package typings.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BasicChartSeries extends js.Object {
  var color: js.UndefOr[Color] = js.native
  var lineStyle: js.UndefOr[LineStyle] = js.native
  var series: js.UndefOr[ChartData] = js.native
  var targetAxis: js.UndefOr[String] = js.native
  var `type`: js.UndefOr[String] = js.native
}

object BasicChartSeries {
  @scala.inline
  def apply(): BasicChartSeries = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BasicChartSeries]
  }
  @scala.inline
  implicit class BasicChartSeriesOps[Self <: BasicChartSeries] (val x: Self) extends AnyVal {
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
    def setColor(value: Color): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setLineStyle(value: LineStyle): Self = this.set("lineStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLineStyle: Self = this.set("lineStyle", js.undefined)
    @scala.inline
    def setSeries(value: ChartData): Self = this.set("series", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSeries: Self = this.set("series", js.undefined)
    @scala.inline
    def setTargetAxis(value: String): Self = this.set("targetAxis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetAxis: Self = this.set("targetAxis", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

