package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client-side equivalent of the AxisBase class.
  */
trait ASPxClientAxisBase extends ASPxClientWebChartElementNamed {
  /**
    * Provides access to the XY-diagram which contains the current axis.
    * Value: An ASPxClientXYDiagramBase class descendant.
    */
  var diagram: ASPxClientXYDiagramBase
  /**
    * Provides acess to the range of the axis coordinates.
    * Value: An ASPxClientAxisRange object, which contains the common range settings of the axis coordinates.
    */
  var range: ASPxClientAxisRange
}

object ASPxClientAxisBase {
  @scala.inline
  def apply(
    chart: ASPxClientWebChart,
    diagram: ASPxClientXYDiagramBase,
    name: String,
    range: ASPxClientAxisRange
  ): ASPxClientAxisBase = {
    val __obj = js.Dynamic.literal(chart = chart, diagram = diagram, name = name, range = range)
  
    __obj.asInstanceOf[ASPxClientAxisBase]
  }
}

