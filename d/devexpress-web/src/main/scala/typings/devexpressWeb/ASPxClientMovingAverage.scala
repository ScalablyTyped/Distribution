package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The client-side equivalent of the MovingAverage class.
  */
trait ASPxClientMovingAverage
  extends StObject
     with ASPxClientSingleLevelIndicator {
  
  /**
    * Gets a value specifying the Envelope percent.
    */
  var envelopePercent: Double
  
  /**
    * Gets a value specifying whether to display a Moving Average, Envelope, or both.
    */
  var kind: String
  
  /**
    * Gets the number of data points used to calculate the moving average.
    */
  var pointsCount: Double
}
object ASPxClientMovingAverage {
  
  inline def apply(
    chart: ASPxClientWebChart,
    envelopePercent: Double,
    kind: String,
    name: String,
    pointsCount: Double,
    series: ASPxClientSeries,
    valueLevel: String
  ): ASPxClientMovingAverage = {
    val __obj = js.Dynamic.literal(chart = chart.asInstanceOf[js.Any], envelopePercent = envelopePercent.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], pointsCount = pointsCount.asInstanceOf[js.Any], series = series.asInstanceOf[js.Any], valueLevel = valueLevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientMovingAverage]
  }
  
  extension [Self <: ASPxClientMovingAverage](x: Self) {
    
    inline def setEnvelopePercent(value: Double): Self = StObject.set(x, "envelopePercent", value.asInstanceOf[js.Any])
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setPointsCount(value: Double): Self = StObject.set(x, "pointsCount", value.asInstanceOf[js.Any])
  }
}
