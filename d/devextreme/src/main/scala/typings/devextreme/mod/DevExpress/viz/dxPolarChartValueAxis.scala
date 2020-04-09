package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.AnonColorOpacity
import typings.devextreme.devextremeStrings.auto
import typings.devextreme.devextremeStrings.betweenLabels
import typings.devextreme.devextremeStrings.continuous
import typings.devextreme.devextremeStrings.crossLabels
import typings.devextreme.devextremeStrings.datetime
import typings.devextreme.devextremeStrings.day
import typings.devextreme.devextremeStrings.discrete
import typings.devextreme.devextremeStrings.hour
import typings.devextreme.devextremeStrings.keep
import typings.devextreme.devextremeStrings.logarithmic
import typings.devextreme.devextremeStrings.millisecond
import typings.devextreme.devextremeStrings.minute
import typings.devextreme.devextremeStrings.month
import typings.devextreme.devextremeStrings.numeric
import typings.devextreme.devextremeStrings.quarter
import typings.devextreme.devextremeStrings.reset
import typings.devextreme.devextremeStrings.second
import typings.devextreme.devextremeStrings.string_
import typings.devextreme.devextremeStrings.week
import typings.devextreme.devextremeStrings.year
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxPolarChartValueAxis extends dxPolarChartCommonAxisSettings {
  /** @name dxPolarChart.Options.valueAxis.axisDivisionFactor */
  var axisDivisionFactor: js.UndefOr[Double] = js.undefined
  /** @name dxPolarChart.Options.valueAxis.categories */
  var categories: js.UndefOr[js.Array[Double | String | Date]] = js.undefined
  /** @name dxPolarChart.Options.valueAxis.constantLines */
  var constantLines: js.UndefOr[js.Array[dxPolarChartValueAxisConstantLines]] = js.undefined
  /** @name dxPolarChart.Options.valueAxis.label */
  @JSName("label")
  var label_dxPolarChartValueAxis: js.UndefOr[dxPolarChartValueAxisLabel] = js.undefined
  /** @name dxPolarChart.Options.valueAxis.linearThreshold */
  var linearThreshold: js.UndefOr[Double] = js.undefined
  /** @name dxPolarChart.Options.valueAxis.logarithmBase */
  var logarithmBase: js.UndefOr[Double] = js.undefined
  /** @name dxPolarChart.Options.valueAxis.maxValueMargin */
  var maxValueMargin: js.UndefOr[Double] = js.undefined
  /** @name dxPolarChart.Options.valueAxis.minValueMargin */
  var minValueMargin: js.UndefOr[Double] = js.undefined
  /** @name dxPolarChart.Options.valueAxis.minVisualRangeLength */
  var minVisualRangeLength: js.UndefOr[
    Double | js.Any | day | hour | millisecond | minute | month | quarter | second | week | year
  ] = js.undefined
  /** @name dxPolarChart.Options.valueAxis.minorTickCount */
  var minorTickCount: js.UndefOr[Double] = js.undefined
  /** @name dxPolarChart.Options.valueAxis.minorTickInterval */
  var minorTickInterval: js.UndefOr[
    Double | js.Any | day | hour | millisecond | minute | month | quarter | second | week | year
  ] = js.undefined
  /** @name dxPolarChart.Options.valueAxis.showZero */
  var showZero: js.UndefOr[Boolean] = js.undefined
  /** @name dxPolarChart.Options.valueAxis.strips */
  var strips: js.UndefOr[js.Array[dxPolarChartValueAxisStrips]] = js.undefined
  /** @name dxPolarChart.Options.valueAxis.tickInterval */
  var tickInterval: js.UndefOr[
    Double | js.Any | day | hour | millisecond | minute | month | quarter | second | week | year
  ] = js.undefined
  /** @name dxPolarChart.Options.valueAxis.tick */
  @JSName("tick")
  var tick_dxPolarChartValueAxis: js.UndefOr[dxPolarChartValueAxisTick] = js.undefined
  /** @name dxPolarChart.Options.valueAxis.type */
  var `type`: js.UndefOr[continuous | discrete | logarithmic] = js.undefined
  /** @name dxPolarChart.Options.valueAxis.valueMarginsEnabled */
  var valueMarginsEnabled: js.UndefOr[Boolean] = js.undefined
  /** @name dxPolarChart.Options.valueAxis.valueType */
  var valueType: js.UndefOr[datetime | numeric | string_] = js.undefined
  /** @name dxPolarChart.Options.valueAxis.visualRange */
  var visualRange: js.UndefOr[VizRange | (js.Array[Double | String | Date])] = js.undefined
  /** @name dxPolarChart.Options.valueAxis.visualRangeUpdateMode */
  var visualRangeUpdateMode: js.UndefOr[auto | keep | reset] = js.undefined
  /** @name dxPolarChart.Options.valueAxis.wholeRange */
  var wholeRange: js.UndefOr[VizRange | (js.Array[Double | String | Date])] = js.undefined
}

object dxPolarChartValueAxis {
  @scala.inline
  def apply(
    allowDecimals: js.UndefOr[Boolean] = js.undefined,
    axisDivisionFactor: Int | Double = null,
    categories: js.Array[Double | String | Date] = null,
    color: String = null,
    constantLineStyle: dxPolarChartCommonAxisSettingsConstantLineStyle = null,
    constantLines: js.Array[dxPolarChartValueAxisConstantLines] = null,
    discreteAxisDivisionMode: betweenLabels | crossLabels = null,
    endOnTick: js.UndefOr[Boolean] = js.undefined,
    grid: AnonColorOpacity = null,
    inverted: js.UndefOr[Boolean] = js.undefined,
    label: dxPolarChartValueAxisLabel = null,
    linearThreshold: Int | Double = null,
    logarithmBase: Int | Double = null,
    maxValueMargin: Int | Double = null,
    minValueMargin: Int | Double = null,
    minVisualRangeLength: Double | js.Any | day | hour | millisecond | minute | month | quarter | second | week | year = null,
    minorGrid: AnonColorOpacity = null,
    minorTick: dxPolarChartCommonAxisSettingsMinorTick = null,
    minorTickCount: Int | Double = null,
    minorTickInterval: Double | js.Any | day | hour | millisecond | minute | month | quarter | second | week | year = null,
    opacity: Int | Double = null,
    showZero: js.UndefOr[Boolean] = js.undefined,
    stripStyle: dxPolarChartCommonAxisSettingsStripStyle = null,
    strips: js.Array[dxPolarChartValueAxisStrips] = null,
    tick: dxPolarChartValueAxisTick = null,
    tickInterval: Double | js.Any | day | hour | millisecond | minute | month | quarter | second | week | year = null,
    `type`: continuous | discrete | logarithmic = null,
    valueMarginsEnabled: js.UndefOr[Boolean] = js.undefined,
    valueType: datetime | numeric | string_ = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    visualRange: VizRange | (js.Array[Double | String | Date]) = null,
    visualRangeUpdateMode: auto | keep | reset = null,
    wholeRange: VizRange | (js.Array[Double | String | Date]) = null,
    width: Int | Double = null
  ): dxPolarChartValueAxis = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowDecimals)) __obj.updateDynamic("allowDecimals")(allowDecimals.asInstanceOf[js.Any])
    if (axisDivisionFactor != null) __obj.updateDynamic("axisDivisionFactor")(axisDivisionFactor.asInstanceOf[js.Any])
    if (categories != null) __obj.updateDynamic("categories")(categories.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (constantLineStyle != null) __obj.updateDynamic("constantLineStyle")(constantLineStyle.asInstanceOf[js.Any])
    if (constantLines != null) __obj.updateDynamic("constantLines")(constantLines.asInstanceOf[js.Any])
    if (discreteAxisDivisionMode != null) __obj.updateDynamic("discreteAxisDivisionMode")(discreteAxisDivisionMode.asInstanceOf[js.Any])
    if (!js.isUndefined(endOnTick)) __obj.updateDynamic("endOnTick")(endOnTick.asInstanceOf[js.Any])
    if (grid != null) __obj.updateDynamic("grid")(grid.asInstanceOf[js.Any])
    if (!js.isUndefined(inverted)) __obj.updateDynamic("inverted")(inverted.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (linearThreshold != null) __obj.updateDynamic("linearThreshold")(linearThreshold.asInstanceOf[js.Any])
    if (logarithmBase != null) __obj.updateDynamic("logarithmBase")(logarithmBase.asInstanceOf[js.Any])
    if (maxValueMargin != null) __obj.updateDynamic("maxValueMargin")(maxValueMargin.asInstanceOf[js.Any])
    if (minValueMargin != null) __obj.updateDynamic("minValueMargin")(minValueMargin.asInstanceOf[js.Any])
    if (minVisualRangeLength != null) __obj.updateDynamic("minVisualRangeLength")(minVisualRangeLength.asInstanceOf[js.Any])
    if (minorGrid != null) __obj.updateDynamic("minorGrid")(minorGrid.asInstanceOf[js.Any])
    if (minorTick != null) __obj.updateDynamic("minorTick")(minorTick.asInstanceOf[js.Any])
    if (minorTickCount != null) __obj.updateDynamic("minorTickCount")(minorTickCount.asInstanceOf[js.Any])
    if (minorTickInterval != null) __obj.updateDynamic("minorTickInterval")(minorTickInterval.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (!js.isUndefined(showZero)) __obj.updateDynamic("showZero")(showZero.asInstanceOf[js.Any])
    if (stripStyle != null) __obj.updateDynamic("stripStyle")(stripStyle.asInstanceOf[js.Any])
    if (strips != null) __obj.updateDynamic("strips")(strips.asInstanceOf[js.Any])
    if (tick != null) __obj.updateDynamic("tick")(tick.asInstanceOf[js.Any])
    if (tickInterval != null) __obj.updateDynamic("tickInterval")(tickInterval.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(valueMarginsEnabled)) __obj.updateDynamic("valueMarginsEnabled")(valueMarginsEnabled.asInstanceOf[js.Any])
    if (valueType != null) __obj.updateDynamic("valueType")(valueType.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (visualRange != null) __obj.updateDynamic("visualRange")(visualRange.asInstanceOf[js.Any])
    if (visualRangeUpdateMode != null) __obj.updateDynamic("visualRangeUpdateMode")(visualRangeUpdateMode.asInstanceOf[js.Any])
    if (wholeRange != null) __obj.updateDynamic("wholeRange")(wholeRange.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxPolarChartValueAxis]
  }
}

