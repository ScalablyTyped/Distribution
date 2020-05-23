package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.anon.ColorOpacity
import typings.devextreme.anon.Length
import typings.devextreme.anon.Line
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
    axisDivisionFactor: js.UndefOr[Double] = js.undefined,
    breakStyle: Line = null,
    breaks: js.Array[ScaleBreak] = null,
    categories: js.Array[Double | String | Date] = null,
    color: String = null,
    constantLineStyle: dxChartValueAxisConstantLineStyle = null,
    constantLines: js.Array[dxChartValueAxisConstantLines] = null,
    discreteAxisDivisionMode: betweenLabels | crossLabels = null,
    endOnTick: js.UndefOr[Boolean] = js.undefined,
    grid: ColorOpacity = null,
    inverted: js.UndefOr[Boolean] = js.undefined,
    label: dxChartValueAxisLabel = null,
    linearThreshold: js.UndefOr[Double] = js.undefined,
    logarithmBase: js.UndefOr[Double] = js.undefined,
    max: Double | Date | String = null,
    maxAutoBreakCount: js.UndefOr[Double] = js.undefined,
    maxValueMargin: js.UndefOr[Double] = js.undefined,
    min: Double | Date | String = null,
    minValueMargin: js.UndefOr[Double] = js.undefined,
    minVisualRangeLength: Double | js.Any | day | hour | millisecond | minute | month | quarter | second | week | year = null,
    minorGrid: ColorOpacity = null,
    minorTick: Length = null,
    minorTickCount: js.UndefOr[Double] = js.undefined,
    minorTickInterval: Double | js.Any | day | hour | millisecond | minute | month | quarter | second | week | year = null,
    multipleAxesSpacing: js.UndefOr[Double] = js.undefined,
    name: String = null,
    opacity: js.UndefOr[Double] = js.undefined,
    pane: String = null,
    placeholderSize: js.UndefOr[Double] = js.undefined,
    position: bottom | left | right | top = null,
    showZero: js.UndefOr[Boolean] = js.undefined,
    stripStyle: dxChartCommonAxisSettingsStripStyle = null,
    strips: js.Array[dxChartValueAxisStrips] = null,
    synchronizedValue: js.UndefOr[Double] = js.undefined,
    tick: Length = null,
    tickInterval: Double | js.Any | day | hour | millisecond | minute | month | quarter | second | week | year = null,
    title: dxChartValueAxisTitle = null,
    `type`: continuous | discrete | logarithmic = null,
    valueMarginsEnabled: js.UndefOr[Boolean] = js.undefined,
    valueType: datetime | numeric | string_ = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    visualRange: VizRange | (js.Array[Double | String | Date]) = null,
    visualRangeUpdateMode: auto | keep | reset | shift = null,
    wholeRange: VizRange | (js.Array[Double | String | Date]) = null,
    width: js.UndefOr[Double] = js.undefined
  ): dxChartValueAxis = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowDecimals)) __obj.updateDynamic("allowDecimals")(allowDecimals.get.asInstanceOf[js.Any])
    if (!js.isUndefined(autoBreaksEnabled)) __obj.updateDynamic("autoBreaksEnabled")(autoBreaksEnabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(axisDivisionFactor)) __obj.updateDynamic("axisDivisionFactor")(axisDivisionFactor.get.asInstanceOf[js.Any])
    if (breakStyle != null) __obj.updateDynamic("breakStyle")(breakStyle.asInstanceOf[js.Any])
    if (breaks != null) __obj.updateDynamic("breaks")(breaks.asInstanceOf[js.Any])
    if (categories != null) __obj.updateDynamic("categories")(categories.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (constantLineStyle != null) __obj.updateDynamic("constantLineStyle")(constantLineStyle.asInstanceOf[js.Any])
    if (constantLines != null) __obj.updateDynamic("constantLines")(constantLines.asInstanceOf[js.Any])
    if (discreteAxisDivisionMode != null) __obj.updateDynamic("discreteAxisDivisionMode")(discreteAxisDivisionMode.asInstanceOf[js.Any])
    if (!js.isUndefined(endOnTick)) __obj.updateDynamic("endOnTick")(endOnTick.get.asInstanceOf[js.Any])
    if (grid != null) __obj.updateDynamic("grid")(grid.asInstanceOf[js.Any])
    if (!js.isUndefined(inverted)) __obj.updateDynamic("inverted")(inverted.get.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (!js.isUndefined(linearThreshold)) __obj.updateDynamic("linearThreshold")(linearThreshold.get.asInstanceOf[js.Any])
    if (!js.isUndefined(logarithmBase)) __obj.updateDynamic("logarithmBase")(logarithmBase.get.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (!js.isUndefined(maxAutoBreakCount)) __obj.updateDynamic("maxAutoBreakCount")(maxAutoBreakCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxValueMargin)) __obj.updateDynamic("maxValueMargin")(maxValueMargin.get.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (!js.isUndefined(minValueMargin)) __obj.updateDynamic("minValueMargin")(minValueMargin.get.asInstanceOf[js.Any])
    if (minVisualRangeLength != null) __obj.updateDynamic("minVisualRangeLength")(minVisualRangeLength.asInstanceOf[js.Any])
    if (minorGrid != null) __obj.updateDynamic("minorGrid")(minorGrid.asInstanceOf[js.Any])
    if (minorTick != null) __obj.updateDynamic("minorTick")(minorTick.asInstanceOf[js.Any])
    if (!js.isUndefined(minorTickCount)) __obj.updateDynamic("minorTickCount")(minorTickCount.get.asInstanceOf[js.Any])
    if (minorTickInterval != null) __obj.updateDynamic("minorTickInterval")(minorTickInterval.asInstanceOf[js.Any])
    if (!js.isUndefined(multipleAxesSpacing)) __obj.updateDynamic("multipleAxesSpacing")(multipleAxesSpacing.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(opacity)) __obj.updateDynamic("opacity")(opacity.get.asInstanceOf[js.Any])
    if (pane != null) __obj.updateDynamic("pane")(pane.asInstanceOf[js.Any])
    if (!js.isUndefined(placeholderSize)) __obj.updateDynamic("placeholderSize")(placeholderSize.get.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(showZero)) __obj.updateDynamic("showZero")(showZero.get.asInstanceOf[js.Any])
    if (stripStyle != null) __obj.updateDynamic("stripStyle")(stripStyle.asInstanceOf[js.Any])
    if (strips != null) __obj.updateDynamic("strips")(strips.asInstanceOf[js.Any])
    if (!js.isUndefined(synchronizedValue)) __obj.updateDynamic("synchronizedValue")(synchronizedValue.get.asInstanceOf[js.Any])
    if (tick != null) __obj.updateDynamic("tick")(tick.asInstanceOf[js.Any])
    if (tickInterval != null) __obj.updateDynamic("tickInterval")(tickInterval.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(valueMarginsEnabled)) __obj.updateDynamic("valueMarginsEnabled")(valueMarginsEnabled.get.asInstanceOf[js.Any])
    if (valueType != null) __obj.updateDynamic("valueType")(valueType.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    if (visualRange != null) __obj.updateDynamic("visualRange")(visualRange.asInstanceOf[js.Any])
    if (visualRangeUpdateMode != null) __obj.updateDynamic("visualRangeUpdateMode")(visualRangeUpdateMode.asInstanceOf[js.Any])
    if (wholeRange != null) __obj.updateDynamic("wholeRange")(wholeRange.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxChartValueAxis]
  }
}

