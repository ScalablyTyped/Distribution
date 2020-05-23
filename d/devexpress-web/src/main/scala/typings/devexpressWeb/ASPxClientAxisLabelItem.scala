package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client-side equivalent of the AxisLabelItem class.
  */
trait ASPxClientAxisLabelItem extends ASPxClientWebChartElement {
  /**
    * Gets the axis to which an axis label item belongs.
    */
  var axis: ASPxClientAxisBase
  /**
    * Gets the axis value to which an axis label item corresponds.
    */
  var axisValue: js.Any
  /**
    * Gets the internal representation of the axis value to which an axis label item corresponds.
    */
  var axisValueInternal: Double
  /**
    * Gets the text of an axis label item.
    */
  var text: String
}

object ASPxClientAxisLabelItem {
  @scala.inline
  def apply(
    axis: ASPxClientAxisBase,
    axisValue: js.Any,
    axisValueInternal: Double,
    chart: ASPxClientWebChart,
    text: String
  ): ASPxClientAxisLabelItem = {
    val __obj = js.Dynamic.literal(axis = axis.asInstanceOf[js.Any], axisValue = axisValue.asInstanceOf[js.Any], axisValueInternal = axisValueInternal.asInstanceOf[js.Any], chart = chart.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientAxisLabelItem]
  }
}

