package typings.devexpressWeb

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
  implicit class ASPxClientIndicatorPointOps[Self <: ASPxClientIndicatorPoint] (val x: Self) extends AnyVal {
    
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
    def setArgument(value: js.Any): Self = this.set("argument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeries(value: ASPxClientSeries): Self = this.set("series", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesVarargs(value: js.Any*): Self = this.set("values", js.Array(value :_*))
    
    @scala.inline
    def setValues(value: js.Array[_]): Self = this.set("values", value.asInstanceOf[js.Any])
  }
}
