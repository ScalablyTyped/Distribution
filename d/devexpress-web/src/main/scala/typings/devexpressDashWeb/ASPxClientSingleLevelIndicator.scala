package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The client-side equivalent of the SingleLevelIndicator class.
  */
trait ASPxClientSingleLevelIndicator extends ASPxClientIndicator {
  /**
    * Gets a value specifying the value level to which the single-level indicator corresponds.
    * Value: A string value.
    */
  var valueLevel: String
}

object ASPxClientSingleLevelIndicator {
  @scala.inline
  def apply(chart: ASPxClientWebChart, name: String, series: ASPxClientSeries, valueLevel: String): ASPxClientSingleLevelIndicator = {
    val __obj = js.Dynamic.literal(chart = chart, name = name, series = series, valueLevel = valueLevel)
  
    __obj.asInstanceOf[ASPxClientSingleLevelIndicator]
  }
}

