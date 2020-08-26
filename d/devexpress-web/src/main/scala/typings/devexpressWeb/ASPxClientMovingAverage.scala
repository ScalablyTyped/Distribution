package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The client-side equivalent of the MovingAverage class.
  */
@js.native
trait ASPxClientMovingAverage extends ASPxClientSingleLevelIndicator {
  /**
    * Gets a value specifying the Envelope percent.
    */
  var envelopePercent: Double = js.native
  /**
    * Gets a value specifying whether to display a Moving Average, Envelope, or both.
    */
  var kind: String = js.native
  /**
    * Gets the number of data points used to calculate the moving average.
    */
  var pointsCount: Double = js.native
}

object ASPxClientMovingAverage {
  @scala.inline
  def apply(
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
  @scala.inline
  implicit class ASPxClientMovingAverageOps[Self <: ASPxClientMovingAverage] (val x: Self) extends AnyVal {
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
    def setEnvelopePercent(value: Double): Self = this.set("envelopePercent", value.asInstanceOf[js.Any])
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def setPointsCount(value: Double): Self = this.set("pointsCount", value.asInstanceOf[js.Any])
  }
  
}

