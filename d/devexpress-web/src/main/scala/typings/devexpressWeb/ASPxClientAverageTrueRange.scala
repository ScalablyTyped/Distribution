package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the client-side equivalent of the AverageTrueRange class.
  */
trait ASPxClientAverageTrueRange
  extends StObject
     with ASPxSeparatePaneIndicator {
  
  /**
    * Gets the number of data points used to calculate the indicator values.
    */
  var pointsCount: Double
}
object ASPxClientAverageTrueRange {
  
  inline def apply(
    axisY: String,
    chart: ASPxClientWebChart,
    name: String,
    pane: String,
    pointsCount: Double,
    series: ASPxClientSeries
  ): ASPxClientAverageTrueRange = {
    val __obj = js.Dynamic.literal(axisY = axisY.asInstanceOf[js.Any], chart = chart.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], pane = pane.asInstanceOf[js.Any], pointsCount = pointsCount.asInstanceOf[js.Any], series = series.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientAverageTrueRange]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ASPxClientAverageTrueRange] (val x: Self) extends AnyVal {
    
    inline def setPointsCount(value: Double): Self = StObject.set(x, "pointsCount", value.asInstanceOf[js.Any])
  }
}
