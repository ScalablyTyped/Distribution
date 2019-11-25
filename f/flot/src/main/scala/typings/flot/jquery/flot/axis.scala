package typings.flot.jquery.flot

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
    alignTicksWithAxis: Int | Double = null,
    autoscaleMargin: Int | Double = null,
    color: js.Any = null,
    font: js.Any = null,
    inverseTransform: /* v */ Double => Double = null,
    labelHeight: Int | Double = null,
    labelWidth: Int | Double = null,
    max: Int | Double = null,
    min: Int | Double = null,
    minTickSize: js.Any = null,
    mode: String = null,
    monthNames: js.Array[String] = null,
    position: String = null,
    reserveSpace: js.UndefOr[Boolean] = js.undefined,
    show: js.UndefOr[Boolean] = js.undefined,
    tickColor: js.Any = null,
    tickDecimals: Int | Double = null,
    tickFormatter: (/* t */ Double, /* a */ js.UndefOr[axis]) => String = null,
    tickLength: Int | Double = null,
    tickSize: js.Any = null,
    ticks: js.Any = null,
    timeformat: String = null,
    timezone: String = null,
    transform: /* v */ Double => Double = null,
    twelveHourClock: js.UndefOr[Boolean] = js.undefined
  ): axis = {
    val __obj = js.Dynamic.literal(c2p = js.Any.fromFunction1(c2p), options = options.asInstanceOf[js.Any], p2c = js.Any.fromFunction1(p2c))
    if (alignTicksWithAxis != null) __obj.updateDynamic("alignTicksWithAxis")(alignTicksWithAxis.asInstanceOf[js.Any])
    if (autoscaleMargin != null) __obj.updateDynamic("autoscaleMargin")(autoscaleMargin.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (inverseTransform != null) __obj.updateDynamic("inverseTransform")(js.Any.fromFunction1(inverseTransform))
    if (labelHeight != null) __obj.updateDynamic("labelHeight")(labelHeight.asInstanceOf[js.Any])
    if (labelWidth != null) __obj.updateDynamic("labelWidth")(labelWidth.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (minTickSize != null) __obj.updateDynamic("minTickSize")(minTickSize.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (monthNames != null) __obj.updateDynamic("monthNames")(monthNames.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(reserveSpace)) __obj.updateDynamic("reserveSpace")(reserveSpace.asInstanceOf[js.Any])
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    if (tickColor != null) __obj.updateDynamic("tickColor")(tickColor.asInstanceOf[js.Any])
    if (tickDecimals != null) __obj.updateDynamic("tickDecimals")(tickDecimals.asInstanceOf[js.Any])
    if (tickFormatter != null) __obj.updateDynamic("tickFormatter")(js.Any.fromFunction2(tickFormatter))
    if (tickLength != null) __obj.updateDynamic("tickLength")(tickLength.asInstanceOf[js.Any])
    if (tickSize != null) __obj.updateDynamic("tickSize")(tickSize.asInstanceOf[js.Any])
    if (ticks != null) __obj.updateDynamic("ticks")(ticks.asInstanceOf[js.Any])
    if (timeformat != null) __obj.updateDynamic("timeformat")(timeformat.asInstanceOf[js.Any])
    if (timezone != null) __obj.updateDynamic("timezone")(timezone.asInstanceOf[js.Any])
    if (transform != null) __obj.updateDynamic("transform")(js.Any.fromFunction1(transform))
    if (!js.isUndefined(twelveHourClock)) __obj.updateDynamic("twelveHourClock")(twelveHourClock.asInstanceOf[js.Any])
    __obj.asInstanceOf[axis]
  }
}

