package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the client-side equivalent of the Strip class.
  */
trait ASPxClientStrip
  extends StObject
     with ASPxClientWebChartElementNamed {
  
  /**
    * Gets the axis that owns the current strip object.
    */
  var axis: ASPxClientAxis
  
  /**
    * Gets the maximum value of the strip's range.
    */
  var maxValue: Any
  
  /**
    * Gets the minimum value of the strip's range.
    */
  var minValue: Any
}
object ASPxClientStrip {
  
  inline def apply(axis: ASPxClientAxis, chart: ASPxClientWebChart, maxValue: Any, minValue: Any, name: String): ASPxClientStrip = {
    val __obj = js.Dynamic.literal(axis = axis.asInstanceOf[js.Any], chart = chart.asInstanceOf[js.Any], maxValue = maxValue.asInstanceOf[js.Any], minValue = minValue.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientStrip]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ASPxClientStrip] (val x: Self) extends AnyVal {
    
    inline def setAxis(value: ASPxClientAxis): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
    
    inline def setMaxValue(value: Any): Self = StObject.set(x, "maxValue", value.asInstanceOf[js.Any])
    
    inline def setMinValue(value: Any): Self = StObject.set(x, "minValue", value.asInstanceOf[js.Any])
  }
}
