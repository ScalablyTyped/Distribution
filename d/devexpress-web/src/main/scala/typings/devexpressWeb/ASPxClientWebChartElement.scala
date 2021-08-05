package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the client-side equivalent of the ChartElement class.
  */
trait ASPxClientWebChartElement extends StObject {
  
  /**
    * Gets the chart that owns the current chart element.
    */
  var chart: ASPxClientWebChart
}
object ASPxClientWebChartElement {
  
  inline def apply(chart: ASPxClientWebChart): ASPxClientWebChartElement = {
    val __obj = js.Dynamic.literal(chart = chart.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientWebChartElement]
  }
  
  extension [Self <: ASPxClientWebChartElement](x: Self) {
    
    inline def setChart(value: ASPxClientWebChart): Self = StObject.set(x, "chart", value.asInstanceOf[js.Any])
  }
}
