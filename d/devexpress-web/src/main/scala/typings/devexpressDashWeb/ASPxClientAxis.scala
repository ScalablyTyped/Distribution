package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client-side equivalent of the Axis class.
  */
trait ASPxClientAxis extends ASPxClientAxis2D {
  /**
    * Gets a value indicating whether the axis is reversed.
    * Value: true if the axis is reversed; otherwise, false.
    */
  var reverse: Boolean
}

object ASPxClientAxis {
  @scala.inline
  def apply(
    axisTitle: ASPxClientAxisTitle,
    chart: ASPxClientWebChart,
    constantLines: js.Array[ASPxClientConstantLine],
    diagram: ASPxClientXYDiagramBase,
    name: String,
    range: ASPxClientAxisRange,
    reverse: Boolean,
    strips: js.Array[ASPxClientStrip]
  ): ASPxClientAxis = {
    val __obj = js.Dynamic.literal(axisTitle = axisTitle, chart = chart, constantLines = constantLines, diagram = diagram, name = name, range = range, reverse = reverse, strips = strips)
  
    __obj.asInstanceOf[ASPxClientAxis]
  }
}

