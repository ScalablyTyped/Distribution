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

object Scale {
  @scala.inline
  def apply(
    backgroundColor: java.lang.String = null,
    barPointers: js.Array[ScalesBarPointer] = null,
    border: ScalesBorder = null,
    customLabels: js.Array[ScalesCustomLabel] = null,
    direction: Direction | java.lang.String = null,
    indicators: js.Array[ScalesIndicator] = null,
    labels: js.Array[ScalesLabel] = null,
    length: scala.Int | scala.Double = null,
    majorIntervalValue: scala.Int | scala.Double = null,
    markerPointers: js.Array[ScalesMarkerPointer] = null,
    maximum: scala.Int | scala.Double = null,
    minimum: scala.Int | scala.Double = null,
    minorIntervalValue: scala.Int | scala.Double = null,
    opacity: scala.Int | scala.Double = null,
    position: ScalesPosition = null,
    ranges: js.Array[ScalesRange] = null,
    shadowOffset: scala.Int | scala.Double = null,
    showBarPointers: js.UndefOr[scala.Boolean] = js.undefined,
    showCustomLabels: js.UndefOr[scala.Boolean] = js.undefined,
    showIndicators: js.UndefOr[scala.Boolean] = js.undefined,
    showLabels: js.UndefOr[scala.Boolean] = js.undefined,
    showMarkerPointers: js.UndefOr[scala.Boolean] = js.undefined,
    showRanges: js.UndefOr[scala.Boolean] = js.undefined,
    showTicks: js.UndefOr[scala.Boolean] = js.undefined,
    ticks: js.Array[ScalesTick] = null,
    `type`: ScaleType | java.lang.String = null,
    width: scala.Int | scala.Double = null
  ): Scale = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor)
    if (barPointers != null) __obj.updateDynamic("barPointers")(barPointers)
    if (border != null) __obj.updateDynamic("border")(border)
    if (customLabels != null) __obj.updateDynamic("customLabels")(customLabels)
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (indicators != null) __obj.updateDynamic("indicators")(indicators)
    if (labels != null) __obj.updateDynamic("labels")(labels)
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (majorIntervalValue != null) __obj.updateDynamic("majorIntervalValue")(majorIntervalValue.asInstanceOf[js.Any])
    if (markerPointers != null) __obj.updateDynamic("markerPointers")(markerPointers)
    if (maximum != null) __obj.updateDynamic("maximum")(maximum.asInstanceOf[js.Any])
    if (minimum != null) __obj.updateDynamic("minimum")(minimum.asInstanceOf[js.Any])
    if (minorIntervalValue != null) __obj.updateDynamic("minorIntervalValue")(minorIntervalValue.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position)
    if (ranges != null) __obj.updateDynamic("ranges")(ranges)
    if (shadowOffset != null) __obj.updateDynamic("shadowOffset")(shadowOffset.asInstanceOf[js.Any])
    if (!js.isUndefined(showBarPointers)) __obj.updateDynamic("showBarPointers")(showBarPointers)
    if (!js.isUndefined(showCustomLabels)) __obj.updateDynamic("showCustomLabels")(showCustomLabels)
    if (!js.isUndefined(showIndicators)) __obj.updateDynamic("showIndicators")(showIndicators)
    if (!js.isUndefined(showLabels)) __obj.updateDynamic("showLabels")(showLabels)
    if (!js.isUndefined(showMarkerPointers)) __obj.updateDynamic("showMarkerPointers")(showMarkerPointers)
    if (!js.isUndefined(showRanges)) __obj.updateDynamic("showRanges")(showRanges)
    if (!js.isUndefined(showTicks)) __obj.updateDynamic("showTicks")(showTicks)
    if (ticks != null) __obj.updateDynamic("ticks")(ticks)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scale]
  }
}

