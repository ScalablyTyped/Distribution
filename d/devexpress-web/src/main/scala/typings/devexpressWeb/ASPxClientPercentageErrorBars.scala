package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
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
  implicit class ASPxClientPercentageErrorBarsMutableBuilder[Self <: ASPxClientPercentageErrorBars] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPercent(value: Double): Self = StObject.set(x, "percent", value.asInstanceOf[js.Any])
  }
}
