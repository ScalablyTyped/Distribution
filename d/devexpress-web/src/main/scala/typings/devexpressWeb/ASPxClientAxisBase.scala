package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client-side equivalent of the AxisBase class.
  */
@js.native
trait ASPxClientAxisBase extends ASPxClientWebChartElementNamed {
  /**
    * Provides access to the XY-diagram which contains the current axis.
    */
  var diagram: ASPxClientXYDiagramBase = js.native
  /**
    * Provides acess to the range of the axis coordinates.
    */
  var range: ASPxClientAxisRange = js.native
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
  @scala.inline
  implicit class ASPxClientAxisBaseOps[Self <: ASPxClientAxisBase] (val x: Self) extends AnyVal {
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
    def setDiagram(value: ASPxClientXYDiagramBase): Self = this.set("diagram", value.asInstanceOf[js.Any])
    @scala.inline
    def setRange(value: ASPxClientAxisRange): Self = this.set("range", value.asInstanceOf[js.Any])
  }
  
}

