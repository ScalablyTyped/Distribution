package typings.devexpressWeb

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
  implicit class ASPxClientMovingAverageConvergenceDivergenceOps[Self <: ASPxClientMovingAverageConvergenceDivergence] (val x: Self) extends AnyVal {
    
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
    def setLongPeriod(value: Double): Self = this.set("longPeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShortPeriod(value: Double): Self = this.set("shortPeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignalSmoothingPeriod(value: Double): Self = this.set("signalSmoothingPeriod", value.asInstanceOf[js.Any])
  }
}
