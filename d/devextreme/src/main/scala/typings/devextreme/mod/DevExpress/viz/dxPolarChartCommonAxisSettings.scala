package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.AnonColorOpacity
import typings.devextreme.devextremeStrings.betweenLabels
import typings.devextreme.devextremeStrings.crossLabels
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxPolarChartCommonAxisSettings extends js.Object {
  /** Specifies whether to allow decimal values on the axis. When false, the axis contains integer values only. */
  var allowDecimals: js.UndefOr[Boolean] = js.undefined
  /** Specifies the color of the line that represents an axis. */
  var color: js.UndefOr[String] = js.undefined
  /** Specifies the appearance of all the widget's constant lines. */
  var constantLineStyle: js.UndefOr[dxPolarChartCommonAxisSettingsConstantLineStyle] = js.undefined
  /** Specifies whether ticks/grid lines of a discrete axis are located between labels or cross the labels. */
  var discreteAxisDivisionMode: js.UndefOr[betweenLabels | crossLabels] = js.undefined
  /** Specifies whether to force the axis to start and end on ticks. */
  var endOnTick: js.UndefOr[Boolean] = js.undefined
  /** An object defining the configuration options for the grid lines of an axis in the PolarChart widget. */
  var grid: js.UndefOr[AnonColorOpacity] = js.undefined
  /** Indicates whether or not an axis is inverted. */
  var inverted: js.UndefOr[Boolean] = js.undefined
  /** An object defining the label configuration options that are common for all axes in the PolarChart widget. */
  var label: js.UndefOr[dxPolarChartCommonAxisSettingsLabel] = js.undefined
  /** Specifies the options of the minor grid. */
  var minorGrid: js.UndefOr[AnonColorOpacity] = js.undefined
  /** Specifies the options of the minor ticks. */
  var minorTick: js.UndefOr[dxPolarChartCommonAxisSettingsMinorTick] = js.undefined
  /** Specifies the opacity of the line that represents an axis. */
  var opacity: js.UndefOr[Double] = js.undefined
  /** An object defining configuration options for strip style. */
  var stripStyle: js.UndefOr[dxPolarChartCommonAxisSettingsStripStyle] = js.undefined
  /** An object defining the configuration options for axis ticks. */
  var tick: js.UndefOr[dxPolarChartCommonAxisSettingsTick] = js.undefined
  /** Indicates whether or not the line that represents an axis in a chart is visible. */
  var visible: js.UndefOr[Boolean] = js.undefined
  /** Specifies the width of the line that represents an axis in the chart. */
  var width: js.UndefOr[Double] = js.undefined
}

object dxPolarChartCommonAxisSettings {
  @scala.inline
  def apply(
    allowDecimals: js.UndefOr[Boolean] = js.undefined,
    color: String = null,
    constantLineStyle: dxPolarChartCommonAxisSettingsConstantLineStyle = null,
    discreteAxisDivisionMode: betweenLabels | crossLabels = null,
    endOnTick: js.UndefOr[Boolean] = js.undefined,
    grid: AnonColorOpacity = null,
    inverted: js.UndefOr[Boolean] = js.undefined,
    label: dxPolarChartCommonAxisSettingsLabel = null,
    minorGrid: AnonColorOpacity = null,
    minorTick: dxPolarChartCommonAxisSettingsMinorTick = null,
    opacity: Int | Double = null,
    stripStyle: dxPolarChartCommonAxisSettingsStripStyle = null,
    tick: dxPolarChartCommonAxisSettingsTick = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    width: Int | Double = null
  ): dxPolarChartCommonAxisSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowDecimals)) __obj.updateDynamic("allowDecimals")(allowDecimals.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (constantLineStyle != null) __obj.updateDynamic("constantLineStyle")(constantLineStyle.asInstanceOf[js.Any])
    if (discreteAxisDivisionMode != null) __obj.updateDynamic("discreteAxisDivisionMode")(discreteAxisDivisionMode.asInstanceOf[js.Any])
    if (!js.isUndefined(endOnTick)) __obj.updateDynamic("endOnTick")(endOnTick.asInstanceOf[js.Any])
    if (grid != null) __obj.updateDynamic("grid")(grid.asInstanceOf[js.Any])
    if (!js.isUndefined(inverted)) __obj.updateDynamic("inverted")(inverted.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (minorGrid != null) __obj.updateDynamic("minorGrid")(minorGrid.asInstanceOf[js.Any])
    if (minorTick != null) __obj.updateDynamic("minorTick")(minorTick.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (stripStyle != null) __obj.updateDynamic("stripStyle")(stripStyle.asInstanceOf[js.Any])
    if (tick != null) __obj.updateDynamic("tick")(tick.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxPolarChartCommonAxisSettings]
  }
}

