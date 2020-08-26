package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.devextremeStrings.allArgumentPoints
import typings.devextreme.devextremeStrings.continuous
import typings.devextreme.devextremeStrings.datetime
import typings.devextreme.devextremeStrings.day
import typings.devextreme.devextremeStrings.discrete
import typings.devextreme.devextremeStrings.hour
import typings.devextreme.devextremeStrings.logarithmic
import typings.devextreme.devextremeStrings.millisecond
import typings.devextreme.devextremeStrings.minute
import typings.devextreme.devextremeStrings.month
import typings.devextreme.devextremeStrings.none
import typings.devextreme.devextremeStrings.numeric
import typings.devextreme.devextremeStrings.quarter
import typings.devextreme.devextremeStrings.second
import typings.devextreme.devextremeStrings.string_
import typings.devextreme.devextremeStrings.week
import typings.devextreme.devextremeStrings.year
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxPolarChartArgumentAxis extends dxPolarChartCommonAxisSettings {
  /** @name dxPolarChart.Options.argumentAxis.argumentType */
  var argumentType: js.UndefOr[datetime | numeric | string_] = js.native
  /** @name dxPolarChart.Options.argumentAxis.axisDivisionFactor */
  var axisDivisionFactor: js.UndefOr[Double] = js.native
  /** @name dxPolarChart.Options.argumentAxis.categories */
  var categories: js.UndefOr[js.Array[Double | String | Date]] = js.native
  /** @name dxPolarChart.Options.argumentAxis.constantLines */
  var constantLines: js.UndefOr[js.Array[dxPolarChartArgumentAxisConstantLines]] = js.native
  /** @name dxPolarChart.Options.argumentAxis.firstPointOnStartAngle */
  var firstPointOnStartAngle: js.UndefOr[Boolean] = js.native
  /** @name dxPolarChart.Options.argumentAxis.hoverMode */
  var hoverMode: js.UndefOr[allArgumentPoints | none] = js.native
  /** @name dxPolarChart.Options.argumentAxis.label */
  @JSName("label")
  var label_dxPolarChartArgumentAxis: js.UndefOr[dxPolarChartArgumentAxisLabel] = js.native
  /** @name dxPolarChart.Options.argumentAxis.linearThreshold */
  var linearThreshold: js.UndefOr[Double] = js.native
  /** @name dxPolarChart.Options.argumentAxis.logarithmBase */
  var logarithmBase: js.UndefOr[Double] = js.native
  /** @name dxPolarChart.Options.argumentAxis.minorTickCount */
  var minorTickCount: js.UndefOr[Double] = js.native
  /** @name dxPolarChart.Options.argumentAxis.minorTickInterval */
  var minorTickInterval: js.UndefOr[
    Double | js.Any | day | hour | millisecond | minute | month | quarter | second | week | year
  ] = js.native
  /** @name dxPolarChart.Options.argumentAxis.minorTick */
  @JSName("minorTick")
  var minorTick_dxPolarChartArgumentAxis: js.UndefOr[dxPolarChartArgumentAxisMinorTick] = js.native
  /** @name dxPolarChart.Options.argumentAxis.originValue */
  var originValue: js.UndefOr[Double] = js.native
  /** @name dxPolarChart.Options.argumentAxis.period */
  var period: js.UndefOr[Double] = js.native
  /** @name dxPolarChart.Options.argumentAxis.startAngle */
  var startAngle: js.UndefOr[Double] = js.native
  /** @name dxPolarChart.Options.argumentAxis.strips */
  var strips: js.UndefOr[js.Array[dxPolarChartArgumentAxisStrips]] = js.native
  /** @name dxPolarChart.Options.argumentAxis.tickInterval */
  var tickInterval: js.UndefOr[
    Double | js.Any | day | hour | millisecond | minute | month | quarter | second | week | year
  ] = js.native
  /** @name dxPolarChart.Options.argumentAxis.tick */
  @JSName("tick")
  var tick_dxPolarChartArgumentAxis: js.UndefOr[dxPolarChartArgumentAxisTick] = js.native
  /** @name dxPolarChart.Options.argumentAxis.type */
  var `type`: js.UndefOr[continuous | discrete | logarithmic] = js.native
}

object dxPolarChartArgumentAxis {
  @scala.inline
  def apply(): dxPolarChartArgumentAxis = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxPolarChartArgumentAxis]
  }
  @scala.inline
  implicit class dxPolarChartArgumentAxisOps[Self <: dxPolarChartArgumentAxis] (val x: Self) extends AnyVal {
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
    def setArgumentType(value: datetime | numeric | string_): Self = this.set("argumentType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArgumentType: Self = this.set("argumentType", js.undefined)
    @scala.inline
    def setAxisDivisionFactor(value: Double): Self = this.set("axisDivisionFactor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAxisDivisionFactor: Self = this.set("axisDivisionFactor", js.undefined)
    @scala.inline
    def setCategoriesVarargs(value: (Double | String | Date)*): Self = this.set("categories", js.Array(value :_*))
    @scala.inline
    def setCategories(value: js.Array[Double | String | Date]): Self = this.set("categories", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCategories: Self = this.set("categories", js.undefined)
    @scala.inline
    def setConstantLinesVarargs(value: dxPolarChartArgumentAxisConstantLines*): Self = this.set("constantLines", js.Array(value :_*))
    @scala.inline
    def setConstantLines(value: js.Array[dxPolarChartArgumentAxisConstantLines]): Self = this.set("constantLines", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConstantLines: Self = this.set("constantLines", js.undefined)
    @scala.inline
    def setFirstPointOnStartAngle(value: Boolean): Self = this.set("firstPointOnStartAngle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFirstPointOnStartAngle: Self = this.set("firstPointOnStartAngle", js.undefined)
    @scala.inline
    def setHoverMode(value: allArgumentPoints | none): Self = this.set("hoverMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHoverMode: Self = this.set("hoverMode", js.undefined)
    @scala.inline
    def setLabel(value: dxPolarChartArgumentAxisLabel): Self = this.set("label", value.asInstanceOf[js.Any])
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
    def setMinorTick(value: dxPolarChartArgumentAxisMinorTick): Self = this.set("minorTick", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinorTick: Self = this.set("minorTick", js.undefined)
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
    def setOriginValue(value: Double): Self = this.set("originValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOriginValue: Self = this.set("originValue", js.undefined)
    @scala.inline
    def setPeriod(value: Double): Self = this.set("period", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePeriod: Self = this.set("period", js.undefined)
    @scala.inline
    def setStartAngle(value: Double): Self = this.set("startAngle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartAngle: Self = this.set("startAngle", js.undefined)
    @scala.inline
    def setStripsVarargs(value: dxPolarChartArgumentAxisStrips*): Self = this.set("strips", js.Array(value :_*))
    @scala.inline
    def setStrips(value: js.Array[dxPolarChartArgumentAxisStrips]): Self = this.set("strips", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrips: Self = this.set("strips", js.undefined)
    @scala.inline
    def setTick(value: dxPolarChartArgumentAxisTick): Self = this.set("tick", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTick: Self = this.set("tick", js.undefined)
    @scala.inline
    def setTickInterval(
      value: Double | js.Any | day | hour | millisecond | minute | month | quarter | second | week | year
    ): Self = this.set("tickInterval", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTickInterval: Self = this.set("tickInterval", js.undefined)
    @scala.inline
    def setType(value: continuous | discrete | logarithmic): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

