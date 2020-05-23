package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client-side equivalent of the ConstantLine class.
  */
trait ASPxClientConstantLine extends ASPxClientWebChartElementNamed {
  /**
    * Gets the axis that owns the current constant line object.
    */
  var axis: ASPxClientAxis
  /**
    * Gets the constant line title.
    */
  var title: String
  /**
    * Gets the constant line's position along the axis.
    */
  var value: js.Any
}

object ASPxClientConstantLine {
  @scala.inline
  def apply(axis: ASPxClientAxis, chart: ASPxClientWebChart, name: String, title: String, value: js.Any): ASPxClientConstantLine = {
    val __obj = js.Dynamic.literal(axis = axis.asInstanceOf[js.Any], chart = chart.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientConstantLine]
  }
}

