package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client-side equivalent of the StandardDeviationErrorBars class.
  */
@js.native
trait ASPxClientStandardDeviationErrorBars extends ASPxClientIndicator {
  /**
    * Returns the multiplier on which the standard deviation value is multiplied before display.
    */
  var multiplier: Double = js.native
}

object ASPxClientStandardDeviationErrorBars {
  @scala.inline
  def apply(chart: ASPxClientWebChart, multiplier: Double, name: String, series: ASPxClientSeries): ASPxClientStandardDeviationErrorBars = {
    val __obj = js.Dynamic.literal(chart = chart.asInstanceOf[js.Any], multiplier = multiplier.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], series = series.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientStandardDeviationErrorBars]
  }
  @scala.inline
  implicit class ASPxClientStandardDeviationErrorBarsOps[Self <: ASPxClientStandardDeviationErrorBars] (val x: Self) extends AnyVal {
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
    def setMultiplier(value: Double): Self = this.set("multiplier", value.asInstanceOf[js.Any])
  }
  
}

