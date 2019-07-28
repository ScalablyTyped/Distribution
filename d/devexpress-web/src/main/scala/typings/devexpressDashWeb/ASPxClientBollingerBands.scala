package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client-side equivalent of the BollingerBands class.
  */
trait ASPxClientBollingerBands extends ASPxClientIndicator {
  /**
    * Gets the number of data points used to calculate the indicator values.
    * Value: An integer value, specifying the number of points.
    */
  var pointsCount: Double
  /**
    * Gets a value, indicating whose series point values are used to calculate the indicator's values.
    * Value: A string value, which indicates which series point value should be used to calculate indicator values.
    */
  var valueLevel: String
}

object ASPxClientBollingerBands {
  @scala.inline
  def apply(
    chart: ASPxClientWebChart,
    name: String,
    pointsCount: Double,
    series: ASPxClientSeries,
    valueLevel: String
  ): ASPxClientBollingerBands = {
    val __obj = js.Dynamic.literal(chart = chart, name = name, pointsCount = pointsCount, series = series, valueLevel = valueLevel)
  
    __obj.asInstanceOf[ASPxClientBollingerBands]
  }
}

