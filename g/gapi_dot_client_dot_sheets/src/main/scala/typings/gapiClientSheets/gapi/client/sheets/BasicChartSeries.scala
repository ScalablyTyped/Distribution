package typings.gapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BasicChartSeries extends js.Object {
  /**
    * The color for elements (such as bars, lines, and points) associated with
    * this series.  If empty, a default color is used.
    */
  var color: js.UndefOr[Color] = js.native
  /**
    * The color for elements (such as bars, lines, and points) associated with
    * this series.  If empty, a default color is used.
    * If color is also set, this field takes precedence.
    */
  var colorStyle: js.UndefOr[ColorStyle] = js.native
  /**
    * The line style of this series. Valid only if the
    * chartType is AREA,
    * LINE, or SCATTER.
    * COMBO charts are also supported if the
    * series chart type is
    * AREA or LINE.
    */
  var lineStyle: js.UndefOr[LineStyle] = js.native
  /** The data being visualized in this chart series. */
  var series: js.UndefOr[ChartData] = js.native
  /**
    * The minor axis that will specify the range of values for this series.
    * For example, if charting stocks over time, the "Volume" series
    * may want to be pinned to the right with the prices pinned to the left,
    * because the scale of trading volume is different than the scale of
    * prices.
    * It is an error to specify an axis that isn't a valid minor axis
    * for the chart's type.
    */
  var targetAxis: js.UndefOr[String] = js.native
  /**
    * The type of this series. Valid only if the
    * chartType is
    * COMBO.
    * Different types will change the way the series is visualized.
    * Only LINE, AREA,
    * and COLUMN are supported.
    */
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
    def setColorStyle(value: ColorStyle): Self = this.set("colorStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColorStyle: Self = this.set("colorStyle", js.undefined)
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

