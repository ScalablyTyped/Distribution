package typings
package flotLib.jqueryNs.flotNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait axisOptions extends js.Object {
  var alignTicksWithAxis: js.UndefOr[scala.Double] = js.undefined
  var autoscaleMargin: js.UndefOr[scala.Double] = js.undefined
    // array of month names
  var color: js.UndefOr[js.Any] = js.undefined
          // null or color spec
  var font: js.UndefOr[js.Any] = js.undefined
                // null or fn: number -> number
  var inverseTransform: js.UndefOr[js.Function1[/* v */ scala.Double, scala.Double]] = js.undefined
  var labelHeight: js.UndefOr[scala.Double] = js.undefined
  var labelWidth: js.UndefOr[scala.Double] = js.undefined
  var max: js.UndefOr[scala.Double] = js.undefined
               // null or font spec object
  var min: js.UndefOr[scala.Double] = js.undefined
                                   // number or array
  var minTickSize: js.UndefOr[js.Any] = js.undefined
        // "bottom" or "top" or "left" or "right"
  var mode: js.UndefOr[java.lang.String] = js.undefined
            // "time"
  var monthNames: js.UndefOr[js.Array[java.lang.String]] = js.undefined
              // null or true/false
  var position: js.UndefOr[java.lang.String] = js.undefined
  var reserveSpace: js.UndefOr[scala.Boolean] = js.undefined
  var show: js.UndefOr[scala.Boolean] = js.undefined
              // null or color spec
  var tickColor: js.UndefOr[js.Any] = js.undefined
                              // (fn: number, object -> string) or string
  var tickDecimals: js.UndefOr[scala.Double] = js.undefined
                                // number or array
  var tickFormatter: js.UndefOr[js.Function2[/* t */ scala.Double, /* a */ js.UndefOr[axis], java.lang.String]] = js.undefined
  var tickLength: js.UndefOr[scala.Double] = js.undefined
                                      // null or number or ticks array or (fn: axis -> ticks array)
  var tickSize: js.UndefOr[js.Any] = js.undefined
         // null or fn: number -> number
  var ticks: js.UndefOr[js.Any] = js.undefined
                        // "browser" or timezone (only makes sense for mode: "time")
  var timeformat: js.UndefOr[java.lang.String] = js.undefined
  var timezone: js.UndefOr[java.lang.String] = js.undefined
  var transform: js.UndefOr[js.Function1[/* v */ scala.Double, scala.Double]] = js.undefined
                      // null or format string
  var twelveHourClock: js.UndefOr[scala.Boolean] = js.undefined
}

object axisOptions {
  @scala.inline
  def apply(
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

