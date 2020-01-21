package typings.ejWebAll.ej.datavisualization.LinearGauge

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Scale extends js.Object {
  /** Specifies the backgroundColor of the Scale.
    * @Default {null}
    */
  var backgroundColor: js.UndefOr[String] = js.undefined
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
  var direction: js.UndefOr[Direction | String] = js.undefined
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
  var length: js.UndefOr[Double] = js.undefined
  /** Specifies the majorIntervalValue of the Scale.
    * @Default {10}
    */
  var majorIntervalValue: js.UndefOr[Double] = js.undefined
  /** Specifies the markerPointers
    * @Default {Array}
    */
  var markerPointers: js.UndefOr[js.Array[ScalesMarkerPointer]] = js.undefined
  /** Specifies the maximum of the Scale.
    * @Default {null}
    */
  var maximum: js.UndefOr[Double] = js.undefined
  /** Specifies the minimum of the Scale.
    * @Default {null}
    */
  var minimum: js.UndefOr[Double] = js.undefined
  /** Specifies the minorIntervalValue of the Scale.
    * @Default {2}
    */
  var minorIntervalValue: js.UndefOr[Double] = js.undefined
  /** Specifies the opacity of the Scale.
    * @Default {NaN}
    */
  var opacity: js.UndefOr[Double] = js.undefined
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
  var shadowOffset: js.UndefOr[Double] = js.undefined
  /** Specifies the showBarPointers state.
    * @Default {true}
    */
  var showBarPointers: js.UndefOr[Boolean] = js.undefined
  /** Specifies the showCustomLabels state.
    * @Default {false}
    */
  var showCustomLabels: js.UndefOr[Boolean] = js.undefined
  /** Specifies the showIndicators state.
    * @Default {false}
    */
  var showIndicators: js.UndefOr[Boolean] = js.undefined
  /** Specifies the showLabels state.
    * @Default {true}
    */
  var showLabels: js.UndefOr[Boolean] = js.undefined
  /** Specifies the showMarkerPointers state.
    * @Default {true}
    */
  var showMarkerPointers: js.UndefOr[Boolean] = js.undefined
  /** Specifies the showRanges state.
    * @Default {false}
    */
  var showRanges: js.UndefOr[Boolean] = js.undefined
  /** Specifies the showTicks state.
    * @Default {true}
    */
  var showTicks: js.UndefOr[Boolean] = js.undefined
  /** Specifies the ticks in the scale.
    * @Default {Array}
    */
  var ticks: js.UndefOr[js.Array[ScalesTick]] = js.undefined
  /** Specifies the scaleBar type .See
    * @Default {Rectangle}
    */
  var `type`: js.UndefOr[ScaleType | String] = js.undefined
  /** Specifies the scaleBar width.
    * @Default {30}
    */
  var width: js.UndefOr[Double] = js.undefined
}

object Scale {
  @scala.inline
  def apply(
    backgroundColor: String = null,
    barPointers: js.Array[ScalesBarPointer] = null,
    border: ScalesBorder = null,
    customLabels: js.Array[ScalesCustomLabel] = null,
    direction: Direction | String = null,
    indicators: js.Array[ScalesIndicator] = null,
    labels: js.Array[ScalesLabel] = null,
    length: Int | Double = null,
    majorIntervalValue: Int | Double = null,
    markerPointers: js.Array[ScalesMarkerPointer] = null,
    maximum: Int | Double = null,
    minimum: Int | Double = null,
    minorIntervalValue: Int | Double = null,
    opacity: Int | Double = null,
    position: ScalesPosition = null,
    ranges: js.Array[ScalesRange] = null,
    shadowOffset: Int | Double = null,
    showBarPointers: js.UndefOr[Boolean] = js.undefined,
    showCustomLabels: js.UndefOr[Boolean] = js.undefined,
    showIndicators: js.UndefOr[Boolean] = js.undefined,
    showLabels: js.UndefOr[Boolean] = js.undefined,
    showMarkerPointers: js.UndefOr[Boolean] = js.undefined,
    showRanges: js.UndefOr[Boolean] = js.undefined,
    showTicks: js.UndefOr[Boolean] = js.undefined,
    ticks: js.Array[ScalesTick] = null,
    `type`: ScaleType | String = null,
    width: Int | Double = null
  ): Scale = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (barPointers != null) __obj.updateDynamic("barPointers")(barPointers.asInstanceOf[js.Any])
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (customLabels != null) __obj.updateDynamic("customLabels")(customLabels.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (indicators != null) __obj.updateDynamic("indicators")(indicators.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (majorIntervalValue != null) __obj.updateDynamic("majorIntervalValue")(majorIntervalValue.asInstanceOf[js.Any])
    if (markerPointers != null) __obj.updateDynamic("markerPointers")(markerPointers.asInstanceOf[js.Any])
    if (maximum != null) __obj.updateDynamic("maximum")(maximum.asInstanceOf[js.Any])
    if (minimum != null) __obj.updateDynamic("minimum")(minimum.asInstanceOf[js.Any])
    if (minorIntervalValue != null) __obj.updateDynamic("minorIntervalValue")(minorIntervalValue.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (ranges != null) __obj.updateDynamic("ranges")(ranges.asInstanceOf[js.Any])
    if (shadowOffset != null) __obj.updateDynamic("shadowOffset")(shadowOffset.asInstanceOf[js.Any])
    if (!js.isUndefined(showBarPointers)) __obj.updateDynamic("showBarPointers")(showBarPointers.asInstanceOf[js.Any])
    if (!js.isUndefined(showCustomLabels)) __obj.updateDynamic("showCustomLabels")(showCustomLabels.asInstanceOf[js.Any])
    if (!js.isUndefined(showIndicators)) __obj.updateDynamic("showIndicators")(showIndicators.asInstanceOf[js.Any])
    if (!js.isUndefined(showLabels)) __obj.updateDynamic("showLabels")(showLabels.asInstanceOf[js.Any])
    if (!js.isUndefined(showMarkerPointers)) __obj.updateDynamic("showMarkerPointers")(showMarkerPointers.asInstanceOf[js.Any])
    if (!js.isUndefined(showRanges)) __obj.updateDynamic("showRanges")(showRanges.asInstanceOf[js.Any])
    if (!js.isUndefined(showTicks)) __obj.updateDynamic("showTicks")(showTicks.asInstanceOf[js.Any])
    if (ticks != null) __obj.updateDynamic("ticks")(ticks.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scale]
  }
}

