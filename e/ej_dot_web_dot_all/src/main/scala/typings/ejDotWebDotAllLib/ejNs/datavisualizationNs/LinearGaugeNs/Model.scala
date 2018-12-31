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

