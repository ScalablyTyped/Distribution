package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client-side equivalent of the Strip class.
  */
trait ASPxClientStrip extends ASPxClientWebChartElementNamed {
  /**
    * Gets the axis that owns the current strip object.
    */
  var axis: ASPxClientAxis
  /**
    * Gets the maximum value of the strip's range.
    */
  var maxValue: js.Any
  /**
    * Gets the minimum value of the strip's range.
    */
  var minValue: js.Any
}

object ASPxClientStrip {
  @scala.inline
  def apply(axis: ASPxClientAxis, chart: ASPxClientWebChart, maxValue: js.Any, minValue: js.Any, name: String): ASPxClientStrip = {
    val __obj = js.Dynamic.literal(axis = axis.asInstanceOf[js.Any], chart = chart.asInstanceOf[js.Any], maxValue = maxValue.asInstanceOf[js.Any], minValue = minValue.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientStrip]
  }
}

