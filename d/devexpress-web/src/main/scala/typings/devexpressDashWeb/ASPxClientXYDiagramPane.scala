package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client-side equivalent of the XYDiagramPane class.
  */
trait ASPxClientXYDiagramPane extends ASPxClientWebChartElementNamed {
  /**
    * Gets the diagram that owns the current pane object.
    * Value: An ASPxClientXYDiagram object, to which the pane belongs.
    */
  var diagram: ASPxClientXYDiagram
  var title: ASPxClientPaneTitle
}

object ASPxClientXYDiagramPane {
  @scala.inline
  def apply(chart: ASPxClientWebChart, diagram: ASPxClientXYDiagram, name: String, title: ASPxClientPaneTitle): ASPxClientXYDiagramPane = {
    val __obj = js.Dynamic.literal(chart = chart, diagram = diagram, name = name, title = title)
  
    __obj.asInstanceOf[ASPxClientXYDiagramPane]
  }
}

