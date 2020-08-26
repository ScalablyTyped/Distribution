package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client-side equivalent of the SeriesPoint class.
  */
@js.native
trait ASPxClientSeriesPoint extends ASPxClientWebChartElement {
  /**
    * Gets the data point's argument.
    */
  var argument: js.Any = js.native
  /**
    * Gets the color of a series point.
    */
  var color: String = js.native
  /**
    * Gets the percent value of a series point.
    */
  var percentValue: Double = js.native
  /**
    * Gets the series that owns the current series point object.
    */
  var series: ASPxClientSeries = js.native
  /**
    * Gets a hint that is shown in series points tooltips.
    */
  var toolTipHint: String = js.native
  /**
    * Gets the text to be displayed within series points tooltips.
    */
  var toolTipText: String = js.native
  /**
    * Gets the point's data value(s).
    */
  var values: js.Array[_] = js.native
}

object ASPxClientSeriesPoint {
  @scala.inline
  def apply(
    argument: js.Any,
    chart: ASPxClientWebChart,
    color: String,
    percentValue: Double,
    series: ASPxClientSeries,
    toolTipHint: String,
    toolTipText: String,
    values: js.Array[_]
  ): ASPxClientSeriesPoint = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], chart = chart.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], percentValue = percentValue.asInstanceOf[js.Any], series = series.asInstanceOf[js.Any], toolTipHint = toolTipHint.asInstanceOf[js.Any], toolTipText = toolTipText.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientSeriesPoint]
  }
  @scala.inline
  implicit class ASPxClientSeriesPointOps[Self <: ASPxClientSeriesPoint] (val x: Self) extends AnyVal {
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
    def setArgument(value: js.Any): Self = this.set("argument", value.asInstanceOf[js.Any])
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def setPercentValue(value: Double): Self = this.set("percentValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setSeries(value: ASPxClientSeries): Self = this.set("series", value.asInstanceOf[js.Any])
    @scala.inline
    def setToolTipHint(value: String): Self = this.set("toolTipHint", value.asInstanceOf[js.Any])
    @scala.inline
    def setToolTipText(value: String): Self = this.set("toolTipText", value.asInstanceOf[js.Any])
    @scala.inline
    def setValuesVarargs(value: js.Any*): Self = this.set("values", js.Array(value :_*))
    @scala.inline
    def setValues(value: js.Array[_]): Self = this.set("values", value.asInstanceOf[js.Any])
  }
  
}

