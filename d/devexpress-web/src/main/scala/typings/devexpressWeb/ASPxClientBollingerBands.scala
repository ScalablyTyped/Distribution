package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client-side equivalent of the BollingerBands class.
  */
trait ASPxClientBollingerBands extends ASPxClientIndicator {
  /**
    * Gets the number of data points used to calculate the indicator values.
    */
  var pointsCount: Double
  /**
    * Gets a value, indicating whose series point values are used to calculate the indicator's values.
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
    val __obj = js.Dynamic.literal(chart = chart.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], pointsCount = pointsCount.asInstanceOf[js.Any], series = series.asInstanceOf[js.Any], valueLevel = valueLevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientBollingerBands]
  }
}

