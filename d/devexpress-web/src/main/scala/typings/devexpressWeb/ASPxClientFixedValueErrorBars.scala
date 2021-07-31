package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the client-side equivalent of the FixedValueErrorBars class.
  */
trait ASPxClientFixedValueErrorBars
  extends StObject
     with ASPxClientIndicator {
  
  /**
    * Returns the fixed negative error value.
    */
  var negativeError: Double
  
  /**
    * Gets or sets the fixed positive error value.
    */
  var positiveError: Double
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
  implicit class ASPxClientFixedValueErrorBarsMutableBuilder[Self <: ASPxClientFixedValueErrorBars] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNegativeError(value: Double): Self = StObject.set(x, "negativeError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositiveError(value: Double): Self = StObject.set(x, "positiveError", value.asInstanceOf[js.Any])
  }
}
