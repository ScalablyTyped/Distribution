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
  
  inline def apply(
    chart: ASPxClientWebChart,
    name: String,
    negativeError: Double,
    positiveError: Double,
    series: ASPxClientSeries
  ): ASPxClientFixedValueErrorBars = {
    val __obj = js.Dynamic.literal(chart = chart.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], negativeError = negativeError.asInstanceOf[js.Any], positiveError = positiveError.asInstanceOf[js.Any], series = series.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientFixedValueErrorBars]
  }
  
  extension [Self <: ASPxClientFixedValueErrorBars](x: Self) {
    
    inline def setNegativeError(value: Double): Self = StObject.set(x, "negativeError", value.asInstanceOf[js.Any])
    
    inline def setPositiveError(value: Double): Self = StObject.set(x, "positiveError", value.asInstanceOf[js.Any])
  }
}
