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

