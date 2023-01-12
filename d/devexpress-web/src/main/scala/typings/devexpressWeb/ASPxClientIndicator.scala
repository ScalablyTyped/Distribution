package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the client-side equivalent of the Indicator class.
  */
trait ASPxClientIndicator
  extends StObject
     with ASPxClientWebChartElementNamed {
  
  /**
    * Gets the indicator's associated series.
    */
  var series: ASPxClientSeries
}
object ASPxClientIndicator {
  
  inline def apply(chart: ASPxClientWebChart, name: String, series: ASPxClientSeries): ASPxClientIndicator = {
    val __obj = js.Dynamic.literal(chart = chart.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], series = series.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientIndicator]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ASPxClientIndicator] (val x: Self) extends AnyVal {
    
    inline def setSeries(value: ASPxClientSeries): Self = StObject.set(x, "series", value.asInstanceOf[js.Any])
  }
}
