package typings.flot.jquery.flot

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait axisOptions extends js.Object {
  
  var alignTicksWithAxis: js.UndefOr[Double] = js.native
  
  var autoscaleMargin: js.UndefOr[Double] = js.native
  
    // array of month names
  var color: js.UndefOr[js.Any] = js.native
  
          // null or color spec
  var font: js.UndefOr[js.Any] = js.native
  
                // null or fn: number -> number
  var inverseTransform: js.UndefOr[js.Function1[/* v */ Double, Double]] = js.native
  
  var labelHeight: js.UndefOr[Double] = js.native
  
  var labelWidth: js.UndefOr[Double] = js.native
  
  var max: js.UndefOr[Double] = js.native
  
               // null or font spec object
  var min: js.UndefOr[Double] = js.native
  
                                   // number or array
  var minTickSize: js.UndefOr[js.Any] = js.native
  
        // "bottom" or "top" or "left" or "right"
  var mode: js.UndefOr[String] = js.native
  
            // "time"
  var monthNames: js.UndefOr[js.Array[String]] = js.native
  
              // null or true/false
  var position: js.UndefOr[String] = js.native
  
  var reserveSpace: js.UndefOr[Boolean] = js.native
  
  var show: js.UndefOr[Boolean] = js.native
  
              // null or color spec
  var tickColor: js.UndefOr[js.Any] = js.native
  
                              // (fn: number, object -> string) or string
  var tickDecimals: js.UndefOr[Double] = js.native
  
                                // number or array
  var tickFormatter: js.UndefOr[js.Function2[/* t */ Double, /* a */ js.UndefOr[axis], String]] = js.native
  
  var tickLength: js.UndefOr[Double] = js.native
  
                                      // null or number or ticks array or (fn: axis -> ticks array)
  var tickSize: js.UndefOr[js.Any] = js.native
  
         // null or fn: number -> number
  var ticks: js.UndefOr[js.Any] = js.native
  
                        // "browser" or timezone (only makes sense for mode: "time")
  var timeformat: js.UndefOr[String] = js.native
  
  var timezone: js.UndefOr[String] = js.native
  
  var transform: js.UndefOr[js.Function1[/* v */ Double, Double]] = js.native
  
                      // null or format string
  var twelveHourClock: js.UndefOr[Boolean] = js.native
}
object axisOptions {
  
  @scala.inline
  def apply(): axisOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[axisOptions]
  }
  
  @scala.inline
  implicit class axisOptionsOps[Self <: axisOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAlignTicksWithAxis(value: Double): Self = this.set("alignTicksWithAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlignTicksWithAxis: Self = this.set("alignTicksWithAxis", js.undefined)
    
    @scala.inline
    def setAutoscaleMargin(value: Double): Self = this.set("autoscaleMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoscaleMargin: Self = this.set("autoscaleMargin", js.undefined)
    
    @scala.inline
    def setColor(value: js.Any): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setFont(value: js.Any): Self = this.set("font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFont: Self = this.set("font", js.undefined)
    
    @scala.inline
    def setInverseTransform(value: /* v */ Double => Double): Self = this.set("inverseTransform", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteInverseTransform: Self = this.set("inverseTransform", js.undefined)
    
    @scala.inline
    def setLabelHeight(value: Double): Self = this.set("labelHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelHeight: Self = this.set("labelHeight", js.undefined)
    
    @scala.inline
    def setLabelWidth(value: Double): Self = this.set("labelWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelWidth: Self = this.set("labelWidth", js.undefined)
    
    @scala.inline
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    
    @scala.inline
    def setMin(value: Double): Self = this.set("min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
    
    @scala.inline
    def setMinTickSize(value: js.Any): Self = this.set("minTickSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinTickSize: Self = this.set("minTickSize", js.undefined)
    
    @scala.inline
    def setMode(value: String): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    
    @scala.inline
    def setMonthNamesVarargs(value: String*): Self = this.set("monthNames", js.Array(value :_*))
    
    @scala.inline
    def setMonthNames(value: js.Array[String]): Self = this.set("monthNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMonthNames: Self = this.set("monthNames", js.undefined)
    
    @scala.inline
    def setPosition(value: String): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    
    @scala.inline
    def setReserveSpace(value: Boolean): Self = this.set("reserveSpace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReserveSpace: Self = this.set("reserveSpace", js.undefined)
    
    @scala.inline
    def setShow(value: Boolean): Self = this.set("show", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShow: Self = this.set("show", js.undefined)
    
    @scala.inline
    def setTickColor(value: js.Any): Self = this.set("tickColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTickColor: Self = this.set("tickColor", js.undefined)
    
    @scala.inline
    def setTickDecimals(value: Double): Self = this.set("tickDecimals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTickDecimals: Self = this.set("tickDecimals", js.undefined)
    
    @scala.inline
    def setTickFormatter(value: (/* t */ Double, /* a */ js.UndefOr[axis]) => String): Self = this.set("tickFormatter", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteTickFormatter: Self = this.set("tickFormatter", js.undefined)
    
    @scala.inline
    def setTickLength(value: Double): Self = this.set("tickLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTickLength: Self = this.set("tickLength", js.undefined)
    
    @scala.inline
    def setTickSize(value: js.Any): Self = this.set("tickSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTickSize: Self = this.set("tickSize", js.undefined)
    
    @scala.inline
    def setTicks(value: js.Any): Self = this.set("ticks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTicks: Self = this.set("ticks", js.undefined)
    
    @scala.inline
    def setTimeformat(value: String): Self = this.set("timeformat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeformat: Self = this.set("timeformat", js.undefined)
    
    @scala.inline
    def setTimezone(value: String): Self = this.set("timezone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimezone: Self = this.set("timezone", js.undefined)
    
    @scala.inline
    def setTransform(value: /* v */ Double => Double): Self = this.set("transform", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteTransform: Self = this.set("transform", js.undefined)
    
    @scala.inline
    def setTwelveHourClock(value: Boolean): Self = this.set("twelveHourClock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTwelveHourClock: Self = this.set("twelveHourClock", js.undefined)
  }
}
