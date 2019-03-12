package typings
package flotLib.jqueryNs.flotNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait axis extends axisOptions {
  var options: axisOptions
  def c2p(canvasPoint: canvasPoint): point
  def p2c(point: point): canvasPoint
}

object axis {
  @scala.inline
  def apply(
    c2p: canvasPoint => point,
    options: axisOptions,
    p2c: point => canvasPoint,
    alignTicksWithAxis: scala.Int | scala.Double = null,
    autoscaleMargin: scala.Int | scala.Double = null,
    color: js.Any = null,
    font: js.Any = null,
    inverseTransform: /* v */ scala.Double => scala.Double = null,
    labelHeight: scala.Int | scala.Double = null,
    labelWidth: scala.Int | scala.Double = null,
    max: scala.Int | scala.Double = null,
    min: scala.Int | scala.Double = null,
    minTickSize: js.Any = null,
    mode: java.lang.String = null,
    monthNames: js.Array[java.lang.String] = null,
    position: java.lang.String = null,
    reserveSpace: js.UndefOr[scala.Boolean] = js.undefined,
    show: js.UndefOr[scala.Boolean] = js.undefined,
    tickColor: js.Any = null,
    tickDecimals: scala.Int | scala.Double = null,
    tickFormatter: (/* t */ scala.Double, /* a */ js.UndefOr[axis]) => java.lang.String = null,
    tickLength: scala.Int | scala.Double = null,
    tickSize: js.Any = null,
    ticks: js.Any = null,
    timeformat: java.lang.String = null,
    timezone: java.lang.String = null,
    transform: /* v */ scala.Double => scala.Double = null,
    twelveHourClock: js.UndefOr[scala.Boolean] = js.undefined
  ): axis = {
    val __obj = js.Dynamic.literal(c2p = js.Any.fromFunction1(c2p), options = options, p2c = js.Any.fromFunction1(p2c))
    if (alignTicksWithAxis != null) __obj.updateDynamic("alignTicksWithAxis")(alignTicksWithAxis.asInstanceOf[js.Any])
    if (autoscaleMargin != null) __obj.updateDynamic("autoscaleMargin")(autoscaleMargin.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color)
    if (font != null) __obj.updateDynamic("font")(font)
    if (inverseTransform != null) __obj.updateDynamic("inverseTransform")(js.Any.fromFunction1(inverseTransform))
    if (labelHeight != null) __obj.updateDynamic("labelHeight")(labelHeight.asInstanceOf[js.Any])
    if (labelWidth != null) __obj.updateDynamic("labelWidth")(labelWidth.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (minTickSize != null) __obj.updateDynamic("minTickSize")(minTickSize)
    if (mode != null) __obj.updateDynamic("mode")(mode)
    if (monthNames != null) __obj.updateDynamic("monthNames")(monthNames)
    if (position != null) __obj.updateDynamic("position")(position)
    if (!js.isUndefined(reserveSpace)) __obj.updateDynamic("reserveSpace")(reserveSpace)
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show)
    if (tickColor != null) __obj.updateDynamic("tickColor")(tickColor)
    if (tickDecimals != null) __obj.updateDynamic("tickDecimals")(tickDecimals.asInstanceOf[js.Any])
    if (tickFormatter != null) __obj.updateDynamic("tickFormatter")(js.Any.fromFunction2(tickFormatter))
    if (tickLength != null) __obj.updateDynamic("tickLength")(tickLength.asInstanceOf[js.Any])
    if (tickSize != null) __obj.updateDynamic("tickSize")(tickSize)
    if (ticks != null) __obj.updateDynamic("ticks")(ticks)
    if (timeformat != null) __obj.updateDynamic("timeformat")(timeformat)
    if (timezone != null) __obj.updateDynamic("timezone")(timezone)
    if (transform != null) __obj.updateDynamic("transform")(js.Any.fromFunction1(transform))
    if (!js.isUndefined(twelveHourClock)) __obj.updateDynamic("twelveHourClock")(twelveHourClock)
    __obj.asInstanceOf[axis]
  }
}

