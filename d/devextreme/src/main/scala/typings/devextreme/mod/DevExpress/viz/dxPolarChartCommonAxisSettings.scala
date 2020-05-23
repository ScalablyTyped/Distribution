package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.anon.ColorOpacity
import typings.devextreme.devextremeStrings.betweenLabels
import typings.devextreme.devextremeStrings.crossLabels
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxPolarChartCommonAxisSettings extends js.Object {
  /** @name dxPolarChart.Options.commonAxisSettings.allowDecimals */
  var allowDecimals: js.UndefOr[Boolean] = js.undefined
  /** @name dxPolarChart.Options.commonAxisSettings.color */
  var color: js.UndefOr[String] = js.undefined
  /** @name dxPolarChart.Options.commonAxisSettings.constantLineStyle */
  var constantLineStyle: js.UndefOr[dxPolarChartCommonAxisSettingsConstantLineStyle] = js.undefined
  /** @name dxPolarChart.Options.commonAxisSettings.discreteAxisDivisionMode */
  var discreteAxisDivisionMode: js.UndefOr[betweenLabels | crossLabels] = js.undefined
  /** @name dxPolarChart.Options.commonAxisSettings.endOnTick */
  var endOnTick: js.UndefOr[Boolean] = js.undefined
  /** @name dxPolarChart.Options.commonAxisSettings.grid */
  var grid: js.UndefOr[ColorOpacity] = js.undefined
  /** @name dxPolarChart.Options.commonAxisSettings.inverted */
  var inverted: js.UndefOr[Boolean] = js.undefined
  /** @name dxPolarChart.Options.commonAxisSettings.label */
  var label: js.UndefOr[dxPolarChartCommonAxisSettingsLabel] = js.undefined
  /** @name dxPolarChart.Options.commonAxisSettings.minorGrid */
  var minorGrid: js.UndefOr[ColorOpacity] = js.undefined
  /** @name dxPolarChart.Options.commonAxisSettings.minorTick */
  var minorTick: js.UndefOr[dxPolarChartCommonAxisSettingsMinorTick] = js.undefined
  /** @name dxPolarChart.Options.commonAxisSettings.opacity */
  var opacity: js.UndefOr[Double] = js.undefined
  /** @name dxPolarChart.Options.commonAxisSettings.stripStyle */
  var stripStyle: js.UndefOr[dxPolarChartCommonAxisSettingsStripStyle] = js.undefined
  /** @name dxPolarChart.Options.commonAxisSettings.tick */
  var tick: js.UndefOr[dxPolarChartCommonAxisSettingsTick] = js.undefined
  /** @name dxPolarChart.Options.commonAxisSettings.visible */
  var visible: js.UndefOr[Boolean] = js.undefined
  /** @name dxPolarChart.Options.commonAxisSettings.width */
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
    grid: ColorOpacity = null,
    inverted: js.UndefOr[Boolean] = js.undefined,
    label: dxPolarChartCommonAxisSettingsLabel = null,
    minorGrid: ColorOpacity = null,
    minorTick: dxPolarChartCommonAxisSettingsMinorTick = null,
    opacity: js.UndefOr[Double] = js.undefined,
    stripStyle: dxPolarChartCommonAxisSettingsStripStyle = null,
    tick: dxPolarChartCommonAxisSettingsTick = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    width: js.UndefOr[Double] = js.undefined
  ): dxPolarChartCommonAxisSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowDecimals)) __obj.updateDynamic("allowDecimals")(allowDecimals.get.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (constantLineStyle != null) __obj.updateDynamic("constantLineStyle")(constantLineStyle.asInstanceOf[js.Any])
    if (discreteAxisDivisionMode != null) __obj.updateDynamic("discreteAxisDivisionMode")(discreteAxisDivisionMode.asInstanceOf[js.Any])
    if (!js.isUndefined(endOnTick)) __obj.updateDynamic("endOnTick")(endOnTick.get.asInstanceOf[js.Any])
    if (grid != null) __obj.updateDynamic("grid")(grid.asInstanceOf[js.Any])
    if (!js.isUndefined(inverted)) __obj.updateDynamic("inverted")(inverted.get.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (minorGrid != null) __obj.updateDynamic("minorGrid")(minorGrid.asInstanceOf[js.Any])
    if (minorTick != null) __obj.updateDynamic("minorTick")(minorTick.asInstanceOf[js.Any])
    if (!js.isUndefined(opacity)) __obj.updateDynamic("opacity")(opacity.get.asInstanceOf[js.Any])
    if (stripStyle != null) __obj.updateDynamic("stripStyle")(stripStyle.asInstanceOf[js.Any])
    if (tick != null) __obj.updateDynamic("tick")(tick.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxPolarChartCommonAxisSettings]
  }
}

