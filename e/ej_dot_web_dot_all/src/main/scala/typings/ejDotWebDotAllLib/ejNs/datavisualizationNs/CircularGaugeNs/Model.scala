package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.CircularGaugeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Model extends js.Object {
  /** Specifies animationSpeed of circular gauge
    * @Default {500}
    */
  var animationSpeed: js.UndefOr[scala.Double] = js.undefined
  /** Specifies the background color of circular gauge.
    * @Default {null}
    */
  var backgroundColor: js.UndefOr[java.lang.String] = js.undefined
  /** Specify distanceFromCorner value of circular gauge
    * @Default {center}
    */
  var distanceFromCorner: js.UndefOr[scala.Double] = js.undefined
  /** Fires, on double clicking the circular gauge.
    */
  var doubleClick: js.UndefOr[js.Function1[/* e */ DoubleClickEventArgs, scala.Unit]] = js.undefined
  /** Triggers while the custom labels are being drawn on the gauge.
    */
  var drawCustomLabel: js.UndefOr[js.Function1[/* e */ DrawCustomLabelEventArgs, scala.Unit]] = js.undefined
  /** Triggers while the indicators are being started to drawn on the gauge.
    */
  var drawIndicators: js.UndefOr[js.Function1[/* e */ DrawIndicatorsEventArgs, scala.Unit]] = js.undefined
  /** Triggers while the labels are being drawn on the gauge.
    */
  var drawLabels: js.UndefOr[js.Function1[/* e */ DrawLabelsEventArgs, scala.Unit]] = js.undefined
  /** Triggers while the pointer cap is being drawn on the gauge.
    */
  var drawPointerCap: js.UndefOr[js.Function1[/* e */ DrawPointerCapEventArgs, scala.Unit]] = js.undefined
  /** Triggers while the pointers are being drawn on the gauge.
    */
  var drawPointers: js.UndefOr[js.Function1[/* e */ DrawPointersEventArgs, scala.Unit]] = js.undefined
  /** Triggers when the ranges begin to be getting drawn on the gauge.
    */
  var drawRange: js.UndefOr[js.Function1[/* e */ DrawRangeEventArgs, scala.Unit]] = js.undefined
  /** Triggers while the ticks are being drawn on the gauge.
    */
  var drawTicks: js.UndefOr[js.Function1[/* e */ DrawTicksEventArgs, scala.Unit]] = js.undefined
  /** Specify animate value of circular gauge
    * @Default {true}
    */
  var enableAnimation: js.UndefOr[scala.Boolean] = js.undefined
  /** Specify to convert the  date object to  string, using locale settings.
    * @Default {false}
    */
  var enableGroupSeparator: js.UndefOr[scala.Boolean] = js.undefined
  /** Controls whether circular gauge has to be responsive while resizing.
    * @Default {false}
    */
  var enableResize: js.UndefOr[scala.Boolean] = js.undefined
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
  var gaugePosition: js.UndefOr[gaugePosition | java.lang.String] = js.undefined
  /** Specifies the height of circular gauge.
    * @Default {360}
    */
  var height: js.UndefOr[scala.Double] = js.undefined
  /** Specifies the interiorGradient of circular gauge.
    * @Default {null}
    */
  var interiorGradient: js.UndefOr[js.Any] = js.undefined
  /** Specify isRadialGradient value of circular gauge
    * @Default {false}
    */
  var isRadialGradient: js.UndefOr[scala.Boolean] = js.undefined
  /** Specify isResponsive value of circular gauge
    * @Default {false}
    */
  var isResponsive: js.UndefOr[scala.Boolean] = js.undefined
  /** Options to customize the legend.
    */
  var legend: js.UndefOr[Legend] = js.undefined
  /** Fires on clicking the legend item.
    */
  var legendItemClick: js.UndefOr[js.Function1[/* e */ LegendItemClickEventArgs, scala.Unit]] = js.undefined
  /** Fires before rendering the legend item. This event is fired for each legend item in CircularGauge. You can use this event to customize legend item shape or add custom text to
    * legend item.
    */
  var legendItemRender: js.UndefOr[js.Function1[/* e */ LegendItemRenderEventArgs, scala.Unit]] = js.undefined
  /** Triggers while the gauge start to Load.
    */
  var load: js.UndefOr[js.Function1[/* e */ LoadEventArgs, scala.Unit]] = js.undefined
  /** Name of the culture based on which circular gauge should be localized.
    * @Default {en-US}
    */
  var locale: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the maximum value of circular gauge.
    * @Default {100}
    */
  var maximum: js.UndefOr[scala.Double] = js.undefined
  /** Specifies the minimum value of circular gauge.
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
  /** Specify outerCustomLabelPosition value of circular gauge See
    * @Default {bottom}
    */
  var outerCustomLabelPosition: js.UndefOr[OuterCustomLabelPosition | java.lang.String] = js.undefined
  /** Specifies the radius of circular gauge.
    * @Default {180}
    */
  var radius: js.UndefOr[scala.Double] = js.undefined
  /** Fires when mouse moving on ranges.
    */
  var rangeMouseMove: js.UndefOr[js.Function1[/* e */ RangeMouseMoveEventArgs, scala.Unit]] = js.undefined
  /** Specify range Z-order placement of circular gauge.
    * @Default {Rear}
    */
  var rangeZOrder: js.UndefOr[RangeZOrderPlacement | java.lang.String] = js.undefined
  /** Specify readonly value of circular gauge
    * @Default {true}
    */
  var readOnly: js.UndefOr[scala.Boolean] = js.undefined
  /** Triggers when the rendering of the gauge is completed.
    */
  var renderComplete: js.UndefOr[js.Function1[/* e */ RenderCompleteEventArgs, scala.Unit]] = js.undefined
  /** Fires, on right clicking the circular gauge.
    */
  var rightClick: js.UndefOr[js.Function1[/* e */ RightClickEventArgs, scala.Unit]] = js.undefined
  /** Specify the pointers, ticks, labels, indicators, ranges of circular gauge
    * @Default {null}
    */
  var scales: js.UndefOr[js.Array[Scale]] = js.undefined
  /** Specify the theme of circular gauge.
    * @Default {flatlight}
    */
  var theme: js.UndefOr[java.lang.String] = js.undefined
  /** Specify tooltip option of circular gauge
    * @Default {object}
    */
  var tooltip: js.UndefOr[Tooltip] = js.undefined
  /** Specifies the value of circular gauge.
    * @Default {0}
    */
  var value: js.UndefOr[scala.Double] = js.undefined
  /** Specifies the width of circular gauge.
    * @Default {360}
    */
  var width: js.UndefOr[scala.Double] = js.undefined
}

