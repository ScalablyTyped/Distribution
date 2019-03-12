package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.LinearGaugeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Model extends js.Object {
  /** Specifies the animationSpeed
    * @Default {500}
    */
  var animationSpeed: js.UndefOr[scala.Double] = js.undefined
  /** Specifies the backgroundColor for Linear gauge.
    * @Default {null}
    */
  var backgroundColor: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the borderColor for Linear gauge.
    * @Default {null}
    */
  var borderColor: js.UndefOr[java.lang.String] = js.undefined
  /** Fires, on double clicking the gauge.
    */
  var doubleClick: js.UndefOr[js.Function1[/* e */ DoubleClickEventArgs, scala.Unit]] = js.undefined
  /** Triggers while the bar pointer are being drawn on the gauge.
    */
  var drawBarPointers: js.UndefOr[js.Function1[/* e */ DrawBarPointersEventArgs, scala.Unit]] = js.undefined
  /** Triggers while the customLabel are being drawn on the gauge.
    */
  var drawCustomLabel: js.UndefOr[js.Function1[/* e */ DrawCustomLabelEventArgs, scala.Unit]] = js.undefined
  /** Triggers while the Indicator are being drawn on the gauge.
    */
  var drawIndicators: js.UndefOr[js.Function1[/* e */ DrawIndicatorsEventArgs, scala.Unit]] = js.undefined
  /** Triggers while the label are being drawn on the gauge.
    */
  var drawLabels: js.UndefOr[js.Function1[/* e */ DrawLabelsEventArgs, scala.Unit]] = js.undefined
  /** Triggers while the marker are being drawn on the gauge.
    */
  var drawMarkerPointers: js.UndefOr[js.Function1[/* e */ DrawMarkerPointersEventArgs, scala.Unit]] = js.undefined
  /** Triggers while the range are being drawn on the gauge.
    */
  var drawRange: js.UndefOr[js.Function1[/* e */ DrawRangeEventArgs, scala.Unit]] = js.undefined
  /** Triggers while the ticks are being drawn on the gauge.
    */
  var drawTicks: js.UndefOr[js.Function1[/* e */ DrawTicksEventArgs, scala.Unit]] = js.undefined
  /** Specifies the animate state
    * @Default {true}
    */
  var enableAnimation: js.UndefOr[scala.Boolean] = js.undefined
  /** Used to Convert the date object to  string while using the  locale settings
    * @Default {false}
    */
  var enableGroupSeparator: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies the animate state for marker pointer
    * @Default {true}
    */
  var enableMarkerPointerAnimation: js.UndefOr[scala.Boolean] = js.undefined
  /** Responsiveness of the linear gauge is controlled
    * @Default {false}
    */
  var enableResize: js.UndefOr[scala.Boolean] = js.undefined
  /** This provides options for customizing export settings
    */
  var exportSettings: js.UndefOr[ExportSettings] = js.undefined
  /** Specify frame of linear gauge
    * @Default {null}
    */
  var frame: js.UndefOr[Frame] = js.undefined
  /** Specifies the height of Linear gauge.
    * @Default {400}
    */
  var height: js.UndefOr[scala.Double] = js.undefined
  /** Triggers when the gauge is initialized.
    */
  var init: js.UndefOr[js.Function1[/* e */ InitEventArgs, scala.Unit]] = js.undefined
  /** Specifies the can resize state.
    * @Default {false}
    */
  var isResponsive: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies the labelColor for Linear gauge.
    * @Default {null}
    */
  var labelColor: js.UndefOr[java.lang.String] = js.undefined
  /** Triggers while the gauge start to Load.
    */
  var load: js.UndefOr[js.Function1[/* e */ LoadEventArgs, scala.Unit]] = js.undefined
  /** Set the  localization culture  for the Linear gauge
    * @Default {en-US}
    */
  var locale: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the maximum value of Linear gauge.
    * @Default {100}
    */
  var maximum: js.UndefOr[scala.Double] = js.undefined
  /** Specifies the minimum value of Linear gauge.
    * @Default {0}
    */
  var minimum: js.UndefOr[scala.Double] = js.undefined
  /** Triggers when the left mouse button is clicked.
    */
  var mouseClick: js.UndefOr[js.Function1[/* e */ MouseClickEventArgs, scala.Unit]] = js.undefined
  /** Triggers when clicking and dragging the mouse pointer over the gauge pointer.
    */
  var mouseClickMove: js.UndefOr[js.Function1[/* e */ MouseClickMoveEventArgs, scala.Unit]] = js.undefined
  /** Triggers when the mouse click is released.
    */
  var mouseClickUp: js.UndefOr[js.Function1[/* e */ MouseClickUpEventArgs, scala.Unit]] = js.undefined
  /** Specifies the orientation for Linear gauge.
    * @Default {Vertical}
    */
  var orientation: js.UndefOr[java.lang.String] = js.undefined
  /** Specify labelPosition value of Linear gauge See
    * @Default {bottom}
    */
  var outerCustomLabelPosition: js.UndefOr[OuterCustomLabelPosition | java.lang.String] = js.undefined
  /** Specifies the pointerGradient1 for Linear gauge.
    * @Default {null}
    */
  var pointerGradient1: js.UndefOr[js.Any] = js.undefined
  /** Specifies the pointerGradient2 for Linear gauge.
    * @Default {null}
    */
  var pointerGradient2: js.UndefOr[js.Any] = js.undefined
  /** Specifies the read only state.
    * @Default {true}
    */
  var readOnly: js.UndefOr[scala.Boolean] = js.undefined
  /** Triggers while the rendering of the gauge completed.
    */
  var renderComplete: js.UndefOr[js.Function1[/* e */ RenderCompleteEventArgs, scala.Unit]] = js.undefined
  /** Fires, on right clicking the gauge.
    */
  var rightClick: js.UndefOr[js.Function1[/* e */ RightClickEventArgs, scala.Unit]] = js.undefined
  /** Specifies the scales
    * @Default {null}
    */
  var scales: js.UndefOr[js.Array[Scale]] = js.undefined
  /** Specifies the theme for Linear gauge. See LinearGauge.Themes
    * @Default {flatlight}
    */
  var theme: js.UndefOr[Themes | java.lang.String] = js.undefined
  /** Specifies the tick Color for Linear gauge.
    * @Default {null}
    */
  var tickColor: js.UndefOr[java.lang.String] = js.undefined
  /** Specify tooltip options of linear gauge
    * @Default {false}
    */
  var tooltip: js.UndefOr[Tooltip] = js.undefined
  /** Specifies the value of the Gauge.
    * @Default {0}
    */
  var value: js.UndefOr[scala.Double] = js.undefined
  /** Specifies the width of Linear gauge.
    * @Default {150}
    */
  var width: js.UndefOr[scala.Double] = js.undefined
}

object Model {
  @scala.inline
  def apply(
    animationSpeed: scala.Int | scala.Double = null,
    backgroundColor: java.lang.String = null,
    borderColor: java.lang.String = null,
    doubleClick: /* e */ DoubleClickEventArgs => scala.Unit = null,
    drawBarPointers: /* e */ DrawBarPointersEventArgs => scala.Unit = null,
    drawCustomLabel: /* e */ DrawCustomLabelEventArgs => scala.Unit = null,
    drawIndicators: /* e */ DrawIndicatorsEventArgs => scala.Unit = null,
    drawLabels: /* e */ DrawLabelsEventArgs => scala.Unit = null,
    drawMarkerPointers: /* e */ DrawMarkerPointersEventArgs => scala.Unit = null,
    drawRange: /* e */ DrawRangeEventArgs => scala.Unit = null,
    drawTicks: /* e */ DrawTicksEventArgs => scala.Unit = null,
    enableAnimation: js.UndefOr[scala.Boolean] = js.undefined,
    enableGroupSeparator: js.UndefOr[scala.Boolean] = js.undefined,
    enableMarkerPointerAnimation: js.UndefOr[scala.Boolean] = js.undefined,
    enableResize: js.UndefOr[scala.Boolean] = js.undefined,
    exportSettings: ExportSettings = null,
    frame: Frame = null,
    height: scala.Int | scala.Double = null,
    init: /* e */ InitEventArgs => scala.Unit = null,
    isResponsive: js.UndefOr[scala.Boolean] = js.undefined,
    labelColor: java.lang.String = null,
    load: /* e */ LoadEventArgs => scala.Unit = null,
    locale: java.lang.String = null,
    maximum: scala.Int | scala.Double = null,
    minimum: scala.Int | scala.Double = null,
    mouseClick: /* e */ MouseClickEventArgs => scala.Unit = null,
    mouseClickMove: /* e */ MouseClickMoveEventArgs => scala.Unit = null,
    mouseClickUp: /* e */ MouseClickUpEventArgs => scala.Unit = null,
    orientation: java.lang.String = null,
    outerCustomLabelPosition: OuterCustomLabelPosition | java.lang.String = null,
    pointerGradient1: js.Any = null,
    pointerGradient2: js.Any = null,
    readOnly: js.UndefOr[scala.Boolean] = js.undefined,
    renderComplete: /* e */ RenderCompleteEventArgs => scala.Unit = null,
    rightClick: /* e */ RightClickEventArgs => scala.Unit = null,
    scales: js.Array[Scale] = null,
    theme: Themes | java.lang.String = null,
    tickColor: java.lang.String = null,
    tooltip: Tooltip = null,
    value: scala.Int | scala.Double = null,
    width: scala.Int | scala.Double = null
  ): Model = {
    val __obj = js.Dynamic.literal()
    if (animationSpeed != null) __obj.updateDynamic("animationSpeed")(animationSpeed.asInstanceOf[js.Any])
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor)
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor)
    if (doubleClick != null) __obj.updateDynamic("doubleClick")(js.Any.fromFunction1(doubleClick))
    if (drawBarPointers != null) __obj.updateDynamic("drawBarPointers")(js.Any.fromFunction1(drawBarPointers))
    if (drawCustomLabel != null) __obj.updateDynamic("drawCustomLabel")(js.Any.fromFunction1(drawCustomLabel))
    if (drawIndicators != null) __obj.updateDynamic("drawIndicators")(js.Any.fromFunction1(drawIndicators))
    if (drawLabels != null) __obj.updateDynamic("drawLabels")(js.Any.fromFunction1(drawLabels))
    if (drawMarkerPointers != null) __obj.updateDynamic("drawMarkerPointers")(js.Any.fromFunction1(drawMarkerPointers))
    if (drawRange != null) __obj.updateDynamic("drawRange")(js.Any.fromFunction1(drawRange))
    if (drawTicks != null) __obj.updateDynamic("drawTicks")(js.Any.fromFunction1(drawTicks))
    if (!js.isUndefined(enableAnimation)) __obj.updateDynamic("enableAnimation")(enableAnimation)
    if (!js.isUndefined(enableGroupSeparator)) __obj.updateDynamic("enableGroupSeparator")(enableGroupSeparator)
    if (!js.isUndefined(enableMarkerPointerAnimation)) __obj.updateDynamic("enableMarkerPointerAnimation")(enableMarkerPointerAnimation)
    if (!js.isUndefined(enableResize)) __obj.updateDynamic("enableResize")(enableResize)
    if (exportSettings != null) __obj.updateDynamic("exportSettings")(exportSettings)
    if (frame != null) __obj.updateDynamic("frame")(frame)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (init != null) __obj.updateDynamic("init")(js.Any.fromFunction1(init))
    if (!js.isUndefined(isResponsive)) __obj.updateDynamic("isResponsive")(isResponsive)
    if (labelColor != null) __obj.updateDynamic("labelColor")(labelColor)
    if (load != null) __obj.updateDynamic("load")(js.Any.fromFunction1(load))
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (maximum != null) __obj.updateDynamic("maximum")(maximum.asInstanceOf[js.Any])
    if (minimum != null) __obj.updateDynamic("minimum")(minimum.asInstanceOf[js.Any])
    if (mouseClick != null) __obj.updateDynamic("mouseClick")(js.Any.fromFunction1(mouseClick))
    if (mouseClickMove != null) __obj.updateDynamic("mouseClickMove")(js.Any.fromFunction1(mouseClickMove))
    if (mouseClickUp != null) __obj.updateDynamic("mouseClickUp")(js.Any.fromFunction1(mouseClickUp))
    if (orientation != null) __obj.updateDynamic("orientation")(orientation)
    if (outerCustomLabelPosition != null) __obj.updateDynamic("outerCustomLabelPosition")(outerCustomLabelPosition.asInstanceOf[js.Any])
    if (pointerGradient1 != null) __obj.updateDynamic("pointerGradient1")(pointerGradient1)
    if (pointerGradient2 != null) __obj.updateDynamic("pointerGradient2")(pointerGradient2)
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly)
    if (renderComplete != null) __obj.updateDynamic("renderComplete")(js.Any.fromFunction1(renderComplete))
    if (rightClick != null) __obj.updateDynamic("rightClick")(js.Any.fromFunction1(rightClick))
    if (scales != null) __obj.updateDynamic("scales")(scales)
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (tickColor != null) __obj.updateDynamic("tickColor")(tickColor)
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Model]
  }
}

