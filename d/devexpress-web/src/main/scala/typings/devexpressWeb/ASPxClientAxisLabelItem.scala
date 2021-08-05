package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the client-side equivalent of the AxisLabelItem class.
  */
trait ASPxClientAxisLabelItem
  extends StObject
     with ASPxClientWebChartElement {
  
  /**
    * Gets the axis to which an axis label item belongs.
    */
  var axis: ASPxClientAxisBase
  
  /**
    * Gets the axis value to which an axis label item corresponds.
    */
  var axisValue: js.Any
  
  /**
    * Gets the internal representation of the axis value to which an axis label item corresponds.
    */
  var axisValueInternal: Double
  
  /**
    * Gets the text of an axis label item.
    */
  var text: String
}
object ASPxClientAxisLabelItem {
  
  inline def apply(
    axis: ASPxClientAxisBase,
    axisValue: js.Any,
    axisValueInternal: Double,
    chart: ASPxClientWebChart,
    text: String
  ): ASPxClientAxisLabelItem = {
    val __obj = js.Dynamic.literal(axis = axis.asInstanceOf[js.Any], axisValue = axisValue.asInstanceOf[js.Any], axisValueInternal = axisValueInternal.asInstanceOf[js.Any], chart = chart.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientAxisLabelItem]
  }
  
  extension [Self <: ASPxClientAxisLabelItem](x: Self) {
    
    inline def setAxis(value: ASPxClientAxisBase): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
    
    inline def setAxisValue(value: js.Any): Self = StObject.set(x, "axisValue", value.asInstanceOf[js.Any])
    
    inline def setAxisValueInternal(value: Double): Self = StObject.set(x, "axisValueInternal", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
