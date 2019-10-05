package typings.flot.jquery.flot

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait axisOptions extends js.Object {
  var alignTicksWithAxis: js.UndefOr[Double] = js.undefined
  var autoscaleMargin: js.UndefOr[Double] = js.undefined
    // array of month names
  var color: js.UndefOr[js.Any] = js.undefined
          // null or color spec
  var font: js.UndefOr[js.Any] = js.undefined
                // null or fn: number -> number
  var inverseTransform: js.UndefOr[js.Function1[/* v */ Double, Double]] = js.undefined
  var labelHeight: js.UndefOr[Double] = js.undefined
  var labelWidth: js.UndefOr[Double] = js.undefined
  var max: js.UndefOr[Double] = js.undefined
               // null or font spec object
  var min: js.UndefOr[Double] = js.undefined
                                   // number or array
  var minTickSize: js.UndefOr[js.Any] = js.undefined
        // "bottom" or "top" or "left" or "right"
  var mode: js.UndefOr[String] = js.undefined
            // "time"
  var monthNames: js.UndefOr[js.Array[String]] = js.undefined
              // null or true/false
  var position: js.UndefOr[String] = js.undefined
  var reserveSpace: js.UndefOr[Boolean] = js.undefined
  var show: js.UndefOr[Boolean] = js.undefined
              // null or color spec
  var tickColor: js.UndefOr[js.Any] = js.undefined
                              // (fn: number, object -> string) or string
  var tickDecimals: js.UndefOr[Double] = js.undefined
                                // number or array
  var tickFormatter: js.UndefOr[js.Function2[/* t */ Double, /* a */ js.UndefOr[axis], String]] = js.undefined
  var tickLength: js.UndefOr[Double] = js.undefined
                                      // null or number or ticks array or (fn: axis -> ticks array)
  var tickSize: js.UndefOr[js.Any] = js.undefined
         // null or fn: number -> number
  var ticks: js.UndefOr[js.Any] = js.undefined
                        // "browser" or timezone (only makes sense for mode: "time")
  var timeformat: js.UndefOr[String] = js.undefined
  var timezone: js.UndefOr[String] = js.undefined
  var transform: js.UndefOr[js.Function1[/* v */ Double, Double]] = js.undefined
                      // null or format string
  var twelveHourClock: js.UndefOr[Boolean] = js.undefined
}

object axisOptions {
  @scala.inline
  def apply(
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
  ): axisOptions = {
    val __obj = js.Dynamic.literal()
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
    __obj.asInstanceOf[axisOptions]
  }
}

