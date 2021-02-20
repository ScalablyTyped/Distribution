package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the client-side equivalent of the MovingAverageConvergenceDivergence class.
  */
@js.native
trait ASPxClientMovingAverageConvergenceDivergence extends ASPxSeparatePaneIndicator {
  
  /**
    * Returns the long period value required to calculate the indicator.
    */
  var longPeriod: Double = js.native
  
  /**
    * Returns the short period value required to calculate the indicator.
    */
  var shortPeriod: Double = js.native
  
  /**
    * Returns the smoothing period value required to calculate the indicator.
    */
  var signalSmoothingPeriod: Double = js.native
}
object ASPxClientMovingAverageConvergenceDivergence {
  
  @scala.inline
  def apply(
    axisY: String,
    chart: ASPxClientWebChart,
    longPeriod: Double,
    name: String,
    pane: String,
    series: ASPxClientSeries,
    shortPeriod: Double,
    signalSmoothingPeriod: Double
  ): ASPxClientMovingAverageConvergenceDivergence = {
    val __obj = js.Dynamic.literal(axisY = axisY.asInstanceOf[js.Any], chart = chart.asInstanceOf[js.Any], longPeriod = longPeriod.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], pane = pane.asInstanceOf[js.Any], series = series.asInstanceOf[js.Any], shortPeriod = shortPeriod.asInstanceOf[js.Any], signalSmoothingPeriod = signalSmoothingPeriod.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientMovingAverageConvergenceDivergence]
  }
  
  @scala.inline
  implicit class ASPxClientMovingAverageConvergenceDivergenceMutableBuilder[Self <: ASPxClientMovingAverageConvergenceDivergence] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLongPeriod(value: Double): Self = StObject.set(x, "longPeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShortPeriod(value: Double): Self = StObject.set(x, "shortPeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignalSmoothingPeriod(value: Double): Self = StObject.set(x, "signalSmoothingPeriod", value.asInstanceOf[js.Any])
  }
}
