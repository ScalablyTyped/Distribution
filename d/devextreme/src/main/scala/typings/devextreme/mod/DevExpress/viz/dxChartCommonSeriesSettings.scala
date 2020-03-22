package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.AnonColorLevel
import typings.devextreme.AnonDisplayMode
import typings.devextreme.devextremeStrings.allArgumentPoints
import typings.devextreme.devextremeStrings.allSeriesPoints
import typings.devextreme.devextremeStrings.area
import typings.devextreme.devextremeStrings.bar
import typings.devextreme.devextremeStrings.bubble
import typings.devextreme.devextremeStrings.candlestick
import typings.devextreme.devextremeStrings.dash
import typings.devextreme.devextremeStrings.dot
import typings.devextreme.devextremeStrings.excludePoints
import typings.devextreme.devextremeStrings.fullstackedarea
import typings.devextreme.devextremeStrings.fullstackedbar
import typings.devextreme.devextremeStrings.fullstackedline
import typings.devextreme.devextremeStrings.fullstackedspline
import typings.devextreme.devextremeStrings.fullstackedsplinearea
import typings.devextreme.devextremeStrings.includePoints
import typings.devextreme.devextremeStrings.line
import typings.devextreme.devextremeStrings.longDash
import typings.devextreme.devextremeStrings.nearestPoint
import typings.devextreme.devextremeStrings.none
import typings.devextreme.devextremeStrings.onlyPoint
import typings.devextreme.devextremeStrings.rangearea
import typings.devextreme.devextremeStrings.rangebar_
import typings.devextreme.devextremeStrings.scatter
import typings.devextreme.devextremeStrings.solid
import typings.devextreme.devextremeStrings.spline
import typings.devextreme.devextremeStrings.splinearea
import typings.devextreme.devextremeStrings.stackedarea
import typings.devextreme.devextremeStrings.stackedbar
import typings.devextreme.devextremeStrings.stackedline
import typings.devextreme.devextremeStrings.stackedspline
import typings.devextreme.devextremeStrings.stackedsplinearea
import typings.devextreme.devextremeStrings.steparea
import typings.devextreme.devextremeStrings.stepline
import typings.devextreme.devextremeStrings.stock
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxChartCommonSeriesSettings extends dxChartSeriesTypesCommonSeries {
  /** Defines common settings for all area series. */
  var area: js.UndefOr[js.Any] = js.undefined
  /** Defines common settings for all bar series. */
  var bar: js.UndefOr[js.Any] = js.undefined
  /** Defines common settings for all bubble series. */
  var bubble: js.UndefOr[js.Any] = js.undefined
  /** Defines common settings for all candlestick series. */
  var candlestick: js.UndefOr[js.Any] = js.undefined
  /** Defines common settings for all full-stacked area series. */
  var fullstackedarea: js.UndefOr[js.Any] = js.undefined
  /** Defines common settings for all full-stacked bar series. */
  var fullstackedbar: js.UndefOr[js.Any] = js.undefined
  /** Defines common settings for all full-stacked line series. */
  var fullstackedline: js.UndefOr[js.Any] = js.undefined
  /** Defines common settings for all full-stacked spline series. */
  var fullstackedspline: js.UndefOr[js.Any] = js.undefined
  /** Defines common settings for all full-stacked spline area series. */
  var fullstackedsplinearea: js.UndefOr[js.Any] = js.undefined
  /** Defines common settings for all line series. */
  var line: js.UndefOr[js.Any] = js.undefined
  /** Defines common settings for all range area series. */
  var rangearea: js.UndefOr[js.Any] = js.undefined
  /** Defines common settings for all range bar series. */
  var rangebar: js.UndefOr[js.Any] = js.undefined
  /** Defines common settings for all scatter series. */
  var scatter: js.UndefOr[js.Any] = js.undefined
  /** Defines common settings for all spline series. */
  var spline: js.UndefOr[js.Any] = js.undefined
  /** Defines common settings for all spline area series. */
  var splinearea: js.UndefOr[js.Any] = js.undefined
  /** Defines common settings for all stacked area series. */
  var stackedarea: js.UndefOr[js.Any] = js.undefined
  /** Defines common settings for all stacked bar series. */
  var stackedbar: js.UndefOr[js.Any] = js.undefined
  /** Defines common settings for all stacked line series. */
  var stackedline: js.UndefOr[js.Any] = js.undefined
  /** Defines common settings for all stacked spline series. */
  var stackedspline: js.UndefOr[js.Any] = js.undefined
  /** Defines common settings for all stacked spline area series. */
  var stackedsplinearea: js.UndefOr[js.Any] = js.undefined
  /** Defines common settings for all step area series. */
  var steparea: js.UndefOr[js.Any] = js.undefined
  /** Defines common settings for all step line series. */
  var stepline: js.UndefOr[js.Any] = js.undefined
  /** Defines common settings for all stock series. */
  var stock: js.UndefOr[js.Any] = js.undefined
  /** Specifies the type of the series. */
  var `type`: js.UndefOr[
    area | bar | bubble | candlestick | fullstackedarea | fullstackedbar | fullstackedline | fullstackedspline | fullstackedsplinearea | line | rangearea | rangebar_ | scatter | spline | splinearea | stackedarea | stackedbar | stackedline | stackedspline | stackedsplinearea | steparea | stepline | stock
  ] = js.undefined
}

object dxChartCommonSeriesSettings {
  @scala.inline
  def apply(
    aggregation: dxChartSeriesTypesCommonSeriesAggregation = null,
    area: js.Any = null,
    argumentField: String = null,
    axis: String = null,
    bar: js.Any = null,
    barOverlapGroup: String = null,
    barPadding: Int | Double = null,
    barWidth: Int | Double = null,
    border: dxChartSeriesTypesCommonSeriesBorder = null,
    bubble: js.Any = null,
    candlestick: js.Any = null,
    closeValueField: String = null,
    color: String = null,
    cornerRadius: Int | Double = null,
    dashStyle: dash | dot | longDash | solid = null,
    fullstackedarea: js.Any = null,
    fullstackedbar: js.Any = null,
    fullstackedline: js.Any = null,
    fullstackedspline: js.Any = null,
    fullstackedsplinearea: js.Any = null,
    highValueField: String = null,
    hoverMode: allArgumentPoints | allSeriesPoints | excludePoints | includePoints | nearestPoint | none | onlyPoint = null,
    hoverStyle: dxChartSeriesTypesCommonSeriesHoverStyle = null,
    ignoreEmptyPoints: js.UndefOr[Boolean] = js.undefined,
    innerColor: String = null,
    label: dxChartSeriesTypesCommonSeriesLabel = null,
    line: js.Any = null,
    lowValueField: String = null,
    maxLabelCount: Int | Double = null,
    minBarSize: Int | Double = null,
    opacity: Int | Double = null,
    openValueField: String = null,
    pane: String = null,
    point: dxChartSeriesTypesCommonSeriesPoint = null,
    rangeValue1Field: String = null,
    rangeValue2Field: String = null,
    rangearea: js.Any = null,
    rangebar: js.Any = null,
    reduction: AnonColorLevel = null,
    scatter: js.Any = null,
    selectionMode: allArgumentPoints | allSeriesPoints | excludePoints | includePoints | none | onlyPoint = null,
    selectionStyle: dxChartSeriesTypesCommonSeriesSelectionStyle = null,
    showInLegend: js.UndefOr[Boolean] = js.undefined,
    sizeField: String = null,
    spline: js.Any = null,
    splinearea: js.Any = null,
    stack: String = null,
    stackedarea: js.Any = null,
    stackedbar: js.Any = null,
    stackedline: js.Any = null,
    stackedspline: js.Any = null,
    stackedsplinearea: js.Any = null,
    steparea: js.Any = null,
    stepline: js.Any = null,
    stock: js.Any = null,
    tagField: String = null,
    `type`: area | bar | bubble | candlestick | fullstackedarea | fullstackedbar | fullstackedline | fullstackedspline | fullstackedsplinearea | line | rangearea | rangebar_ | scatter | spline | splinearea | stackedarea | stackedbar | stackedline | stackedspline | stackedsplinearea | steparea | stepline | stock = null,
    valueErrorBar: AnonDisplayMode = null,
    valueField: String = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    width: Int | Double = null
  ): dxChartCommonSeriesSettings = {
    val __obj = js.Dynamic.literal()
    if (aggregation != null) __obj.updateDynamic("aggregation")(aggregation.asInstanceOf[js.Any])
    if (area != null) __obj.updateDynamic("area")(area.asInstanceOf[js.Any])
    if (argumentField != null) __obj.updateDynamic("argumentField")(argumentField.asInstanceOf[js.Any])
    if (axis != null) __obj.updateDynamic("axis")(axis.asInstanceOf[js.Any])
    if (bar != null) __obj.updateDynamic("bar")(bar.asInstanceOf[js.Any])
    if (barOverlapGroup != null) __obj.updateDynamic("barOverlapGroup")(barOverlapGroup.asInstanceOf[js.Any])
    if (barPadding != null) __obj.updateDynamic("barPadding")(barPadding.asInstanceOf[js.Any])
    if (barWidth != null) __obj.updateDynamic("barWidth")(barWidth.asInstanceOf[js.Any])
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (bubble != null) __obj.updateDynamic("bubble")(bubble.asInstanceOf[js.Any])
    if (candlestick != null) __obj.updateDynamic("candlestick")(candlestick.asInstanceOf[js.Any])
    if (closeValueField != null) __obj.updateDynamic("closeValueField")(closeValueField.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (cornerRadius != null) __obj.updateDynamic("cornerRadius")(cornerRadius.asInstanceOf[js.Any])
    if (dashStyle != null) __obj.updateDynamic("dashStyle")(dashStyle.asInstanceOf[js.Any])
    if (fullstackedarea != null) __obj.updateDynamic("fullstackedarea")(fullstackedarea.asInstanceOf[js.Any])
    if (fullstackedbar != null) __obj.updateDynamic("fullstackedbar")(fullstackedbar.asInstanceOf[js.Any])
    if (fullstackedline != null) __obj.updateDynamic("fullstackedline")(fullstackedline.asInstanceOf[js.Any])
    if (fullstackedspline != null) __obj.updateDynamic("fullstackedspline")(fullstackedspline.asInstanceOf[js.Any])
    if (fullstackedsplinearea != null) __obj.updateDynamic("fullstackedsplinearea")(fullstackedsplinearea.asInstanceOf[js.Any])
    if (highValueField != null) __obj.updateDynamic("highValueField")(highValueField.asInstanceOf[js.Any])
    if (hoverMode != null) __obj.updateDynamic("hoverMode")(hoverMode.asInstanceOf[js.Any])
    if (hoverStyle != null) __obj.updateDynamic("hoverStyle")(hoverStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreEmptyPoints)) __obj.updateDynamic("ignoreEmptyPoints")(ignoreEmptyPoints.asInstanceOf[js.Any])
    if (innerColor != null) __obj.updateDynamic("innerColor")(innerColor.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (line != null) __obj.updateDynamic("line")(line.asInstanceOf[js.Any])
    if (lowValueField != null) __obj.updateDynamic("lowValueField")(lowValueField.asInstanceOf[js.Any])
    if (maxLabelCount != null) __obj.updateDynamic("maxLabelCount")(maxLabelCount.asInstanceOf[js.Any])
    if (minBarSize != null) __obj.updateDynamic("minBarSize")(minBarSize.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (openValueField != null) __obj.updateDynamic("openValueField")(openValueField.asInstanceOf[js.Any])
    if (pane != null) __obj.updateDynamic("pane")(pane.asInstanceOf[js.Any])
    if (point != null) __obj.updateDynamic("point")(point.asInstanceOf[js.Any])
    if (rangeValue1Field != null) __obj.updateDynamic("rangeValue1Field")(rangeValue1Field.asInstanceOf[js.Any])
    if (rangeValue2Field != null) __obj.updateDynamic("rangeValue2Field")(rangeValue2Field.asInstanceOf[js.Any])
    if (rangearea != null) __obj.updateDynamic("rangearea")(rangearea.asInstanceOf[js.Any])
    if (rangebar != null) __obj.updateDynamic("rangebar")(rangebar.asInstanceOf[js.Any])
    if (reduction != null) __obj.updateDynamic("reduction")(reduction.asInstanceOf[js.Any])
    if (scatter != null) __obj.updateDynamic("scatter")(scatter.asInstanceOf[js.Any])
    if (selectionMode != null) __obj.updateDynamic("selectionMode")(selectionMode.asInstanceOf[js.Any])
    if (selectionStyle != null) __obj.updateDynamic("selectionStyle")(selectionStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(showInLegend)) __obj.updateDynamic("showInLegend")(showInLegend.asInstanceOf[js.Any])
    if (sizeField != null) __obj.updateDynamic("sizeField")(sizeField.asInstanceOf[js.Any])
    if (spline != null) __obj.updateDynamic("spline")(spline.asInstanceOf[js.Any])
    if (splinearea != null) __obj.updateDynamic("splinearea")(splinearea.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    if (stackedarea != null) __obj.updateDynamic("stackedarea")(stackedarea.asInstanceOf[js.Any])
    if (stackedbar != null) __obj.updateDynamic("stackedbar")(stackedbar.asInstanceOf[js.Any])
    if (stackedline != null) __obj.updateDynamic("stackedline")(stackedline.asInstanceOf[js.Any])
    if (stackedspline != null) __obj.updateDynamic("stackedspline")(stackedspline.asInstanceOf[js.Any])
    if (stackedsplinearea != null) __obj.updateDynamic("stackedsplinearea")(stackedsplinearea.asInstanceOf[js.Any])
    if (steparea != null) __obj.updateDynamic("steparea")(steparea.asInstanceOf[js.Any])
    if (stepline != null) __obj.updateDynamic("stepline")(stepline.asInstanceOf[js.Any])
    if (stock != null) __obj.updateDynamic("stock")(stock.asInstanceOf[js.Any])
    if (tagField != null) __obj.updateDynamic("tagField")(tagField.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (valueErrorBar != null) __obj.updateDynamic("valueErrorBar")(valueErrorBar.asInstanceOf[js.Any])
    if (valueField != null) __obj.updateDynamic("valueField")(valueField.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxChartCommonSeriesSettings]
  }
}

