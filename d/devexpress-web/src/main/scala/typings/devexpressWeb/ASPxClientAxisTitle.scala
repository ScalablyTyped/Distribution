package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client-side equivalent of the AxisTitle class.
  */
trait ASPxClientAxisTitle extends ASPxClientWebChartElement {
  /**
    * Gets the axis to which the axis title belongs.
    */
  var axis: ASPxClientAxisBase
  /**
    * Gets the text of the axis title.
    */
  var text: String
}

object ASPxClientAxisTitle {
  @scala.inline
  def apply(axis: ASPxClientAxisBase, chart: ASPxClientWebChart, text: String): ASPxClientAxisTitle = {
    val __obj = js.Dynamic.literal(axis = axis.asInstanceOf[js.Any], chart = chart.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientAxisTitle]
  }
}

