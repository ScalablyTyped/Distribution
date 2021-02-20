package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The IndicatorPoint class's client-side equivalent.
  */
@js.native
trait ASPxClientIndicatorPoint extends ASPxClientWebChartElement {
  
  /**
    * Returns the indicator point's argument.
    */
  var argument: js.Any = js.native
  
  /**
    * Returns the series to which the indicator and its point belong.
    */
  var series: ASPxClientSeries = js.native
  
  /**
    * Returns the values for the indicator point that the Crosshair Cursor highlights.
    */
  var values: js.Array[_] = js.native
}
object ASPxClientIndicatorPoint {
  
  @scala.inline
  def apply(argument: js.Any, chart: ASPxClientWebChart, series: ASPxClientSeries, values: js.Array[_]): ASPxClientIndicatorPoint = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], chart = chart.asInstanceOf[js.Any], series = series.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientIndicatorPoint]
  }
  
  @scala.inline
  implicit class ASPxClientIndicatorPointMutableBuilder[Self <: ASPxClientIndicatorPoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArgument(value: js.Any): Self = StObject.set(x, "argument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeries(value: ASPxClientSeries): Self = StObject.set(x, "series", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValues(value: js.Array[_]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesVarargs(value: js.Any*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}
