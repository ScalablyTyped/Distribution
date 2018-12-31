package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.LinearGaugeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Scale extends js.Object {
  /** Specifies the backgroundColor of the Scale.
    * @Default {null}
    */
  var backgroundColor: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the scaleBar Gradient of bar pointer
    * @Default {Array}
    */
  var barPointers: js.UndefOr[js.Array[ScalesBarPointer]] = js.undefined
  /** Specifies the border of the Scale.
    * @Default {null}
    */
  var border: js.UndefOr[ScalesBorder] = js.undefined
  /** Specifies the customLabel
    * @Default {Array}
    */
  var customLabels: js.UndefOr[js.Array[ScalesCustomLabel]] = js.undefined
  /** Specifies the scale Direction of the Scale. See
    * @Default {CounterClockwise}
    */
  var direction: js.UndefOr[Direction | java.lang.String] = js.undefined
  /** Specifies the indicator
    * @Default {Array}
    */
  var indicators: js.UndefOr[js.Array[ScalesIndicator]] = js.undefined
  /** Specifies the labels.
    * @Default {Array}
    */
  var labels: js.UndefOr[js.Array[ScalesLabel]] = js.undefined
  /** Specifies the scaleBar Length.
    * @Default {290}
    */
  var length: js.UndefOr[scala.Double] = js.undefined
  /** Specifies the majorIntervalValue of the Scale.
    * @Default {10}
    */
  var majorIntervalValue: js.UndefOr[scala.Double] = js.undefined
  /** Specifies the markerPointers
    * @Default {Array}
    */
  var markerPointers: js.UndefOr[js.Array[ScalesMarkerPointer]] = js.undefined
  /** Specifies the maximum of the Scale.
    * @Default {null}
    */
  var maximum: js.UndefOr[scala.Double] = js.undefined
  /** Specifies the minimum of the Scale.
    * @Default {null}
    */
  var minimum: js.UndefOr[scala.Double] = js.undefined
  /** Specifies the minorIntervalValue of the Scale.
    * @Default {2}
    */
  var minorIntervalValue: js.UndefOr[scala.Double] = js.undefined
  /** Specifies the opacity of the Scale.
    * @Default {NaN}
    */
  var opacity: js.UndefOr[scala.Double] = js.undefined
  /** Specifies the position
    * @Default {null}
    */
  var position: js.UndefOr[ScalesPosition] = js.undefined
  /** Specifies the ranges in the tick.
    * @Default {Array}
    */
  var ranges: js.UndefOr[js.Array[ScalesRange]] = js.undefined
  /** Specifies the shadowOffset.
    * @Default {0}
    */
  var shadowOffset: js.UndefOr[scala.Double] = js.undefined
  /** Specifies the showBarPointers state.
    * @Default {true}
    */
  var showBarPointers: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies the showCustomLabels state.
    * @Default {false}
    */
  var showCustomLabels: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies the showIndicators state.
    * @Default {false}
    */
  var showIndicators: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies the showLabels state.
    * @Default {true}
    */
  var showLabels: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies the showMarkerPointers state.
    * @Default {true}
    */
  var showMarkerPointers: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies the showRanges state.
    * @Default {false}
    */
  var showRanges: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies the showTicks state.
    * @Default {true}
    */
  var showTicks: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies the ticks in the scale.
    * @Default {Array}
    */
  var ticks: js.UndefOr[js.Array[ScalesTick]] = js.undefined
  /** Specifies the scaleBar type .See
    * @Default {Rectangle}
    */
  var `type`: js.UndefOr[ScaleType | java.lang.String] = js.undefined
  /** Specifies the scaleBar width.
    * @Default {30}
    */
  var width: js.UndefOr[scala.Double] = js.undefined
}

