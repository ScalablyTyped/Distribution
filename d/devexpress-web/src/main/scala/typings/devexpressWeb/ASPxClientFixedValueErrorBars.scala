package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the client-side equivalent of the FixedValueErrorBars class.
  */
@js.native
trait ASPxClientFixedValueErrorBars extends ASPxClientIndicator {
  
  /**
    * Returns the fixed negative error value.
    */
  var negativeError: Double = js.native
  
  /**
    * Gets or sets the fixed positive error value.
    */
  var positiveError: Double = js.native
}
object ASPxClientFixedValueErrorBars {
  
  @scala.inline
  def apply(
    chart: ASPxClientWebChart,
    name: String,
    negativeError: Double,
    positiveError: Double,
    series: ASPxClientSeries
  ): ASPxClientFixedValueErrorBars = {
    val __obj = js.Dynamic.literal(chart = chart.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], negativeError = negativeError.asInstanceOf[js.Any], positiveError = positiveError.asInstanceOf[js.Any], series = series.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientFixedValueErrorBars]
  }
  
  @scala.inline
  implicit class ASPxClientFixedValueErrorBarsOps[Self <: ASPxClientFixedValueErrorBars] (val x: Self) extends AnyVal {
    
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
    def setNegativeError(value: Double): Self = this.set("negativeError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositiveError(value: Double): Self = this.set("positiveError", value.asInstanceOf[js.Any])
  }
}
