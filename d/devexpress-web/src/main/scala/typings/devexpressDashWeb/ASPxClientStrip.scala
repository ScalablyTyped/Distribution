package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client-side equivalent of the Strip class.
  */
trait ASPxClientStrip extends ASPxClientWebChartElementNamed {
  /**
    * Gets the axis that owns the current strip object.
    * Value: An ASPxClientAxis object, to which the strip belongs.
    */
  var axis: ASPxClientAxis
  /**
    * Gets the maximum value of the strip's range.
    * Value: An object that represents the maximum value of the strip's range.
    */
  var maxValue: js.Object
  /**
    * Gets the minimum value of the strip's range.
    * Value: An object that represents the minimum value of the strip's range.
    */
  var minValue: js.Object
}

object ASPxClientStrip {
  @scala.inline
  def apply(
    axis: ASPxClientAxis,
    chart: ASPxClientWebChart,
    maxValue: js.Object,
    minValue: js.Object,
    name: String
  ): ASPxClientStrip = {
    val __obj = js.Dynamic.literal(axis = axis, chart = chart, maxValue = maxValue, minValue = minValue, name = name)
  
    __obj.asInstanceOf[ASPxClientStrip]
  }
}

