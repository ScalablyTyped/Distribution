package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The client-side equivalent of the MovingAverage class.
  */
trait ASPxClientMovingAverage extends ASPxClientSingleLevelIndicator {
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
}

