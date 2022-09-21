package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the client-side equivalent of the AxisRange class.
  */
trait ASPxClientAxisRange
  extends StObject
     with ASPxClientWebChartElement {
  
  /**
    * Gets the axis that owns the current axis range object.
    */
  var axis: ASPxClientAxisBase
  
  /**
    * Gets the maximum value to display on an axis.
    */
  var maxValue: Any
  
  /**
    * Gets the internal float representation of the range maximum value.
    */
  var maxValueInternal: Double
  
  /**
    * Gets the minimum value to display on an axis.
    */
  var minValue: Any
  
  /**
    * Gets the internal float representation of the range minimum value.
    */
  var minValueInternal: Double
}
object ASPxClientAxisRange {
  
  inline def apply(
    axis: ASPxClientAxisBase,
    chart: ASPxClientWebChart,
    maxValue: Any,
    maxValueInternal: Double,
    minValue: Any,
    minValueInternal: Double
  ): ASPxClientAxisRange = {
    val __obj = js.Dynamic.literal(axis = axis.asInstanceOf[js.Any], chart = chart.asInstanceOf[js.Any], maxValue = maxValue.asInstanceOf[js.Any], maxValueInternal = maxValueInternal.asInstanceOf[js.Any], minValue = minValue.asInstanceOf[js.Any], minValueInternal = minValueInternal.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientAxisRange]
  }
  
  extension [Self <: ASPxClientAxisRange](x: Self) {
    
    inline def setAxis(value: ASPxClientAxisBase): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
    
    inline def setMaxValue(value: Any): Self = StObject.set(x, "maxValue", value.asInstanceOf[js.Any])
    
    inline def setMaxValueInternal(value: Double): Self = StObject.set(x, "maxValueInternal", value.asInstanceOf[js.Any])
    
    inline def setMinValue(value: Any): Self = StObject.set(x, "minValue", value.asInstanceOf[js.Any])
    
    inline def setMinValueInternal(value: Double): Self = StObject.set(x, "minValueInternal", value.asInstanceOf[js.Any])
  }
}
