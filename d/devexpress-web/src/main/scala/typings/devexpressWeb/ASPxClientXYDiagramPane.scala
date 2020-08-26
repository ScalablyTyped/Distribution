package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client-side equivalent of the XYDiagramPane class.
  */
@js.native
trait ASPxClientXYDiagramPane extends ASPxClientWebChartElementNamed {
  /**
    * Gets the diagram that owns the current pane object.
    */
  var diagram: ASPxClientXYDiagram = js.native
  /**
    * Returns the pane title's settings.
    */
  var title: ASPxClientPaneTitle = js.native
}

object ASPxClientXYDiagramPane {
  @scala.inline
  def apply(chart: ASPxClientWebChart, diagram: ASPxClientXYDiagram, name: String, title: ASPxClientPaneTitle): ASPxClientXYDiagramPane = {
    val __obj = js.Dynamic.literal(chart = chart.asInstanceOf[js.Any], diagram = diagram.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientXYDiagramPane]
  }
  @scala.inline
  implicit class ASPxClientXYDiagramPaneOps[Self <: ASPxClientXYDiagramPane] (val x: Self) extends AnyVal {
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
    def setDiagram(value: ASPxClientXYDiagram): Self = this.set("diagram", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitle(value: ASPxClientPaneTitle): Self = this.set("title", value.asInstanceOf[js.Any])
  }
  
}

