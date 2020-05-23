package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client-side equivalent of the AxisBase class.
  */
trait ASPxClientAxisBase extends ASPxClientWebChartElementNamed {
  /**
    * Provides access to the XY-diagram which contains the current axis.
    */
  var diagram: ASPxClientXYDiagramBase
  /**
    * Provides acess to the range of the axis coordinates.
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
    val __obj = js.Dynamic.literal(chart = chart.asInstanceOf[js.Any], diagram = diagram.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientAxisBase]
  }
}

