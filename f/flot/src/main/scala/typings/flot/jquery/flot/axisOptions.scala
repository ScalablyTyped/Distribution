package typings.flot.jquery.flot

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait axisOptions extends StObject {
  
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
  implicit class axisOptionsMutableBuilder[Self <: axisOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlignTicksWithAxis(value: Double): Self = StObject.set(x, "alignTicksWithAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlignTicksWithAxisUndefined: Self = StObject.set(x, "alignTicksWithAxis", js.undefined)
    
    @scala.inline
    def setAutoscaleMargin(value: Double): Self = StObject.set(x, "autoscaleMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoscaleMarginUndefined: Self = StObject.set(x, "autoscaleMargin", js.undefined)
    
    @scala.inline
    def setColor(value: js.Any): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setFont(value: js.Any): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    @scala.inline
    def setInverseTransform(value: /* v */ Double => Double): Self = StObject.set(x, "inverseTransform", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInverseTransformUndefined: Self = StObject.set(x, "inverseTransform", js.undefined)
    
    @scala.inline
    def setLabelHeight(value: Double): Self = StObject.set(x, "labelHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelHeightUndefined: Self = StObject.set(x, "labelHeight", js.undefined)
    
    @scala.inline
    def setLabelWidth(value: Double): Self = StObject.set(x, "labelWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelWidthUndefined: Self = StObject.set(x, "labelWidth", js.undefined)
    
    @scala.inline
    def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    @scala.inline
    def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinTickSize(value: js.Any): Self = StObject.set(x, "minTickSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinTickSizeUndefined: Self = StObject.set(x, "minTickSize", js.undefined)
    
    @scala.inline
    def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    @scala.inline
    def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    @scala.inline
    def setMonthNames(value: js.Array[String]): Self = StObject.set(x, "monthNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonthNamesUndefined: Self = StObject.set(x, "monthNames", js.undefined)
    
    @scala.inline
    def setMonthNamesVarargs(value: String*): Self = StObject.set(x, "monthNames", js.Array(value :_*))
    
    @scala.inline
    def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    @scala.inline
    def setReserveSpace(value: Boolean): Self = StObject.set(x, "reserveSpace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReserveSpaceUndefined: Self = StObject.set(x, "reserveSpace", js.undefined)
    
    @scala.inline
    def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
    
    @scala.inline
    def setTickColor(value: js.Any): Self = StObject.set(x, "tickColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTickColorUndefined: Self = StObject.set(x, "tickColor", js.undefined)
    
    @scala.inline
    def setTickDecimals(value: Double): Self = StObject.set(x, "tickDecimals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTickDecimalsUndefined: Self = StObject.set(x, "tickDecimals", js.undefined)
    
    @scala.inline
    def setTickFormatter(value: (/* t */ Double, /* a */ js.UndefOr[axis]) => String): Self = StObject.set(x, "tickFormatter", js.Any.fromFunction2(value))
    
    @scala.inline
    def setTickFormatterUndefined: Self = StObject.set(x, "tickFormatter", js.undefined)
    
    @scala.inline
    def setTickLength(value: Double): Self = StObject.set(x, "tickLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTickLengthUndefined: Self = StObject.set(x, "tickLength", js.undefined)
    
    @scala.inline
    def setTickSize(value: js.Any): Self = StObject.set(x, "tickSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTickSizeUndefined: Self = StObject.set(x, "tickSize", js.undefined)
    
    @scala.inline
    def setTicks(value: js.Any): Self = StObject.set(x, "ticks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTicksUndefined: Self = StObject.set(x, "ticks", js.undefined)
    
    @scala.inline
    def setTimeformat(value: String): Self = StObject.set(x, "timeformat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeformatUndefined: Self = StObject.set(x, "timeformat", js.undefined)
    
    @scala.inline
    def setTimezone(value: String): Self = StObject.set(x, "timezone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimezoneUndefined: Self = StObject.set(x, "timezone", js.undefined)
    
    @scala.inline
    def setTransform(value: /* v */ Double => Double): Self = StObject.set(x, "transform", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
    
    @scala.inline
    def setTwelveHourClock(value: Boolean): Self = StObject.set(x, "twelveHourClock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTwelveHourClockUndefined: Self = StObject.set(x, "twelveHourClock", js.undefined)
  }
}
