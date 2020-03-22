package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.AnonColorOpacity
import typings.devextreme.AnonLength
import typings.devextreme.AnonLine
import typings.devextreme.devextremeStrings.betweenLabels
import typings.devextreme.devextremeStrings.crossLabels
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxChartCommonAxisSettings extends js.Object {
  /** Specifies whether to allow decimal values on the axis. When false, the axis contains integer values only. */
  var allowDecimals: js.UndefOr[Boolean] = js.undefined
  /** Configures the scale breaks' appearance. */
  var breakStyle: js.UndefOr[AnonLine] = js.undefined
  /** Specifies the color of the axis line. */
  var color: js.UndefOr[String] = js.undefined
  /** Configures the appearance of all constant lines in the widget. */
  var constantLineStyle: js.UndefOr[dxChartCommonAxisSettingsConstantLineStyle] = js.undefined
  /** Specifies whether ticks and grid lines should cross axis labels or lie between them. Applies only to the axes of the "discrete" type. */
  var discreteAxisDivisionMode: js.UndefOr[betweenLabels | crossLabels] = js.undefined
  /** Specifies whether to force the axis to start and end on ticks. */
  var endOnTick: js.UndefOr[Boolean] = js.undefined
  /** Configures the grid. */
  var grid: js.UndefOr[AnonColorOpacity] = js.undefined
  /** Inverts the axis. */
  var inverted: js.UndefOr[Boolean] = js.undefined
  /** Configures axis labels. */
  var label: js.UndefOr[dxChartCommonAxisSettingsLabel] = js.undefined
  /** Controls the empty space between the maximum series points and the axis. Applies only to the axes of the "continuous" and "logarithmic" type. */
  var maxValueMargin: js.UndefOr[Double] = js.undefined
  /** Controls the empty space between the minimum series points and the axis. Applies only to the axes of the "continuous" and "logarithmic" type. */
  var minValueMargin: js.UndefOr[Double] = js.undefined
  /** Configures the minor grid. */
  var minorGrid: js.UndefOr[AnonColorOpacity] = js.undefined
  /** Configures the appearance of minor axis ticks. */
  var minorTick: js.UndefOr[AnonLength] = js.undefined
  /** Specifies how transparent the axis line should be. */
  var opacity: js.UndefOr[Double] = js.undefined
  /** Reserves a pixel-measured space for the axis. */
  var placeholderSize: js.UndefOr[Double] = js.undefined
  /** Configures the appearance of strips. */
  var stripStyle: js.UndefOr[dxChartCommonAxisSettingsStripStyle] = js.undefined
  /** Configures the appearance of major axis ticks. */
  var tick: js.UndefOr[AnonLength] = js.undefined
  /** Configures axis titles. */
  var title: js.UndefOr[dxChartCommonAxisSettingsTitle] = js.undefined
  /** Adds an empty space between the axis and the minimum and maximum series points. */
  var valueMarginsEnabled: js.UndefOr[Boolean] = js.undefined
  /** Makes the axis line visible. */
  var visible: js.UndefOr[Boolean] = js.undefined
  /** Specifies the width of the axis line in pixels. */
  var width: js.UndefOr[Double] = js.undefined
}

object dxChartCommonAxisSettings {
  @scala.inline
  def apply(
    allowDecimals: js.UndefOr[Boolean] = js.undefined,
    breakStyle: AnonLine = null,
    color: String = null,
    constantLineStyle: dxChartCommonAxisSettingsConstantLineStyle = null,
    discreteAxisDivisionMode: betweenLabels | crossLabels = null,
    endOnTick: js.UndefOr[Boolean] = js.undefined,
    grid: AnonColorOpacity = null,
    inverted: js.UndefOr[Boolean] = js.undefined,
    label: dxChartCommonAxisSettingsLabel = null,
    maxValueMargin: Int | Double = null,
    minValueMargin: Int | Double = null,
    minorGrid: AnonColorOpacity = null,
    minorTick: AnonLength = null,
    opacity: Int | Double = null,
    placeholderSize: Int | Double = null,
    stripStyle: dxChartCommonAxisSettingsStripStyle = null,
    tick: AnonLength = null,
    title: dxChartCommonAxisSettingsTitle = null,
    valueMarginsEnabled: js.UndefOr[Boolean] = js.undefined,
    visible: js.UndefOr[Boolean] = js.undefined,
    width: Int | Double = null
  ): dxChartCommonAxisSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowDecimals)) __obj.updateDynamic("allowDecimals")(allowDecimals.asInstanceOf[js.Any])
    if (breakStyle != null) __obj.updateDynamic("breakStyle")(breakStyle.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (constantLineStyle != null) __obj.updateDynamic("constantLineStyle")(constantLineStyle.asInstanceOf[js.Any])
    if (discreteAxisDivisionMode != null) __obj.updateDynamic("discreteAxisDivisionMode")(discreteAxisDivisionMode.asInstanceOf[js.Any])
    if (!js.isUndefined(endOnTick)) __obj.updateDynamic("endOnTick")(endOnTick.asInstanceOf[js.Any])
    if (grid != null) __obj.updateDynamic("grid")(grid.asInstanceOf[js.Any])
    if (!js.isUndefined(inverted)) __obj.updateDynamic("inverted")(inverted.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (maxValueMargin != null) __obj.updateDynamic("maxValueMargin")(maxValueMargin.asInstanceOf[js.Any])
    if (minValueMargin != null) __obj.updateDynamic("minValueMargin")(minValueMargin.asInstanceOf[js.Any])
    if (minorGrid != null) __obj.updateDynamic("minorGrid")(minorGrid.asInstanceOf[js.Any])
    if (minorTick != null) __obj.updateDynamic("minorTick")(minorTick.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (placeholderSize != null) __obj.updateDynamic("placeholderSize")(placeholderSize.asInstanceOf[js.Any])
    if (stripStyle != null) __obj.updateDynamic("stripStyle")(stripStyle.asInstanceOf[js.Any])
    if (tick != null) __obj.updateDynamic("tick")(tick.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (!js.isUndefined(valueMarginsEnabled)) __obj.updateDynamic("valueMarginsEnabled")(valueMarginsEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxChartCommonAxisSettings]
  }
}

