package typings.devexpressWeb

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
  implicit class ASPxClientStripOps[Self <: ASPxClientStrip] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAxis(value: ASPxClientAxis): Self = this.set("axis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxValue(value: js.Any): Self = this.set("maxValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinValue(value: js.Any): Self = this.set("minValue", value.asInstanceOf[js.Any])
  }
}
