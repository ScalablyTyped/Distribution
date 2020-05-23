package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client-side equivalent of the XYDiagramPane class.
  */
trait ASPxClientXYDiagramPane extends ASPxClientWebChartElementNamed {
  /**
    * Gets the diagram that owns the current pane object.
    */
  var diagram: ASPxClientXYDiagram
  /**
    * Returns the pane title's settings.
    */
  var title: ASPxClientPaneTitle
}

object ASPxClientXYDiagramPane {
  @scala.inline
  def apply(chart: ASPxClientWebChart, diagram: ASPxClientXYDiagram, name: String, title: ASPxClientPaneTitle): ASPxClientXYDiagramPane = {
    val __obj = js.Dynamic.literal(chart = chart.asInstanceOf[js.Any], diagram = diagram.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientXYDiagramPane]
  }
}

