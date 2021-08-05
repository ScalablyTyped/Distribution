package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the client-side equivalent of the MassIndex class.
  */
trait ASPxClientMassIndex
  extends StObject
     with ASPxSeparatePaneIndicator {
  
  /**
    * Returns the count of points used to calculate the exponential moving average (EMA).
    */
  var movingAveragePointsCount: Double
  
  /**
    * Returns the count of summable values.
    */
  var sumPointsCount: Double
}
object ASPxClientMassIndex {
  
  inline def apply(
    axisY: String,
    chart: ASPxClientWebChart,
    movingAveragePointsCount: Double,
    name: String,
    pane: String,
    series: ASPxClientSeries,
    sumPointsCount: Double
  ): ASPxClientMassIndex = {
    val __obj = js.Dynamic.literal(axisY = axisY.asInstanceOf[js.Any], chart = chart.asInstanceOf[js.Any], movingAveragePointsCount = movingAveragePointsCount.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], pane = pane.asInstanceOf[js.Any], series = series.asInstanceOf[js.Any], sumPointsCount = sumPointsCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientMassIndex]
  }
  
  extension [Self <: ASPxClientMassIndex](x: Self) {
    
    inline def setMovingAveragePointsCount(value: Double): Self = StObject.set(x, "movingAveragePointsCount", value.asInstanceOf[js.Any])
    
    inline def setSumPointsCount(value: Double): Self = StObject.set(x, "sumPointsCount", value.asInstanceOf[js.Any])
  }
}
