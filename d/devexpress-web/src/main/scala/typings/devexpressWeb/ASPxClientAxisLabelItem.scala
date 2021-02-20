package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the client-side equivalent of the AxisLabelItem class.
  */
@js.native
trait ASPxClientAxisLabelItem extends ASPxClientWebChartElement {
  
  /**
    * Gets the axis to which an axis label item belongs.
    */
  var axis: ASPxClientAxisBase = js.native
  
  /**
    * Gets the axis value to which an axis label item corresponds.
    */
  var axisValue: js.Any = js.native
  
  /**
    * Gets the internal representation of the axis value to which an axis label item corresponds.
    */
  var axisValueInternal: Double = js.native
  
  /**
    * Gets the text of an axis label item.
    */
  var text: String = js.native
}
object ASPxClientAxisLabelItem {
  
  @scala.inline
  def apply(
    axis: ASPxClientAxisBase,
    axisValue: js.Any,
    axisValueInternal: Double,
    chart: ASPxClientWebChart,
    text: String
  ): ASPxClientAxisLabelItem = {
    val __obj = js.Dynamic.literal(axis = axis.asInstanceOf[js.Any], axisValue = axisValue.asInstanceOf[js.Any], axisValueInternal = axisValueInternal.asInstanceOf[js.Any], chart = chart.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientAxisLabelItem]
  }
  
  @scala.inline
  implicit class ASPxClientAxisLabelItemMutableBuilder[Self <: ASPxClientAxisLabelItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAxis(value: ASPxClientAxisBase): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAxisValue(value: js.Any): Self = StObject.set(x, "axisValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAxisValueInternal(value: Double): Self = StObject.set(x, "axisValueInternal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
