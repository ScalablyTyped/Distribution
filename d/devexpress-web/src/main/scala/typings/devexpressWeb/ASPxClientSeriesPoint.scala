package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the client-side equivalent of the SeriesPoint class.
  */
trait ASPxClientSeriesPoint
  extends StObject
     with ASPxClientWebChartElement {
  
  /**
    * Gets the data point's argument.
    */
  var argument: Any
  
  /**
    * Gets the color of a series point.
    */
  var color: String
  
  /**
    * Gets the percent value of a series point.
    */
  var percentValue: Double
  
  /**
    * Gets the series that owns the current series point object.
    */
  var series: ASPxClientSeries
  
  /**
    * Gets a hint that is shown in series points tooltips.
    */
  var toolTipHint: String
  
  /**
    * Gets the text to be displayed within series points tooltips.
    */
  var toolTipText: String
  
  /**
    * Gets the point's data value(s).
    */
  var values: js.Array[Any]
}
object ASPxClientSeriesPoint {
  
  inline def apply(
    argument: Any,
    chart: ASPxClientWebChart,
    color: String,
    percentValue: Double,
    series: ASPxClientSeries,
    toolTipHint: String,
    toolTipText: String,
    values: js.Array[Any]
  ): ASPxClientSeriesPoint = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], chart = chart.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], percentValue = percentValue.asInstanceOf[js.Any], series = series.asInstanceOf[js.Any], toolTipHint = toolTipHint.asInstanceOf[js.Any], toolTipText = toolTipText.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientSeriesPoint]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ASPxClientSeriesPoint] (val x: Self) extends AnyVal {
    
    inline def setArgument(value: Any): Self = StObject.set(x, "argument", value.asInstanceOf[js.Any])
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setPercentValue(value: Double): Self = StObject.set(x, "percentValue", value.asInstanceOf[js.Any])
    
    inline def setSeries(value: ASPxClientSeries): Self = StObject.set(x, "series", value.asInstanceOf[js.Any])
    
    inline def setToolTipHint(value: String): Self = StObject.set(x, "toolTipHint", value.asInstanceOf[js.Any])
    
    inline def setToolTipText(value: String): Self = StObject.set(x, "toolTipText", value.asInstanceOf[js.Any])
    
    inline def setValues(value: js.Array[Any]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesVarargs(value: Any*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
