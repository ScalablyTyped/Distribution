package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The IndicatorPoint class's client-side equivalent.
  */
trait ASPxClientIndicatorPoint
  extends StObject
     with ASPxClientWebChartElement {
  
  /**
    * Returns the indicator point's argument.
    */
  var argument: Any
  
  /**
    * Returns the series to which the indicator and its point belong.
    */
  var series: ASPxClientSeries
  
  /**
    * Returns the values for the indicator point that the Crosshair Cursor highlights.
    */
  var values: js.Array[Any]
}
object ASPxClientIndicatorPoint {
  
  inline def apply(argument: Any, chart: ASPxClientWebChart, series: ASPxClientSeries, values: js.Array[Any]): ASPxClientIndicatorPoint = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], chart = chart.asInstanceOf[js.Any], series = series.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientIndicatorPoint]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ASPxClientIndicatorPoint] (val x: Self) extends AnyVal {
    
    inline def setArgument(value: Any): Self = StObject.set(x, "argument", value.asInstanceOf[js.Any])
    
    inline def setSeries(value: ASPxClientSeries): Self = StObject.set(x, "series", value.asInstanceOf[js.Any])
    
    inline def setValues(value: js.Array[Any]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesVarargs(value: Any*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
