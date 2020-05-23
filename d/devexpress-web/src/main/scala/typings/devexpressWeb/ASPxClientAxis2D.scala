package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client-side equivalent of the Axis2D class.
  */
trait ASPxClientAxis2D extends ASPxClientAxisBase {
  /**
    * Provides access to an axis title object.
    */
  var axisTitle: ASPxClientAxisTitle
  /**
    * Provides access to the collection of the axis constant lines.
    */
  var constantLines: js.Array[ASPxClientConstantLine]
  /**
    * Provides access to the axis strips collection.
    */
  var strips: js.Array[ASPxClientStrip]
}

object ASPxClientAxis2D {
  @scala.inline
  def apply(
    axisTitle: ASPxClientAxisTitle,
    chart: ASPxClientWebChart,
    constantLines: js.Array[ASPxClientConstantLine],
    diagram: ASPxClientXYDiagramBase,
    name: String,
    range: ASPxClientAxisRange,
    strips: js.Array[ASPxClientStrip]
  ): ASPxClientAxis2D = {
    val __obj = js.Dynamic.literal(axisTitle = axisTitle.asInstanceOf[js.Any], chart = chart.asInstanceOf[js.Any], constantLines = constantLines.asInstanceOf[js.Any], diagram = diagram.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], strips = strips.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientAxis2D]
  }
}

