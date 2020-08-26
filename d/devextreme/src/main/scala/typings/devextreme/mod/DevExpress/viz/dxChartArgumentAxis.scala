package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.devextremeStrings.allArgumentPoints
import typings.devextreme.devextremeStrings.auto
import typings.devextreme.devextremeStrings.bottom
import typings.devextreme.devextremeStrings.continuous
import typings.devextreme.devextremeStrings.datetime
import typings.devextreme.devextremeStrings.day
import typings.devextreme.devextremeStrings.discrete
import typings.devextreme.devextremeStrings.hour
import typings.devextreme.devextremeStrings.keep
import typings.devextreme.devextremeStrings.left
import typings.devextreme.devextremeStrings.logarithmic
import typings.devextreme.devextremeStrings.millisecond
import typings.devextreme.devextremeStrings.minute
import typings.devextreme.devextremeStrings.month
import typings.devextreme.devextremeStrings.none
import typings.devextreme.devextremeStrings.numeric
import typings.devextreme.devextremeStrings.quarter
import typings.devextreme.devextremeStrings.reset
import typings.devextreme.devextremeStrings.right
import typings.devextreme.devextremeStrings.second
import typings.devextreme.devextremeStrings.shift
import typings.devextreme.devextremeStrings.string_
import typings.devextreme.devextremeStrings.top
import typings.devextreme.devextremeStrings.week
import typings.devextreme.devextremeStrings.year
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxChartArgumentAxis extends dxChartCommonAxisSettings {
  /** @name dxChart.Options.argumentAxis.aggregateByCategory */
  var aggregateByCategory: js.UndefOr[Boolean] = js.native
  /** @name dxChart.Options.argumentAxis.aggregationGroupWidth */
  var aggregationGroupWidth: js.UndefOr[Double] = js.native
  /** @name dxChart.Options.argumentAxis.aggregationInterval */
  var aggregationInterval: js.UndefOr[
    Double | js.Any | day | hour | millisecond | minute | month | quarter | second | week | year
  ] = js.native
  /** @name dxChart.Options.argumentAxis.argumentType */
  var argumentType: js.UndefOr[datetime | numeric | string_] = js.native
  /** @name dxChart.Options.argumentAxis.axisDivisionFactor */
  var axisDivisionFactor: js.UndefOr[Double] = js.native
  /** @name dxChart.Options.argumentAxis.breaks */
  var breaks: js.UndefOr[js.Array[ScaleBreak]] = js.native
  /** @name dxChart.Options.argumentAxis.categories */
  var categories: js.UndefOr[js.Array[Double | String | Date]] = js.native
  /** @name dxChart.Options.argumentAxis.constantLineStyle */
  @JSName("constantLineStyle")
  var constantLineStyle_dxChartArgumentAxis: js.UndefOr[dxChartArgumentAxisConstantLineStyle] = js.native
  /** @name dxChart.Options.argumentAxis.constantLines */
  var constantLines: js.UndefOr[js.Array[dxChartArgumentAxisConstantLines]] = js.native
  /** @name dxChart.Options.argumentAxis.customPosition */
  var customPosition: js.UndefOr[Double | Date | String] = js.native
  /** @name dxChart.Options.argumentAxis.customPositionAxis */
  var customPositionAxis: js.UndefOr[String] = js.native
  /** @name dxChart.Options.argumentAxis.holidays */
  var holidays: js.UndefOr[js.Array[Date | Double | String]] = js.native
  /** @name dxChart.Options.argumentAxis.hoverMode */
  var hoverMode: js.UndefOr[allArgumentPoints | none] = js.native
  /** @name dxChart.Options.argumentAxis.label */
  @JSName("label")
  var label_dxChartArgumentAxis: js.UndefOr[dxChartArgumentAxisLabel] = js.native
  /** @name dxChart.Options.argumentAxis.linearThreshold */
  var linearThreshold: js.UndefOr[Double] = js.native
  /** @name dxChart.Options.argumentAxis.logarithmBase */
  var logarithmBase: js.UndefOr[Double] = js.native
  /** @deprecated */
  /** @name dxChart.Options.argumentAxis.max */
  var max: js.UndefOr[Double | Date | String] = js.native
  /** @deprecated */
  /** @name dxChart.Options.argumentAxis.min */
  var min: js.UndefOr[Double | Date | String] = js.native
  /** @name dxChart.Options.argumentAxis.minVisualRangeLength */
  var minVisualRangeLength: js.UndefOr[
    Double | js.Any | day | hour | millisecond | minute | month | quarter | second | week | year
  ] = js.native
  /** @name dxChart.Options.argumentAxis.minorTickCount */
  var minorTickCount: js.UndefOr[Double] = js.native
  /** @name dxChart.Options.argumentAxis.minorTickInterval */
  var minorTickInterval: js.UndefOr[
    Double | js.Any | day | hour | millisecond | minute | month | quarter | second | week | year
  ] = js.native
  /** @name dxChart.Options.argumentAxis.offset */
  var offset: js.UndefOr[Double] = js.native
  /** @name dxChart.Options.argumentAxis.position */
  var position: js.UndefOr[bottom | left | right | top] = js.native
  /** @name dxChart.Options.argumentAxis.singleWorkdays */
  var singleWorkdays: js.UndefOr[js.Array[Date | Double | String]] = js.native
  /** @name dxChart.Options.argumentAxis.strips */
  var strips: js.UndefOr[js.Array[dxChartArgumentAxisStrips]] = js.native
  /** @name dxChart.Options.argumentAxis.tickInterval */
  var tickInterval: js.UndefOr[
    Double | js.Any | day | hour | millisecond | minute | month | quarter | second | week | year
  ] = js.native
  /** @name dxChart.Options.argumentAxis.title */
  @JSName("title")
  var title_dxChartArgumentAxis: js.UndefOr[dxChartArgumentAxisTitle] = js.native
  /** @name dxChart.Options.argumentAxis.type */
  var `type`: js.UndefOr[continuous | discrete | logarithmic] = js.native
  /** @name dxChart.Options.argumentAxis.visualRange */
  var visualRange: js.UndefOr[VizRange | (js.Array[Double | String | Date])] = js.native
  /** @name dxChart.Options.argumentAxis.visualRangeUpdateMode */
  var visualRangeUpdateMode: js.UndefOr[auto | keep | reset | shift] = js.native
  /** @name dxChart.Options.argumentAxis.wholeRange */
  var wholeRange: js.UndefOr[VizRange | (js.Array[Double | String | Date])] = js.native
  /** @name dxChart.Options.argumentAxis.workWeek */
  var workWeek: js.UndefOr[js.Array[Double]] = js.native
  /** @name dxChart.Options.argumentAxis.workdaysOnly */
  var workdaysOnly: js.UndefOr[Boolean] = js.native
}

object dxChartArgumentAxis {
  @scala.inline
  def apply(): dxChartArgumentAxis = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxChartArgumentAxis]
  }
  @scala.inline
  implicit class dxChartArgumentAxisOps[Self <: dxChartArgumentAxis] (val x: Self) extends AnyVal {
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
    def setAggregateByCategory(value: Boolean): Self = this.set("aggregateByCategory", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAggregateByCategory: Self = this.set("aggregateByCategory", js.undefined)
    @scala.inline
    def setAggregationGroupWidth(value: Double): Self = this.set("aggregationGroupWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAggregationGroupWidth: Self = this.set("aggregationGroupWidth", js.undefined)
    @scala.inline
    def setAggregationInterval(
      value: Double | js.Any | day | hour | millisecond | minute | month | quarter | second | week | year
    ): Self = this.set("aggregationInterval", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAggregationInterval: Self = this.set("aggregationInterval", js.undefined)
    @scala.inline
    def setArgumentType(value: datetime | numeric | string_): Self = this.set("argumentType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArgumentType: Self = this.set("argumentType", js.undefined)
    @scala.inline
    def setAxisDivisionFactor(value: Double): Self = this.set("axisDivisionFactor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAxisDivisionFactor: Self = this.set("axisDivisionFactor", js.undefined)
    @scala.inline
    def setBreaksVarargs(value: ScaleBreak*): Self = this.set("breaks", js.Array(value :_*))
    @scala.inline
    def setBreaks(value: js.Array[ScaleBreak]): Self = this.set("breaks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBreaks: Self = this.set("breaks", js.undefined)
    @scala.inline
    def setCategoriesVarargs(value: (Double | String | Date)*): Self = this.set("categories", js.Array(value :_*))
    @scala.inline
    def setCategories(value: js.Array[Double | String | Date]): Self = this.set("categories", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCategories: Self = this.set("categories", js.undefined)
    @scala.inline
    def setConstantLineStyle(value: dxChartArgumentAxisConstantLineStyle): Self = this.set("constantLineStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConstantLineStyle: Self = this.set("constantLineStyle", js.undefined)
    @scala.inline
    def setConstantLinesVarargs(value: dxChartArgumentAxisConstantLines*): Self = this.set("constantLines", js.Array(value :_*))
    @scala.inline
    def setConstantLines(value: js.Array[dxChartArgumentAxisConstantLines]): Self = this.set("constantLines", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConstantLines: Self = this.set("constantLines", js.undefined)
    @scala.inline
    def setCustomPosition(value: Double | Date | String): Self = this.set("customPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomPosition: Self = this.set("customPosition", js.undefined)
    @scala.inline
    def setCustomPositionAxis(value: String): Self = this.set("customPositionAxis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomPositionAxis: Self = this.set("customPositionAxis", js.undefined)
    @scala.inline
    def setHolidaysVarargs(value: (Date | Double | String)*): Self = this.set("holidays", js.Array(value :_*))
    @scala.inline
    def setHolidays(value: js.Array[Date | Double | String]): Self = this.set("holidays", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHolidays: Self = this.set("holidays", js.undefined)
    @scala.inline
    def setHoverMode(value: allArgumentPoints | none): Self = this.set("hoverMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHoverMode: Self = this.set("hoverMode", js.undefined)
    @scala.inline
    def setLabel(value: dxChartArgumentAxisLabel): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setLinearThreshold(value: Double): Self = this.set("linearThreshold", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLinearThreshold: Self = this.set("linearThreshold", js.undefined)
    @scala.inline
    def setLogarithmBase(value: Double): Self = this.set("logarithmBase", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogarithmBase: Self = this.set("logarithmBase", js.undefined)
    @scala.inline
    def setMax(value: Double | Date | String): Self = this.set("max", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    @scala.inline
    def setMin(value: Double | Date | String): Self = this.set("min", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
    @scala.inline
    def setMinVisualRangeLength(
      value: Double | js.Any | day | hour | millisecond | minute | month | quarter | second | week | year
    ): Self = this.set("minVisualRangeLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinVisualRangeLength: Self = this.set("minVisualRangeLength", js.undefined)
    @scala.inline
    def setMinorTickCount(value: Double): Self = this.set("minorTickCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinorTickCount: Self = this.set("minorTickCount", js.undefined)
    @scala.inline
    def setMinorTickInterval(
      value: Double | js.Any | day | hour | millisecond | minute | month | quarter | second | week | year
    ): Self = this.set("minorTickInterval", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinorTickInterval: Self = this.set("minorTickInterval", js.undefined)
    @scala.inline
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    @scala.inline
    def setPosition(value: bottom | left | right | top): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    @scala.inline
    def setSingleWorkdaysVarargs(value: (Date | Double | String)*): Self = this.set("singleWorkdays", js.Array(value :_*))
    @scala.inline
    def setSingleWorkdays(value: js.Array[Date | Double | String]): Self = this.set("singleWorkdays", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSingleWorkdays: Self = this.set("singleWorkdays", js.undefined)
    @scala.inline
    def setStripsVarargs(value: dxChartArgumentAxisStrips*): Self = this.set("strips", js.Array(value :_*))
    @scala.inline
    def setStrips(value: js.Array[dxChartArgumentAxisStrips]): Self = this.set("strips", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrips: Self = this.set("strips", js.undefined)
    @scala.inline
    def setTickInterval(
      value: Double | js.Any | day | hour | millisecond | minute | month | quarter | second | week | year
    ): Self = this.set("tickInterval", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTickInterval: Self = this.set("tickInterval", js.undefined)
    @scala.inline
    def setTitle(value: dxChartArgumentAxisTitle): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setType(value: continuous | discrete | logarithmic): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setVisualRangeVarargs(value: (Double | String | Date)*): Self = this.set("visualRange", js.Array(value :_*))
    @scala.inline
    def setVisualRange(value: VizRange | (js.Array[Double | String | Date])): Self = this.set("visualRange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisualRange: Self = this.set("visualRange", js.undefined)
    @scala.inline
    def setVisualRangeUpdateMode(value: auto | keep | reset | shift): Self = this.set("visualRangeUpdateMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisualRangeUpdateMode: Self = this.set("visualRangeUpdateMode", js.undefined)
    @scala.inline
    def setWholeRangeVarargs(value: (Double | String | Date)*): Self = this.set("wholeRange", js.Array(value :_*))
    @scala.inline
    def setWholeRange(value: VizRange | (js.Array[Double | String | Date])): Self = this.set("wholeRange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWholeRange: Self = this.set("wholeRange", js.undefined)
    @scala.inline
    def setWorkWeekVarargs(value: Double*): Self = this.set("workWeek", js.Array(value :_*))
    @scala.inline
    def setWorkWeek(value: js.Array[Double]): Self = this.set("workWeek", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWorkWeek: Self = this.set("workWeek", js.undefined)
    @scala.inline
    def setWorkdaysOnly(value: Boolean): Self = this.set("workdaysOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWorkdaysOnly: Self = this.set("workdaysOnly", js.undefined)
  }
  
}

