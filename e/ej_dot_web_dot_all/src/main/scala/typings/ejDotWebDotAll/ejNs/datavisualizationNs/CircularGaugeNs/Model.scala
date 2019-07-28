package typings.ejDotWebDotAll.ejNs.datavisualizationNs.CircularGaugeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Model extends js.Object {
  /** Specifies animationSpeed of circular gauge
    * @Default {500}
    */
  var animationSpeed: js.UndefOr[Double] = js.undefined
  /** Specifies the background color of circular gauge.
    * @Default {null}
    */
  var backgroundColor: js.UndefOr[String] = js.undefined
  /** Specify distanceFromCorner value of circular gauge
    * @Default {center}
    */
  var distanceFromCorner: js.UndefOr[Double] = js.undefined
  /** Fires, on double clicking the circular gauge.
    */
  var doubleClick: js.UndefOr[js.Function1[/* e */ DoubleClickEventArgs, Unit]] = js.undefined
  /** Triggers while the custom labels are being drawn on the gauge.
    */
  var drawCustomLabel: js.UndefOr[js.Function1[/* e */ DrawCustomLabelEventArgs, Unit]] = js.undefined
  /** Triggers while the indicators are being started to drawn on the gauge.
    */
  var drawIndicators: js.UndefOr[js.Function1[/* e */ DrawIndicatorsEventArgs, Unit]] = js.undefined
  /** Triggers while the labels are being drawn on the gauge.
    */
  var drawLabels: js.UndefOr[js.Function1[/* e */ DrawLabelsEventArgs, Unit]] = js.undefined
  /** Triggers while the pointer cap is being drawn on the gauge.
    */
  var drawPointerCap: js.UndefOr[js.Function1[/* e */ DrawPointerCapEventArgs, Unit]] = js.undefined
  /** Triggers while the pointers are being drawn on the gauge.
    */
  var drawPointers: js.UndefOr[js.Function1[/* e */ DrawPointersEventArgs, Unit]] = js.undefined
  /** Triggers when the ranges begin to be getting drawn on the gauge.
    */
  var drawRange: js.UndefOr[js.Function1[/* e */ DrawRangeEventArgs, Unit]] = js.undefined
  /** Triggers while the ticks are being drawn on the gauge.
    */
  var drawTicks: js.UndefOr[js.Function1[/* e */ DrawTicksEventArgs, Unit]] = js.undefined
  /** Specify animate value of circular gauge
    * @Default {true}
    */
  var enableAnimation: js.UndefOr[Boolean] = js.undefined
  /** Specify to convert the  date object to  string, using locale settings.
    * @Default {false}
    */
  var enableGroupSeparator: js.UndefOr[Boolean] = js.undefined
  /** Controls whether circular gauge has to be responsive while resizing.
    * @Default {false}
    */
  var enableResize: js.UndefOr[Boolean] = js.undefined
  /** This provides options for customizing export settings
    */
  var exportSettings: js.UndefOr[ExportSettings] = js.undefined
  /** Specify the frame of circular gauge
    * @Default {Object}
    */
  var frame: js.UndefOr[Frame] = js.undefined
  /** Specify gaugePosition value of circular gauge See GaugePosition
    * @Default {center}
    */
  var gaugePosition: js.UndefOr[
    typings.ejDotWebDotAll.ejNs.datavisualizationNs.CircularGaugeNs.gaugePosition | String
  ] = js.undefined
  /** Specifies the height of circular gauge.
    * @Default {360}
    */
  var height: js.UndefOr[Double] = js.undefined
  /** Specifies the interiorGradient of circular gauge.
    * @Default {null}
    */
  var interiorGradient: js.UndefOr[js.Any] = js.undefined
  /** Specify isRadialGradient value of circular gauge
    * @Default {false}
    */
  var isRadialGradient: js.UndefOr[Boolean] = js.undefined
  /** Specify isResponsive value of circular gauge
    * @Default {false}
    */
  var isResponsive: js.UndefOr[Boolean] = js.undefined
  /** Options to customize the legend.
    */
  var legend: js.UndefOr[Legend] = js.undefined
  /** Fires on clicking the legend item.
    */
  var legendItemClick: js.UndefOr[js.Function1[/* e */ LegendItemClickEventArgs, Unit]] = js.undefined
  /** Fires before rendering the legend item. This event is fired for each legend item in CircularGauge. You can use this event to customize legend item shape or add custom text to
    * legend item.
    */
  var legendItemRender: js.UndefOr[js.Function1[/* e */ LegendItemRenderEventArgs, Unit]] = js.undefined
  /** Triggers while the gauge start to Load.
    */
  var load: js.UndefOr[js.Function1[/* e */ LoadEventArgs, Unit]] = js.undefined
  /** Name of the culture based on which circular gauge should be localized.
    * @Default {en-US}
    */
  var locale: js.UndefOr[String] = js.undefined
  /** Specifies the maximum value of circular gauge.
    * @Default {100}
    */
  var maximum: js.UndefOr[Double] = js.undefined
  /** Specifies the minimum value of circular gauge.
    * @Default {0}
    */
  var minimum: js.UndefOr[Double] = js.undefined
  /** Triggers when the left mouse button is clicked.
    */
  var mouseClick: js.UndefOr[js.Function1[/* e */ MouseClickEventArgs, Unit]] = js.undefined
  /** Triggers when clicking and dragging the mouse pointer over the gauge pointer.
    */
  var mouseClickMove: js.UndefOr[js.Function1[/* e */ MouseClickMoveEventArgs, Unit]] = js.undefined
  /** Triggers when the mouse click is released.
    */
  var mouseClickUp: js.UndefOr[js.Function1[/* e */ MouseClickUpEventArgs, Unit]] = js.undefined
  /** Specify outerCustomLabelPosition value of circular gauge See
    * @Default {bottom}
    */
  var outerCustomLabelPosition: js.UndefOr[OuterCustomLabelPosition | String] = js.undefined
  /** Specifies the radius of circular gauge.
    * @Default {180}
    */
  var radius: js.UndefOr[Double] = js.undefined
  /** Fires when mouse moving on ranges.
    */
  var rangeMouseMove: js.UndefOr[js.Function1[/* e */ RangeMouseMoveEventArgs, Unit]] = js.undefined
  /** Specify range Z-order placement of circular gauge.
    * @Default {Rear}
    */
  var rangeZOrder: js.UndefOr[RangeZOrderPlacement | String] = js.undefined
  /** Specify readonly value of circular gauge
    * @Default {true}
    */
  var readOnly: js.UndefOr[Boolean] = js.undefined
  /** Triggers when the rendering of the gauge is completed.
    */
  var renderComplete: js.UndefOr[js.Function1[/* e */ RenderCompleteEventArgs, Unit]] = js.undefined
  /** Fires, on right clicking the circular gauge.
    */
  var rightClick: js.UndefOr[js.Function1[/* e */ RightClickEventArgs, Unit]] = js.undefined
  /** Specify the pointers, ticks, labels, indicators, ranges of circular gauge
    * @Default {null}
    */
  var scales: js.UndefOr[js.Array[Scale]] = js.undefined
  /** Specify the theme of circular gauge.
    * @Default {flatlight}
    */
  var theme: js.UndefOr[String] = js.undefined
  /** Specify tooltip option of circular gauge
    * @Default {object}
    */
  var tooltip: js.UndefOr[typings.ejDotWebDotAll.ejNs.datavisualizationNs.CircularGaugeNs.Tooltip] = js.undefined
  /** Specifies the value of circular gauge.
    * @Default {0}
    */
  var value: js.UndefOr[Double] = js.undefined
  /** Specifies the width of circular gauge.
    * @Default {360}
    */
  var width: js.UndefOr[Double] = js.undefined
}

object Model {
  @scala.inline
  def apply(
    animationSpeed: Int | Double = null,
    backgroundColor: String = null,
    distanceFromCorner: Int | Double = null,
    doubleClick: /* e */ DoubleClickEventArgs => Unit = null,
    drawCustomLabel: /* e */ DrawCustomLabelEventArgs => Unit = null,
    drawIndicators: /* e */ DrawIndicatorsEventArgs => Unit = null,
    drawLabels: /* e */ DrawLabelsEventArgs => Unit = null,
    drawPointerCap: /* e */ DrawPointerCapEventArgs => Unit = null,
    drawPointers: /* e */ DrawPointersEventArgs => Unit = null,
    drawRange: /* e */ DrawRangeEventArgs => Unit = null,
    drawTicks: /* e */ DrawTicksEventArgs => Unit = null,
    enableAnimation: js.UndefOr[Boolean] = js.undefined,
    enableGroupSeparator: js.UndefOr[Boolean] = js.undefined,
    enableResize: js.UndefOr[Boolean] = js.undefined,
    exportSettings: ExportSettings = null,
    frame: Frame = null,
    gaugePosition: gaugePosition | String = null,
    height: Int | Double = null,
    interiorGradient: js.Any = null,
    isRadialGradient: js.UndefOr[Boolean] = js.undefined,
    isResponsive: js.UndefOr[Boolean] = js.undefined,
    legend: Legend = null,
    legendItemClick: /* e */ LegendItemClickEventArgs => Unit = null,
    legendItemRender: /* e */ LegendItemRenderEventArgs => Unit = null,
    load: /* e */ LoadEventArgs => Unit = null,
    locale: String = null,
    maximum: Int | Double = null,
    minimum: Int | Double = null,
    mouseClick: /* e */ MouseClickEventArgs => Unit = null,
    mouseClickMove: /* e */ MouseClickMoveEventArgs => Unit = null,
    mouseClickUp: /* e */ MouseClickUpEventArgs => Unit = null,
    outerCustomLabelPosition: OuterCustomLabelPosition | String = null,
    radius: Int | Double = null,
    rangeMouseMove: /* e */ RangeMouseMoveEventArgs => Unit = null,
    rangeZOrder: RangeZOrderPlacement | String = null,
    readOnly: js.UndefOr[Boolean] = js.undefined,
    renderComplete: /* e */ RenderCompleteEventArgs => Unit = null,
    rightClick: /* e */ RightClickEventArgs => Unit = null,
    scales: js.Array[Scale] = null,
    theme: String = null,
    tooltip: typings.ejDotWebDotAll.ejNs.datavisualizationNs.CircularGaugeNs.Tooltip = null,
    value: Int | Double = null,
    width: Int | Double = null
  ): Model = {
    val __obj = js.Dynamic.literal()
    if (animationSpeed != null) __obj.updateDynamic("animationSpeed")(animationSpeed.asInstanceOf[js.Any])
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor)
    if (distanceFromCorner != null) __obj.updateDynamic("distanceFromCorner")(distanceFromCorner.asInstanceOf[js.Any])
    if (doubleClick != null) __obj.updateDynamic("doubleClick")(js.Any.fromFunction1(doubleClick))
    if (drawCustomLabel != null) __obj.updateDynamic("drawCustomLabel")(js.Any.fromFunction1(drawCustomLabel))
    if (drawIndicators != null) __obj.updateDynamic("drawIndicators")(js.Any.fromFunction1(drawIndicators))
    if (drawLabels != null) __obj.updateDynamic("drawLabels")(js.Any.fromFunction1(drawLabels))
    if (drawPointerCap != null) __obj.updateDynamic("drawPointerCap")(js.Any.fromFunction1(drawPointerCap))
    if (drawPointers != null) __obj.updateDynamic("drawPointers")(js.Any.fromFunction1(drawPointers))
    if (drawRange != null) __obj.updateDynamic("drawRange")(js.Any.fromFunction1(drawRange))
    if (drawTicks != null) __obj.updateDynamic("drawTicks")(js.Any.fromFunction1(drawTicks))
    if (!js.isUndefined(enableAnimation)) __obj.updateDynamic("enableAnimation")(enableAnimation)
    if (!js.isUndefined(enableGroupSeparator)) __obj.updateDynamic("enableGroupSeparator")(enableGroupSeparator)
    if (!js.isUndefined(enableResize)) __obj.updateDynamic("enableResize")(enableResize)
    if (exportSettings != null) __obj.updateDynamic("exportSettings")(exportSettings)
    if (frame != null) __obj.updateDynamic("frame")(frame)
    if (gaugePosition != null) __obj.updateDynamic("gaugePosition")(gaugePosition.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (interiorGradient != null) __obj.updateDynamic("interiorGradient")(interiorGradient)
    if (!js.isUndefined(isRadialGradient)) __obj.updateDynamic("isRadialGradient")(isRadialGradient)
    if (!js.isUndefined(isResponsive)) __obj.updateDynamic("isResponsive")(isResponsive)
    if (legend != null) __obj.updateDynamic("legend")(legend)
    if (legendItemClick != null) __obj.updateDynamic("legendItemClick")(js.Any.fromFunction1(legendItemClick))
    if (legendItemRender != null) __obj.updateDynamic("legendItemRender")(js.Any.fromFunction1(legendItemRender))
    if (load != null) __obj.updateDynamic("load")(js.Any.fromFunction1(load))
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (maximum != null) __obj.updateDynamic("maximum")(maximum.asInstanceOf[js.Any])
    if (minimum != null) __obj.updateDynamic("minimum")(minimum.asInstanceOf[js.Any])
    if (mouseClick != null) __obj.updateDynamic("mouseClick")(js.Any.fromFunction1(mouseClick))
    if (mouseClickMove != null) __obj.updateDynamic("mouseClickMove")(js.Any.fromFunction1(mouseClickMove))
    if (mouseClickUp != null) __obj.updateDynamic("mouseClickUp")(js.Any.fromFunction1(mouseClickUp))
    if (outerCustomLabelPosition != null) __obj.updateDynamic("outerCustomLabelPosition")(outerCustomLabelPosition.asInstanceOf[js.Any])
    if (radius != null) __obj.updateDynamic("radius")(radius.asInstanceOf[js.Any])
    if (rangeMouseMove != null) __obj.updateDynamic("rangeMouseMove")(js.Any.fromFunction1(rangeMouseMove))
    if (rangeZOrder != null) __obj.updateDynamic("rangeZOrder")(rangeZOrder.asInstanceOf[js.Any])
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly)
    if (renderComplete != null) __obj.updateDynamic("renderComplete")(js.Any.fromFunction1(renderComplete))
    if (rightClick != null) __obj.updateDynamic("rightClick")(js.Any.fromFunction1(rightClick))
    if (scales != null) __obj.updateDynamic("scales")(scales)
    if (theme != null) __obj.updateDynamic("theme")(theme)
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Model]
  }
}

