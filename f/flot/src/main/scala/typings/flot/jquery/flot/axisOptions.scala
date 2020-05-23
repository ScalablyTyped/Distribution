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
    alignTicksWithAxis: js.UndefOr[Double] = js.undefined,
    autoscaleMargin: js.UndefOr[Double] = js.undefined,
    color: js.Any = null,
    font: js.Any = null,
    inverseTransform: /* v */ Double => Double = null,
    labelHeight: js.UndefOr[Double] = js.undefined,
    labelWidth: js.UndefOr[Double] = js.undefined,
    max: js.UndefOr[Double] = js.undefined,
    min: js.UndefOr[Double] = js.undefined,
    minTickSize: js.Any = null,
    mode: String = null,
    monthNames: js.Array[String] = null,
    position: String = null,
    reserveSpace: js.UndefOr[Boolean] = js.undefined,
    show: js.UndefOr[Boolean] = js.undefined,
    tickColor: js.Any = null,
    tickDecimals: js.UndefOr[Double] = js.undefined,
    tickFormatter: (/* t */ Double, /* a */ js.UndefOr[axis]) => String = null,
    tickLength: js.UndefOr[Double] = js.undefined,
    tickSize: js.Any = null,
    ticks: js.Any = null,
    timeformat: String = null,
    timezone: String = null,
    transform: /* v */ Double => Double = null,
    twelveHourClock: js.UndefOr[Boolean] = js.undefined
  ): axisOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(alignTicksWithAxis)) __obj.updateDynamic("alignTicksWithAxis")(alignTicksWithAxis.get.asInstanceOf[js.Any])
    if (!js.isUndefined(autoscaleMargin)) __obj.updateDynamic("autoscaleMargin")(autoscaleMargin.get.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (inverseTransform != null) __obj.updateDynamic("inverseTransform")(js.Any.fromFunction1(inverseTransform))
    if (!js.isUndefined(labelHeight)) __obj.updateDynamic("labelHeight")(labelHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(labelWidth)) __obj.updateDynamic("labelWidth")(labelWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(max)) __obj.updateDynamic("max")(max.get.asInstanceOf[js.Any])
    if (!js.isUndefined(min)) __obj.updateDynamic("min")(min.get.asInstanceOf[js.Any])
    if (minTickSize != null) __obj.updateDynamic("minTickSize")(minTickSize.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (monthNames != null) __obj.updateDynamic("monthNames")(monthNames.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(reserveSpace)) __obj.updateDynamic("reserveSpace")(reserveSpace.get.asInstanceOf[js.Any])
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show.get.asInstanceOf[js.Any])
    if (tickColor != null) __obj.updateDynamic("tickColor")(tickColor.asInstanceOf[js.Any])
    if (!js.isUndefined(tickDecimals)) __obj.updateDynamic("tickDecimals")(tickDecimals.get.asInstanceOf[js.Any])
    if (tickFormatter != null) __obj.updateDynamic("tickFormatter")(js.Any.fromFunction2(tickFormatter))
    if (!js.isUndefined(tickLength)) __obj.updateDynamic("tickLength")(tickLength.get.asInstanceOf[js.Any])
    if (tickSize != null) __obj.updateDynamic("tickSize")(tickSize.asInstanceOf[js.Any])
    if (ticks != null) __obj.updateDynamic("ticks")(ticks.asInstanceOf[js.Any])
    if (timeformat != null) __obj.updateDynamic("timeformat")(timeformat.asInstanceOf[js.Any])
    if (timezone != null) __obj.updateDynamic("timezone")(timezone.asInstanceOf[js.Any])
    if (transform != null) __obj.updateDynamic("transform")(js.Any.fromFunction1(transform))
    if (!js.isUndefined(twelveHourClock)) __obj.updateDynamic("twelveHourClock")(twelveHourClock.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[axisOptions]
  }
}

