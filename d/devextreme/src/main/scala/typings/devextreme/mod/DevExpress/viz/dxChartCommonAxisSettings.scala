package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.anon.ColorOpacity
import typings.devextreme.anon.Length
import typings.devextreme.anon.Line
import typings.devextreme.devextremeStrings.betweenLabels
import typings.devextreme.devextremeStrings.crossLabels
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxChartCommonAxisSettings extends js.Object {
  /** @name dxChart.Options.commonAxisSettings.allowDecimals */
  var allowDecimals: js.UndefOr[Boolean] = js.undefined
  /** @name dxChart.Options.commonAxisSettings.breakStyle */
  var breakStyle: js.UndefOr[Line] = js.undefined
  /** @name dxChart.Options.commonAxisSettings.color */
  var color: js.UndefOr[String] = js.undefined
  /** @name dxChart.Options.commonAxisSettings.constantLineStyle */
  var constantLineStyle: js.UndefOr[dxChartCommonAxisSettingsConstantLineStyle] = js.undefined
  /** @name dxChart.Options.commonAxisSettings.discreteAxisDivisionMode */
  var discreteAxisDivisionMode: js.UndefOr[betweenLabels | crossLabels] = js.undefined
  /** @name dxChart.Options.commonAxisSettings.endOnTick */
  var endOnTick: js.UndefOr[Boolean] = js.undefined
  /** @name dxChart.Options.commonAxisSettings.grid */
  var grid: js.UndefOr[ColorOpacity] = js.undefined
  /** @name dxChart.Options.commonAxisSettings.inverted */
  var inverted: js.UndefOr[Boolean] = js.undefined
  /** @name dxChart.Options.commonAxisSettings.label */
  var label: js.UndefOr[dxChartCommonAxisSettingsLabel] = js.undefined
  /** @name dxChart.Options.commonAxisSettings.maxValueMargin */
  var maxValueMargin: js.UndefOr[Double] = js.undefined
  /** @name dxChart.Options.commonAxisSettings.minValueMargin */
  var minValueMargin: js.UndefOr[Double] = js.undefined
  /** @name dxChart.Options.commonAxisSettings.minorGrid */
  var minorGrid: js.UndefOr[ColorOpacity] = js.undefined
  /** @name dxChart.Options.commonAxisSettings.minorTick */
  var minorTick: js.UndefOr[Length] = js.undefined
  /** @name dxChart.Options.commonAxisSettings.opacity */
  var opacity: js.UndefOr[Double] = js.undefined
  /** @name dxChart.Options.commonAxisSettings.placeholderSize */
  var placeholderSize: js.UndefOr[Double] = js.undefined
  /** @name dxChart.Options.commonAxisSettings.stripStyle */
  var stripStyle: js.UndefOr[dxChartCommonAxisSettingsStripStyle] = js.undefined
  /** @name dxChart.Options.commonAxisSettings.tick */
  var tick: js.UndefOr[Length] = js.undefined
  /** @name dxChart.Options.commonAxisSettings.title */
  var title: js.UndefOr[dxChartCommonAxisSettingsTitle] = js.undefined
  /** @name dxChart.Options.commonAxisSettings.valueMarginsEnabled */
  var valueMarginsEnabled: js.UndefOr[Boolean] = js.undefined
  /** @name dxChart.Options.commonAxisSettings.visible */
  var visible: js.UndefOr[Boolean] = js.undefined
  /** @name dxChart.Options.commonAxisSettings.width */
  var width: js.UndefOr[Double] = js.undefined
}

object dxChartCommonAxisSettings {
  @scala.inline
  def apply(
    allowDecimals: js.UndefOr[Boolean] = js.undefined,
    breakStyle: Line = null,
    color: String = null,
    constantLineStyle: dxChartCommonAxisSettingsConstantLineStyle = null,
    discreteAxisDivisionMode: betweenLabels | crossLabels = null,
    endOnTick: js.UndefOr[Boolean] = js.undefined,
    grid: ColorOpacity = null,
    inverted: js.UndefOr[Boolean] = js.undefined,
    label: dxChartCommonAxisSettingsLabel = null,
    maxValueMargin: js.UndefOr[Double] = js.undefined,
    minValueMargin: js.UndefOr[Double] = js.undefined,
    minorGrid: ColorOpacity = null,
    minorTick: Length = null,
    opacity: js.UndefOr[Double] = js.undefined,
    placeholderSize: js.UndefOr[Double] = js.undefined,
    stripStyle: dxChartCommonAxisSettingsStripStyle = null,
    tick: Length = null,
    title: dxChartCommonAxisSettingsTitle = null,
    valueMarginsEnabled: js.UndefOr[Boolean] = js.undefined,
    visible: js.UndefOr[Boolean] = js.undefined,
    width: js.UndefOr[Double] = js.undefined
  ): dxChartCommonAxisSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowDecimals)) __obj.updateDynamic("allowDecimals")(allowDecimals.get.asInstanceOf[js.Any])
    if (breakStyle != null) __obj.updateDynamic("breakStyle")(breakStyle.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (constantLineStyle != null) __obj.updateDynamic("constantLineStyle")(constantLineStyle.asInstanceOf[js.Any])
    if (discreteAxisDivisionMode != null) __obj.updateDynamic("discreteAxisDivisionMode")(discreteAxisDivisionMode.asInstanceOf[js.Any])
    if (!js.isUndefined(endOnTick)) __obj.updateDynamic("endOnTick")(endOnTick.get.asInstanceOf[js.Any])
    if (grid != null) __obj.updateDynamic("grid")(grid.asInstanceOf[js.Any])
    if (!js.isUndefined(inverted)) __obj.updateDynamic("inverted")(inverted.get.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (!js.isUndefined(maxValueMargin)) __obj.updateDynamic("maxValueMargin")(maxValueMargin.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minValueMargin)) __obj.updateDynamic("minValueMargin")(minValueMargin.get.asInstanceOf[js.Any])
    if (minorGrid != null) __obj.updateDynamic("minorGrid")(minorGrid.asInstanceOf[js.Any])
    if (minorTick != null) __obj.updateDynamic("minorTick")(minorTick.asInstanceOf[js.Any])
    if (!js.isUndefined(opacity)) __obj.updateDynamic("opacity")(opacity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(placeholderSize)) __obj.updateDynamic("placeholderSize")(placeholderSize.get.asInstanceOf[js.Any])
    if (stripStyle != null) __obj.updateDynamic("stripStyle")(stripStyle.asInstanceOf[js.Any])
    if (tick != null) __obj.updateDynamic("tick")(tick.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (!js.isUndefined(valueMarginsEnabled)) __obj.updateDynamic("valueMarginsEnabled")(valueMarginsEnabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxChartCommonAxisSettings]
  }
}

