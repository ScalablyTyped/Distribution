package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.AnonColorOpacity
import typings.devextreme.AnonLength
import typings.devextreme.AnonLine
import typings.devextreme.devextremeStrings.auto
import typings.devextreme.devextremeStrings.betweenLabels
import typings.devextreme.devextremeStrings.bottom
import typings.devextreme.devextremeStrings.continuous
import typings.devextreme.devextremeStrings.crossLabels
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

trait dxChartValueAxis extends dxChartCommonAxisSettings {
  /** @name dxChart.Options.valueAxis.autoBreaksEnabled */
  var autoBreaksEnabled: js.UndefOr[Boolean] = js.undefined
  /** @name dxChart.Options.valueAxis.axisDivisionFactor */
  var axisDivisionFactor: js.UndefOr[Double] = js.undefined
  /** @name dxChart.Options.valueAxis.breaks */
  var breaks: js.UndefOr[js.Array[ScaleBreak]] = js.undefined
  /** @name dxChart.Options.valueAxis.categories */
  var categories: js.UndefOr[js.Array[Double | String | Date]] = js.undefined
  /** @name dxChart.Options.valueAxis.constantLineStyle */
  @JSName("constantLineStyle")
  var constantLineStyle_dxChartValueAxis: js.UndefOr[dxChartValueAxisConstantLineStyle] = js.undefined
  /** @name dxChart.Options.valueAxis.constantLines */
  var constantLines: js.UndefOr[js.Array[dxChartValueAxisConstantLines]] = js.undefined
  /** @name dxChart.Options.valueAxis.label */
  @JSName("label")
  var label_dxChartValueAxis: js.UndefOr[dxChartValueAxisLabel] = js.undefined
  /** @name dxChart.Options.valueAxis.linearThreshold */
  var linearThreshold: js.UndefOr[Double] = js.undefined
  /** @name dxChart.Options.valueAxis.logarithmBase */
  var logarithmBase: js.UndefOr[Double] = js.undefined
  /** @deprecated */
  /** @name dxChart.Options.valueAxis.max */
  var max: js.UndefOr[Double | Date | String] = js.undefined
  /** @name dxChart.Options.valueAxis.maxAutoBreakCount */
  var maxAutoBreakCount: js.UndefOr[Double] = js.undefined
  /** @deprecated */
  /** @name dxChart.Options.valueAxis.min */
  var min: js.UndefOr[Double | Date | String] = js.undefined
  /** @name dxChart.Options.valueAxis.minVisualRangeLength */
  var minVisualRangeLength: js.UndefOr[
    Double | js.Any | day | hour | millisecond | minute | month | quarter | second | week | year
  ] = js.undefined
  /** @name dxChart.Options.valueAxis.minorTickCount */
  var minorTickCount: js.UndefOr[Double] = js.undefined
  /** @name dxChart.Options.valueAxis.minorTickInterval */
  var minorTickInterval: js.UndefOr[
    Double | js.Any | day | hour | millisecond | minute | month | quarter | second | week | year
  ] = js.undefined
  /** @name dxChart.Options.valueAxis.multipleAxesSpacing */
  var multipleAxesSpacing: js.UndefOr[Double] = js.undefined
  /** @name dxChart.Options.valueAxis.name */
  var name: js.UndefOr[String] = js.undefined
  /** @name dxChart.Options.valueAxis.pane */
  var pane: js.UndefOr[String] = js.undefined
  /** @name dxChart.Options.valueAxis.position */
  var position: js.UndefOr[bottom | left | right | top] = js.undefined
  /** @name dxChart.Options.valueAxis.showZero */
  var showZero: js.UndefOr[Boolean] = js.undefined
  /** @name dxChart.Options.valueAxis.strips */
  var strips: js.UndefOr[js.Array[dxChartValueAxisStrips]] = js.undefined
  /** @name dxChart.Options.valueAxis.synchronizedValue */
  var synchronizedValue: js.UndefOr[Double] = js.undefined
  /** @name dxChart.Options.valueAxis.tickInterval */
  var tickInterval: js.UndefOr[
    Double | js.Any | day | hour | millisecond | minute | month | quarter | second | week | year
  ] = js.undefined
  /** @name dxChart.Options.valueAxis.title */
  @JSName("title")
  var title_dxChartValueAxis: js.UndefOr[dxChartValueAxisTitle] = js.undefined
  /** @name dxChart.Options.valueAxis.type */
  var `type`: js.UndefOr[continuous | discrete | logarithmic] = js.undefined
  /** @name dxChart.Options.valueAxis.valueType */
  var valueType: js.UndefOr[datetime | numeric | string_] = js.undefined
  /** @name dxChart.Options.valueAxis.visualRange */
  var visualRange: js.UndefOr[VizRange | (js.Array[Double | String | Date])] = js.undefined
  /** @name dxChart.Options.valueAxis.visualRangeUpdateMode */
  var visualRangeUpdateMode: js.UndefOr[auto | keep | reset | shift] = js.undefined
  /** @name dxChart.Options.valueAxis.wholeRange */
  var wholeRange: js.UndefOr[VizRange | (js.Array[Double | String | Date])] = js.undefined
}

object dxChartValueAxis {
  @scala.inline
  def apply(
    allowDecimals: js.UndefOr[Boolean] = js.undefined,
    autoBreaksEnabled: js.UndefOr[Boolean] = js.undefined,
    axisDivisionFactor: Int | Double = null,
    breakStyle: AnonLine = null,
    breaks: js.Array[ScaleBreak] = null,
    categories: js.Array[Double | String | Date] = null,
    color: String = null,
    constantLineStyle: dxChartValueAxisConstantLineStyle = null,
    constantLines: js.Array[dxChartValueAxisConstantLines] = null,
    discreteAxisDivisionMode: betweenLabels | crossLabels = null,
    endOnTick: js.UndefOr[Boolean] = js.undefined,
    grid: AnonColorOpacity = null,
    inverted: js.UndefOr[Boolean] = js.undefined,
    label: dxChartValueAxisLabel = null,
    linearThreshold: Int | Double = null,
    logarithmBase: Int | Double = null,
    max: Double | Date | String = null,
    maxAutoBreakCount: Int | Double = null,
    maxValueMargin: Int | Double = null,
    min: Double | Date | String = null,
    minValueMargin: Int | Double = null,
    minVisualRangeLength: Double | js.Any | day | hour | millisecond | minute | month | quarter | second | week | year = null,
    minorGrid: AnonColorOpacity = null,
    minorTick: AnonLength = null,
    minorTickCount: Int | Double = null,
    minorTickInterval: Double | js.Any | day | hour | millisecond | minute | month | quarter | second | week | year = null,
    multipleAxesSpacing: Int | Double = null,
    name: String = null,
    opacity: Int | Double = null,
    pane: String = null,
    placeholderSize: Int | Double = null,
    position: bottom | left | right | top = null,
    showZero: js.UndefOr[Boolean] = js.undefined,
    stripStyle: dxChartCommonAxisSettingsStripStyle = null,
    strips: js.Array[dxChartValueAxisStrips] = null,
    synchronizedValue: Int | Double = null,
    tick: AnonLength = null,
    tickInterval: Double | js.Any | day | hour | millisecond | minute | month | quarter | second | week | year = null,
    title: dxChartValueAxisTitle = null,
    `type`: continuous | discrete | logarithmic = null,
    valueMarginsEnabled: js.UndefOr[Boolean] = js.undefined,
    valueType: datetime | numeric | string_ = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    visualRange: VizRange | (js.Array[Double | String | Date]) = null,
    visualRangeUpdateMode: auto | keep | reset | shift = null,
    wholeRange: VizRange | (js.Array[Double | String | Date]) = null,
    width: Int | Double = null
  ): dxChartValueAxis = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowDecimals)) __obj.updateDynamic("allowDecimals")(allowDecimals.asInstanceOf[js.Any])
    if (!js.isUndefined(autoBreaksEnabled)) __obj.updateDynamic("autoBreaksEnabled")(autoBreaksEnabled.asInstanceOf[js.Any])
    if (axisDivisionFactor != null) __obj.updateDynamic("axisDivisionFactor")(axisDivisionFactor.asInstanceOf[js.Any])
    if (breakStyle != null) __obj.updateDynamic("breakStyle")(breakStyle.asInstanceOf[js.Any])
    if (breaks != null) __obj.updateDynamic("breaks")(breaks.asInstanceOf[js.Any])
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
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (maxAutoBreakCount != null) __obj.updateDynamic("maxAutoBreakCount")(maxAutoBreakCount.asInstanceOf[js.Any])
    if (maxValueMargin != null) __obj.updateDynamic("maxValueMargin")(maxValueMargin.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (minValueMargin != null) __obj.updateDynamic("minValueMargin")(minValueMargin.asInstanceOf[js.Any])
    if (minVisualRangeLength != null) __obj.updateDynamic("minVisualRangeLength")(minVisualRangeLength.asInstanceOf[js.Any])
    if (minorGrid != null) __obj.updateDynamic("minorGrid")(minorGrid.asInstanceOf[js.Any])
    if (minorTick != null) __obj.updateDynamic("minorTick")(minorTick.asInstanceOf[js.Any])
    if (minorTickCount != null) __obj.updateDynamic("minorTickCount")(minorTickCount.asInstanceOf[js.Any])
    if (minorTickInterval != null) __obj.updateDynamic("minorTickInterval")(minorTickInterval.asInstanceOf[js.Any])
    if (multipleAxesSpacing != null) __obj.updateDynamic("multipleAxesSpacing")(multipleAxesSpacing.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (pane != null) __obj.updateDynamic("pane")(pane.asInstanceOf[js.Any])
    if (placeholderSize != null) __obj.updateDynamic("placeholderSize")(placeholderSize.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(showZero)) __obj.updateDynamic("showZero")(showZero.asInstanceOf[js.Any])
    if (stripStyle != null) __obj.updateDynamic("stripStyle")(stripStyle.asInstanceOf[js.Any])
    if (strips != null) __obj.updateDynamic("strips")(strips.asInstanceOf[js.Any])
    if (synchronizedValue != null) __obj.updateDynamic("synchronizedValue")(synchronizedValue.asInstanceOf[js.Any])
    if (tick != null) __obj.updateDynamic("tick")(tick.asInstanceOf[js.Any])
    if (tickInterval != null) __obj.updateDynamic("tickInterval")(tickInterval.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(valueMarginsEnabled)) __obj.updateDynamic("valueMarginsEnabled")(valueMarginsEnabled.asInstanceOf[js.Any])
    if (valueType != null) __obj.updateDynamic("valueType")(valueType.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (visualRange != null) __obj.updateDynamic("visualRange")(visualRange.asInstanceOf[js.Any])
    if (visualRangeUpdateMode != null) __obj.updateDynamic("visualRangeUpdateMode")(visualRangeUpdateMode.asInstanceOf[js.Any])
    if (wholeRange != null) __obj.updateDynamic("wholeRange")(wholeRange.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxChartValueAxis]
  }
}

