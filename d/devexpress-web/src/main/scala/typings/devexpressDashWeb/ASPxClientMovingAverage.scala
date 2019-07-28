package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The client-side equivalent of the MovingAverage class.
  */
trait ASPxClientMovingAverage extends ASPxClientSingleLevelIndicator {
  /**
    * Gets a value specifying the Envelope percent.
    * Value: A double value which specifies the Envelope percent.
    */
  var envelopePercent: Double
  /**
    * Gets a value specifying whether to display a Moving Average, Envelope, or both.
    * Value: A string value.
    */
  var kind: String
  /**
    * Gets the number of data points used to calculate the moving average.
    * Value: An integer value, specifying the number of points.
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
    val __obj = js.Dynamic.literal(chart = chart, envelopePercent = envelopePercent, kind = kind, name = name, pointsCount = pointsCount, series = series, valueLevel = valueLevel)
  
    __obj.asInstanceOf[ASPxClientMovingAverage]
  }
}

