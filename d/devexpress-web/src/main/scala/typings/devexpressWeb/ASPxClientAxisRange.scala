package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client-side equivalent of the AxisRange class.
  */
trait ASPxClientAxisRange extends ASPxClientWebChartElement {
  /**
    * Gets the axis that owns the current axis range object.
    */
  var axis: ASPxClientAxisBase
  /**
    * Gets the maximum value to display on an axis.
    */
  var maxValue: js.Any
  /**
    * Gets the internal float representation of the range maximum value.
    */
  var maxValueInternal: Double
  /**
    * Gets the minimum value to display on an axis.
    */
  var minValue: js.Any
  /**
    * Gets the internal float representation of the range minimum value.
    */
  var minValueInternal: Double
}

object ASPxClientAxisRange {
  @scala.inline
  def apply(
    axis: ASPxClientAxisBase,
    chart: ASPxClientWebChart,
    maxValue: js.Any,
    maxValueInternal: Double,
    minValue: js.Any,
    minValueInternal: Double
  ): ASPxClientAxisRange = {
    val __obj = js.Dynamic.literal(axis = axis.asInstanceOf[js.Any], chart = chart.asInstanceOf[js.Any], maxValue = maxValue.asInstanceOf[js.Any], maxValueInternal = maxValueInternal.asInstanceOf[js.Any], minValue = minValue.asInstanceOf[js.Any], minValueInternal = minValueInternal.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientAxisRange]
  }
}

