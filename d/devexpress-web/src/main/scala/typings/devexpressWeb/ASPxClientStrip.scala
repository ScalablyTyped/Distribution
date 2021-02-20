package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the client-side equivalent of the Strip class.
  */
@js.native
trait ASPxClientStrip extends ASPxClientWebChartElementNamed {
  
  /**
    * Gets the axis that owns the current strip object.
    */
  var axis: ASPxClientAxis = js.native
  
  /**
    * Gets the maximum value of the strip's range.
    */
  var maxValue: js.Any = js.native
  
  /**
    * Gets the minimum value of the strip's range.
    */
  var minValue: js.Any = js.native
}
object ASPxClientStrip {
  
  @scala.inline
  def apply(axis: ASPxClientAxis, chart: ASPxClientWebChart, maxValue: js.Any, minValue: js.Any, name: String): ASPxClientStrip = {
    val __obj = js.Dynamic.literal(axis = axis.asInstanceOf[js.Any], chart = chart.asInstanceOf[js.Any], maxValue = maxValue.asInstanceOf[js.Any], minValue = minValue.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientStrip]
  }
  
  @scala.inline
  implicit class ASPxClientStripMutableBuilder[Self <: ASPxClientStrip] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAxis(value: ASPxClientAxis): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxValue(value: js.Any): Self = StObject.set(x, "maxValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinValue(value: js.Any): Self = StObject.set(x, "minValue", value.asInstanceOf[js.Any])
  }
}
