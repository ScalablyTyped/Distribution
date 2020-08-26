package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client-side equivalent of the AxisRange class.
  */
@js.native
trait ASPxClientAxisRange extends ASPxClientWebChartElement {
  /**
    * Gets the axis that owns the current axis range object.
    */
  var axis: ASPxClientAxisBase = js.native
  /**
    * Gets the maximum value to display on an axis.
    */
  var maxValue: js.Any = js.native
  /**
    * Gets the internal float representation of the range maximum value.
    */
  var maxValueInternal: Double = js.native
  /**
    * Gets the minimum value to display on an axis.
    */
  var minValue: js.Any = js.native
  /**
    * Gets the internal float representation of the range minimum value.
    */
  var minValueInternal: Double = js.native
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
  @scala.inline
  implicit class ASPxClientAxisRangeOps[Self <: ASPxClientAxisRange] (val x: Self) extends AnyVal {
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
    def setAxis(value: ASPxClientAxisBase): Self = this.set("axis", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxValue(value: js.Any): Self = this.set("maxValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxValueInternal(value: Double): Self = this.set("maxValueInternal", value.asInstanceOf[js.Any])
    @scala.inline
    def setMinValue(value: js.Any): Self = this.set("minValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setMinValueInternal(value: Double): Self = this.set("minValueInternal", value.asInstanceOf[js.Any])
  }
  
}

