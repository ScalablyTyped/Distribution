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
  /** Enables auto-calculated scale breaks. Applies only if the axis' type is "continuous" or "logarithmic" and valueType is "numeric". */
  var autoBreaksEnabled: js.UndefOr[Boolean] = js.undefined
  /** Specifies the minimum distance between two neighboring major ticks in pixels. Applies only to the axes of the "continuous" and "logarithmic" types. */
  var axisDivisionFactor: js.UndefOr[Double] = js.undefined
  /** Declares a custom scale break collection. Applies only if the axis' type is "continuous" or "logarithmic". */
  var breaks: js.UndefOr[js.Array[ScaleBreak]] = js.undefined
  /** Specifies the order of categories on an axis of the "discrete" type. */
  var categories: js.UndefOr[js.Array[Double | String | Date]] = js.undefined
  /** Specifies the appearance of those constant lines that belong to the value axis. */
  @JSName("constantLineStyle")
  var constantLineStyle_dxChartValueAxis: js.UndefOr[dxChartValueAxisConstantLineStyle] = js.undefined
  /** Declares a collection of constant lines belonging to the value axis. */
  var constantLines: js.UndefOr[js.Array[dxChartValueAxisConstantLines]] = js.undefined
  /** Configures the labels of the value axis. */
  @JSName("label")
  var label_dxChartValueAxis: js.UndefOr[dxChartValueAxisLabel] = js.undefined
  /** Specifies a value used to calculate the range on a logarithmic axis within which the axis should be linear. Applies only if the data source contains negative values or zeroes. */
  var linearThreshold: js.UndefOr[Double] = js.undefined
  /** Specifies the value to be raised to a power when generating ticks for an axis of the "logarithmic" type. */
  var logarithmBase: js.UndefOr[Double] = js.undefined
  /** @deprecated Use the valueAxis.visualRange option instead. */
  /** Coupled with the min option, focuses the widget on a specific chart segment. Applies only to the axes of the "continuous" and "logarithmic" type. */
  var max: js.UndefOr[Double | Date | String] = js.undefined
  /** Sets a limit on auto-calculated scale breaks. Custom scale breaks are not counted. */
  var maxAutoBreakCount: js.UndefOr[Double] = js.undefined
  /** @deprecated Use the valueAxis.visualRange option instead. */
  /** Coupled with the max option, focuses the widget on a specific chart segment. Applies only to the axes of the "continuous" and "logarithmic" type. */
  var min: js.UndefOr[Double | Date | String] = js.undefined
  /** Specifies the minimum length of the visual range. */
  var minVisualRangeLength: js.UndefOr[
    Double | js.Any | day | hour | millisecond | minute | month | quarter | second | week | year
  ] = js.undefined
  /** Specifies how many minor ticks to place between two neighboring major ticks. */
  var minorTickCount: js.UndefOr[Double] = js.undefined
  /** Specifies the interval between minor ticks. Applies only to continuous axes. */
  var minorTickInterval: js.UndefOr[
    Double | js.Any | day | hour | millisecond | minute | month | quarter | second | week | year
  ] = js.undefined
  /** Adds a pixel-measured empty space between two side-by-side value axes. Applies if several value axes are located on one side of the chart. */
  var multipleAxesSpacing: js.UndefOr[Double] = js.undefined
  /** Specifies the name of the value axis. */
  var name: js.UndefOr[String] = js.undefined
  /** Binds the value axis to a pane. */
  var pane: js.UndefOr[String] = js.undefined
  /** Relocates the value axis. */
  var position: js.UndefOr[bottom | left | right | top] = js.undefined
  /** Specifies whether or not to show zero on the value axis. */
  var showZero: js.UndefOr[Boolean] = js.undefined
  /** Declares a collection of strips belonging to the value axis. */
  var strips: js.UndefOr[js.Array[dxChartValueAxisStrips]] = js.undefined
  /** Synchronizes two or more value axes with each other at a specific value. */
  var synchronizedValue: js.UndefOr[Double] = js.undefined
  /** Specifies the interval between major ticks. Does not apply to discrete axes. */
  var tickInterval: js.UndefOr[
    Double | js.Any | day | hour | millisecond | minute | month | quarter | second | week | year
  ] = js.undefined
  /** Configures the axis title. */
  @JSName("title")
  var title_dxChartValueAxis: js.UndefOr[dxChartValueAxisTitle] = js.undefined
  /** Specifies the type of the value axis. */
  var `type`: js.UndefOr[continuous | discrete | logarithmic] = js.undefined
  /** Casts values to a specified data type. */
  var valueType: js.UndefOr[datetime | numeric | string_] = js.undefined
  /** Defines the axis' displayed range. Cannot be wider than the wholeRange. */
  var visualRange: js.UndefOr[VizRange | (js.Array[Double | String | Date])] = js.undefined
  /** Specifies how the axis's visual range should behave when chart data is updated. */
  var visualRangeUpdateMode: js.UndefOr[auto | keep | reset | shift] = js.undefined
  /** Defines the range where the axis can be zoomed and panned. */
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

