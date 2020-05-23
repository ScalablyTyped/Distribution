package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.anon.ColorOpacity
import typings.devextreme.devextremeStrings.allArgumentPoints
import typings.devextreme.devextremeStrings.betweenLabels
import typings.devextreme.devextremeStrings.continuous
import typings.devextreme.devextremeStrings.crossLabels
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

trait dxPolarChartArgumentAxis extends dxPolarChartCommonAxisSettings {
  /** @name dxPolarChart.Options.argumentAxis.argumentType */
  var argumentType: js.UndefOr[datetime | numeric | string_] = js.undefined
  /** @name dxPolarChart.Options.argumentAxis.axisDivisionFactor */
  var axisDivisionFactor: js.UndefOr[Double] = js.undefined
  /** @name dxPolarChart.Options.argumentAxis.categories */
  var categories: js.UndefOr[js.Array[Double | String | Date]] = js.undefined
  /** @name dxPolarChart.Options.argumentAxis.constantLines */
  var constantLines: js.UndefOr[js.Array[dxPolarChartArgumentAxisConstantLines]] = js.undefined
  /** @name dxPolarChart.Options.argumentAxis.firstPointOnStartAngle */
  var firstPointOnStartAngle: js.UndefOr[Boolean] = js.undefined
  /** @name dxPolarChart.Options.argumentAxis.hoverMode */
  var hoverMode: js.UndefOr[allArgumentPoints | none] = js.undefined
  /** @name dxPolarChart.Options.argumentAxis.label */
  @JSName("label")
  var label_dxPolarChartArgumentAxis: js.UndefOr[dxPolarChartArgumentAxisLabel] = js.undefined
  /** @name dxPolarChart.Options.argumentAxis.linearThreshold */
  var linearThreshold: js.UndefOr[Double] = js.undefined
  /** @name dxPolarChart.Options.argumentAxis.logarithmBase */
  var logarithmBase: js.UndefOr[Double] = js.undefined
  /** @name dxPolarChart.Options.argumentAxis.minorTickCount */
  var minorTickCount: js.UndefOr[Double] = js.undefined
  /** @name dxPolarChart.Options.argumentAxis.minorTickInterval */
  var minorTickInterval: js.UndefOr[
    Double | js.Any | day | hour | millisecond | minute | month | quarter | second | week | year
  ] = js.undefined
  /** @name dxPolarChart.Options.argumentAxis.minorTick */
  @JSName("minorTick")
  var minorTick_dxPolarChartArgumentAxis: js.UndefOr[dxPolarChartArgumentAxisMinorTick] = js.undefined
  /** @name dxPolarChart.Options.argumentAxis.originValue */
  var originValue: js.UndefOr[Double] = js.undefined
  /** @name dxPolarChart.Options.argumentAxis.period */
  var period: js.UndefOr[Double] = js.undefined
  /** @name dxPolarChart.Options.argumentAxis.startAngle */
  var startAngle: js.UndefOr[Double] = js.undefined
  /** @name dxPolarChart.Options.argumentAxis.strips */
  var strips: js.UndefOr[js.Array[dxPolarChartArgumentAxisStrips]] = js.undefined
  /** @name dxPolarChart.Options.argumentAxis.tickInterval */
  var tickInterval: js.UndefOr[
    Double | js.Any | day | hour | millisecond | minute | month | quarter | second | week | year
  ] = js.undefined
  /** @name dxPolarChart.Options.argumentAxis.tick */
  @JSName("tick")
  var tick_dxPolarChartArgumentAxis: js.UndefOr[dxPolarChartArgumentAxisTick] = js.undefined
  /** @name dxPolarChart.Options.argumentAxis.type */
  var `type`: js.UndefOr[continuous | discrete | logarithmic] = js.undefined
}

object dxPolarChartArgumentAxis {
  @scala.inline
  def apply(
    allowDecimals: js.UndefOr[Boolean] = js.undefined,
    argumentType: datetime | numeric | string_ = null,
    axisDivisionFactor: js.UndefOr[Double] = js.undefined,
    categories: js.Array[Double | String | Date] = null,
    color: String = null,
    constantLineStyle: dxPolarChartCommonAxisSettingsConstantLineStyle = null,
    constantLines: js.Array[dxPolarChartArgumentAxisConstantLines] = null,
    discreteAxisDivisionMode: betweenLabels | crossLabels = null,
    endOnTick: js.UndefOr[Boolean] = js.undefined,
    firstPointOnStartAngle: js.UndefOr[Boolean] = js.undefined,
    grid: ColorOpacity = null,
    hoverMode: allArgumentPoints | none = null,
    inverted: js.UndefOr[Boolean] = js.undefined,
    label: dxPolarChartArgumentAxisLabel = null,
    linearThreshold: js.UndefOr[Double] = js.undefined,
    logarithmBase: js.UndefOr[Double] = js.undefined,
    minorGrid: ColorOpacity = null,
    minorTick: dxPolarChartArgumentAxisMinorTick = null,
    minorTickCount: js.UndefOr[Double] = js.undefined,
    minorTickInterval: Double | js.Any | day | hour | millisecond | minute | month | quarter | second | week | year = null,
    opacity: js.UndefOr[Double] = js.undefined,
    originValue: js.UndefOr[Double] = js.undefined,
    period: js.UndefOr[Double] = js.undefined,
    startAngle: js.UndefOr[Double] = js.undefined,
    stripStyle: dxPolarChartCommonAxisSettingsStripStyle = null,
    strips: js.Array[dxPolarChartArgumentAxisStrips] = null,
    tick: dxPolarChartArgumentAxisTick = null,
    tickInterval: Double | js.Any | day | hour | millisecond | minute | month | quarter | second | week | year = null,
    `type`: continuous | discrete | logarithmic = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    width: js.UndefOr[Double] = js.undefined
  ): dxPolarChartArgumentAxis = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowDecimals)) __obj.updateDynamic("allowDecimals")(allowDecimals.get.asInstanceOf[js.Any])
    if (argumentType != null) __obj.updateDynamic("argumentType")(argumentType.asInstanceOf[js.Any])
    if (!js.isUndefined(axisDivisionFactor)) __obj.updateDynamic("axisDivisionFactor")(axisDivisionFactor.get.asInstanceOf[js.Any])
    if (categories != null) __obj.updateDynamic("categories")(categories.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (constantLineStyle != null) __obj.updateDynamic("constantLineStyle")(constantLineStyle.asInstanceOf[js.Any])
    if (constantLines != null) __obj.updateDynamic("constantLines")(constantLines.asInstanceOf[js.Any])
    if (discreteAxisDivisionMode != null) __obj.updateDynamic("discreteAxisDivisionMode")(discreteAxisDivisionMode.asInstanceOf[js.Any])
    if (!js.isUndefined(endOnTick)) __obj.updateDynamic("endOnTick")(endOnTick.get.asInstanceOf[js.Any])
    if (!js.isUndefined(firstPointOnStartAngle)) __obj.updateDynamic("firstPointOnStartAngle")(firstPointOnStartAngle.get.asInstanceOf[js.Any])
    if (grid != null) __obj.updateDynamic("grid")(grid.asInstanceOf[js.Any])
    if (hoverMode != null) __obj.updateDynamic("hoverMode")(hoverMode.asInstanceOf[js.Any])
    if (!js.isUndefined(inverted)) __obj.updateDynamic("inverted")(inverted.get.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (!js.isUndefined(linearThreshold)) __obj.updateDynamic("linearThreshold")(linearThreshold.get.asInstanceOf[js.Any])
    if (!js.isUndefined(logarithmBase)) __obj.updateDynamic("logarithmBase")(logarithmBase.get.asInstanceOf[js.Any])
    if (minorGrid != null) __obj.updateDynamic("minorGrid")(minorGrid.asInstanceOf[js.Any])
    if (minorTick != null) __obj.updateDynamic("minorTick")(minorTick.asInstanceOf[js.Any])
    if (!js.isUndefined(minorTickCount)) __obj.updateDynamic("minorTickCount")(minorTickCount.get.asInstanceOf[js.Any])
    if (minorTickInterval != null) __obj.updateDynamic("minorTickInterval")(minorTickInterval.asInstanceOf[js.Any])
    if (!js.isUndefined(opacity)) __obj.updateDynamic("opacity")(opacity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(originValue)) __obj.updateDynamic("originValue")(originValue.get.asInstanceOf[js.Any])
    if (!js.isUndefined(period)) __obj.updateDynamic("period")(period.get.asInstanceOf[js.Any])
    if (!js.isUndefined(startAngle)) __obj.updateDynamic("startAngle")(startAngle.get.asInstanceOf[js.Any])
    if (stripStyle != null) __obj.updateDynamic("stripStyle")(stripStyle.asInstanceOf[js.Any])
    if (strips != null) __obj.updateDynamic("strips")(strips.asInstanceOf[js.Any])
    if (tick != null) __obj.updateDynamic("tick")(tick.asInstanceOf[js.Any])
    if (tickInterval != null) __obj.updateDynamic("tickInterval")(tickInterval.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxPolarChartArgumentAxis]
  }
}

