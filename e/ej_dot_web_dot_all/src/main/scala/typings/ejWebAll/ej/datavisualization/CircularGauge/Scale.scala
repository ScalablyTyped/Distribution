package typings.ejWebAll.ej.datavisualization.CircularGauge

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Scale extends js.Object {
  /** Specify backgroundColor for the scale of circular gauge
    * @Default {null}
    */
  var backgroundColor: js.UndefOr[String] = js.undefined
  /** Specify border for scales of circular gauge
    * @Default {Object}
    */
  var border: js.UndefOr[ScalesBorder] = js.undefined
  /** Specify the custom labels for the scales.
    * @Default {Array}
    */
  var customLabels: js.UndefOr[js.Array[ScalesCustomLabel]] = js.undefined
  /** Specify scale direction of circular gauge. See
    * @Default {Clockwise}
    */
  var direction: js.UndefOr[Direction | String] = js.undefined
  /** Specify representing state of circular gauge
    * @Default {Array}
    */
  var indicators: js.UndefOr[js.Array[ScalesIndicator]] = js.undefined
  /** Specify the text values displayed in a meaningful manner alongside the ticks of circular gauge
    * @Default {Array}
    */
  var labels: js.UndefOr[js.Array[ScalesLabel]] = js.undefined
  /** Specify majorIntervalValue of circular gauge
    * @Default {10}
    */
  var majorIntervalValue: js.UndefOr[Double] = js.undefined
  /** Specify maximum scale value of circular gauge
    * @Default {null}
    */
  var maximum: js.UndefOr[Double] = js.undefined
  /** Specify minimum scale value of circular gauge
    * @Default {null}
    */
  var minimum: js.UndefOr[Double] = js.undefined
  /** Specify minorIntervalValue of circular gauge
    * @Default {2}
    */
  var minorIntervalValue: js.UndefOr[Double] = js.undefined
  /** Specify opacity value of circular gauge
    * @Default {1}
    */
  var opacity: js.UndefOr[Double] = js.undefined
  /** Specify pointer cap of circular gauge
    * @Default {Object}
    */
  var pointerCap: js.UndefOr[ScalesPointerCap] = js.undefined
  /** Specify pointers value of circular gauge
    * @Default {Array}
    */
  var pointers: js.UndefOr[js.Array[ScalesPointer]] = js.undefined
  /** Specify scale radius of circular gauge
    * @Default {170}
    */
  var radius: js.UndefOr[Double] = js.undefined
  /** Specify ranges value of circular gauge
    * @Default {Array}
    */
  var ranges: js.UndefOr[js.Array[ScalesRange]] = js.undefined
  /** Specify shadowOffset value of circular gauge
    * @Default {0}
    */
  var shadowOffset: js.UndefOr[Double] = js.undefined
  /** Specify showIndicators of circular gauge
    * @Default {false}
    */
  var showIndicators: js.UndefOr[Boolean] = js.undefined
  /** Specify showLabels of circular gauge
    * @Default {true}
    */
  var showLabels: js.UndefOr[Boolean] = js.undefined
  /** Specify showPointers of circular gauge
    * @Default {true}
    */
  var showPointers: js.UndefOr[Boolean] = js.undefined
  /** Specify showRanges of circular gauge
    * @Default {false}
    */
  var showRanges: js.UndefOr[Boolean] = js.undefined
  /** Specify showScaleBar of circular gauge
    * @Default {false}
    */
  var showScaleBar: js.UndefOr[Boolean] = js.undefined
  /** Specify showTicks of circular gauge
    * @Default {true}
    */
  var showTicks: js.UndefOr[Boolean] = js.undefined
  /** Specify scaleBar size of circular gauge
    * @Default {6}
    */
  var size: js.UndefOr[Double] = js.undefined
  /** Specify startAngle of circular gauge
    * @Default {115}
    */
  var startAngle: js.UndefOr[Double] = js.undefined
  /** Specify subGauge of circular gauge
    * @Default {Array}
    */
  var subGauges: js.UndefOr[js.Array[ScalesSubGauge]] = js.undefined
  /** Specify sweepAngle of circular gauge
    * @Default {310}
    */
  var sweepAngle: js.UndefOr[Double] = js.undefined
  /** Specify ticks of circular gauge
    * @Default {Array}
    */
  var ticks: js.UndefOr[js.Array[ScalesTick]] = js.undefined
}

object Scale {
  @scala.inline
  def apply(
    backgroundColor: String = null,
    border: ScalesBorder = null,
    customLabels: js.Array[ScalesCustomLabel] = null,
    direction: Direction | String = null,
    indicators: js.Array[ScalesIndicator] = null,
    labels: js.Array[ScalesLabel] = null,
    majorIntervalValue: js.UndefOr[Double] = js.undefined,
    maximum: js.UndefOr[Double] = js.undefined,
    minimum: js.UndefOr[Double] = js.undefined,
    minorIntervalValue: js.UndefOr[Double] = js.undefined,
    opacity: js.UndefOr[Double] = js.undefined,
    pointerCap: ScalesPointerCap = null,
    pointers: js.Array[ScalesPointer] = null,
    radius: js.UndefOr[Double] = js.undefined,
    ranges: js.Array[ScalesRange] = null,
    shadowOffset: js.UndefOr[Double] = js.undefined,
    showIndicators: js.UndefOr[Boolean] = js.undefined,
    showLabels: js.UndefOr[Boolean] = js.undefined,
    showPointers: js.UndefOr[Boolean] = js.undefined,
    showRanges: js.UndefOr[Boolean] = js.undefined,
    showScaleBar: js.UndefOr[Boolean] = js.undefined,
    showTicks: js.UndefOr[Boolean] = js.undefined,
    size: js.UndefOr[Double] = js.undefined,
    startAngle: js.UndefOr[Double] = js.undefined,
    subGauges: js.Array[ScalesSubGauge] = null,
    sweepAngle: js.UndefOr[Double] = js.undefined,
    ticks: js.Array[ScalesTick] = null
  ): Scale = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (customLabels != null) __obj.updateDynamic("customLabels")(customLabels.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (indicators != null) __obj.updateDynamic("indicators")(indicators.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (!js.isUndefined(majorIntervalValue)) __obj.updateDynamic("majorIntervalValue")(majorIntervalValue.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maximum)) __obj.updateDynamic("maximum")(maximum.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minimum)) __obj.updateDynamic("minimum")(minimum.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minorIntervalValue)) __obj.updateDynamic("minorIntervalValue")(minorIntervalValue.get.asInstanceOf[js.Any])
    if (!js.isUndefined(opacity)) __obj.updateDynamic("opacity")(opacity.get.asInstanceOf[js.Any])
    if (pointerCap != null) __obj.updateDynamic("pointerCap")(pointerCap.asInstanceOf[js.Any])
    if (pointers != null) __obj.updateDynamic("pointers")(pointers.asInstanceOf[js.Any])
    if (!js.isUndefined(radius)) __obj.updateDynamic("radius")(radius.get.asInstanceOf[js.Any])
    if (ranges != null) __obj.updateDynamic("ranges")(ranges.asInstanceOf[js.Any])
    if (!js.isUndefined(shadowOffset)) __obj.updateDynamic("shadowOffset")(shadowOffset.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showIndicators)) __obj.updateDynamic("showIndicators")(showIndicators.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showLabels)) __obj.updateDynamic("showLabels")(showLabels.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showPointers)) __obj.updateDynamic("showPointers")(showPointers.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showRanges)) __obj.updateDynamic("showRanges")(showRanges.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showScaleBar)) __obj.updateDynamic("showScaleBar")(showScaleBar.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showTicks)) __obj.updateDynamic("showTicks")(showTicks.get.asInstanceOf[js.Any])
    if (!js.isUndefined(size)) __obj.updateDynamic("size")(size.get.asInstanceOf[js.Any])
    if (!js.isUndefined(startAngle)) __obj.updateDynamic("startAngle")(startAngle.get.asInstanceOf[js.Any])
    if (subGauges != null) __obj.updateDynamic("subGauges")(subGauges.asInstanceOf[js.Any])
    if (!js.isUndefined(sweepAngle)) __obj.updateDynamic("sweepAngle")(sweepAngle.get.asInstanceOf[js.Any])
    if (ticks != null) __obj.updateDynamic("ticks")(ticks.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scale]
  }
}

