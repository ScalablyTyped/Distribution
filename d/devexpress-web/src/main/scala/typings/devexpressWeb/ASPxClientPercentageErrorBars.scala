package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the client-side equivalent of the PercentageErrorBars class.
  */
@js.native
trait ASPxClientPercentageErrorBars extends ASPxClientIndicator {
  
  /**
    * Returns the value specifying the percentage of error values of series point values.
    */
  var percent: Double = js.native
}
object ASPxClientPercentageErrorBars {
  
  @scala.inline
  def apply(chart: ASPxClientWebChart, name: String, percent: Double, series: ASPxClientSeries): ASPxClientPercentageErrorBars = {
    val __obj = js.Dynamic.literal(chart = chart.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], percent = percent.asInstanceOf[js.Any], series = series.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientPercentageErrorBars]
  }
  
  @scala.inline
  implicit class ASPxClientPercentageErrorBarsOps[Self <: ASPxClientPercentageErrorBars] (val x: Self) extends AnyVal {
    
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
    def setPercent(value: Double): Self = this.set("percent", value.asInstanceOf[js.Any])
  }
}
