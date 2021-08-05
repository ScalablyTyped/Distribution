package typings.flot.jquery.flot

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait axisOptions extends StObject {
  
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
  
  inline def apply(): axisOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[axisOptions]
  }
  
  extension [Self <: axisOptions](x: Self) {
    
    inline def setAlignTicksWithAxis(value: Double): Self = StObject.set(x, "alignTicksWithAxis", value.asInstanceOf[js.Any])
    
    inline def setAlignTicksWithAxisUndefined: Self = StObject.set(x, "alignTicksWithAxis", js.undefined)
    
    inline def setAutoscaleMargin(value: Double): Self = StObject.set(x, "autoscaleMargin", value.asInstanceOf[js.Any])
    
    inline def setAutoscaleMarginUndefined: Self = StObject.set(x, "autoscaleMargin", js.undefined)
    
    inline def setColor(value: js.Any): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setFont(value: js.Any): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    inline def setInverseTransform(value: /* v */ Double => Double): Self = StObject.set(x, "inverseTransform", js.Any.fromFunction1(value))
    
    inline def setInverseTransformUndefined: Self = StObject.set(x, "inverseTransform", js.undefined)
    
    inline def setLabelHeight(value: Double): Self = StObject.set(x, "labelHeight", value.asInstanceOf[js.Any])
    
    inline def setLabelHeightUndefined: Self = StObject.set(x, "labelHeight", js.undefined)
    
    inline def setLabelWidth(value: Double): Self = StObject.set(x, "labelWidth", value.asInstanceOf[js.Any])
    
    inline def setLabelWidthUndefined: Self = StObject.set(x, "labelWidth", js.undefined)
    
    inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinTickSize(value: js.Any): Self = StObject.set(x, "minTickSize", value.asInstanceOf[js.Any])
    
    inline def setMinTickSizeUndefined: Self = StObject.set(x, "minTickSize", js.undefined)
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    inline def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setMonthNames(value: js.Array[String]): Self = StObject.set(x, "monthNames", value.asInstanceOf[js.Any])
    
    inline def setMonthNamesUndefined: Self = StObject.set(x, "monthNames", js.undefined)
    
    inline def setMonthNamesVarargs(value: String*): Self = StObject.set(x, "monthNames", js.Array(value :_*))
    
    inline def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setReserveSpace(value: Boolean): Self = StObject.set(x, "reserveSpace", value.asInstanceOf[js.Any])
    
    inline def setReserveSpaceUndefined: Self = StObject.set(x, "reserveSpace", js.undefined)
    
    inline def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
    
    inline def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
    
    inline def setTickColor(value: js.Any): Self = StObject.set(x, "tickColor", value.asInstanceOf[js.Any])
    
    inline def setTickColorUndefined: Self = StObject.set(x, "tickColor", js.undefined)
    
    inline def setTickDecimals(value: Double): Self = StObject.set(x, "tickDecimals", value.asInstanceOf[js.Any])
    
    inline def setTickDecimalsUndefined: Self = StObject.set(x, "tickDecimals", js.undefined)
    
    inline def setTickFormatter(value: (/* t */ Double, /* a */ js.UndefOr[axis]) => String): Self = StObject.set(x, "tickFormatter", js.Any.fromFunction2(value))
    
    inline def setTickFormatterUndefined: Self = StObject.set(x, "tickFormatter", js.undefined)
    
    inline def setTickLength(value: Double): Self = StObject.set(x, "tickLength", value.asInstanceOf[js.Any])
    
    inline def setTickLengthUndefined: Self = StObject.set(x, "tickLength", js.undefined)
    
    inline def setTickSize(value: js.Any): Self = StObject.set(x, "tickSize", value.asInstanceOf[js.Any])
    
    inline def setTickSizeUndefined: Self = StObject.set(x, "tickSize", js.undefined)
    
    inline def setTicks(value: js.Any): Self = StObject.set(x, "ticks", value.asInstanceOf[js.Any])
    
    inline def setTicksUndefined: Self = StObject.set(x, "ticks", js.undefined)
    
    inline def setTimeformat(value: String): Self = StObject.set(x, "timeformat", value.asInstanceOf[js.Any])
    
    inline def setTimeformatUndefined: Self = StObject.set(x, "timeformat", js.undefined)
    
    inline def setTimezone(value: String): Self = StObject.set(x, "timezone", value.asInstanceOf[js.Any])
    
    inline def setTimezoneUndefined: Self = StObject.set(x, "timezone", js.undefined)
    
    inline def setTransform(value: /* v */ Double => Double): Self = StObject.set(x, "transform", js.Any.fromFunction1(value))
    
    inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
    
    inline def setTwelveHourClock(value: Boolean): Self = StObject.set(x, "twelveHourClock", value.asInstanceOf[js.Any])
    
    inline def setTwelveHourClockUndefined: Self = StObject.set(x, "twelveHourClock", js.undefined)
  }
}
